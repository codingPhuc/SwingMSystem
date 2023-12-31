package main;

import com.Dao.LoginHistoryDao;
import com.Dao.UserDao;
import com.MainComponet.MainFrame;

import com.formdev.flatlaf.FlatLightLaf;
import com.model.ModelUser;
import login.Background;
import swing.CustomButton;
import swing.CustomTextField;
import swing.PasswordField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    private LoginHistoryDao loginHistoryDao ; 
    public Login() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        loginHistoryDao = new LoginHistoryDao() ; 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new Background();
        panel = new JPanel();
        txtUser = new CustomTextField();
        txtPassword = new PasswordField();
        jLabel1 = new JLabel();
        cmdLogin = new CustomButton();
        ErrorTextFlied = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background.setBlur(panel);

        panel.setBackground(new Color(102, 0, 51));
        panel.setForeground(new Color(51, 255, 51));

        txtUser.setHint("Account User Name");

        txtPassword.setHint("Account Password");

        jLabel1.setFont(new Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("LOG IN");

        cmdLogin.setForeground(new Color(231, 231, 231));
        cmdLogin.setText("LOG IN");
        cmdLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cmdLoginActionPerformed(evt);
            }
        });

        ErrorTextFlied.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
        ErrorTextFlied.setForeground(new Color(255, 51, 51));

        GroupLayout panelLayout = new GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUser, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPassword, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdLogin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ErrorTextFlied, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(txtUser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(cmdLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ErrorTextFlied, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        GroupLayout backgroundLayout = new GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap(311, Short.MAX_VALUE)
                .addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(background, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(background, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  private void updateLoginHistory(int userID) {
    // Update the login history for the specified user
    loginHistoryDao.addLoginHistory(userID, new java.sql.Timestamp(System.currentTimeMillis()));
}
   
    private void cmdLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLoginActionPerformed
       String user = txtUser.getText();
    String pass = String.valueOf(txtPassword.getPassword());

    // Check the username and password against the database
    UserDao userDao = new UserDao();
    ModelUser loginUser = userDao.authenticate(user, pass);

    if (loginUser != null) {
        if(loginUser.getStatus() ==1)
        {
            ErrorTextFlied.setText("you have been block from the system");
            return;
        }
          try {
    UIManager.setLookAndFeel( new FlatLightLaf() );
} catch( Exception ex ) {
    System.err.println( "Failed to initialize LaF" );
}
        // Open the TestFrame upon successful login
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame(loginUser).setVisible(true);
            }
        });
//        testFrame testFrame = new testFrame(loginUser);
//        testFrame.setVisible(true);

        // Update the login history for the logged-in user
        updateLoginHistory(loginUser.getUserID());

        // Close the login frame
        dispose();
    } else {
        // Show an error message for incorrect credentials
        ErrorTextFlied.setText("Incorrect username or password");
    }
    }//GEN-LAST:event_cmdLoginActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ErrorTextFlied;
    private login.Background background;
    private CustomButton cmdLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel;
    private swing.PasswordField txtPassword;
    private CustomTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
