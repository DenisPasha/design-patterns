package org.example.structural.adapter;

public class Main {
    public static void main(String[] args) {


//normal celsius temp
        Celsius celsius = new CelsiusImpl();
        System.out.println(celsius.temp(27));



// adapter used from Fahrenheit to Celsius
        FahrenheitAdapter adapter = new FahrenheitAdapter();
        System.out.println(adapter.temp(98));
    }
}
