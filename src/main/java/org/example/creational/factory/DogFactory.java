package org.example.creational.factory;

import org.example.creational.factory.entities.Mammal;
import org.example.creational.factory.entities.Dog;

public class DogFactory extends MammalFactory {
    @Override
    public Mammal createAnimal() {
        return new Dog();
    }
}
