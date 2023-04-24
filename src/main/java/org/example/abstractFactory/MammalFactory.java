package org.example.abstractFactory;

import org.example.abstractFactory.entities.Mammal;

public abstract class MammalFactory {

    public Mammal createAnimalOfMammalType(){
        return createAnimal();
    }

    public abstract Mammal createAnimal();
}
