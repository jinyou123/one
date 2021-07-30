package com.集合;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        //创建对象
        //构造一个具有初始容量为10的空列表
        ArrayList list1 = new ArrayList(  );

        //构造一个具有指定初始容量的空列表
        ArrayList list2 = new ArrayList( 70 );

        list1.add( null );
        list1.add( "123" );
        list1.add( 555 );
        list1.add( new int[]{1,2,3,4} );
        list1.add( '中');
        System.out.println(list1.toString());

        //list1.add(index,element)在指定index位置新增指定元素element
        list1.add( 0,"开始" );
        System.out.println(list1.toString());

        //clear()清除所有元素
       // list1.clear();
        //System.out.println(list1);

        //contains()判断是否包含指定元素
        System.out.println("是否包含\"123\":"+list1.contains( "123" ));//是否包含"123":true
        System.out.println("是否包含123:"+list1.contains( 123 ));//

        //get(index)通过index获取值
        System.out.println(list1.get( 2 ));//123

        //indexOf(obj)查找指定元素的下标，不存在返回-1-----从左往右找
        System.out.println(list1.indexOf( 123 ));//-1
        System.out.println(list1.indexOf( "123" ));//2

        //lastIndexOf(obj)查找指定元素的下标，不存在返回-1---从右往左找
        System.out.println(list1.lastIndexOf( '中' ));//5

        //remove(obj)移除指定元素，返回boolean操作结果
        System.out.println(list1.remove( null ));//true
        System.out.println(list1);//[开始, 123, 555, [I@1540e19d, 中]

        //remove(index)移除并返回指定元素
        System.out.println(list1.remove( 1 ));//123
        System.out.println(list1);//[开始, 555, [I@1540e19d, 中]

        //set(index,element)
        list1.set( 0,"star" );
        System.out.println(list1);//[star, 555, [I@1540e19d, 中]

        //size()获取大小
        System.out.println(list1.size());//4

        //toArray()集合---》数组
        Object[] objArray = list1.toArray();


        //数组遍历--------数组：长度obj.length,获取元素objArray[i]
        //方式一
        for (int i=0;i<objArray.length;i++){
            Object object = objArray[i];
            System.out.println(object);
        }

        //方式二
        for(Object object:objArray){
            System.out.println(object);
        }

        //集合遍历元素：集合：长度：list.size() 获取元素list.get(i)
        //方式三
        for(int i=0;i<list1.size();i++){
            Object obj = list1.get( i );
            System.out.println(obj);
        }

        //方式四

    }
}
