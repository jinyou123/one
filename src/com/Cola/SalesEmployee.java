package com.Cola;

//销售人员，工资由月销售额和提成率决定。
// 属性：月销售额，提成率
public class SalesEmployee extends ColaEmpoyee {
    double salary;
    double rate;

    public SalesEmployee() {

    }

    public SalesEmployee(String ename, int birth,double salary,double rate) {
        super(ename, birth);
        this.salary = salary;
        this.rate = rate;
    }

    @Override
    public double getSalary(int month) {
        double totalSalary=salary*rate;
        if (birth == month){
            totalSalary = totalSalary+100;
        }
        return totalSalary;
    }
}
