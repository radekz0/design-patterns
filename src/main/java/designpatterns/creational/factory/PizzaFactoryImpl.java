package designpatterns.creational.factory;

public class PizzaFactoryImpl implements PizzaFactory {
    private Pizza pizza;

    @Override
    public Pizza getPizza(String pizzaType) {
        if(pizzaType.toLowerCase().equals("cheese"))
            pizza = new CheesePizza();
        else if(pizzaType.toLowerCase().equals("pepperoni"))
            pizza = new PepperoniPizza();
        return pizza;
    }
}
