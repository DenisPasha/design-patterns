package org.example.structural.adapter;

public class DogAdapter implements Cat {


    // composition
    // adapter
    private Cat cat;

    public DogAdapter(Cat cat) {
        this.cat = cat;
    }

    //adapt cat method to dog
    @Override
    public void makeCatSound() {
        cat.makeCatSound();
    }
}
