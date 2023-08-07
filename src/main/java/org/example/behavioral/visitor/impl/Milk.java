package org.example.behavioral.visitor.impl;

import org.example.behavioral.visitor.AbstractPriceHolder;
import org.example.behavioral.visitor.Necessity;
import org.example.behavioral.visitor.Visitable;
import org.example.behavioral.visitor.Visitor;

public class Milk extends AbstractPriceHolder implements Necessity, Visitable {
    public Milk(double price) {
        super(price);
    }

    @Override
    public double accept(Visitor visitor) {
       return visitor.visit(this);
    }
}
