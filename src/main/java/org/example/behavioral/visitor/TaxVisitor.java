package org.example.behavioral.visitor;

public class TaxVisitor implements Visitor {

    @Override
    public double visit(Liquor liquor) {
       return liquor.getPrice() + liquor.getPrice() * 0.20;
    }

    @Override
    public double visit(Necessity necessity) {
        return necessity.getPrice() + necessity.getPrice() * 0.10;
    }

    @Override
    public double visit(Tobacco tobacco) {
        return tobacco.getPrice() + tobacco.getPrice() * 0.15;
    }
}
