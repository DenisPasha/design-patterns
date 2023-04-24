package org.example.factory;

import org.example.factory.entities.Mammal;

public abstract class MammalFactory {

   public Mammal createAnimalType(){
     Mammal animal = createAnimal();
     return animal;
   }

   public abstract Mammal createAnimal();

}
