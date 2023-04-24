package org.example.creational.factory;

import org.example.creational.factory.entities.Mammal;

public abstract class MammalFactory {

   public Mammal createAnimalType(){
     Mammal animal = createAnimal();
     return animal;
   }

   public abstract Mammal createAnimal();

}
