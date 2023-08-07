package org.example.behavioral.visitor;

public abstract class AbstractPriceHolder {
    private double price;

    public AbstractPriceHolder(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
