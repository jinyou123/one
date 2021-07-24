package com.工具类;

public class WrapperDemo {
    public static void main(String[] args) {

        //基本数据类型-----》包装类
        int num = 10;
        Integer integer = new Integer(num);
        System.out.println(integer.MAX_VALUE + "  " + integer.MIN_VALUE);//2147483647  -2147483648

        byte b = 10;
        Byte bytes = new Byte(b);
        System.out.println(bytes.MIN_VALUE + " " + bytes.MIN_VALUE);//-128 -128

        //字符串----》包装类
        String str = "101";
        Integer integer1 = new Integer(str);//通过包装类构造函数Integer（String str）
        Integer integer2 = Integer.valueOf(str);
        System.out.println(integer1+"----"+integer2);//101----101

        //isDigit()判断一个字符是否为数字
        System.out.println(Character.isDigit('3'));//true
        System.out.println(Character.isDigit('a'));//false

        //isLetter()判断一个字符是否为字母
        System.out.println(Character.isLetter('3'));//false
        System.out.println(Character.isLetter('a'));//true

        //isLowerCase()判断一个字符是否为小写字母
        System.out.println(Character.isLowerCase('a'));//true
        System.out.println(Character.isLowerCase('A'));//false

        //包装类--》基本数据类型
        Integer integer3 = new Integer(200);
        int num1 = integer3.intValue();//

        Double doubles = new Double(200.10);
        double d = doubles.doubleValue();
        System.out.println(d);//200.1

        //包装类---》字符串
        Integer integer4 = new Integer(300);
        String str2 = integer4.toString();
        System.out.println(str2);//300

        //字符串---》基本数据类型
        String str3 = "123";
        int num2 = Integer.parseInt(str3);
        System.out.println(num2);//123

        //基本数据类型---》字符串
        int num3= 120;
        String str4 = num3+"";
        String str5 = String.valueOf(num3);
        System.out.println(str4);
        System.out.println(str5);

        //自动装箱与自动拆箱

        //自动装箱:基本数据类型---》包装类
        int num4 = 134;
        Integer integer5 = num4;
        System.out.println(integer5);//134
        //自动拆箱:包装类----》基本数据类型
        Integer integer6 = new Integer(190);
        int num5 =integer6;
        System.out.println(num5);//190

    }
}
