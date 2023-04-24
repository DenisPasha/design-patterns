package org.example.abstractFactory;

import org.example.abstractFactory.entities.Cat;
import org.example.abstractFactory.entities.Mammal;

public class CatFactory extends MammalFactory {
    @Override
    public Mammal createAnimal() {
        return new Cat();
    }
}
