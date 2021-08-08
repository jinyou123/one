package com.文件;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputSteamDemo {
    public static void main(String[] args) {

        try {
            //字节流 、输入流（字节输入流 ）
            FileInputStream input = new FileInputStream( "file/工具类.txt" );

            //一个字节一个字节读取，中文在UTF-8编码下占3个字节，英文和数字各占一个


          /*
            int content =-1;
          while ((content = input.read()) != -1){
                System.out.println(content);//每执行一次input.read()，先赋值给content，在判断content==-1
            }*/

        /*  //read(byte[] b)一个字节数组一个字节数组读
            byte[] b = new byte[3];//保存每次读取到的3个字节，建议使用1024的倍数，1024byte = 1kb，1024kb=1M....
            int count = input.read(b);//每读取一次，会将字节信息保存到b字节数组中，并返回int类型的读取个数
            System.out.println("读取个数："+count +"当次读取到的内容:"+ Arrays.toString(b));

*/
            byte[] b = new byte[3];
            int count =-1;
            while ((count =input.read( b )) !=-1){
                System.out.println("读取个数："+ count +" 当读取到的内容:"+ Arrays.toString(b));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
