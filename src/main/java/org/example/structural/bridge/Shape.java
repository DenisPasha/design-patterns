package org.example.structural.bridge;

public abstract class Shape {


    // field color is a reference to independent color class
    // acts as a bridge
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract void drawShape();
}
