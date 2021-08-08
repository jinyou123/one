package com.文件;

import java.io.Serializable;
import java.security.PrivateKey;

public class Student implements Serializable {

    private int sid;
    private String sname;
    private  int age;//表示该属性不会被序列化
    private String sex;
    private  StuClass stuClass;//复合属性

    public  Student(){


    }    public Student(int sid, String sname, int  age, String sex, StuClass stuClass) {
        this.sid = sid;
        this.sname = sname;
        this.age = age;
        this.sex = sex;
        this.stuClass = stuClass;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public StuClass getStuClass() {
        return stuClass;
    }

    public void setStuClass(StuClass stuClass) {
        this.stuClass = stuClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", stuClass=" + stuClass +
                '}';
    }
}
