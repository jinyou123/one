package com.Cola;
//定义一个类Company，在该类中写一个方法，调用该方法可以打印出某个员工的工资数额，
// 写一个测试类TestCompany，
// 在main方法中，把若干各种类型的员工放在一个ColaEmployeeS数组里。并单元出每个员工当月的工资
public class Company {
    public static void printSalary(ColaEmpoyee colaEmpoyee,int month){
        double salary = colaEmpoyee.getSalary(month);
        System.out.println("员工["+colaEmpoyee.ename+"]第"+month+"月的工资："+salary);



    }
}
