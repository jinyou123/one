package Practice.P1.p2;

import java.util.LinkedList;

/**
 * （1）、请使用LinkedList来模拟一个队列（先进先出的特性）
 * （2）、拥有放入对象的方法void put(Object o)
 * （3）、取出对象的方法Object get()
 * （4）、判断队列当中是否为空的方法boolean isEmpty();并且编写测试代码，验证你的队列是否正确
 * */
public class Queue {

    private  LinkedList list = new LinkedList(  );

    public void put (Object o){
        list.add( o );
    }

   public  Object get(){
        return  list.removeFirst();
    }

    boolean isEmpty(){
        return  list.isEmpty();//为空返回true，否则，返回false
    }

    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.put( "123" );
        queue.put( "abc" );
        queue.put( "中文" );

        while (!queue.isEmpty()){
            System.out.println(queue.get());

        }

    }
}
