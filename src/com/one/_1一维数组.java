package com.one;

public class _1一维数组 {
    public static void main(String[] args) {
        String[] a;//声明数组
        a = new String[3];//创建对象
        //存值
        a[0] = "a1";
        a[1] = "a2";
        a[2] = "a3";
        //获取数组长度并取值
        //  System.out.println("数值的长度为："+a.length+"\n"+a[0]+" "+a[2]);
        //遍历的方式进行取值
        for (int i = 0; i < a.length; i++) {
            //通过下标取值
            String key = a[i];
            System.out.println(key);
        }
        //增强for循环
        for (String j : a) {
            System.out.println("数组a的值为：" + j);
        }
        //-------------------------------------------------------
        int[] b = new int[]{1,2,3,4};
        for (int k:b){
            System.out.println("数组b的值为："+k);
        }

    }
}
