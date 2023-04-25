package org.example.creational.factory;

public abstract class AnimalFactory {

    private Animal createAnimal(){
        return createAnimalOfType();
    }

    public abstract Animal createAnimalOfType();
}
