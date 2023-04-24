package org.example.creational.builder;

public class Main {
    public static void main(String[] args) {

        Car.CarBuilder carBuilder = new Car.CarBuilder();
        carBuilder.setBrand("carBrand");
        carBuilder.setEngine("engineType");
        carBuilder.setTransmission("transmission");
        Car build = carBuilder.build();

    }
}
