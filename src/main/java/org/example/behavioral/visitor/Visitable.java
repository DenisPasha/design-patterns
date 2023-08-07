package org.example.behavioral.visitor;

public interface Visitable {
    double accept(Visitor visitor);
}
