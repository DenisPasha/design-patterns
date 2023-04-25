package org.example.creational.abstractFactory.factory;

import org.example.creational.abstractFactory.factory.entities.Reptile;

public abstract class ReptileFactory{

    public Reptile createAnimalType(){
      return  createReptile();
    }

    public abstract Reptile createReptile();
}
