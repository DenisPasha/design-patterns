package org.example.creational.abstractFactory.factory;

import org.example.creational.abstractFactory.factory.entities.Cat;
import org.example.creational.abstractFactory.factory.entities.Mammal;

public class CatFactory extends MammalFactory {

    @Override
    public Mammal createAnimal() {
        return new Cat();
    }
}
