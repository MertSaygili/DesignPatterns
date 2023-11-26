package models;

import models.interfaces.Color;
import models.interfaces.Shape;

//* Concrete implementation 1 for bridge pattern
public class Square implements Shape {
    @Override
    public void draw(Color color) {
        System.out.println("Drawing a square...");
        color.fillWithColor(10);
    }

    @Override
    public void resizeByPercentage(double pct) {
        System.out.println("Resizing a square...");
        System.out.println("Square resized by " + pct + "%");
    }
}
