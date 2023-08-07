package org.example.behavioral.visitor.impl;

import org.example.behavioral.visitor.AbstractPriceHolder;
import org.example.behavioral.visitor.Tobacco;
import org.example.behavioral.visitor.Visitable;
import org.example.behavioral.visitor.Visitor;

public class Cigars extends AbstractPriceHolder implements Tobacco, Visitable {

    public Cigars(double price) {
        super(price);
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
