package com.工具类;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        //addAll()往指定集合中批量添加元素
        Collections.addAll( list, "123", "abc", "true", '中' );
        System.out.println( list );//[123, abc, true, 中]

        ArrayList src = new ArrayList();
        src.add( 1 );
        src.add( 2 );
        src.add( 3 );


        ArrayList dest = new ArrayList();
        dest.add( 4 );
        dest.add( 5 );
        dest.add( 6 );
        dest.add( 7 );
        dest.add( 8 );

        //copy()将所有元素从一个列表复制到一个列表
        System.out.println( "src拷贝前：" + src );//src拷贝前：[1, 2, 3]
        System.out.println( "dest拷贝前：" + dest );//dest拷贝前：[4, 5, 6, 7, 8]

        Collections.copy( dest, src );

        System.out.println( "src拷贝后：" + src );//src拷贝后：[1, 2, 3]
        System.out.println( "dest拷贝后：" + dest );//dest拷贝后：[1, 2, 3, 7, 8]

    /*    //fill()填充集合
        Collections.fill( list,"空" );
        System.out.println(list);//[空, 空, 空, 空]*/

        //max()获取集合中最大值；min()获取集合中的最小值
        //注意：底层使用compareTo()进行比较，要求比较类型必须相同
        ArrayList list1 = new ArrayList();
        Collections.addAll( list1, 10, 20, 40, 30, 19 );
        System.out.println( Collections.max( list1 ) );//40
        System.out.println( Collections.min( list1 ) );//10

        //sort()默认升序排序
        Collections.sort( list1 );
        System.out.println(list1);//[10, 19, 20, 30, 40]

        //reverse()颠倒元素顺序
        Collections.reverse( list1 );
        System.out.println(list1);//[40, 30, 20, 19, 10]
    }

}
