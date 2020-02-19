package designpatterns.behavior.strategy;

/*
Essentially, the strategy pattern allows us to change the behavior of an algorithm at runtime.

*/

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Discounter easterDiscounter = new EasterDiscounter();

        BigDecimal discountedValue = easterDiscounter.applyDiscount(BigDecimal.valueOf(100));
        System.out.println(discountedValue);
    }
}