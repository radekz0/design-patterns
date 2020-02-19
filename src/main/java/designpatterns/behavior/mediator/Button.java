package designpatterns.behavior.mediator;

public class Button {
    private Mediator mediator;

    public void press(){
        mediator.press();
    }
}
