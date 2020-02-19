package designpatterns.structural.decorator;

public class BubbleLights extends TreeDecorator {

    public BubbleLights(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    public String decorate(){
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights(){
        return " with Bubble lights";
    }
}
