package com.Four;

public class Singleton {

    //创建自己的实例，并用private static修饰
    private static Singleton instance = new Singleton();
    //构造私有函数，用private修饰
    private  Singleton(){

    }
    //对外提供公共方法，访问实例，并用public static修饰
    public static Singleton getInstance(){
        return instance;
    }
}
