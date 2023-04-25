package org.example.creational.abstractFactory.factory;

import org.example.creational.abstractFactory.factory.entities.Reptile;
import org.example.creational.abstractFactory.factory.entities.Snake;

public class SnakeFactory extends ReptileFactory {
    @Override
    public Reptile createReptile() {
        return new Snake();
    }
}
