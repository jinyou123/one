package com.Socket模拟;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

//客户机
public class T_Cilent {
    public static void main(String[] args) {
        //3、连接服务器，并指定服务器的ip与端口
        try {
            Socket socket = new Socket( "192.168.1.104",8081);
            //4.给服务器发送消息
           /* OutputStream out = socket.getOutputStream();//字节流
            OutputStreamWriter outputWriter = new OutputStreamWriter( out );//字节流--》字符流
            PrintWriter writer = new PrintWriter( outputWriter );//一行一行输出的字符流
*/
           while (true){
            PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));//一行一行输出的字符流
            //获取控制台用户输入的信息
            Scanner scanner = new Scanner( System.in);
            System.out.println("客户端，请输入：");
            String sendMessage = scanner.nextLine();
            writer.println("sendMessage");
            writer.flush();
            //判断客户端是否需要退出，如果输入exit，终止循环，终止客户端进程
               if("exit".equals( sendMessage )){
                   break;
               }
            //7、接收服务器回应的消息
            BufferedReader reader = new BufferedReader(new InputStreamReader( socket.getInputStream()));//一行一行读
            String content = reader.readLine();
            System.out.println("服务器说："+content);
               //接收判断服务器是否已经退出
               if("exit".equals( content )){
                   System.out.println("服务器已退出");
               }
           }
       } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
