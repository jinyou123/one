package com.文件;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * 将文件File.txt中的内容复制到文件file_bak.txt的文件中
 * 将文件1.jpg的内容复制到文件2.jpg的文件中
 * 等不同类型文件的拷贝，比如*.mp3, *.doc, *.pptx
 */
public class FileInputStreamAndFileOuputStream {
    public static void main(String[] args) {
        FileInputStream input = null;
        FileOutputStream output = null;
        try {
            //字节输入流
            input = new FileInputStream( "file/工具类.txt" );

            //字节输出流
            output = new FileOutputStream( "file/file_bak.txt",true );//true表示追加内容到文档末尾
            //循环读取外部文件内容
            byte[] b = new byte[3];//存储读到的数据
            int count = -1;//保存读取到的有效字节个数
            while ((count = input.read( b )) != -1) {
                //将读取的内容保存在b数组中
                System.out.println( "读取个数：" + count + " 当读取到的内容:" + Arrays.toString( b ) );

                //将b数组中的数据写出到file_bak.txt文件中
                output.write( b, 0, count );
            }
            output.write( '\n' );//换行符
            //注意：强制刷新暂存区
            output.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //注意二、，关闭资源 释放占用资源（从下往上关）
            try {
                if(output != null ){
                    output.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(input != null)
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
