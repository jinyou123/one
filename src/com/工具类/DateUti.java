package com.工具类;

import sun.java2d.pipe.SpanShapeRenderer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.SignStyle;
import java.util.Calendar;
import java.util.Date;

public class DateUti {
    //日期---》字符串
    private static SimpleDateFormat sdf = new SimpleDateFormat( "yyy年MM月dd日 HH:mm:ss" );

    public static String dateToString(Date date) {
        return sdf.format( date );
    }


    //字符串----》日期

    public static Date StringToDate(String string) {
        try {
            return sdf.parse( string );
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    //Date日期---》Calendar日历
    public static Calendar dateToCalendar(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime( date );
        return  calendar;
    }

    //Calendar日历----》Date日期
    public static Date calendarDate(Calendar calendar){

        return calendar.getTime();
    }
}
