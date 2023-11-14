///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
package com.raven.componet;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author konod
 */
public class CustomTextField extends JTextField {
//    private Shape shape;
//    private final ImageIcon searchIcon = new ImageIcon(getClass().getResource("/com/Icon/12.png")); // Add the path to your search icon
//
//    public CustomTextField() {
//        setOpaque(false);
//        setBorder(new EmptyBorder(0, 30, 0, 10)); // Add padding for text and search icon
//    }
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        g.setColor(getBackground());
//        g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, getWidth()/2, getHeight()/2); // Adjust the radius to make it more or less round
//        super.paintComponent(g);
//        int iconX = getWidth() - 30; // Adjust the position of the search icon
//        int iconY = (getHeight() - searchIcon.getIconHeight()) / 2;
//        searchIcon.paintIcon(this, g, iconX, iconY);
//    }
//
//    @Override
//    protected void paintBorder(Graphics g) {
//        g.setColor(getForeground());
//        g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 30,30); // Adjust the radius to match the fill
//    }
//
//    @Override
//    public boolean contains(int x, int y) {
//        if (shape == null || !shape.getBounds().equals(getBounds())) {
//            shape = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 20, 20); // Adjust the radius
//        }
//        return shape.contains(x, y);
//    }
//    
    
//    private Shape shape;
//    private final ImageIcon searchIcon = new ImageIcon(getClass().getResource("/com/Icon/12.png"));
//    private boolean isFocused = false;
//    private Color focusBorderColor = Color.BLUE;
//
//    public CustomTextField() {
//        setOpaque(false);
//        setBorder(new EmptyBorder(0, 30, 0, 10));
//        addFocusListener(new FocusListener() {
//            @Override
//            public void focusGained(FocusEvent e) {
//                isFocused = true;
//                repaint();
//            }
//
//            @Override
//            public void focusLost(FocusEvent e) {
//                isFocused = false;
//                repaint();
//            }
//        });
//    }
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        g.setColor(getBackground());
//        g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, getWidth()/2, getHeight()/2);
//        super.paintComponent(g);
//
//        int iconX = getWidth() - 30;
//        int iconY = (getHeight() - searchIcon.getIconHeight()) / 2;
//        searchIcon.paintIcon(this, g, iconX, iconY);
//    }
//
//    @Override
//    protected void paintBorder(Graphics g) {
//        if (isFocused) {
//            g.setColor(focusBorderColor);
//        } else {
//            g.setColor(getForeground());
//        }
//        g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 30, 30);
//    }
//
//    @Override
//    public boolean contains(int x, int y) {
//        if (shape == null || !shape.getBounds().equals(getBounds())) {
//            shape = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
//        }
//        return shape.contains(x, y);
//    }
    
    
    
   private Shape shape;
    private final JButton searchButton = new JButton(); // Create a button with no text
    private boolean isFocused = false;
    private Color focusBorderColor = Color.BLUE;
    private Color shadowColor = new Color(0, 0, 0, 50); // R, G, B, Alpha 
    public CustomTextField() {
        setOpaque(false);
        setBorder(new EmptyBorder(0, 30, 0, 40));
        addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                isFocused = true;
                repaint();
            }

            @Override
            public void focusLost(FocusEvent e) {
                isFocused = false;
                repaint();
            }
        });

        searchButton.setIcon(new ImageIcon(getClass().getResource("/com/Icon/TextFiled_searchIcon.png"))); // Add the path to your search icon
        searchButton.setOpaque(false);
        searchButton.setContentAreaFilled(false);
        searchButton.setBorderPainted(false);
        searchButton.addActionListener(e -> {
            System.out.println("snopp dog ");
        });
        add(searchButton);
    }

    @Override
    protected void paintComponent(Graphics g) {
         g.setColor(getBackground());
    g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 30, 30);
    super.paintComponent(g);
    
    int buttonX = getWidth() - 40; // Adjust the buttonX position to create a gap
    int buttonY = (getHeight() - searchButton.getIcon().getIconHeight()) / 2;
    searchButton.setBounds(buttonX, buttonY, searchButton.getIcon().getIconWidth(), searchButton.getIcon().getIconHeight());
     

     // Dispose the copied graphics context
    }

    @Override
    protected void paintBorder(Graphics g) {
          if (isFocused) {
        g.setColor(focusBorderColor);
        g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 30, 30);
          }
//    } else {
//        // Draw the shadow border
//        int shadowThickness = 5; // Adjust the thickness as needed
//        int shadowArc = 30; // Use the same arc as the focused border
//        int x = 0;
//        int y = 0;
//        int width = getWidth() - 1;
//        int height = getHeight() - 1;
//        
//        Graphics2D g2d = (Graphics2D) g;
//        g2d.setStroke(new BasicStroke(shadowThickness));
//        g2d.setColor(shadowColor);
//        g2d.draw(new RoundRectangle2D.Double(x, y, width, height, shadowArc, shadowArc));
//    }
}

    @Override
    public boolean contains(int x, int y) {
        if (shape == null || !shape.getBounds().equals(getBounds())) {
            shape = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
        }
        return shape.contains(x, y);
    }
}



