package org.example.creational.abstractFactory;

import org.example.creational.abstractFactory.entities.Ram;
import org.example.creational.abstractFactory.entities.MotherBoard;

public class Main {
    public static void main(String[] args) {

        //abstract factory method

        AbstractFactory asusFactory = new AsusFactory();
        Ram gpu = asusFactory.createGpu();


        AbstractFactory msiFactory = new MsiFactory();
        MotherBoard monitor = msiFactory.createMonitor();



    }
}
