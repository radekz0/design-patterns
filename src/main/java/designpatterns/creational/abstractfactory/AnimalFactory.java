package designpatterns.creational.abstractfactory;

public class AnimalFactory implements Factory {
    private Animal animal;

    @Override
    public Animal create(String animalType) {
        if(animalType.toLowerCase().equals("bear")){
            animal = new Bear();
            return animal;
        }
        else if(animalType.toLowerCase().equals("duck")){
            animal = new Duck();
            return animal;
        }
        return null;
    }
}