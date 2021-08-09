package Practice.生产消费;

public class Customer extends Thread {
    private Store store;

    public Customer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (store) {
                //当前容量等于0时，停止消费，等到生产者生产
                while (store.currentCount == 0) {
                    try {
                        store.wait();//在其他线程调用此对象的notify()方法或者notifyAll()方法前，导致当前线程等待
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            //出库
            store.out();
            store.notify();//唤醒生产者生产
            try {
                Thread.sleep( 1000 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
