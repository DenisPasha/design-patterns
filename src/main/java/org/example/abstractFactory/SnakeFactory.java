package org.example.abstractFactory;

import org.example.abstractFactory.ReptileFactory;
import org.example.abstractFactory.entities.Reptile;
import org.example.abstractFactory.entities.Snake;

public class SnakeFactory extends ReptileFactory {
    @Override
    public Reptile createReptile() {
        return new Snake();
    }
}
