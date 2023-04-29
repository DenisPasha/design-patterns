package org.example.creational.prototype.deep;

public class Car implements Cloneable{
    private String make;
    private String model;

    private Driver driver;

    public Car(String make, String model, Driver driver) {
        this.make = make;
        this.model = model;
        this.driver = driver;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        Car cloned = (Car) super.clone();
        cloned.driver = (Driver) driver.clone();
        return cloned;
    }
}
