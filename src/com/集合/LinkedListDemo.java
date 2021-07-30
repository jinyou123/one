package com.集合;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        //创建对象
        LinkedList list1 = new LinkedList(  );

        list1.add( null );
        list1.add( null );
        list1.add( "123" );
        list1.add( 555 );
        list1.add( new int[]{1,2,3,4} );
        list1.add( '中');

        System.out.println(list1);

        //扩展常用的方法：比ArrayList多的方法

        //addFirst()在头部添加元素
        list1.addFirst( "头部元素" );
        System.out.println(list1);//[头部元素, null, null, 123, 555, [I@1540e19d, 中]

        //addLast()在尾部添加元素
        list1.addLast( "尾部元素" );
        System.out.println(list1);//[头部元素, null, null, 123, 555, [I@1540e19d, 中, 尾部元素]

        //getFirst()获取第一个元素
        System.out.println(list1.getFirst());//头部元素
        //getLast()获取最后一个元素
        System.out.println(list1.getLast());//尾部元素

        //removeFirst()移除并返回第一个元素
        System.out.println(list1.removeFirst());//头部元素
        System.out.println(list1);//[null, null, 123, 555, [I@1540e19d, 中, 尾部元素]

        //removeLast()移除并返回最后一个元素
        System.out.println(list1.removeLast());//尾部元素
        System.out.println(list1);//[null, null, 123, 555, [I@1540e19d, 中]
    }
}
