package com.Socket模拟;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class T_ServerThread extends Thread {
    private Socket socket;
    public T_ServerThread(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            while (true) {
                BufferedReader reader = new BufferedReader( new InputStreamReader( socket.getInputStream() ) );//一行一行读
                String content = null;

                content = reader.readLine();

                System.out.println( "客户端说：" + content );
                if ("exit".equals( content )) {
                    System.err.println( "客户端xxx已退出" );
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
                if ("exit".equals( content )) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
