package designpatterns.creational.singleton;

/*
The singleton pattern is a mechanism that ensures only one instance of an object exists per application.
This pattern can be useful when managing shared resources or providing cross-cutting services, such as logging.

A singleton might be garbage-collected once no one holds a reference to it. This issue does not lead to the presence
of multiple singleton instances at a time, but when recreated, the instance might differ from its previous version.

For resources that are expensive to create (like database connection objects)
It's good practice to keep all loggers as Singletons which increases performance
*/
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }
}
