package com.文件;

import java.io.*;

/**
 * 一行一行读取数据
 * 节点流：可以直接操作数据源
 * <p>
 * 处理流：不可以直接操作数据源
 */
public class BufferedReaerAndBufferWriter {
    public static void main(String[] args) {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {

            /**
             * 字符输入流
             * */
            //字节输入流（节点流）
            FileReader fr = new FileReader( "file/工具类.txt" );
            //字符输入流（处理流）
            reader = new BufferedReader( fr );
            //字节输出流（处理流）
            FileWriter fw = new FileWriter( "file/file_bak.txt" );
            writer = new BufferedWriter( fw );
            //当返回值为null时，表示读取完成
            String content = null;
            while ((content = reader.readLine()) != null) {
                System.out.println( content );
                //写入文件
                writer.write( content );
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(writer != null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                if (reader != null){
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}