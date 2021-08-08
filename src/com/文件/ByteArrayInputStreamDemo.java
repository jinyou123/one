package com.文件;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {
    //字节输入流：操作字节数组byte[]
    public static void main(String[] args) {

        byte[] b = new byte[]{1,2,3,4,5,6};
        ByteArrayInputStream input = new ByteArrayInputStream(b);
        int content = input.read();
        System.out.println(content);//1
        //剩余可读字节数量
        System.out.println(input.available());//5

        //mark()设置标记一。通常与reset()重置结合使用
        input.mark( 1 );

        //skip()跳跃指定字节，不读取
        input.skip( 3 );

        System.out.println(content);//1
        //剩余可读字节数量
        System.out.println(input.available());//2

        //reset()重置到最近的标记位置
        input.reset();

        System.out.println(content);//1
        //剩余可读字节数量
        System.out.println(input.available());//5

    }

}
