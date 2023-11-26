package models;
//* ShowJPEGImage is implemented, but showPNGImage is not.
//* This is because JPEG images are the only images that can be shown by this class.

public class JpegImage implements ImageViewer{
    @Override
    public void showPNGImage(String path) {
        throw new UnsupportedOperationException("JPEG viewer cannot show PNG images.");
    }

    @Override
    public void showJPEGImage(String path) {
        System.out.println("Showing JPEG image: " + path);
    }
}
