package designpatterns.creational.factory;

/*
According to GoF, this pattern “defines an interface for creating an object, but let subclasses decide which class to instantiate.
The Factory method lets a class defer instantiation to subclasses”.
When to use:
When the implementation of an interface or an abstract class is expected to change frequently
When the current implementation cannot comfortably accommodate new change
When the initialization process is relatively simple, and the constructor only requires a handful of parameters
*/

public class Main {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactoryImpl();
        Pizza pizza = pizzaFactory.getPizza("cheese");
        System.out.println(pizza.getType());
    }
}
