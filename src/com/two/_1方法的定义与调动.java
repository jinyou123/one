package com.two;

public class _1方法的定义与调动 {
    public static void main(String[] args) {

        //相加运算
        double sum = add(10.5, 20.8);
        System.out.println("求和为：" + sum);

        //相减运算
        jiang(20, 10.5);

        //相乘运算
        double result = cheng();
        System.out.println("相乘为："+result);

        //除法运算
        chu();

    }



    //有参数，有返回值
    public static double add(double x, double y) {
        double sum = x + y;
        return sum;
    }

    //有参数，无返回值
    public static void jiang(double x, double y) {
        double sum = x - y;
        System.out.println("相减为：" + sum);
    }

    //无参数，有返回值
    public static double cheng() {
        double x = 3.4;
        double y = 5.2;
        double sum = x * y;
        return sum;
    }


    //无参数，无返回值
    public  static void chu(){
        double x=20;
        double y=4;
        double sum = x/y;
        System.out.println("相除为："+sum);
    }
}
