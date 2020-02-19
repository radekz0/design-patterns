package designpatterns.structural.decorator;

/*
When we want to enhance the behavior or state of objects
*/

public class Main {

    public static void main(String[] args) {
        ChristmasTree christmasTree = new BubbleLights(new ChristmasTreeImpl());
        System.out.println(christmasTree.decorate());
    }
}
