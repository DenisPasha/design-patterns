package org.example.singlton;

public class CarSingleton {

    private static CarSingleton carSingleton;
    private String brand;
    private String model;
    private String kilometers;

    private CarSingleton(String brand, String model, String kilometers) {
        this.brand = brand;
        this.model = model;
        this.kilometers = kilometers;
    }

    public static CarSingleton getInstance(String brand , String model ,String kilometers){
        if (carSingleton == null ){
            carSingleton = new CarSingleton(brand ,model ,kilometers);
        }
        return carSingleton;
    }
}
