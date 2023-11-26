package models;

import models.interfaces.Color;

//* Concrete implementation of the Color interface
public class BlueColor implements Color {
    @Override
    public void fillWithColor(int border) {
        System.out.println("Filling with blue color with " + border + " inch border");
    }

    @Override
    public String getColor() {
        return "Blue";
    }
}
