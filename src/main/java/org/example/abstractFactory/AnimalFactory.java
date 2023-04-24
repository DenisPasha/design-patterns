package org.example.abstractFactory;

import org.example.abstractFactory.entities.Mammal;
import org.example.abstractFactory.entities.Reptile;

public  class AnimalFactory {
    public MammalFactory createMammal(){
        MammalFactory mammalFactory = new MammalFactory();
        return mammalFactory;
    }

    public ReptileFactory createReptile(){
        return new ReptileFactory();
    }
}
