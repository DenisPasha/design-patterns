package org.example.structural.bridge;

public abstract class Color {

     private String color;

     public Color(String color) {
          this.color = color;
     }

     public abstract void fillColor();

     @Override
     public String toString() {
          return String.format(color);
     }
}
