package com.工具类;

public class String类 {
    public static void main(String[] args) {
        //静态创建
        String str = "123";

        //动态创建
        //初始化一个新创建的String对象，使其表示一个空的字符串
        String str2 = new String();
        //初始化一个新创建的String对象，使其表示一个与参数相同的字符序列，换句话说：新创建的字符串是该参数字符串的副本
        String str3 = new String("中文");

        //分配一个新的字符串，它包含字符串缓冲区参数中当前包含的字符序列
        StringBuffer sb = new StringBuffer("true");
        String str4 = new String(sb);
        byte[] bytes = str3.getBytes();
        String str5 = new String();
        System.out.println(str3);

        System.out.println("=========================================");

        String s1 = "abc";//”abc“保存在常量池中
        String s2 = "abc";
        System.out.println(s1==s2);//true
        System.out.println(s1.equals(s2));//true

        String s3 = new String("abc");//”abc“保存在堆内存中
        String s4 = new String("abc");
        System.out.println(s3==s4);//false
        System.out.println(s3.equals(s4));//true

    }
}
