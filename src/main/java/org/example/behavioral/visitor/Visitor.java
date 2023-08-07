package org.example.behavioral.visitor;

public interface Visitor {
    double visit(Liquor liquor);
    double visit(Necessity necessity);
    double visit(Tobacco tobacco);

}
