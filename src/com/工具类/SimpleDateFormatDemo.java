package com.工具类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) {

        //format()日期----》字符串
        Date date = new Date();
        System.out.println(date);//Wed Jul 28 21:07:25 CST 2021

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyy/MM/dd HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyy年MM月dd日 HH:mm:ss");
        SimpleDateFormat sdf4 = new SimpleDateFormat("yyy年MM月dd日 HH:mm:ss a E");
        System.out.println(sdf1.format( date ));//2021-07-28 21:08:52
        System.out.println(sdf2.format( date ));//2021/07/28 21:08:52
        System.out.println(sdf3.format( date ));//2021年07月28日 21:08:52
        System.out.println(sdf4.format( date ));//2021年07月28日 21:08:52 下午 星期三


        //parse()字符串---》日期
        //注意：SimpleDateFormat中指定的日期格式必须与字符串日期格式一模一样
        String date1 = "2021-7-28";
        SimpleDateFormat sdf5 = new SimpleDateFormat( "yyy-MM-dd" );
        try {
            System.out.println(sdf5.parse( date1 ));//Wed Jul 28 00:00:00 CST 2021
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //调用日期装换工具类
        //日期----》字符串
        Date date2 = new Date(  );
        String useDate = DateUti.dateToString( date2 );
        System.out.println(useDate);//2021年07月28日 21:29:47


        //字符串---》日期
        String string = "2021年7月28日 21:08:52";
        Date date3 = DateUti.StringToDate( string );
        System.out.println(date3);//Wed Jul 28 21:08:52 CST 2021

    }
}
