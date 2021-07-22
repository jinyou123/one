package com.two;
//创建一个球员类，并且该类最多允许创建十一个对象。提示利用static和封装来完成
public class Player {
    static int sum;

    public Player() {

    }
    //普通方法：创建一个球队
    static void Create() {
        while (true) {
            //未满员
            if (sum < 11) {
                Player players = new Player();
                sum++;
                System.out.println("创建了一个对象");
                //满员
            } else {
                System.out.println("对不起，已经创建了11个对象，不能在创建了");
                break;
            }

        }
    }
    public static void main(String[] args) {
        //球队
        Player[] team = new Player[11];
        //创建一个球队
        Player.Create();

    }
}
