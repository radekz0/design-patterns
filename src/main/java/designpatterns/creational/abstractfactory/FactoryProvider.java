package designpatterns.creational.abstractfactory;

public interface FactoryProvider {
    <T extends Factory> T getFactory(String factoryType);
}
