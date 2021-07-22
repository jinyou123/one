package Practice.P1;

public class Student extends Person implements Consumer{

    String school;

    public void study(){

        System.out.println(super.name+"正在"+school+"学习");
    }

    @Override
    public void useCredit() {
        System.out.println(super.name+"使用了信用卡。");
    }
}
