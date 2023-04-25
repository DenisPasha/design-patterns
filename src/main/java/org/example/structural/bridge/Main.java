package org.example.structural.bridge;

public class Main {
    public static void main(String[] args) {



        Color red = new Red();
        Shape rectangle = new Rectangle(red);
        rectangle.drawShape();

        Color green = new Green();
        Shape circle = new Circle(green);
        circle.drawShape();


    }
}
