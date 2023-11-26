import models.BlueColor;
import models.Circle;
import models.RedColor;
import models.Square;
import models.interfaces.Shape;

//* Bridge Design Pattern
//* Decouple an abstraction from its implementation so that the two can vary independently.
//* The bridge uses encapsulation, aggregation, and can use inheritance to separate responsibilities into different classes.
public class Main {
    public static void main(String[] args) {

        RedColor redColor = new RedColor();
        BlueColor blueColor = new BlueColor();

        Shape circle = new Circle();
        Shape square = new Square();

        circle.draw(redColor);
        circle.resizeByPercentage(50);

        square.draw(blueColor);
        square.resizeByPercentage(25);

    }
}