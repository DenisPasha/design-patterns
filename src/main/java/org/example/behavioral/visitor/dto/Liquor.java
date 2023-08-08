package org.example.behavioral.visitor.dto;

import org.example.behavioral.visitor.AbstractItem;
import org.example.behavioral.visitor.Visitable;
import org.example.behavioral.visitor.Visitor;

public class Liquor extends AbstractItem implements Visitable {
    public Liquor(double price) {
        super(price);
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
