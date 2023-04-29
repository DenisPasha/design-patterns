package org.example.structural.adapter;

public class Main {
    public static void main(String[] args) {
        DogAdapter adapter = new DogAdapter(new DogImpl());
        adapter.makeCatSound();

    }
}
