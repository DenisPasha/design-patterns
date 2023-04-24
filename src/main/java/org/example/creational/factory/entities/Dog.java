package org.example.creational.factory.entities;

public class Dog implements Mammal {
    @Override
    public void speak() {
        System.out.println("Bark bark");
    }
}
