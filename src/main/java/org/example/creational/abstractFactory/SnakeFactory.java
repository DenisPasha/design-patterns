package org.example.creational.abstractFactory;

import org.example.creational.abstractFactory.entities.Reptile;
import org.example.creational.abstractFactory.entities.Snake;

public class SnakeFactory extends ReptileFactory {
    @Override
    public Reptile createReptile() {
        return new Snake();
    }
}
