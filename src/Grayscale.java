import edu.duke.*;
import java.io.*;

public class Grayscale {

    public void grayScaleImages() {
        DirectoryResource dir = new DirectoryResource();

        for (File f : dir.selectedFiles()) {
            ImageResource imageGrayed = new ImageResource(f);

            for (Pixel px : imageGrayed.pixels()) {
                int r = px.getRed();
                int g = px.getGreen();
                int b = px.getBlue();
                int avg = (r + g + b) / 3;

                px.setRed(avg);
                px.setGreen(avg);
                px.setBlue(avg);
            }

            imageGrayed.setFileName("Grayed-" + f.getName());
            imageGrayed.save();

        }
    }

    public void invertImages() {
        DirectoryResource dir = new DirectoryResource();

        for (File f : dir.selectedFiles()) {
            ImageResource imageGrayed = new ImageResource(f);

            for (Pixel px : imageGrayed.pixels()) {
                int r = px.getRed();
                int g = px.getGreen();
                int b = px.getBlue();

                px.setRed(255 - r);
                px.setGreen(255 - g);
                px.setBlue(255 - b);
            }

            imageGrayed.setFileName("Inverted-" + f.getName());
            imageGrayed.save();

        }
    }
}
