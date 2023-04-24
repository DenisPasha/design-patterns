package org.example.structural.adapter;

public class FahrenheitAdapter implements Celsius {


    @Override
    public double temp(int temp) {
        return (temp - 32) * 5 / 9.00;
    }


}
