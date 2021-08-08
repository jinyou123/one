package Practice.p2;

public class ThreadDemo extends Thread{
    private int x;//开始范围
    private int y;//结束范围

    public ThreadDemo() {
    }

    public ThreadDemo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void run() {
        for (int i = x; i < y; i++) {

            boolean flag = true;//是一个素数
            inner:
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    flag = false;
                    break inner;
                }
            }
            if (flag) {
                System.out.println( Thread.currentThread().getName() + ": " + i );

            }
        }
    }

}
