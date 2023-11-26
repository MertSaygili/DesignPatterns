package models;

import models.enums.ImageTypes;

public class ImageCreatorController {

    public void showImage(ImageTypes imageType, String imagePath) {
        ImageAdapter imageAdapter = new ImageAdapter(imageType);
        if (imageType == ImageTypes.PNG) {
            imageAdapter.showPNGImage(imagePath);
        } else if (imageType == ImageTypes.JPEG) {
            imageAdapter.showJPEGImage(imagePath);
        }
        else{
            throw new UnsupportedOperationException("Image type not supported.");
        }
    }
}
