package org.example.structural.decorator;

public class Main {
    public static void main(String[] args) {


        Pizza cheese = new Cheese(new BasePizza());
        Pizza ham = new Ham(new Cheese(new BasePizza()));

        System.out.println(cheese.bake());
        System.out.println(ham.bake());
    }
}
