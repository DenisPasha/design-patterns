package org.example.structural.adapter;

public class DogImpl implements Dog {
    @Override
    public void makeDogSound() {
        System.out.println("Bark");
    }
}
