package com.Three;

public class Officer extends Enployee{
    String department;
    public void vehicleAllowance(){
        System.out.println("交通补贴："+300);
    }

    //构造函数
    public Officer() {
        System.out.println("new officer()实例化");
    }

    public Officer(String name, String sex, int age, double salary, String department) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.salary = salary;
        this.department=department;
    }
}
