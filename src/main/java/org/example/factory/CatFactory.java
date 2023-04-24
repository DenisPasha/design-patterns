package org.example.factory;

import org.example.factory.entities.Mammal;
import org.example.factory.entities.Cat;

public class CatFactory extends MammalFactory {

    @Override
    public Mammal createAnimal() {
        return new Cat();
    }
}
