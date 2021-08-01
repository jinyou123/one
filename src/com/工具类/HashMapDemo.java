package com.工具类;

import com.sun.corba.se.spi.ior.ObjectKey;

import java.security.KeyStore;
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        /**
         * 构造一个具有默认初始容量（16）和默认加载因子（0.75）的空HashMap

         * */

        HashMap map = new HashMap();
        map.put( null, null );
        map.put( null, "abc" );//null键会覆盖之前保存的null
        map.put( 123, 456 );
        map.put( 'A', '中' );
        map.put( true, false );
        System.out.println( map );

        //clear()清除所有的key=value的映射关系，不影响map对象的存在
       /* map.clear();
        System.out.println(map);*/

        //containsKey()判断是否存在指定key
        System.out.println( map.containsKey( 123 ) );//true

        //containsValues()判断是否存在指定values
        System.out.println( map.containsValue( 123 ) );//false

        //get()通过指定key获取对应value
        System.out.println( map.get( null ) );//abc

        //isEmpty()判断是否为空，如果size<=0,返回true，否则返回false
        System.out.println( map.isEmpty() );//false


        //remove(key)通过指定key移除对应的映射关系
        map.remove( null );
        System.out.println( map );//{A=中, 123=456, true=false}

        //size()获取映射关系的数量
        System.out.println( map.size() );//3

        System.out.println( "=============================" );

        //遍历map集合

        HashMap hashMap = new HashMap();
        hashMap.put( 1, "张三" );
        hashMap.put( 2, "李四" );
        hashMap.put( 3, "王五" );
        hashMap.put( 4, "赵六" );
        hashMap.put( 5, "小明" );
        System.out.println( hashMap );//{1=张三, 2=李四, 3=王五, 4=赵六, 5=小明}


        //keySet()------------------获取所有的【key键】的视图集合
        Set keys = hashMap.keySet();
        Iterator iterator = keys.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();//key键
            Object value = hashMap.get( key );//get()通过key键获取value值
            System.out.println( key + "  " + value );
        }

        //value()------------------获取所有的【value值】的视图集合
        Collection values = hashMap.values();
        Iterator it = values.iterator();
        while (it.hasNext()){
           Object value = it.next();
            System.out.println(value);
        }

        ////entrySet()------------------获取所有的【key键-value值】的视图集合
        Set entrySet = hashMap.entrySet();
        for (Object obj:entrySet){
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key+" "+value);
        }


    }
}
