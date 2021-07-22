package com.Four;

public class Singleton2 {

    //创建自己的实例，并用private static修饰
    private static Singleton2 instance = null;
    //构造私有函数，用private修饰
    private  Singleton2(){

    }
    //对外提供公共方法，访问实例，并用public static修饰
    public static  synchronized Singleton2 getInstance(){
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}
