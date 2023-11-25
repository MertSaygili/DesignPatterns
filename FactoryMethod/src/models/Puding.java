package models;

import models.enums.TasteSweetnessLevel;

//* Purpose: Concrete product class for PeachPie.

public class Puding implements IDesert{

    private final String currentPrice;
    private final String currentDiscount;

    public Puding(String currentPrice, String currentDiscount) {
        this.currentPrice = currentPrice;
        this.currentDiscount = currentDiscount;
    }


    @Override
    public String getHistory() {
        return "Puding is a pie made with peaches as primary ingredient. " +
                "It is a traditional dessert in the American cuisine. " +
                "Peach pie is often eaten during the summer and holidays, " +
                "such as Independence Day (Fourth of July) in the United States.";
    }

    @Override
    public String getIngredients() {
        return "Peach, sugar, flour, butter, egg, cinnamon, nutmeg, lemon juice, vanilla extract, salt, cornstarch, " +
                "pie crust, milk, cream, and/or ice cream.";
    }

    @Override
    public String getTaste() {
        return TasteSweetnessLevel.SWEET.toString();
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public String getCurrentDiscount() {
        return currentDiscount;
    }
}
