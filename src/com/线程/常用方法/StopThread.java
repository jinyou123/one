package com.线程.常用方法;

public class StopThread {
    public static void main(String[] args) {
        Thread3 t1 = new Thread3();
        t1.start();
        for (int i = 1; i < 20; i++) {
            System.out.println( "main:" + i );
            //制作条件，终止线程
            if(i%10==0){
                t1.setFlag( false );
                System.out.println("我终止了线程....");
            }
            try {
                Thread.sleep( 1000 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class Thread3 extends Thread {
    private boolean flag = true;//定义一个标识，判断循环是否需要终止

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        while (flag) {
            System.out.println( "say hello!" );
            try {
                Thread.sleep( 1000 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
