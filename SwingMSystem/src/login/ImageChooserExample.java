/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

/**
 *
 * @author konod
 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class ImageChooserExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Image Chooser Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new FlowLayout());

            JButton chooseImageButton = new JButton("Choose Image");
            chooseImageButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFileChooser fileChooser = new JFileChooser();
                    int result = fileChooser.showOpenDialog(frame);
                    if (result == JFileChooser.APPROVE_OPTION) {
                        File selectedFile = fileChooser.getSelectedFile();

                        // Load and display the selected image
                        ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
                        JLabel imageLabel = new JLabel(imageIcon);
                        frame.add(imageLabel);
                        frame.pack();

                        // Save the selected image to a destination
                        saveImage(selectedFile);
                    }
                }
            });

            frame.add(chooseImageButton);
            frame.pack();
            frame.setVisible(true);
        });
    }

    private static void saveImage(File sourceFile) {
   try {
    BufferedImage image = ImageIO.read(sourceFile);

    // Get the current working directory
    String currentDirectory = System.getProperty("user.dir");

    // Specify the file name for the saved image
    String destinationFileName = "image.jpg";

    // Create the destination file in the current working directory
    File destinationFile = new File(currentDirectory + File.separator + destinationFileName);

    // Write the image to the destination file
    ImageIO.write(image, "jpg", destinationFile);

    System.out.println("Image saved to: " + destinationFile.getAbsolutePath());
} catch (IOException ex) {
    ex.printStackTrace();
}
    }
}
