package com.two;

public class Constructor {

    public static void main(String[] args) {
        Person p1 = new Person("zhangsan",22,173);
        Person p2 = new Person("lisi",44,174);
        p1.sayHello();
        p2.sayHello();
    }
}
