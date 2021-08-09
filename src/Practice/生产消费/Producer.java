package Practice.生产消费;

public class Producer extends Thread {
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        synchronized (store) {
            while (true) {
                //当当前容量等于最大库存容量时，停止生产，等到消费者消费
                while (store.MAX_COUNT==store.currentCount){
                    try {
                        store.wait();//在其他线程调用此对象的notify()方法或者notifyAll()方法前，导致当前线程等待
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //入库
                store.in();
                store.notify();//唤醒消费者消费
                try {
                    Thread.sleep( 1000 );
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
