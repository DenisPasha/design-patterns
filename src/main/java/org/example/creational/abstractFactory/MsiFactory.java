package org.example.creational.abstractFactory;

import org.example.creational.abstractFactory.entities.Ram;
import org.example.creational.abstractFactory.entities.MotherBoard;
import org.example.creational.abstractFactory.entities.MsiRam;
import org.example.creational.abstractFactory.entities.MsiMotherBoard;

public class MsiFactory extends AbstractFactory {
    @Override
    public Ram createGpu() {
        return new MsiRam();
    }

    @Override
    public MotherBoard createMonitor() {
        return new MsiMotherBoard();
    }
}
