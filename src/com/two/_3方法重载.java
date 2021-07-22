package com.two;

public class _3方法重载 {

//被重载的方法
    public static double add(double x,double y){
        double sum =x+y;
        return sum;
    }
    //参数类型不一致
    public static int add(int x,int y){
        int sum =x+y;
        return sum;
    }

    //参数个数不一致
    public static double add(double x,double y,double z){
        double sum =x+y+z;
        return sum;
    }

    //参数顺序不一致
    public static double add(int x,double y){
        double sum =x+y;
        return sum;
    }

    //参数顺序不一致
    public static double add(double x,int y){
        double sum =x+y;
        return  sum;
    }

//main方法
    public static void main(String[] args) {
        //被重载的方法
        System.out.println(add(10.5,20.5));//31.0
        //参数类型不一致
        System.out.println(add(10,20));//30
        //参数个数不一致
        System.out.println(add(10,20,30));//60.0
        //参数顺序不一致
        System.out.println(add(20.5,30));//50.5

        System.out.println(add(20,10.5));//30.5

    }
}
