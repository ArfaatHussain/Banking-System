/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Screens;


import java.sql.*;
import javax.swing.JOptionPane;
import Backend.Database_Configuration;

/**
 *
 * @author mu409
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    Database_Configuration db = new Database_Configuration();
    Connection conn;

    public Login() {
        initComponents();

        jAccountNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    jLogin.doClick(); // Simulate button click
                }
            }
        });

        jPin.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    jLogin.doClick(); // Simulate button click
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jAccountNumber = new javax.swing.JTextField();
        jLogin = new javax.swing.JButton();
        jPin = new javax.swing.JPasswordField();
        jSignup = new javax.swing.JLabel();
        jShowPass = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/login.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(313, 535));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 530));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOGIN");
        jLabel2.setPreferredSize(new java.awt.Dimension(147, 42));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 129, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Account Number");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 115, 34));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Pin");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        jAccountNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAccountNumberActionPerformed(evt);
            }
        });
        jPanel1.add(jAccountNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 191, 156, 40));

        jLogin.setBackground(new java.awt.Color(204, 204, 204));
        jLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLogin.setText("LOGIN");
        jLogin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLoginMouseDragged(evt);
            }
        });
        jLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jLoginFocusLost(evt);
            }
        });
        jLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 87, 33));
        jPanel1.add(jPin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 156, 40));

        jSignup.setForeground(new java.awt.Color(51, 51, 255));
        jSignup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSignup.setText("Signup");
        jSignup.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSignupMouseClicked(evt);
            }
        });
        jPanel1.add(jSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 333, -1, -1));

        jShowPass.setText("Show Password");
        jShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jShowPassActionPerformed(evt);
            }
        });
        jPanel1.add(jShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 331, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 0, 460, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jAccountNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAccountNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAccountNumberActionPerformed

    private void jLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginActionPerformed

        String Pin = String.valueOf(jPin.getPassword());

        if ((jAccountNumber.getText().trim().isEmpty() == false && Pin.trim().isEmpty() == false)) {
//            db = new Database_Configuration();
            // Get inputs

            String accountID = jAccountNumber.getText();
            char[] passwordArray = jPin.getPassword();

            String password = new String(passwordArray);

            // Validate inputs
            if (accountID.trim().isEmpty() || password.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Account ID and PIN cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Ensure inputs are numeric
            try {
                int accountNumber = Integer.parseInt(accountID);
                int pin = Integer.parseInt(password);

                try {
                    conn = db.getConnection();

                    String query = "SELECT account_id, customer_name, balance, pin FROM accounts WHERE account_id = ? AND pin = ?;";
                    PreparedStatement stmt = conn.prepareStatement(query);

                    stmt.setInt(1, accountNumber);
                    stmt.setInt(2, pin);

                    ResultSet rs = stmt.executeQuery();

                    if (rs.next()) {
                        // Record found
                        int account_id = rs.getInt("account_id");
                        String customerName = rs.getString("customer_name");
                        int balance = rs.getInt("balance");

                        // Navigate to Dashboard
                        new DashBoard(account_id, customerName, balance).setVisible(true);
                        db.closeConnection();
                        db.closeResources();
                        setVisible(false);
                    } else {
                        // Invalid credentials
                        JOptionPane.showMessageDialog(null, "Invalid Credentials", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                // Handle invalid numeric input
                JOptionPane.showMessageDialog(null, "Account ID and PIN must be numeric!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Field(s) cannot be empty", "Warning !", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jLoginActionPerformed

    private void jShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jShowPassActionPerformed
        // TODO add your handling code here:

        if (jShowPass.isSelected()) {
            // Show password as plain text
            jPin.setEchoChar((char) 0);
        } else {
            // Hide password with default echo char
            jPin.setEchoChar('*');
        }

    }//GEN-LAST:event_jShowPassActionPerformed

    private void jSignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSignupMouseClicked
        // TODO add your handling code here:

        new Signup().setVisible(true);
        dispose();
    }//GEN-LAST:event_jSignupMouseClicked

    private void jLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLoginFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_jLoginFocusGained

    private void jLoginMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLoginMouseDragged
        // TODO add your handling code here:

    }//GEN-LAST:event_jLoginMouseDragged

    private void jLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLoginFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_jLoginFocusLost

    /**
     * @param args the command line arguments
     */
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
    private javax.swing.JTextField jAccountNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPin;
    private javax.swing.JCheckBox jShowPass;
    private javax.swing.JLabel jSignup;
    // End of variables declaration//GEN-END:variables
}
