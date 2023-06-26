
package supplier;

import user.*;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ADMIN
 */
public class SupplierAccount extends javax.swing.JFrame {

    Color textPrimaryColor = new Color(153, 153, 153);
    Color primaryColor = new Color(42, 58, 73);
    Color bgColor = new Color(51, 51, 51);
    
    public SupplierAccount() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jTextField40 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jTextField43 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbGender = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel36.setText("Password");
        jPanel6.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 120, 24));

        jTextField37.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jPanel6.add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 280, -1));

        jLabel37.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel37.setText("Supplier ID");
        jPanel6.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 120, 24));

        jLabel38.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel38.setText("Supplier Name");
        jPanel6.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 190, 24));

        jTextField38.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jPanel6.add(jTextField38, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 280, -1));

        jTextField39.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jPanel6.add(jTextField39, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 280, -1));

        jLabel39.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel39.setText("Email");
        jPanel6.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 120, 24));

        jTextField40.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jPanel6.add(jTextField40, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 280, -1));

        jLabel40.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel40.setText("Phone");
        jPanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 120, 24));

        jButton17.setBackground(new java.awt.Color(204, 204, 204));
        jButton17.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jButton17.setText("UPDATE");
        jPanel6.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 130, 40));

        jLabel43.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel43.setText("Address");
        jPanel6.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 250, 24));

        jTextField43.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jPanel6.add(jTextField43, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 280, -1));

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel10.setText("Gender");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 80, -1));

        cbGender.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        jPanel6.add(cbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 280, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 36)); // NOI18N
        jLabel3.setText("SUPPLIERS ACCOUNT");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 310, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit_button.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 40, 50));

        jPanel6.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 50));

        jButton18.setBackground(new java.awt.Color(204, 204, 204));
        jButton18.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jButton18.setText("DELETE");
        jPanel6.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 130, 40));

        jPasswordField1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jPanel6.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 280, 40));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 730, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        for(double i =0.1;i<=1.0; i+=0.1){
            try {
                String s ="" + i;
                float f = Float.parseFloat(s);
                this.setOpacity(f);
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        setVisible(false);
        SupplierDashboard.jpMyAccount.setBackground(bgColor);
        SupplierDashboard.jpIsSelected10.setBackground(bgColor);
        SupplierDashboard.jLabel28.setForeground(textPrimaryColor);
        SupplierDashboard.jLabel11.setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(SupplierAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SupplierAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SupplierAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupplierAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SupplierAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField43;
    // End of variables declaration//GEN-END:variables
}
