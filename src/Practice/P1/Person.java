package Practice.P1;

public class Person {
    String name;
    int age;
    String sex;

    public void getInfo(){
        System.out.println("我叫"+name+",今年"+age+"岁，是一个"+sex);
    }

    public void getHello(){

        System.out.println(name+"对你说：“hello!");

    }
}
