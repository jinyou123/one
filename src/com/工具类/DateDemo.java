package com.工具类;

import javax.swing.tree.DefaultTreeCellEditor;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        //创建对象

        //获取当前系统日期
        Date now = new Date();
        System.out.println(now);//Wed Jul 28 13:57:57 CST 2021

        //获取指定毫秒值的具体日期
        Date date = new Date(17853293734L);
        System.out.println(date);//Sun Jul 26 23:14:53 CST 1970

        //常用方法

        System.out.println(date.getTime());//17853293734

        System.out.println("当前系统毫秒值"+new Date().getTime());//当前系统毫秒值1627452074137
        System.out.println("当前系统毫秒值"+System.currentTimeMillis());//当前系统毫秒值1627452074137



    }
}
