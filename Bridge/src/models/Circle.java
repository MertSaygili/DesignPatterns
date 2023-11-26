package models;

import models.interfaces.Color;
import models.interfaces.Shape;

//* Concrete implementation 1 for bridge pattern
public class Circle implements Shape {
    @Override
    public void draw(Color color) {
        System.out.println("Drawing a circle to " + color.getColor());
        color.fillWithColor(0);
    }

    @Override
    public void resizeByPercentage(double pct) {
        System.out.println("Resizing a circle...");
        System.out.println("Circle resized by " + pct + "%");
    }
}
