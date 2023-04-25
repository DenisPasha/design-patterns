package org.example.creational.decorator;

public class BasePizza implements Pizza{
    @Override
    public String bake() {
        return "base pizza ";
    }
}
