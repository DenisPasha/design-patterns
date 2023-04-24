package org.example.creational.abstractFactory;


public abstract class AnimalFactory {
    public abstract MammalFactory createMammal();
    public abstract ReptileFactory createReptile();

}
