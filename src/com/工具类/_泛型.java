package com.工具类;

import org.omg.PortableInterceptor.INACTIVE;

import javax.sql.rowset.serial.SerialStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class _泛型 {
    public static void main(String[] args) {

        //list中使用
        //未使用泛型
        ArrayList list = new ArrayList();
        list.add( "abc" );
        list.add( "123" );
        list.add( true );
        list.add( 123 );
        list.add( '中' );

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println( obj + "的类型为："+getType( obj ) );
        }


        System.out.println("========================");

        //使用泛型
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add( 145 );
        list1.add( 345);
        list1.add( 768 );
        list1.add( 123 );

        Iterator<Integer> iterator1 = list1.iterator();

        while (iterator1.hasNext()) {
         Integer num = iterator1.next();
            System.out.println( num );
        }

        //map中使用
        HashMap<Integer,String> map = new HashMap<Integer,String>( );
        map.put( 10,"张三" );
        map.put( 20,"李四" );

        Set<Integer> keys = map.keySet();
        Iterator<Integer> iterator2 = keys.iterator();
        while (iterator2.hasNext()){
            Integer key = iterator2.next();
            String value = map.get( key );
            System.out.println(key+" "+value);
        }

    }

    public static String getType(Object obj) {

        if (obj instanceof String){
            return "String";
        }else if(obj instanceof Integer){
            return "Intetger";
        }
        return "----";

    }
}
