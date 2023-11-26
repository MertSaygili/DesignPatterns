package models;
//* This interface is implemented by PngImage and JpegImage.
//* This interface is used by ImageAdapter.
public interface ImageViewer {
    void showPNGImage(String path);
    void showJPEGImage(String path);
}
