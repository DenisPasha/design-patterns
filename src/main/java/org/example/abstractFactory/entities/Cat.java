package org.example.abstractFactory.entities;

public class Cat implements Mammal {
    @Override
    public void speak() {
        System.out.println("Meow");
    }
}
