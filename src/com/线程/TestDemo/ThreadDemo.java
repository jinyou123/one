package com.线程.TestDemo;

public class ThreadDemo extends Thread {
    public void run(){
        for(int i=0;i<11;i++){
            System.out.println(Thread.currentThread().getName()+": "+i);

        }    }
}
