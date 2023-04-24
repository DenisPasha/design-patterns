package org.example.abstractFactory;

import org.example.abstractFactory.entities.Mammal;
import org.example.abstractFactory.entities.Reptile;

public abstract class AnimalFactory {
    public abstract MammalFactory createMammal();
    public abstract ReptileFactory createReptile();

}
