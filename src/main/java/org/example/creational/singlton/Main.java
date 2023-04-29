package org.example.creational.singlton;

import org.example.training.creational.singlton.CarSingleton;

public class Main {
    public static void main(String[] args) {
        // singleton instance of a car
        CarSingleton instance = CarSingleton.getInstance();
        System.out.println(instance.hashCode());

        CarSingleton instance1 = CarSingleton.getInstance();
        System.out.println(instance1.hashCode());

        CarSingleton instance2 = CarSingleton.getInstance();
        System.out.println(instance2.hashCode());
    }

}
