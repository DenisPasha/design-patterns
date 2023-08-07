package org.example.behavioral.visitor.impl;

import org.example.behavioral.visitor.AbstractPriceHolder;
import org.example.behavioral.visitor.Liquor;
import org.example.behavioral.visitor.Visitable;
import org.example.behavioral.visitor.Visitor;

public class Whisky extends AbstractPriceHolder implements Liquor, Visitable {

    public Whisky(double price) {
        super(price);
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
