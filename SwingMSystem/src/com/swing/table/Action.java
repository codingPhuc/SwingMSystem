package com.swing.table;

import com.model.ModelActionUser;
import com.model.ModelUser;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// the model action contain the button you must pass the Event that you want each action to perform
public class Action extends javax.swing.JPanel {
    private ModelUser user;
    public Action(ModelActionUser data) {
        initComponents();
        setOpaque(false);
        this.user = data.getUser();
        cmdEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               
                data.getEvent().update(data.getUser());
            }
        });
        cmdDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
             
                data.getEvent().delete(user);
            }
        });
        cmdView.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                data.getEvent().view(data.getUser());
            }
        });
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        grphcs.setColor(new Color(30, 30, 30, 50));
     //   grphcs.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdDelete = new com.raven.swing.ActionButton();
        cmdView = new com.raven.swing.ActionButton();
        cmdEdit = new com.raven.swing.ActionButton();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        cmdDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ResourceImage/TableDeleteAction.png"))); // NOI18N
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });
        add(cmdDelete);

        cmdView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ResourceImage/TableViewAction.png"))); // NOI18N
        add(cmdView);

        cmdEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ResourceImage/TableeditAction.png"))); // NOI18N
        add(cmdEdit);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdDeleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.ActionButton cmdDelete;
    private com.raven.swing.ActionButton cmdEdit;
    private com.raven.swing.ActionButton cmdView;
    // End of variables declaration//GEN-END:variables
}
