package com.one;

import java.util.Arrays;

public class _4冒泡排序 {
    public static void main(String[] args) {
        int[] a = new int[]{2,5,9,1,6};
        for (int i=1;i<a.length;i++){
            for (int j=0;j<a.length-1;j++){
                if(a[i]>a[j]){
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
            System.out.println("第"+i+"次："+Arrays.toString(a));
        }
    }
}
