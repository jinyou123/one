package com.工具类;

import sun.java2d.pipe.SpanShapeRenderer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.SignStyle;
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
}
