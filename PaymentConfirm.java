/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookmyshow;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class PaymentConfirm extends javax.swing.JFrame {

// String movie_name_str,movie_str,seat_type_str,seat_no_str,food_str,food_qty_str,gst_str,total_str;
//
//    public PaymentConfirm(String gst_str, String total_str, JLabel final_amt, JLabel gst_label) {
//        initComponents();
//        this.gst_str = gst_str;
//        this.total_str = total_str;
////        this.final_amt = final_amt;
////        this.gst_label = gst_label;
//        
//        gst_label.setText(gst_str+" Rs.");
//        total_label.setText(total_str+" Rs.");
//    }
    public PaymentConfirm() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        gst_label.setText(PaymentProcess.gst_str+" Rs.");
        total_label.setText(PaymentProcess.total_str+" Rs.");
    }

    PaymentConfirm(String gst_str, String total_str) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        payment_panel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        gst_label = new javax.swing.JLabel();
        total_label = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        pay_btn = new javax.swing.JButton();
        cancel_btn1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(143, 52, 143));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153,90));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        payment_panel.setBackground(new java.awt.Color(102, 0, 153,90));
        payment_panel.setName("PaymentPanel"); // NOI18N
        payment_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("GST 18% (Rs.)");
        payment_panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 190, 38));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total Amount (Rs.)");
        payment_panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 250, 38));

        gst_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        gst_label.setForeground(new java.awt.Color(255, 255, 255));
        payment_panel.add(gst_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 200, 38));

        total_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        total_label.setForeground(new java.awt.Color(255, 255, 255));
        payment_panel.add(total_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 200, 38));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153,110));

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(251, 250, 242));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Payment");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        payment_panel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 130));

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 153,90));
        kGradientPanel1.setkGradientFocus(700);
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 0, 153,90));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Paytm.png"))); // NOI18N

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bhim.png"))); // NOI18N

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Google Pay India.png"))); // NOI18N

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MasterCard.png"))); // NOI18N

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Phone Pe.png"))); // NOI18N

        pay_btn.setBackground(new java.awt.Color(0, 153, 0));
        pay_btn.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        pay_btn.setText("Pay");
        pay_btn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pay_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pay_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay_btnActionPerformed(evt);
            }
        });

        cancel_btn1.setBackground(new java.awt.Color(153, 153, 153));
        cancel_btn1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        cancel_btn1.setText("Back");
        cancel_btn1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cancel_btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(cancel_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(pay_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancel_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pay_btn))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        payment_panel.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 580, 170));

        jPanel2.add(payment_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 860, 830));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/seatconfirm back1.jpg"))); // NOI18N
        jLabel11.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jLabel11.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jLabel11.setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 2500, 1070));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pay_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay_btnActionPerformed
//            payment_opt_panel.setVisible(false);
//            payment_panel.setEnabled(false);
//            payment_confirm_panel.setVisible(true);
//           
//            cancel_btn1.setEnabled(false);
//            pay_btn.setEnabled(false);
             new Congrats().show();
             dispose();
           // final_amt.setText(String.valueOf(Bookmyshowframe1.total_str)+" Rs");
        // TODO add your handling code here:
    }//GEN-LAST:event_pay_btnActionPerformed

    private void cancel_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btn1ActionPerformed

        new Bookmyshowframe1().show();
        dispose();
// payment_panel.setVisible(false);
        //next_btn.setEnabled(true);
       // cancel_btn.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel_btn1ActionPerformed

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
            java.util.logging.Logger.getLogger(PaymentConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentConfirm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_btn1;
    private javax.swing.JLabel gst_label;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton pay_btn;
    private javax.swing.JPanel payment_panel;
    private javax.swing.JLabel total_label;
    // End of variables declaration//GEN-END:variables
}
