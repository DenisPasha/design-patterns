package org.example.factory.entities;

public class Cat implements Mammal {
    @Override
    public void speak() {
        System.out.println("Meow");
    }
}
