package org.example.creational.builder;

public class Car {
    private String brand;
    private String model;
    private String kilometers;
    private String steeringWheelSide;
    private String transmission;
    private String engine;
    private String type;
    private String countOfOwners;

    private Car(String brand, String model, String kilometers, String steeringWheelSide, String transmission, String engine, String type, String countOfOwners) {
        this.brand = brand;
        this.model = model;
        this.kilometers = kilometers;
        this.steeringWheelSide = steeringWheelSide;
        this.transmission = transmission;
        this.engine = engine;
        this.type = type;
        this.countOfOwners = countOfOwners;
    }


    public static class CarBuilder{
        private String brand;
        private String model;
        private String kilometers;
        private String steeringWheelSide;
        private String transmission;
        private String engine;
        private String type;
        private String countOfOwners;

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setKilometers(String kilometers) {
            this.kilometers = kilometers;
        }

        public void setSteeringWheelSide(String steeringWheelSide) {
            this.steeringWheelSide = steeringWheelSide;
        }

        public void setTransmission(String transmission) {
            this.transmission = transmission;
        }

        public void setEngine(String engine) {
            this.engine = engine;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setCountOfOwners(String countOfOwners) {
            this.countOfOwners = countOfOwners;
        }

        public Car build(){
         return new Car(brand ,model ,kilometers ,steeringWheelSide ,transmission ,engine ,type, countOfOwners);
        }
    }

}

