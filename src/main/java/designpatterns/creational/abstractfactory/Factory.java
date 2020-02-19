package designpatterns.creational.abstractfactory;

public interface Factory{
    <T extends Animal & Color> T create(String animalType);
}