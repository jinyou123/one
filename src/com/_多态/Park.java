package com._多态;

public class Park {
//统一收费
    public static void chargeFree(Vehice vehice,int hour){
        vehice.freePay(hour);
    }

    public static void main(String[] args) {
        //汽车、
        chargeFree(new Bus(),2);
        // 货车、
        chargeFree(new Truck(),4);
        // 轿车
        chargeFree(new Car(),6);
    }
}
