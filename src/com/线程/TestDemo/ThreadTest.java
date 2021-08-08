package com.线程.TestDemo;

public class ThreadTest {
    public static void main(String[] args) {

        ThreadDemo t1 = new ThreadDemo();
        //t1.run();//不能直接调用run方法，此时为单线程，相当于调用一个对象的普通方法
        t1.start();//启动线程，不会立即执行，让线程就绪，等到CPU分配时间片
        for (int i=11;i<21;i++){
            System.out.println(Thread.currentThread().getName()+": "+i);
        }

    }
}
