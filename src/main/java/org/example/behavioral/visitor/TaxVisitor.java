package org.example.behavioral.visitor;

import org.example.behavioral.visitor.dto.Liquor;
import org.example.behavioral.visitor.dto.Necessity;
import org.example.behavioral.visitor.dto.Tobacco;

public class TaxVisitor implements Visitor{
    @Override
    public double visit(Necessity liquor) {
        return liquor.getPrice() + liquor.getPrice() * 0.20;
    }

    @Override
    public double visit(Liquor liquor) {
        return liquor.getPrice() + liquor.getPrice() * 0.10;
    }

    @Override
    public double visit(Tobacco tobacco) {
        return tobacco.getPrice() + tobacco.getPrice() * 0.15;
    }
}
