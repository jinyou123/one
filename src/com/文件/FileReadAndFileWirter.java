package com.文件;

import java.io.*;
import java.util.Arrays;

public class FileReadAndFileWirter {
    public static void main(String[] args) {
        FileReader read = null;
        FileWriter writer = null;
        try {
            //字节输入流
            read = new  FileReader( "file/工具类.txt" );

            //字节输出流
            writer = new FileWriter( "file/file_bak.txt",true );//true表示追加内容到文档末尾
            //循环读取外部文件内容
            char[] c = new char[3];//存储读到的数据
            int count = -1;//保存读取到的有效字节个数
            while ((count = read.read( c )) != -1) {
                //将读取的内容保存在b数组中
                System.out.println( "读取到的字符个数：" + count + " 当读取到的内容:" + Arrays.toString( c) );

                //将b数组中的数据写出到file_bak.txt文件中
               //修改文件内容，读取到的内容全部转大小写；
                String str = new String( c,0,count );
                str = str.toUpperCase();
                writer.write( str );
            }
            //注意：强制刷新暂存区
            writer.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //注意二、，关闭资源 释放占用资源（从下往上关）
            try {
                if(writer != null ){
                    writer.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(read != null)
                    read.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
