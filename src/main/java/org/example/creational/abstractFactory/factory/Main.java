package org.example.creational.abstractFactory.factory;

import org.example.creational.abstractFactory.factory.entities.Mammal;
import org.example.creational.abstractFactory.factory.entities.Reptile;

public class Main {
    public static void main(String[] args) {

        //factory pattern

        DogFactory dogFactory = new DogFactory();
        Mammal dog = dogFactory.createAnimal();
        dog.speak();

        CatFactory catFactory = new CatFactory();
        Mammal cat = catFactory.createMammal();
        cat.speak();

        SnakeFactory snakeFactory = new SnakeFactory();
        Reptile reptile = snakeFactory.createReptile();
        reptile.speak();


    }
}
