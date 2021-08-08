package com.线程.TestDemo;

public class RunnableDemo implements Runnable {
    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.println( Thread.currentThread().getName() + ": " + i );

        }
    }
}
