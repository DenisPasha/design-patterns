package org.example.structural.bridge;

public class Red extends Color {
    private static final String COLOR = "Red";
    public Red() {
        super(COLOR);
    }

    @Override
    public void fillColor() {
        System.out.println("Filled with red");
    }
}
