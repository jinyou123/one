package com.文件;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 与Student类和StuClass类一起用
 * 对象序列化：对象---》字节序列化
 *
 * 注意;
 *      1、需要被实现序列化的对象必须实现序列化接口Serializable Externalizable中的任何一个
 *      2、如果有父类实现序列化接口，子类可以不再实现
 *      3、建议再需要实现序列化的类中显示serialVersionUIO
 *      4、如果指定属性不能被序列化，需隐藏，使用transient修饰,那所有属性被序列化时，使用默认值
 *      private transient int age;//表示该属性不会被序列化
 */
public class ObjectInputStreamAndObjectOutputStream {

    public static void main(String[] args) {

        FileOutputStream fos = null;//结点流
        ObjectOutputStream output = null;
        try {
            StuClass stuClass1 = new StuClass( 111, "JAVA1班" );
            Student zhangsan = new Student( 1, "张三", 18, "男", stuClass1 );
            System.out.println( zhangsan );

            //序列化到本地文件
            fos = new FileOutputStream( "file/zhangsan.txt" );
            output = new ObjectOutputStream( fos );//处理流

            output.writeObject( zhangsan  );
            output.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(output != null){
                    output.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
