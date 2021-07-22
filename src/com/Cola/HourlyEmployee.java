package com.Cola;

//按小时拿工资的员工，每月工资超出160小时的部分按照1.5倍工资发放。
// 属性：每小时的工资、每月工作的小时数
public class HourlyEmployee extends ColaEmpoyee {
    double hourSalary;
    int hour;

    public HourlyEmployee() {

    }

    public HourlyEmployee(String ename, int birth,double hourSalary,int hour) {
        super(ename, birth);
        this.hourSalary = hourSalary;
        this.hour = hour;
    }

    @Override
    public double getSalary(int month) {

        double totalSalary = 0;
        if (hour <= 160) {
            totalSalary = hourSalary * hour;
        } else {
            totalSalary = hourSalary * 160 + (hour - 160) * hourSalary * 1.5;
        }
        if (birth == month) {
            totalSalary = totalSalary + 100;
        }
        return totalSalary;
    }
}
