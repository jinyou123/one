package com.工具类;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Calendar;
import java.util.Date;

public class Calendar类 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        //常用方法;

        //set()设置指定日期
        calendar.set(2020, 12, 31, 12, 30);
        System.out.println(calendar);

        //add()添加指定的时间（年，月，日，时，分，秒）
        calendar.add(calendar.YEAR, 1);//加1年
        calendar.add(calendar.MONTH, -2);//减两个月
        System.out.println(calendar);


        //get()获取指定日期的信息
        int year = calendar.get(calendar.YEAR);
        int month = calendar.get(calendar.MONTH);
        int date = calendar.get(calendar.DATE);
        System.out.println("year:"+year+",month:"+month+",date:"+date);

        //getTime() 日历类---》日期类
        Date date1 = calendar.getTime();
        System.out.println(date1);//Tue Nov 30 12:30:08 CST 2021

    }
}
