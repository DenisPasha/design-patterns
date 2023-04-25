package org.example.creational.abstractFactory.factory;

import org.example.creational.abstractFactory.factory.entities.Mammal;

public abstract class AbstractFactory {

    public abstract ReptileFactory createReptileFactory();
    public abstract MammalFactory createMammalFactory();
}
