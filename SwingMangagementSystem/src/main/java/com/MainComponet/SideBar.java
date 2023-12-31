/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.MainComponet;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
 
import com.model.ModelMenu;
import com.swing.MenuItem;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;
import com.EventInterface.EventMenuItemSelected;
import javax.swing.border.EmptyBorder;

public class SideBar extends javax.swing.JPanel {

   
    public  void setLabel(String label) {
        jLabel2.setText(label);
    }
    /**
     * Creates new form SideBar
     */
    public void setEventSelect(EventMenuItemSelected event)
    {
        this.event = event  ; 
    }
    public void setShowMenu(boolean showMenu) {
        this.showMenu = showMenu;
    }
    public SideBar() {
        initComponents();
       
        setOpaque(false);
        layout = new MigLayout("wrap, fillx, insets 0", "[fill]", "[]0[]");
        PnMenuButtons.setLayout(layout);
        jLabel2.setBorder(new EmptyBorder(1, 20, 1, 1));
        jLabel2.setIconTextGap(35);
        
//        initMenuItem(); 
    }
    private final MigLayout layout;
    private EventMenuItemSelected event;
    private boolean showMenu = true;
    private  boolean  adminRole = false ; 
 
//    protected void paintChildren(Graphics grphcs) {
//        Graphics2D g2 = (Graphics2D) grphcs;
//        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        GradientPaint g = new GradientPaint(0, 0, Color.decode("#373B44"), 0, getHeight(), Color.decode("#4286f4"));
//        g2.setPaint(g);
//        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 10);
//        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
//        super.paintChildren(grphcs);
//    }
    @Override
protected void paintChildren(Graphics grphcs) {
    Graphics2D g2 = (Graphics2D) grphcs;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    // Define a gradient paint with start and end colors
    GradientPaint g = new GradientPaint(0, 0, Color.decode("#373B44"), 0, getHeight(), Color.decode("#4286f4"));
    // Set the gradient paint
    g2.setPaint(g); 
    // Fill the component's background with a rounded rectangle
    int cornerRadius = 0; // Adjust the corner roundness as needed
    g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);

    // Fill a rectangular area at the right end (you can adjust the dimensions)
//    g2.fillRect(getWidth() - 20, 0, 20, getHeight());

    super.paintChildren(grphcs);
}

 public void initMenuItem() {
      
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/com/ResourceImage/SideBarHome.png")), "Home"));
//        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/com/"main/javaResourceImage/SideBarUser.png")), "User"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/com/ResourceImage/SideBarStudent.png")), "Student"));
//        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/com/ResourceImage/SideBarReport.png")), "Report"));
        if (this.adminRole) {
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/com/ResourceImage/SideBarUser.png")), "User"));
            }
    }
 private void addMenu(ModelMenu menu) {
       
        PnMenuButtons.add(new MenuItem(menu ,PnMenuButtons.getComponentCount(),this.event), "h 60!");
    }
    // this even iPnMenuButtonss for when you click on a menu item it will show it click item 
 
//    private EventMenu getEventMenu() {
//      
//      };
     
     /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnMenuTitle = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PnMenuButtons = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(160, 600));

        PnMenuTitle.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Icon/interface_user_icon.png"))); // NOI18N
        jLabel2.setText("Admin");
        jLabel2.setPreferredSize(new java.awt.Dimension(160, 45));

        javax.swing.GroupLayout PnMenuTitleLayout = new javax.swing.GroupLayout(PnMenuTitle);
        PnMenuTitle.setLayout(PnMenuTitleLayout);
        PnMenuTitleLayout.setHorizontalGroup(
            PnMenuTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PnMenuTitleLayout.setVerticalGroup(
            PnMenuTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnMenuTitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        PnMenuButtons.setOpaque(false);

        javax.swing.GroupLayout PnMenuButtonsLayout = new javax.swing.GroupLayout(PnMenuButtons);
        PnMenuButtons.setLayout(PnMenuButtonsLayout);
        PnMenuButtonsLayout.setHorizontalGroup(
            PnMenuButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PnMenuButtonsLayout.setVerticalGroup(
            PnMenuButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnMenuTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PnMenuButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PnMenuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnMenuButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnMenuButtons;
    private javax.swing.JPanel PnMenuTitle;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    public boolean isShowMenu() {
        return this.showMenu; 
    }
    public void AdminRole()
    {
        this.adminRole = true ;
    }
}
