package org.example.structural.adapter;

public class FahrenheitImpl implements Fahrenheit {

    private int temp ;

    public FahrenheitImpl(int temp) {
        this.temp = temp;
    }

    @Override
    public int temp() {
        return temp;
    }
}
