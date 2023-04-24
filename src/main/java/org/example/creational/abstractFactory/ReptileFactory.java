package org.example.creational.abstractFactory;

import org.example.creational.abstractFactory.entities.Reptile;

public abstract class ReptileFactory {

    public Reptile createAnimalOfReptileType(){
        return createReptile();
    }

    public abstract Reptile createReptile();

}
