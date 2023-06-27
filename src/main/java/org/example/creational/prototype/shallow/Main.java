package org.example.creational.prototype.shallow;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        // shallow copy driver object hashcode and clone object hashcode are same
        // only reference to the real object is cloned

        Driver driver = new Driver("Denis");

        Car car = new Car("Yaris" , "Toyota" ,driver);
        Object clone = car.clone();

        System.out.println(car.getDriver().hashCode());
        System.out.println(driver.hashCode());

        System.out.println();

    }
}
