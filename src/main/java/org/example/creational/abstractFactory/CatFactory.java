package org.example.creational.abstractFactory;

import org.example.creational.abstractFactory.entities.Cat;
import org.example.creational.abstractFactory.entities.Mammal;

public class CatFactory extends MammalFactory {
    @Override
    public Mammal createAnimal() {
        return new Cat();
    }
}
