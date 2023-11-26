package models;

import models.enums.ImageTypes;

public class ImageAdapter implements ImageViewer{
    private ImageViewer imageViewer;

    public ImageAdapter(ImageTypes imageType) {
        if (imageType == ImageTypes.PNG) {
            imageViewer = new PngImage();
        } else if (imageType == ImageTypes.JPEG) {
            imageViewer = new JpegImage();
        }
    }

    @Override
    public void showPNGImage(String path) {
        imageViewer.showPNGImage(path);
    }

    @Override
    public void showJPEGImage(String path) {
        imageViewer.showJPEGImage(path);
    }
}
