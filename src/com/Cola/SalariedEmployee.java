package com.Cola;
//ColaEmployee的子类，拿固定的工作的员工，属性：月薪
public class SalariedEmployee extends ColaEmpoyee {
    double monthSalary;

    public SalariedEmployee() {

    }

    public SalariedEmployee(String ename, int birth,double monthSalary) {
        super(ename, birth);
        this.monthSalary =monthSalary;
    }

    @Override
    public double getSalary(int month) {
        double totalSalary=monthSalary;
        if (birth==month) {
            totalSalary = totalSalary + 100;
        }
        return totalSalary;
    }
}
