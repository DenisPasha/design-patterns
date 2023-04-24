package org.example.creational.factory;

import org.example.creational.factory.entities.Mammal;
import org.example.creational.factory.entities.Cat;

public class CatFactory extends MammalFactory {

    @Override
    public Mammal createAnimal() {
        return new Cat();
    }
}
