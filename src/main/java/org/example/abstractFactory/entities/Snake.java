package org.example.abstractFactory.entities;

public class Snake implements Reptile{
    @Override
    public void makeSound() {
        System.out.println("Pss");
    }
}
