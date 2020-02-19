package designpatterns.behavior.mediator;

/*The intent of the Mediator Pattern is to reduce the complexity and dependencies between tightly coupled objects communicating directly with one another.
This is achieved by creating a mediator object that takes care of the interaction between dependent objects. Consequently, all the communication goes through the mediator.

The Mediator Pattern is a good choice if we have to deal with a set of objects that are tightly coupled and hard to maintain.
This way we can reduce the dependencies between objects and decrease the overall complexity.
*/

public class Main {

    public static void main(String[] args) {
        Button button = new Button();
        button.press();
    }
}