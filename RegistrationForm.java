
package bookmyshow;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RegistrationForm extends javax.swing.JFrame {

    public RegistrationForm() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
       // setExtendedState(1920);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        contact_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lname_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fname_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        login_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 0, 204)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register Here!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 440, 70));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 425, 208, 26));

        contact_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        contact_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 0, 102)));
        jPanel1.add(contact_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 385, 349, 33));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Contact Number");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 346, 208, 26));

        email_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        email_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 0, 102)));
        jPanel1.add(email_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 306, 349, 33));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Email Id");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 267, 208, 26));

        lname_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lname_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 0, 102)));
        jPanel1.add(lname_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 227, 349, 33));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 188, 208, 26));

        fname_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fname_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 0, 102)));
        jPanel1.add(fname_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 137, 349, 33));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("First Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 208, 26));

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 0, 102)));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 350, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button (1).png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 190, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 500, 620));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/film image.jpg"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jLabel4.setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1920, 1080, 1920, 1080));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/film image.jpg"))); // NOI18N
        jLabel7.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jLabel7.setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2050, 1080));

        kGradientPanel1.setkEndColor(new java.awt.Color(153, 102, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 51, 153));

        login_btn.setBackground(new java.awt.Color(255, 255, 255));
        login_btn.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        login_btn.setForeground(new java.awt.Color(102, 0, 102));
        login_btn.setText("Register");
        login_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });
        kGradientPanel1.add(login_btn);

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 700, 440, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        if(fname_txt.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Registration is Mandatory");
        }
        else  if(lname_txt.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Registration is Mandatory");
        }
        else  if(contact_txt.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Registration is Mandatory");
        }
        if(email_txt.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Registration is Mandatory");
        }
        else
        {
            new Bookmyshowframe().show();
            dispose();// TODO add your handling code here:
        }
    }//GEN-LAST:event_login_btnActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
       if(fname_txt.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Registration is Mandatory");
        }
        else  if(lname_txt.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Registration is Mandatory");
        }
        else  if(contact_txt.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Registration is Mandatory");
        }
        if(email_txt.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Registration is Mandatory");
        }
        else
        {
            new Bookmyshowframe().show();
            dispose();// TODO add your handling code here:
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contact_txt;
    private javax.swing.JTextField email_txt;
    private javax.swing.JTextField fname_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField lname_txt;
    private javax.swing.JButton login_btn;
    // End of variables declaration//GEN-END:variables
}
