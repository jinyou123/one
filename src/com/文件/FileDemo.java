package com.文件;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        //创建对象
        File file = new File( "file/工具类.txt" );
        //exists()判断文件是否存在
        System.out.println( file.exists() );
        if (!file.exists()) {
            boolean result = file.createNewFile();
            System.out.println( "创建结果：" + result );
        }

        // file.setReadOnly();//设置只读
        //常用属性
        System.out.println();
        System.out.println("文件名称："+file.getName());//文件名称：工具类.txt
        System.out.println("绝对路径："+file.getAbsoluteFile());//绝对路径：D:\javaEE\first\file\工具类.txt
        System.out.println("相对路径："+file.getPath());//相对路径：file\工具类.txt
        System.out.println("最后修改时间："+new Date(file.lastModified()));//最后修改时间：Sun Aug 01 15:04:21 CST 2021
        System.out.println("文件内容长度："+file.length());//文件内容长度：9（中文（utf-8）占3个字节，数字和英文各占一个字节）
        System.out.println("是否为目录（文件夹）："+file.isDirectory());//是否为目录（文件夹）：false
        System.out.println("是否为文件："+file.isFile());//是否为文件：true
        System.out.println("是否可读："+file.canRead());//是否可读：true
        System.out.println("是否可写："+file.canWrite());//是否可写：true

      /*  File temp = File.createTempFile( "前缀名" ,".doc");
        System.out.println(temp.getAbsoluteFile());*/


        File temp1 = File.createTempFile( "前缀名" ,".pptx");
        System.out.println(temp1.getAbsoluteFile());

        //删除文件
       // temp.delete();//使用完之后删除
        temp1.deleteOnExit();//当jvm虚拟退出之后在删除

        //list()获取指定文件夹下所有的文件名SString[]
        File file2 = new File( "file" );
        String[] files = file2.list();
        for(String fileNmae : files){
            if(fileNmae.indexOf( "前缀名" )!=-1){
                System.out.println(fileNmae);
            }
        }

        System.out.println("------------------------");

        //listFiles()获取指定文件夹下所有的文件File[]
        File[] fileArray = file2.listFiles();
        for(File file3 :fileArray){
            System.out.println(file3.getPath());
        }

        //mkdir()c创建一个文件夹
        File fileDri = new File("file/a");
        System.out.println(fileDri.getName()+"是否创建成功："+fileDri.mkdir());

        //mkdirs()创建多个文件夹
        File fileDri1 = new File("file/a/b/c");
        System.out.println(fileDri.getName()+"是否创建成功："+fileDri1.mkdirs());



    }

}
