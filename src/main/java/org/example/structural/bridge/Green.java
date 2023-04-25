package org.example.structural.bridge;

public class Green extends Color {

    private static final String COLOR = "Green";
    public Green() {
        super(COLOR);
    }

    @Override
    public void fillColor() {
        System.out.println("Filled with green");
    }
}
