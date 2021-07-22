package com.Three;

public class Test {

    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.name = "张三";
        worker.age = 24;
        worker.sex = "男";
        worker.salary = 5000;

        //访问父类方法
        worker.getDtail();
        //访问自有的属性或者方法
        worker.dressAllowance();

        Officer officer = new Officer("李四","男",30,6000,"人事处");
        officer.getDtail();
    }
}
