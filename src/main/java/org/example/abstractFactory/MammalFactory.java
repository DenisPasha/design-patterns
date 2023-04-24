package org.example.abstractFactory;

import org.example.abstractFactory.entities.Cat;
import org.example.abstractFactory.entities.Mammal;
import org.example.abstractFactory.entities.Dog;


public class MammalFactory {
    public Mammal createDog(){
        return new Dog();
    }
    public Mammal createCat(){
        return new Cat();
    }
}
