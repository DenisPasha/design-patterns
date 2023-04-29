package org.example.structural.adapter;

public class DogAdapter implements Cat {


    // composition
    // adapter
    private Dog dog;

    public DogAdapter(Dog dog) {
        this.dog = dog;
    }

    //adapt cat method to dog
    @Override
    public void makeCatSound() {
        dog.makeDogSound();
    }
}
