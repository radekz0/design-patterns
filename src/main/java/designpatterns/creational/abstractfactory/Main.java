package designpatterns.creational.abstractfactory;


/*
Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
It's a Factory of Factories.

When to use:
The client is independent of how we create and compose the objects in the system.
The system consists of multiple families of objects, and these families are designed to be used together
We need a run-time value to construct a particular dependency
Adding new objects can be challenging
*/

public class Main {

    public static void main(String[] args) {
        FactoryProvider factoryProvider = new FactoryProviderImpl();
        Factory factory = factoryProvider.getFactory("animal");
        Animal animal = factory.create("bear");
        System.out.println(animal.getType());
    }
}
