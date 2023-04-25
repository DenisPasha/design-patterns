package org.example.creational.factory;

public class CatFactory extends AnimalFactory{
    @Override
    public Animal createAnimalOfType() {
        return new Cat();
    }
}
