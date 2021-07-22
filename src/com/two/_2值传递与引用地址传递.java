package com.two;

import java.util.Arrays;

public class _2值传递与引用地址传递 {

    public static void getMonthSal(double sal) {
        double total = sal + 800 + 500;
        System.out.println("getMonthSal:" + total);//1600.0
    }

    public static void getValues(int[] a){
        a[1]=100;
        System.out.println("getValues:"+a);//getValues:[I@1540e19d(获取数组的地址)
        System.out.println("getValues:"+Arrays.toString(a));//getValues:[1, 100, 5, 7]
    }

    public static void main(String[] args) {

        //1、值传递：基本数据类型、String类型
        double total = 5000;
        //调用方法，获取计算后的薪资
        getMonthSal(300);
        System.out.println("main:"+total);//5000.0

        //2、引用地址传递--引用类型
        int[] a = new  int[]{1,3,5,7};
        getValues(a);
        System.out.println("main:"+a);//main:[I@1540e19d
        System.out.println("main:"+Arrays.toString(a));//getValues:[1, 100, 5, 7]

    }
}
