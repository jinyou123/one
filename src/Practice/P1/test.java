package Practice.P1;

public class test {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="张三";
        s1.age =18;
        s1.sex="男生";
        s1.school="北京大学";

        s1.getInfo();
        s1.getHello();
        s1.study();
        s1.useCredit();
    }


}
