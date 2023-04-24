package org.example.creational.abstractFactory;

import org.example.creational.abstractFactory.entities.Mammal;

public abstract class MammalFactory {

    public Mammal createAnimalOfMammalType(){
        return createAnimal();
    }

    public abstract Mammal createAnimal();
}
