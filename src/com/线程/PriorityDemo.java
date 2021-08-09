package com.线程;

import com.线程.TestDemo.ThreadDemo;

/*
* 线程优先级
* */
public class PriorityDemo {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        t1.start();

        ThreadDemo t2 = new ThreadDemo();
        t2.start();

        //getPriority()获取优先级
        System.out.println("t1默认优先级："+t1.getPriority());
        System.out.println("t2默认优先级："+t2.getPriority());

        //setPriority()修改优先级
        t1.setPriority( Thread.MIN_PRIORITY );//1
        t2.setPriority( Thread.MAX_PRIORITY );//10

        System.out.println("t1修改后优先级："+t1.getPriority());
        System.out.println("t2修改后优先级："+t2.getPriority());

    }
}
