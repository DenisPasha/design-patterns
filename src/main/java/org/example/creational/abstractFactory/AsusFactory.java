package org.example.creational.abstractFactory;

import org.example.creational.abstractFactory.entities.AsusRam;
import org.example.creational.abstractFactory.entities.AsusMotherBoard;
import org.example.creational.abstractFactory.entities.Ram;
import org.example.creational.abstractFactory.entities.MotherBoard;

public class AsusFactory extends AbstractFactory{
    @Override
    public Ram createGpu() {
        return new AsusRam();
    }

    @Override
    public MotherBoard createMonitor() {
        return new AsusMotherBoard();
    }
}
