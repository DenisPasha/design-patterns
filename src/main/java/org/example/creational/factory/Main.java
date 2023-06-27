package org.example.creational.factory;

public class Main {
    public static void main(String[] args) {

        // factory method
        AnimalFactory factoryCat = new CatFactory();
        Animal animalOfType = factoryCat.createAnimalOfType();

        AnimalFactory factoryDog = new DogFactory();
        Animal animalOfType1 = factoryDog.createAnimalOfType();
        System.out.println();
    }
}
