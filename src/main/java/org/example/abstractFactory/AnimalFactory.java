package org.example.abstractFactory;


public abstract class AnimalFactory {
    public abstract MammalFactory createMammal();
    public abstract ReptileFactory createReptile();

}
