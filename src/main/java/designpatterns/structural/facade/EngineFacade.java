package designpatterns.structural.facade;

public class EngineFacade {

    public static void turnOnEngine(){
        FuelPump.pumpGas();
        FuelInjector.injectGas();
        Starter.turnOn();
    }
}
