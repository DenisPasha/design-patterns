package org.example.abstractFactory;

import org.example.abstractFactory.entities.Reptile;

public abstract class ReptileFactory {

    public Reptile createAnimalOfReptileType(){
        return createReptile();
    }

    public abstract Reptile createReptile();

}
