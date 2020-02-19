package designpatterns.structural.adapter;

public class Iphone4sTo6ChargerAtapter implements Iphone6Charger{
    Iphone4sCharger iphone4sCharger = new Iphone4sChargerImpl();

    @Override
    public void chargeIphone6() {
        iphone4sCharger.chargeIphone4s();
    }
}