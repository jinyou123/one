package Practice.P3;
/**
 * 继承Thread：每new一次对象，都生成一个新的成员num=50，导致每个线程都会卖自己的50张票，不能共享数据
 * 而实现Runnable接口：runnable仅创建一次，所以可以共享数据
 * */
public class Test {
    public static void main(String[] args) {

        TicketRunnable runnable = new TicketRunnable();
        Thread t1 = new Thread(runnable);
        t1.setName( "张三" );
        t1.start();

        Thread t2 = new Thread(runnable);
        t2.setName( "李四" );
        t2.start();

        Thread t3 = new Thread(runnable);
        t3.setName( "王五" );
        t3.start();
    }
}
