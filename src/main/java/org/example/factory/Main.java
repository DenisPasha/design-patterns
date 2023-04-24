package org.example.factory;

import org.example.factory.entities.Mammal;

public class Main {
    public static void main(String[] args) {

        //factory pattern

        DogFactory dogFactory = new DogFactory();
        Mammal dog = dogFactory.createAnimal();
        dog.speak();

        CatFactory catFactory = new CatFactory();
        Mammal cat = catFactory.createCat();
        cat.speak();

    }
}
