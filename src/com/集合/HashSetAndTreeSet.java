package com.集合;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetAndTreeSet {
    public static void main(String[] args) {
        //创建对象
        //构造一个新的空set，其底层HashMap，实例的默认初始容量是16，加载因子0.75

        HashSet set = new HashSet();
        set.add( null );
        set.add( "123" );
        set.add( "abc" );
        set.add( "中文" );
        set.add( '中' );
        System.out.println( set.toString() );

        //遍历：因为set无序的，所以不能通过下标index访问

        for (Object obj : set) {
            System.out.println( obj );
        }

        //Iterator:属于List集合特有
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println( obj );
        }

        System.out.println( "====================================================" );

        //构造一个新的空set，该set根据其元素的自然顺序进行排序

        TreeSet treeSet = new TreeSet();
        treeSet.add( 30 );
        treeSet.add( 15 );
        treeSet.add( 20 );
        treeSet.add( 10 );
        treeSet.add( 40 );
        treeSet.add( 35 );
        System.out.println(treeSet);
    }
}
