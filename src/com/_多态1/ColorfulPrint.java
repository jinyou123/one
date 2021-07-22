package com._多态1;
//彩色打印机
public class ColorfulPrint extends Printer {
    @Override
    public void print() {
        System.out.println("打印机，打印中...彩色");
    }
}
