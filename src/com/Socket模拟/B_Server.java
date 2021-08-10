package com.Socket模拟;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//服务器
public class B_Server {
    public static void main(String[] args) {
        try {
            //1、创建服务号，并且指定端口号
            ServerSocket ss = new ServerSocket( 8081 );
            System.out.println("服务器启动.....");
            //2.等待客户端连接
            Socket socket = ss.accept();//阻塞式方法，直到用户连接才会执行后续代码
            System.out.println("有新的客户连接进来了："+socket.getInetAddress()+" "+socket.getPort());
           //5.接收客户端消息
            while (true) {
                BufferedReader reader = new BufferedReader( new InputStreamReader( socket.getInputStream() ) );//一行一行读
                String content = reader.readLine();
                System.out.println( "客户端说：" + content );
                if("exit".equals( content )){
                    System.err.println("客户端xxx已退出");
                }
                //6、回复消息给客户端
                PrintWriter writer = new PrintWriter( new OutputStreamWriter( socket.getOutputStream() ) );
                //获取控制台用户输入的信息
                Scanner scanner = new Scanner( System.in );
                System.out.println( "服务端，请输入：" );
                String sendMessage = scanner.nextLine();
                writer.println( sendMessage );
                writer.flush();
                //判断服务器是否已经退出
                if("exit".equals( content )){
                   break;
                }
            }
            //7、接收服务器回应的消息
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
