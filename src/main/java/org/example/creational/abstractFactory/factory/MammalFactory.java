package org.example.creational.abstractFactory.factory;

import org.example.creational.abstractFactory.factory.entities.Mammal;

public abstract class MammalFactory {

   public Mammal createMammal(){
     Mammal animal = createAnimal();
     return animal;
   }

   public abstract Mammal createAnimal();

}
