package org.example.structural.bridge;

public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void drawShape() {
        System.out.println("Rectangle with "+super.getColor() + " color");
    }


}
