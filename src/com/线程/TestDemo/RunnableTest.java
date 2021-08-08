package com.线程.TestDemo;

public class RunnableTest {
    public static void main(String[] args) {

        Runnable runnable = new RunnableDemo();
        Thread t1 = new Thread( runnable );
        t1.start();
        Thread t2 = new Thread( runnable );
        t2.start();

        for (int i=11;i<21;i++){
            System.out.println(Thread.currentThread().getName()+": "+i);
        }

    }
}
