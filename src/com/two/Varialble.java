package com.two;

public class Varialble {

    //静态变量
    static String name="scott";

    //定义一个实例变量
    String sex;

    //局部变量
    public  void getMethod(int age) {
        String telePhon = "1234567";
    }

    public static void main(String[] args) {

        //使用“类名.变量名”的方式访问
        System.out.println(Varialble.name);

        //定义一个实例,并指定实例名称v1
        Varialble v1 = new Varialble();
        v1.name = "张三";
        v1.sex="男";
        System.out.println(v1.name+"   "+v1.sex);

        //匿名名称：不定义对象的句柄，而是直接调用这个对象的方法
        new Varialble().getMethod(20);


    }
}
