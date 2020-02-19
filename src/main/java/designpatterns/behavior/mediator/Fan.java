package designpatterns.behavior.mediator;


public class Fan {
    private boolean isOn = false;

    public boolean isOn() {
        return isOn;
    }

    public void turnOn(){
        isOn = true;
    }

    public void turnOff(){
        isOn = false;
    }
}
