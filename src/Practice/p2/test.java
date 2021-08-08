package Practice.p2;

/*利用Thread实现，要求多线程求解某范围素数每个线程负责1000范围：
线程1找1-1000；线程2找1001-2000；线程3找2001-3000，
编程程序将每个线程找到的素数及时打印*/
public class test {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo(2,1000 );//通过构造函数赋值
        t1.start();
        ThreadDemo t2 = new ThreadDemo( );
        t2.setX( 1001 );//通过set方法赋值
        t2.setY( 2000 );
        t2.start();
        ThreadDemo t3 = new ThreadDemo(2001,3000 );
        t3.start();

    }
}
