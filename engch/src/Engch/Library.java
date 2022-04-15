package Engch;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.SecureRandom;

public class Library {
    public int NanoTimeSeedSecureRandom(int range) {  // get range range to random
        // seed for SecureRandom();
        // https://stackoverflow.com/questions/29273498/getting-date-time-in-unix-time-as-byte-array-which-size-is-4-bytes-with-java
        // https://www.baeldung.com/java-secure-random
        byte[] nano_time_byte_seed = ByteBuffer.allocate(4).putInt((int) (System.nanoTime())).array();  // [int, int, int, int]
        // seeded secure random.
        SecureRandom rand = new SecureRandom(nano_time_byte_seed);
        return rand.nextInt(range);  // return (int) range(0 - range)
    }

    public ImageIcon ImageIconScales(String imagePath, int width, int length) throws IOException {
        // just some rescaling of imageIcon
        // https://stackoverflow.com/questions/6714045/how-to-resize-jlabel-imageicon
        if (ImageIO.read(new File(imagePath)) == null) throw new IOException();  // check if image file path exist
        else {
            Image image = new ImageIcon(imagePath).getImage();  // convert imageIcon to Image
            Image newLootImage = image.getScaledInstance(width, length, Image.SCALE_SMOOTH);  // scale
            return new ImageIcon(newLootImage);  // return as imageIcon
        }
    }

    public static void main(String[] args) {
//        import Engch.Library;
//        Library ec = new Library();
        String banner = "Welcome to Engch Library!";
    }
}

