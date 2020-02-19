package designpatterns.structural.adapter;

/*
Adapter design pattern is used when we can't directly connect two incompatible interfaces.
An adapter wraps an existing class with a new interface so it becomes compatible with client's interface.

*/

public class Main {
    public static void main(String[] args) {
        Iphone6Charger iphone6Charger = new Iphone4sTo6ChargerAtapter();
        Iphone6 iphone6 = new Iphone6();
        iphone6.setIphone6Charger(iphone6Charger);
        iphone6.chargeIphone();
    }
}
