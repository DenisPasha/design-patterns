package org.example.creational.factory;

public class DogFactory extends AnimalFactory{
    @Override
    public Animal createAnimalOfType() {
        return new Dog();
    }
}
