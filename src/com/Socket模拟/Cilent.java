package com.Socket模拟;

import java.io.*;
import java.net.Socket;

//客户机
public class Cilent {
    public static void main(String[] args) {
        //3、连接服务器，并指定服务器的ip与端口
        try {
            Socket socket = new Socket( "192.168.1.104",8080);
            //4.给服务器发送消息
           /* OutputStream out = socket.getOutputStream();//字节流
            OutputStreamWriter outputWriter = new OutputStreamWriter( out );//字节流--》字符流
            PrintWriter writer = new PrintWriter( outputWriter );//一行一行输出的字符流
*/
            PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));//一行一行输出的字符流
            writer.println("hello");
            writer.flush();
            //7、接收服务器回应的消息
            BufferedReader reader = new BufferedReader(new InputStreamReader( socket.getInputStream()));//一行一行读
            String content = reader.readLine();
            System.out.println("服务器说："+content);
       } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
