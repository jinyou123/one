package com._多态1;

public class Test {
    public static void PrintPhone(Printer printer){
        printer.print();
    }

    public static void main(String[] args) {
        PrintPhone(new ColorfulPrint());
        PrintPhone(new BandW());
    }
}
