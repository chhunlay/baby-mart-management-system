
package admin;
import static admin.AdminDashboard.jLabel23;
import static admin.AdminDashboard.jLabel30;
import static admin.AdminDashboard.jLabel31;
import static admin.AdminDashboard.jLabel34;
import static admin.AdminDashboard.jpIsSelected2;
import static admin.AdminDashboard.jpManageSuppliers;
import static admin.AdminDashboard.jpSelectSuppliers;
import java.awt.Color;

/**
 *
 * @author ADMIN
 */
public class ManageSupplier extends javax.swing.JFrame {

    Color textPrimaryColor = new Color(153, 153, 153);
    Color primaryColor = new Color(42, 58, 73);
    Color bgColor = new Color(51, 51, 51);
    
    public ManageSupplier() {
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
        jLabel36 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jTextField40 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jTextField43 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbGender = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton18 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField44 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Password");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 120, 24));

        jTextField37.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jPanel1.add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 280, -1));

        jLabel37.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Supplier ID");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 120, 24));

        jLabel38.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Supplier Name");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 190, 24));

        jTextField38.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jPanel1.add(jTextField38, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 280, -1));

        jTextField39.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jPanel1.add(jTextField39, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 280, -1));

        jLabel39.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Email");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 120, 24));

        jTextField40.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jPanel1.add(jTextField40, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 280, -1));

        jLabel40.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Phone");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 120, 24));

        jButton16.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jButton16.setForeground(new java.awt.Color(153, 153, 255));
        jButton16.setText("CLEAR");
        jPanel1.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 280, 50));

        jButton17.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jButton17.setForeground(new java.awt.Color(153, 153, 255));
        jButton17.setText("UPDATE");
        jPanel1.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 130, 50));

        jLabel43.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Address");
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 250, 24));

        jTextField43.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jPanel1.add(jTextField43, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 280, -1));

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gender");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 80, -1));

        cbGender.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        jPanel1.add(cbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 280, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Supplier ID", "Supplier Name", "Gender", "Phone", "Email", "Password", "Address"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 690, 180));

        jButton18.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jButton18.setForeground(new java.awt.Color(153, 153, 255));
        jButton18.setText("DELETE");
        jPanel1.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 130, 50));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("__________________________________________________________________________________________________");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        jTextField44.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jTextField44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField44ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField44, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 540, 280, -1));

        jLabel44.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("SEARCH");
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, 250, 40));

        jPasswordField1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 280, 40));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 36)); // NOI18N
        jLabel3.setText("SUPPLIERS MANAGEMENT");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 400, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit_button.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 40, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 820));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField44ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        setVisible(false);
        AdminDashboard.jpManageSuppliers.setBackground(bgColor);
        AdminDashboard.jpIsSelected2.setBackground(bgColor);
        AdminDashboard.jLabel30.setForeground(textPrimaryColor);
        AdminDashboard.jLabel23.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(ManageSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageSupplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    // End of variables declaration//GEN-END:variables
}
