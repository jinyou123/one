package com.工具类;

import java.util.Random;

public class Math类 {

    public static void main(String[] args) {
        //常用属性
        System.out.println(Math.PI);//圆周率
        System.out.println(Math.E);//自然对数底数

        //常用方法
        //abs()取绝对值
        System.out.println(Math.abs(123.875));//123.875
        System.out.println(Math.abs(-123.875));//123.875

        //ceil()向上取整，不会做四舍五入
        System.out.println(Math.ceil(123.123));//124.0
        System.out.println(Math.ceil(123.523));//124.0
        System.out.println(Math.ceil(-123.123));//-124.0

        //floor()向下取整
        System.out.println(Math.floor(123.123));//123.0
        System.out.println(Math.floor(123.523));//123.0
        System.out.println(Math.floor(-123.123));//-124.0


        //round()四舍五入
        System.out.println(Math.round(123.123));//123
        System.out.println(Math.round(123.523));//124
        System.out.println(Math.round(-123.123));//-123
        System.out.println(Math.round(-123.523));//-124

        //max()获取两者之间的最大值；min()获取两者之间的最小值
        System.out.println(Math.max(10,20));//20
        System.out.println(Math.min(10,20));//110

        //random()获取0.0~1.0之间的随机值
        System.out.println(Math.random());
        //获取0-10之间的随机整数值
        System.out.println(Math.round(Math.random()*10));


        double d =3.14159;//希望保留2位小数
        System.out.println((Math.round(d*100.00))/100.00);//3.14

        //Random类
        Random random = new Random();//随机生成器
        System.out.println(random.nextInt());//540371062随机生成int数范围内的整数
        System.out.println(random.nextInt(11));//随机生成0-10范围以内的整数值


        //随机生成长度为4的验证码，范围在26个大小写字母，与10个数字之间

        char[] chars = new char[]{'a','b','c','d','A','B','C','D','2','3','5','6','7','8'};
        String code = "";
        for(int i=0;i<4;i++){
            int index = random.nextInt(chars.length);
            code=code+chars[index];
        }
        System.out.println("随机验证码："+code);




    }
}
