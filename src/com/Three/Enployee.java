package com.Three;

public class Enployee {
    String name;
    String sex;
    int age;
    double salary;

    public void getDtail() {
        System.out.println("name:" + name + "  " + "sex:" + sex + "  " + "age:" + age + "  " + "salary:" + salary);
    }

    public void getSalary() {
        System.out.println("salary:" + (salary + 500));
    }

    public Enployee() {
        System.out.println("new Enployee()实例化");
    }

    public Enployee(String name, String sex, int age, double salary) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.salary = salary;
    }
}
