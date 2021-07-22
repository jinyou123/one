package com.two;

/**
 * 设计一个类Student，该类包括姓名、学号和成绩。
 * 设计一个方法，按照成绩从高到低的顺序输出姓名、学号和成绩信息
 */
public class Student {
    //成员变量
    String name;//姓名
    String no;//学号
    int score;//成绩

    //构造方法
    public Student() {
    }

    public Student(String name, String no, int score) {
        this.name = name;
        this.no = no;
        this.score = score;
    }

    public static void main(String[] args) {
        //创建四个学生信息
        Student stu1 = new Student("张三", "201910", 60);
        Student stu2 = new Student("李四", "201911", 70);
        Student stu3 = new Student("王五", "201912", 54);
        Student stu4 = new Student("赵六", "201913", 80);
        //将学生信息保存到数组
        Student[] student = new Student[]{stu1, stu2, stu3, stu4};
        //根据成绩排序
        for (int i = 1; i < student.length; i++) {
            for (int j = 0; j < student.length - 1; j++) {
                if (student[j].score < student[j + 1].score) {
                    Student stu = student[j];
                    student[j] = student[j + 1];
                    student[j + 1]= stu;
                }
            }
        }
        //排序后输出
        for (Student students : student) {
            System.out.println(students.name + "\t" + students.no + "\t" + students.score);
        }
    }
}
