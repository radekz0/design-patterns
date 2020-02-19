package designpatterns.structural.proxy;

/*
When we want to have a simplified version of an object(heavy initialization object) or access the object more securely.
When we want a local version of a remote object

*/

public class Main {
    public static void main(String[] args) {
        ExpensiveObject expensiveObject = new ExpensiveObjectProxy();
        expensiveObject.process();
        expensiveObject.process();
    }
}