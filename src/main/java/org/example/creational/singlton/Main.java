package org.example.creational.singlton;

public class Main {
    public static void main(String[] args) {
        // singleton instance of a car
        CarSingleton instance = CarSingleton.getInstance("Toyota","Yaris","100");
        System.out.println(instance.hashCode());

        CarSingleton instance1 = CarSingleton.getInstance("Toyota","Yaris","100");
        System.out.println(instance1.hashCode());

        CarSingleton instance2 = CarSingleton.getInstance("Toyota","Yaris","100");
        System.out.println(instance2.hashCode());
    }

}
