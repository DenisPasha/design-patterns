package org.example.creational.prototype.shallow;

public class Car implements Cloneable{
    private String model;
    private String make;
    private Driver driver;

    public Car(String model, String make, Driver driver) {
        this.model = model;
        this.make = make;
        this.driver = driver;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
