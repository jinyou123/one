package com.工具类;

public class StringBufferDemo {
    //线程安全的可变字符序列
    public static void main(String[] args) {
        //创建对象
        //构造一个其中不带字符串缓冲区，初始容量为16个字符
        StringBuffer sb1 = new StringBuffer();
        //构造一个不带字符，但具有指定初始容量的字符缓冲区
        StringBuffer sb2 = new StringBuffer(70);
        //构造一个字符串缓冲区，并将其内容初始化为指定的字符串内容
        StringBuffer sb3 = new StringBuffer("123zhonwen中文");

        /**
         * 常用方法
         * */
        //append()追加字符串
        StringBuffer sb4 = new StringBuffer("123abc");
        sb4.append("ture").append("zhongwen");
        System.out.println(sb4);//123abcturezhongwen

        String str = "123abc";
        String str1 = str.concat("ture").concat("zhongwen") ;
        System.out.println(str1);//123abcturezhongwen

        //capacity()获取容量
        System.out.println(sb1.capacity());//16
        System.out.println(sb2.capacity());//70
        System.out.println(sb3.capacity());//28


        //delete(begin,end)删除指定开始位置到结束的字符串，包括开始位置，不包括结束位置
        StringBuffer sb5 = new StringBuffer("123abc");
        System.out.println(sb5.delete(3,sb5.length()));//123
        System.out.println(sb5.length());//5

        //deleteCharAt()删除指定位置的字符
        System.out.println(sb5.deleteCharAt(0));//23

        //insert(index,obj)在指定位置新增一个字符
        System.out.println(sb5.insert(0,1));//123
        System.out.println(sb5.insert(sb1.length(),"abc"));//abc123

        //reverse()颠倒字符串，用于判断字符串是否为回文数；例如：123abc----cba321
        System.out.println(sb5.reverse());

        //setCharAt(index,char)在指定index位置使用指定char替换字符
        sb1.setCharAt(0,'a');
        System.out.println(sb5);

        //toString()将对象转换为字符串
        System.out.println(sb5.toString());


    }
}
