package designpatterns.creational.prototype;


/*
The Prototype pattern is generally used when we have an instance of the class (prototype)
and we'd like to create new objects by just copying the prototype.

Example:
In some games, we want trees or buildings in the background.
We may realize that we don't have to create new trees or buildings and render them on the screen every time the character moves.
https://www.baeldung.com/java-pattern-prototype

 */
public class Main {
    public static void main(String[] args) {
        PlasticTree plasticTree = new PlasticTree();
        PlasticTree plasticTree2 = (PlasticTree) plasticTree.copy();
    }
}