package com.Socket模拟;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//服务器
public class T_Server {
    public static void main(String[] args) {
        try {
            //1、创建服务号，并且指定端口号
            ServerSocket ss = new ServerSocket( 8081 );
            System.out.println("服务器启动.....");
            while (true) {
                //2.等待客户端连接
                Socket socket = ss.accept();//阻塞式方法，直到用户连接才会执行后续代码
                System.out.println( "有新的客户连接进来了：" + socket.getInetAddress() + " " + socket.getPort() );
            //来一个客户端，开一个线程
                T_ServerThread t1 = new T_ServerThread(socket);
                t1.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
