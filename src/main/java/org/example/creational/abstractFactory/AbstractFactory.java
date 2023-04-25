package org.example.creational.abstractFactory;

import org.example.creational.abstractFactory.entities.Ram;
import org.example.creational.abstractFactory.entities.MotherBoard;

public abstract class AbstractFactory {

    public abstract Ram createGpu();
    public abstract MotherBoard createMonitor();
}
