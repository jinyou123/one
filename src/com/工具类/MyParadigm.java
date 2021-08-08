package com.工具类;

public class MyParadigm<E> {

    //属性
    private  E name;

    //构造函数
    public MyParadigm(){

    }

    public MyParadigm(E name) {
        this.name = name;
    }

    //访问器
    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    public void getType(){
        System.out.println(this.name.getClass().getName());
    }
}
