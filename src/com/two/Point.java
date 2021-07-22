package com.two;

import org.omg.PortableServer.POA;

/**
 * 定义一个点类Point：
 * 1、包含2个成员变量x、y分别表示x和y坐标
 * 2、2个构造器point（）和point（int x0,int y0）,
 * 3、以及一个movePoint（int dx,int dy）方法实现点的位置移动，
 * 4、创建两个Point对象p1、p2，分别调用movePoint方法后，打印p1和p2的坐标
 */
public class Point {
    int x;
    int y;

    public  Point(){

    }
    public Point(int x0,int y0){
        x=x0;
        y=y0;
    }

    public void movePoint(int dx,int dy) {
        x = x+dx;
        y = y +dy;

    }

    public static void main(String[] args) {
        Point p1 = new Point(20,10);
        Point p2 = new Point(10,15);

        p1.movePoint(12,5);
        p2.movePoint(-5,-2);

        System.out.println("p1的当前位置为："+p1.x+"\t"+p1.y);
        System.out.println("p2的当前位置为："+p2.x+"\t"+p2.y);
    }
}
