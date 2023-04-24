package org.example.factory;

import org.example.factory.entities.Mammal;
import org.example.factory.entities.Dog;

public class DogFactory extends MammalFactory {
    @Override
    public Mammal createAnimal() {
        return new Dog();
    }
}
