package org.example.creational.abstractFactory.factory;

import org.example.creational.abstractFactory.factory.entities.Dog;
import org.example.creational.abstractFactory.factory.entities.Mammal;

public class DogFactory extends MammalFactory {
    @Override
    public Mammal createAnimal() {
        return new Dog();
    }
}
