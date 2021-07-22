package com.two;

public class ThisKey {

    //成员变量
    String name;
    String sex;

    //构造函数
    public ThisKey() {
        System.out.println("初始化界面，初始化当前对象.....");//初始化界面，初始化当前对象.....
    }

    public ThisKey(String name, String sex) {
        this();
        this.name = name;
        this.sex = sex;
        System.out.println(name+"   "+sex);//张三   男
        System.out.println("构造函数："+this);//构造函数：com.two.ThisKey@1540e19d
    }

    //成员方法
    public ThisKey getInstance() {
        //返回当前对象的引用
        return  this;
    }

    public static void main(String[] args) {
        ThisKey thisKey = new ThisKey("张三","男") ;
        System.out.println("main:"+thisKey);//构造函数：com.two.ThisKey@1540e19d

        ThisKey clone = thisKey.getInstance();
        System.out.println(clone);//com.two.ThisKey@1540e19d
    }
}
