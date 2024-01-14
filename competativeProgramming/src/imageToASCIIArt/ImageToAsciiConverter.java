package imageToASCIIArt;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageToAsciiConverter {

    public static void main(String[] args) {
        String imagePath = "/Users/sanketkumar/eclipse-workspace/competativeProgramming/src/imageToASCIIArt/pony.jpg"; // Replace with the path to your image file
        int width = 100; // Width of the ASCII art (adjust as needed)
        int height = 0; // Height will be determined based on the aspect ratio of the image

        try {
            BufferedImage image = ImageIO.read(new File(imagePath));
            height = (int) ((double) image.getHeight() / (double) image.getWidth() * width);

            BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            resizedImage.getGraphics().drawImage(image.getScaledInstance(width, height, BufferedImage.SCALE_SMOOTH), 0, 0, null);

            StringBuilder asciiArt = new StringBuilder();
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    int pixel = resizedImage.getRGB(x, y);
                    int red = (pixel >> 16) & 0xff;
                    int green = (pixel >> 8) & 0xff;
                    int blue = pixel & 0xff;
                    int gray = (red + green + blue) / 3;
                    char asciiChar = getAsciiChar(gray);
                    asciiArt.append(asciiChar);
                }
                asciiArt.append("\n");
            }

            System.out.println(asciiArt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static char getAsciiChar(int gray) {
        char asciiChar;
        if (gray >= 230) {
            asciiChar = ' ';
        } else if (gray >= 200) {
            asciiChar = '.';
        } else if (gray >= 180) {
            asciiChar = '*';
        } else if (gray >= 160) {
            asciiChar = ':';
        } else if (gray >= 130) {
            asciiChar = 'o';
        } else if (gray >= 100) {
            asciiChar = '&';
        } else if (gray >= 70) {
            asciiChar = '8';
        } else if (gray >= 50) {
            asciiChar = '#';
        } else {
            asciiChar = '@';
        }
        return asciiChar;
    }
}
