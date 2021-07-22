package com.Cola;
/**
 * 这是所有员工总的父类，属性：员工的姓名，员工的生日月份。方法：gerSalary(int month),
        * 根据参数月份来确定工资，如果该月员工过生日，则公司会额外奖励100元
        *
        * */
public class ColaEmpoyee {
    //员工的生日月份
    String ename;
    //员工的生日月份
    int birth;

    public ColaEmpoyee() {
    }

    public ColaEmpoyee(String ename, int birth) {
        this.ename = ename;
        this.birth = birth;
    }

    public double getSalary(int month){
        return 0;
    }


}
