package com.example.KaiTicket.major;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class picture extends JFrame {

    public picture() {
        super("Image Frame");

        // Load the image file
        ImageIcon imageIcon = loadImage("pic.jpg");

        // Create a JLabel to hold the image
        JLabel imageLabel = new JLabel(imageIcon);

        // Add the JLabel to the JFrame
        getContentPane().add(imageLabel);

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    private ImageIcon loadImage(String filename) {
        try {
            // Load image file
            File file = new File(filename);
            Image image = ImageIO.read(file);
            // Scale the image to fit JLabel dimensions
            Image scaledImage = image.getScaledInstance(400, 300, Image.SCALE_SMOOTH);
            return new ImageIcon(scaledImage);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new picture());
    }
}