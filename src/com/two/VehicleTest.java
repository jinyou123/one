package com.two;

public class VehicleTest {
    public static void main(String[] args) {
        //初始化品牌与颜色
        Vehicle car = new Vehicle("benz","black");
        //car.Speed();//不可用，因为speed用private修饰，其他类无法访问
        // （即speed是私有化属性，对其他类不可见）
        //给速度speed赋值
        car.setSpeed(200);
        //获取benz的信息
        car.run();
    }
}
