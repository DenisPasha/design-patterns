package org.example.abstractFactory;

import org.example.abstractFactory.entities.Mammal;
import org.example.abstractFactory.entities.Reptile;

public class Main {
    public static void main(String[] args) {

        //abstract factory method


        MammalFactory mammalFactory = new CatFactory();
        Mammal animalOfMammalType =
                mammalFactory.createAnimalOfMammalType();
        animalOfMammalType.speak();

        ReptileFactory reptileFactory = new SnakeFactory();
        Reptile animalOfReptileType = reptileFactory.createAnimalOfReptileType();
        animalOfReptileType.makeSound();

    }
}
