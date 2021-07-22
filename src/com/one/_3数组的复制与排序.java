package com.one;

import java.util.Arrays;

public class _3数组的复制与排序 {
    public static void main(String[] args) {
        //源数组
        int[] src = new int[]{1,2,3,4,5};
        //目标数组
        int[] dest = new  int[]{6,7,8,9,10,11,12};
        //复制之前
        System.out.println("源数组复制之前"+Arrays.toString(src));
        System.out.println("目标数组复制之前"+Arrays.toString(dest));

        System.arraycopy(src,0,dest,0,src.length);
        //复制之后
        System.out.println("源数组复制之后"+Arrays.toString(src));
        System.out.println("目标数组复制之后"+Arrays.toString(dest));


        //-----------------------------------------------------------------
        //对数组进行升序排序
        int[] a = new int[]{1,5,2,8,4};
        System.out.println("数组排序之前："+Arrays.toString(a));
        Arrays.sort(a);//排序
        System.out.println("数组排序之后："+Arrays.toString(a));
        System.out.println("\n");

        //降序
        for(int i=a.length-1;i>=0;i--){
            System.out.print(+a[i]+"\t");
        }
    }
}
