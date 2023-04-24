package org.example.creational.factory;

import org.example.creational.factory.entities.Mammal;

public class Main {
    public static void main(String[] args) {

        //factory pattern

        DogFactory dogFactory = new DogFactory();
        Mammal dog = dogFactory.createAnimal();
        dog.speak();

        CatFactory catFactory = new CatFactory();
        Mammal cat = catFactory.createAnimalType();
        cat.speak();

    }
}
