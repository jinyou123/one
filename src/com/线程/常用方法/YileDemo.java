package com.线程.常用方法;

import com.线程.TestDemo.ThreadDemo;

public class YileDemo {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        t1.start();
        ThreadDemo t2 = new ThreadDemo();
        t2.start();
        t2.yield();//让出更多的cpu时间给其他的线程
    }
}
