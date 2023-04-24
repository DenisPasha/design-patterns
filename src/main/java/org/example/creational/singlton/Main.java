package org.example.creational.singlton;

public class Main {
    public static void main(String[] args) {
        // singleton instance of a car
        CarSingleton car =
                CarSingleton.getInstance("Ford" ,"Escort","22000");

        CarSingleton newCar =
                CarSingleton.getInstance("Test","Test","Test");

    }

}
