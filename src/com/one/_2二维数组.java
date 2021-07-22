package com.one;

import java.util.Arrays;

public class _2二维数组 {
    public static void main(String[] args) {
        //1、声明
        int[][] a;
        int b[][];
        int[] c[];
        //2、创建二维数组
        a = new int[3][3];
        b = new int[3][];
        c = new int[3][3];
        //3、把1和2结合起来，声明的同时创建二维数组
        int[][] d = new int[3][3];
        //给第一行赋值
        int[] rowOne = new int[]{1};
        d[1] = rowOne;
        //给第二行赋值
        int[] rowTwo = new int[]{4,5,6};
        d[2] = rowTwo;
        //给第三行赋值
        int[] rowThree = new int[]{7,8};
        d[3] = rowThree;


        //4、在声明并创建的同时，完成初始化
        int[][] e = {
                {1, 2, 3,},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] f = new int[][]{
                {1, 2, 3},
                {4, 5},
                {7, 8, 9}
        };
        //5、遍历二维数组,方式一
        for (int i = 0; i < f.length; i++) {
            int[] row = f[i];//，每一列的值
           // System.out.println(Arrays.toString(row));//打印数组所有的元素
            //遍历行数组，获取每列值
            for (int j = 0; j < row.length; j++) {
                int column = row[j];
                System.out.print(column + "\t");
            }
            System.out.println("\n");
        }

        //方式2遍历
        for (int i = 0;i<e.length;i++){
            for (int j=0;j<a[i].length;j++){
                int values = e[i][j];
                System.out.print(values+"\t");
            }
            System.out.println();
        }
    }

}
