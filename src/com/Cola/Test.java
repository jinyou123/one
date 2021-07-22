package com.Cola;
//在main方法中，把若干各种类型的员工放在一个ColaEmployeeS数组里。并单元出每个员工当月的工资
public class Test {

    public static void main(String[] args) {
        //公司所有员工的数值
        ColaEmpoyee[] emps = new ColaEmpoyee[3];
        emps[0] = new SalariedEmployee("张三",10,1500);
        emps[1] = new HourlyEmployee("李四",3,30,159);
        emps[2] = new SalesEmployee("王五",6,100000,0.1);

        //打印每个员工的指定月份的工资

        for(ColaEmpoyee e:emps){
            Company.printSalary(e,3);

        }

    }
}
