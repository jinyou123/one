package com.线程;

//死锁
public class DeadLock {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
        Thread2 t2 = new Thread2();
        t2.start();
    }
}

class Thread1 extends Thread {
    public void run() {
        while (true) {
            synchronized ("a") {
                System.out.println( "Thread1拿到了A锁" );

                synchronized ("b") {
                    System.out.println( "Thread1拿到了B锁" );
                }
            }
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        while (true) {
            synchronized ("b") {
                System.out.println( "Thread2拿到了B锁" );

                synchronized ("a") {
                    System.out.println( "Thread2拿到了A锁" );
                }
            }
        }
    }
}
