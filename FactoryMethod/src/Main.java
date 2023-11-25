import models.DesertFactory;
import models.IDesert;
import models.enums.DesertTypes;

//* Factory Method example, with a simple desert factory.
public class Main {
    public static void main(String[] args) {
        IDesert peachPie = DesertFactory.createDesert(DesertTypes.PEACH_PIE, "10", "0");
        IDesert puding = DesertFactory.createDesert(DesertTypes.PUDING, "15", "0");

        System.out.println(peachPie.getHistory());
        System.out.println(peachPie.getIngredients());
        System.out.println(peachPie.getTaste());

        System.out.println(puding.getHistory());
        System.out.println(puding.getIngredients());
        System.out.println(puding.getTaste());

    }
}