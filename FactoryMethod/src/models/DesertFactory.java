package models;

import models.enums.DesertTypes;
//* Purpose: Factory class for creating desert products.

public class DesertFactory {

        public static IDesert createDesert(DesertTypes desertType, String currentPrice, String currentDiscount) {
            return switch (desertType) {
                case PEACH_PIE -> new PeachPie(currentPrice, currentDiscount);
                case PUDING -> new Puding(currentPrice, currentDiscount);

                //! No need for default case, because we have only two types of deserts. Defined in DesertTypes.java, as enum.
                default -> throw new IllegalArgumentException("Invalid desert type: " + desertType);
            };
        }
}
