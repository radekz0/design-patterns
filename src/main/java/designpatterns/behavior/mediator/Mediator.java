package designpatterns.behavior.mediator;

public class Mediator implements OperateFan {
    private Button button;
    private Fan fan;

    @Override
    public void press(){
        if(fan.isOn()){
            fan.turnOff();
        }else{
            fan.turnOn();
        }
    }
}
