package org.example.behavioral.visitor;

public abstract class AbstractItem {
    private final double price;

    public AbstractItem(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
