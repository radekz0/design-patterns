package designpatterns.structural.adapter;

public class Iphone6 {
    Iphone6Charger iphone6Charger;

    public void setIphone6Charger(Iphone6Charger iphone6Charger) {
        this.iphone6Charger = iphone6Charger;
    }

    public void chargeIphone(){
        iphone6Charger.chargeIphone6();
    }
}
