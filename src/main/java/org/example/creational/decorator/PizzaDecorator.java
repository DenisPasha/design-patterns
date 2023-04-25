package org.example.creational.decorator;

public abstract class PizzaDecorator implements Pizza{

    protected Pizza pizza;
    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String bake() {
        return pizza.bake();
    }
}
