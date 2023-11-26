package models;
//* ShowPNGImage is implemented, but showJPEGImage is not.
//* This is because PNG images are the only images that can be shown by this class.
//* JPEG images are not supported by this class.
public class PngImage implements ImageViewer {

    @Override
    public void showPNGImage(String path) {
        System.out.println("Showing PNG image: " + path);
    }

    @Override
    public void showJPEGImage(String path) {
        throw new UnsupportedOperationException("PNG viewer cannot show JPEG images.");
    }
}
