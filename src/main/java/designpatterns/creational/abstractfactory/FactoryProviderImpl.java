package designpatterns.creational.abstractfactory;

public class FactoryProviderImpl implements FactoryProvider {
    Factory factory;
    Animal animal;

    @Override
    public Factory getFactory(String factoryType) {
        if (factoryType.toLowerCase().equals("animal")) {
            factory = new AnimalFactory();
            return factory;
        }
        return null;
    }
}
