package task1631;

import task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageTypes) {
        return switch (imageTypes) {
            case ImageTypes.PNG -> new PngReader();
            case ImageTypes.JPG -> new JpgReader();
            case ImageTypes.BMP -> new BmpReader();
            default -> throw new IllegalArgumentException();

        };
    }
}