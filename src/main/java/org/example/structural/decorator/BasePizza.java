package org.example.structural.decorator;

public class BasePizza implements Pizza{
    @Override
    public String bake() {
        return "pizza ";
    }
}
