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
        System.out.println(s1 == s2);//true
        System.out.println(s1.equals(s2));//true

        String s3 = new String("abc");//”abc“保存在堆内存中
        String s4 = new String("abc");
        System.out.println(s3 == s4);//false
        System.out.println(s3.equals(s4));//true

        System.out.println("=======================");
        //常用方法：
        //连接操作符“+”
        System.out.println(5 + 6 + "A");//11A
        System.out.println(5 + "A" + 6);//5A6
        System.out.println("A" + 5 + 6);//A56
        System.out.println(5 + 6 + 'A');//76


        //byte[] char[] String之间的相互转换
        String str6 = "abc123中文abc";

        //getBytes()字符串--->字节数组
        byte[] b2 = str6.getBytes();
        System.out.println(b2);//[B@1540e19d

        //toCharArray()字符串----》字节数组
        char[] c = str6.toCharArray();
        System.out.println(c);//abc123中文abc

        //字节数组---》字符串
        String str7 = new String(b2);
        System.out.println(str7);//abc123中文abc
        //字符数组---》字符串
        String str8 = new String(b2);
        System.out.println(str8);//abc123中文abc

        //charAt() 根据指定的index查找字符
        String str9 = "jinyou123@qq.com";
        System.out.println(str9.charAt(3));//y

        //compareTo()根据字典顺序比较两个字符串大小，表示a-b的长度，等于0，表示相等
        System.out.println(str9.compareTo("jinyou"));//10
        System.out.println(str9.compareTo("jinyou123@qq.com"));//0
        System.out.println(str9.compareTo("jinyoully123@qq.com"));//-59

        //compareToIgnoreCase根据字典顺序比较两个字符串大小,不考虑大小写
        System.out.println(str9.compareToIgnoreCase("JINYOU123@qq.com"));//0

        //equals()比较大小写
        System.out.println(str9.equals("jinyou123@qq.com"));//true
        System.out.println(str9.equals("jinyou123@qq.con"));//false

        //equalsIgnoreCase忽略大小写比较
        System.out.println(str9.equalsIgnoreCase("JINYOU123@qq.com"));//true

        //concat（）拼接字符串，如果需要多次拼接，建议使用StringBuffer
        String str10 = "jinyou.lyl";
        str10 = str10.concat("123").concat("@").concat("qq.com");
        System.out.println(str10);//jinyou.lyl123@qq.com

        //contains()判断指定字符串是否包含指定字符
        System.out.println(str10.contains("@"));//true

        //indexOf()查找指定字符的下标---从左往右找
        System.out.println(str10.indexOf('@'));//13

        //lastIndexOf()查找指定字符的下标---从右往左找
        System.out.println(str10.lastIndexOf('.'));//16
        System.out.println(str10.lastIndexOf('#'));//-1,-1表示不存在

        //endsWith 以...结尾
        String t1 = "image.png";
        System.out.println(t1.endsWith(".png"));//true
        System.out.println(t1.endsWith(".gif"));//false

        //startsWith ...开头
        String t2 = "赵某某";
        System.out.println(t2.startsWith("赵"));//true
        System.out.println(t2.startsWith("孙"));//false

        //isEmpty()判断值是否为空，即判断长度>0
        String a = null;
        System.out.println("".isEmpty());//true
        System.out.println(" ".isEmpty());//false（空格）
        System.out.println("123".isEmpty());//false
        // System.out.println(a.isEmpty()); //java.lang.NullPointerException,空指针异常，调用的方法或属性的对象为空

        //length()获取字符串长度
        String t3 = "jinyou123@qq.com";
        System.out.println(t3.length());//16

        //split()分隔字符串
        String t4 = "张三；男；18岁；java1；123456789";
        String[] values = t4.split("；");
        for (String value : values) {
            System.out.println(value);
        }

        //replace()替换字符
        //敏感字符替换
        String t5 = "新发布了一个帖子，谈到党与政治问题，涉及习主席最近在党内的动态";
        String[] t6 = new String[]{"党", "政治", "习主席"};
        for (String older : t6) {
            t5 = t5.replace(older, "*");
            System.out.println(t5);
        }

        //replaceAll()替换掉所有符合正则表达式的字符
        String t7 = "河池2学院4在yizhou";
        System.out.println(t7.replaceAll("[0-9]", "*"));//河池*学院*在yizhou

        //substring(beginIndex)截取字符串，从指定开始位置，截取到末尾
        //substring(beginIndex,endIndex)截取字符串，从指定开始位置，截取得到指定位置结束，不包括结束位置
        String t8 = "jinyou@qq.com";
        System.out.println(t8.substring(t8.indexOf('@')));//从指定位置开始，截取到末尾  @qq.com
        System.out.println(t8.substring(0,t8.indexOf('@')));//从指定位置开始，截取得到指定位置结束，不包括结束位置  jinyou

        //toLowerCase()转小写
        //toUpperCase()转大写
        String t9 = "Hello World";
        System.out.println(t9.toLowerCase());//hello world
        System.out.println(t9.toUpperCase());//HELLO WORLD

        //trim()去首尾空格
        String t10 =" Hello World ";
        String t11 ="Hello World ";
        System.out.println(t10.trim());
        System.out.println(t11.trim());
        System.out.println(t10.equals(t11));//false


        //toString()转换字符串
        System.out.println(t10.toString());

        //valueOf将任意类型---》字符串
        String i = String.valueOf(12345);
        System.out.println(i);
    }
}
