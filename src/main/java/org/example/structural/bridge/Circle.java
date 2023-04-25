package org.example.structural.bridge;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void drawShape() {
        System.out.println("Circle with "+ super.getColor() + " color");
    }


}
