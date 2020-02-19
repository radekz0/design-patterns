package designpatterns.creational.factory;

public class CheesePizza implements Pizza {
    @Override
    public String getType() {
        return "cheese";
    }
}
