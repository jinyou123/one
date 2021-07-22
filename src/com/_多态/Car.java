package com._多态;
//轿车：8元/小时
public class Car extends Vehice{
    //覆盖父类的方法，因为父类方法不满足计算需求
    @Override
    public void freePay(int hour) {
        System.out.println("轿车：8元/小时，您当前停车"+hour+
                "小时，需要付费"+(hour*8)+"元");
    }
}
