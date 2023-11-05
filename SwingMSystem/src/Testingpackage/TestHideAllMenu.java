/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testingpackage;

import javax.swing.*;
import java.awt.*;

public class TestHideAllMenu {

    public static void main(String[] args) {
        // Create a JFrame and a panel
        JFrame frame = new JFrame("Test Hide All Menu");
        NewJPanel panel = new NewJPanel();

        // Add the panel to the frame
        frame.add(panel);

        // Set up the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true);

        // Call the hideallMenu method to print component information
        panel.hideallMenu();
    }
}
