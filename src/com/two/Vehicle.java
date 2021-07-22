package com.two;

public class Vehicle {
    private String brand;//汽车品牌
    private String color;//汽车颜色
    private double speed;//速度

    public Vehicle() {
    }

    //至少提供一个有参的构造方法
    // （要求品牌和颜色可以初始化为任意值，但速度的初始值为0）；
    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }
    //为私有属性提供访问器方法。注意：汽车品牌一旦初始化之后就不能更改。
    public String getBrand() {
        return brand;
    }

    /*public void setBrand(String brand) {
        this.brand = brand;
    }*/

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
//定义一个一般方法run（），用打印语句描述汽车奔跑的功能
    public  void run(){
        System.out.println("品牌为"+brand+"，颜色为"+color+"的汽车正在以"+speed
                +"/小时的速度奔跑在高速公路上...");
    }
}

