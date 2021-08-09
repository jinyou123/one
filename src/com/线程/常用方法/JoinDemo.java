package com.线程.常用方法;

public class JoinDemo {
    public static void main(String[] args) {
        //线程一
        Thread2 t1 = new Thread2( 1, 10 );
        t1.setName( "线程一" );
        t1.start();
        /*try {
            t1.join();//让t1插队，必须等到该线程之前那的代码执行完毕，后续代码才能继续执行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        //线程2
        Thread2 t2 = new Thread2( 100, 110 );
        t2.setName( "线程2" );
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //主线程
        for (int i = 300; i < 310; i++) {
            System.out.println( Thread.currentThread().getName() + ":" + i );
        }


    }
}

class Thread2 extends Thread {
    private int x;
    private int y;

    public Thread2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        for (int i = x; i < y; i++) {
            System.out.println( Thread.currentThread().getName() + ":" + i );
        }
    }
}
