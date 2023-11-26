import models.ImageAdapter;
import models.ImageCreatorController;
import models.enums.ImageTypes;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ImageCreatorController imageCreatorController = new ImageCreatorController();

        imageCreatorController.showImage(ImageTypes.PNG, "path/to/png/image");
        imageCreatorController.showImage(ImageTypes.JPEG, "path/to/jpeg/image");
    }
}