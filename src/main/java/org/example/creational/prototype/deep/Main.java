package org.example.creational.prototype.deep;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        //deep copy not the refference but new object has been created

        Driver driver = new Driver("Denis");
        Car car = new Car("Mercedes" , "E class" ,driver);

        Car clone = car.clone();
        System.out.println(clone.getDriver().hashCode());
        System.out.println(driver.hashCode());


    }
}
