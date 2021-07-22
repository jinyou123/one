package com.two;

public class XiYouJiRole {

    //成员变量（全局变量、属性）
    String name;   //姓名
    String wq;     //武器
    String zdl;   //战斗力
    String nl;     //耐力

    //构造无参函数
    public XiYouJiRole() {

    }

    //构造方法重载
    public XiYouJiRole(String p_name, String p_wq, String p_zdl, String p_nl) {
        name = p_name;
        wq = p_wq;
        zdl = p_zdl;
        nl = p_nl;
    }

    //成员方法（行为）
    public void getDetail() {
        System.out.println("角色名称：" + name + "\t" + "武器：" + wq + "\t" +
                "战斗力：" + zdl + "\t" + "耐力：" + nl);
    }


    public static void main(String[] args) {

        //实例化、具体化
        XiYouJiRole tangSeng = new XiYouJiRole();

        //通过.属性的方式赋值
        tangSeng.name = "唐僧";
        tangSeng.wq = "禅杖";
        tangSeng.zdl = "零颗星";
        tangSeng.nl = "五颗星";

        //实例化的同时完成初始化---实例化对象，并赋值

        XiYouJiRole suWuKong = new XiYouJiRole("孙悟空", "金箍棒", "五颗星", "五颗星");
        XiYouJiRole zhuBaJie = new XiYouJiRole("猪八戒", "九齿钉耙", "四颗星", "三颗星");
        XiYouJiRole saWuJing = new XiYouJiRole("沙悟净", "月牙铲", "四颗星", "四颗星");

        //通过.方法名（）的方法获取角色所有的信息
        tangSeng.getDetail();
        saWuJing.getDetail();
        zhuBaJie.getDetail();
        suWuKong.getDetail();

    }
}
