package com.线程.常用方法;
/**
 * sleep(毫秒值)：指定当前线程休眠指定毫秒值
 * */
import java.util.Date;

public class SleepDemo {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();


    }
}

class Thread1 extends Thread {
    public void run() {
        while (true){
            Date date = new Date();
            System.out.println(date.toLocaleString());
            try {
                //每隔1秒循环一次
                Thread.sleep( 1000 );//毫米为单位
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

