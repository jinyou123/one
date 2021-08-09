package com.Socket模拟;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//服务器
public class Server {
    public static void main(String[] args) {
        try {
            //1、创建服务号，并且指定端口号
            ServerSocket ss = new ServerSocket( 8080 );
            System.out.println("服务器启动.....");
            //2.等待客户端连接
            Socket socket = ss.accept();//阻塞式方法，直到用户连接才会执行后续代码
            System.out.println("有新的客户连接进来了："+socket.getInetAddress()+" "+socket.getPort());
           //5.接收客户端消息
            BufferedReader reader = new BufferedReader(new InputStreamReader( socket.getInputStream()));//一行一行读
            String content = reader.readLine();
            System.out.println("客户端说："+content);
            //6、回复消息给客户端
            PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            writer.println("您好，我在呢！");
            writer.flush();
            //7、接收服务器回应的消息
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
