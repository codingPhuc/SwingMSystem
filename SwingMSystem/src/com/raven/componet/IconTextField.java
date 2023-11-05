/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.componet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.JTextField;
import javax.swing.BorderFactory   ; 
import javax.swing.ImageIcon;
/**
 *
 * @author konod
 */
public class IconTextField extends JTextField {
     private Icon prefixIcon;
    private Icon suffixIcon;

    // Getter for prefixIcon
    public Icon getPrefixIcon() {
        return prefixIcon;
    }

    // Setter for prefixIcon
    public void setPrefixIcon(Icon prefixIcon) {
        this.prefixIcon = prefixIcon;
        initBorder()  ; 
    }

    // Getter for suffixIcon
    public Icon getSuffixIcon() {
        return suffixIcon;
    }

    // Setter for suffixIcon
    public void setSuffixIcon(Icon suffixIcon) {
        this.suffixIcon = suffixIcon;
        initBorder()  ; 
    }
    public IconTextField()
    {
        setBorder( BorderFactory.createEmptyBorder(5, 5, 5, 5)) ;  
    }
    @Override 
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        paintIcon(g);
        //  paint border
        if (isFocusOwner()) {
            g.setColor(new Color(4, 88, 167));
            g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
            g.drawRect(1, 1, getWidth() - 3, getHeight() - 3);
        } else {
            g.setColor(new Color(142, 142, 142));
            g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
            g.drawRect(1, 1, getWidth() - 3, getHeight() - 3);
        }
//    public void set
//    public Icon  getPrefixIcon()
//    {
//        
//    }
    }
    private void paintIcon(Graphics g)
    {
        Graphics2D g2  = (Graphics2D) g ;  
        if( prefixIcon !=null )
        { 
            Image prefix =  ((ImageIcon) prefixIcon).getImage()  ; 
            int y  = (getHeight()  - prefixIcon.getIconHeight())/ 2  ; 
            g2.drawImage(prefix ,3 , y  , this)   ; 
        }
        if(suffixIcon != null)
        {
            Image suffix =  ((ImageIcon) suffixIcon).getImage()   ; 
            int y  =  ( getHeight() - prefixIcon.getIconHeight())/2   ; 
            g2.drawImage(suffix, 3, y ,   this);
        }
    }
    
    
    private void initBorder() {
        int left = 5;
        int right = 5;
        //  5 is default
        if (prefixIcon != null) {
            //  prefix is left
            left = prefixIcon.getIconWidth() + 5;
        }
        if(suffixIcon != null)
        {
            right  = suffixIcon.getIconWidth() + 5 ; 
        }
       
        setBorder(javax.swing.BorderFactory.createEmptyBorder(5, left, 5, right));
    }
}
