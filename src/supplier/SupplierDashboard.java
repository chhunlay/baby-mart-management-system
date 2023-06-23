package supplier;
import admin.ManageProduct;
import java.awt.Color;
import javax.swing.JOptionPane;
import user.Login;

/**
 *
 * @author ADMIN
 */
public class SupplierDashboard extends javax.swing.JFrame {

    Color selectionColor = new Color(34, 48, 62);
    Color sideColor = new Color(64, 194, 150);
    Color textSelectionColor = new Color(255, 255, 255);
    
    public SupplierDashboard() {
        initComponents();
        init();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jpMyAccount = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jpIsSelected10 = new javax.swing.JPanel();
        jpMyDelivery = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jpIsSelected9 = new javax.swing.JPanel();
        jpDeliver = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jpIsSelected8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shopping.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 60, 80));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BABY MART MANAGEMENT SYSTEM");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 770, 80));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        jLabel2.setText("Logout");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 0, 100, 80));

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/account_light.png"))); // NOI18N
        jLabel10.setText("exmple@gmail.com");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 0, 220, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1520, 80));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dashboard.png"))); // NOI18N
        jLabel9.setText("    DASHBOARD");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 197, 60));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 270, -1));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpMyAccount.setBackground(new java.awt.Color(51, 51, 51));
        jpMyAccount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setBackground(new java.awt.Color(153, 153, 153));
        jLabel28.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(153, 153, 153));
        jLabel28.setText("My Account");
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        jpMyAccount.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 210, 40));

        jLabel11.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user_dark.png"))); // NOI18N
        jpMyAccount.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 30, 40));

        jpIsSelected10.setBackground(new java.awt.Color(51, 51, 51));
        jpIsSelected10.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpIsSelected10Layout = new javax.swing.GroupLayout(jpIsSelected10);
        jpIsSelected10.setLayout(jpIsSelected10Layout);
        jpIsSelected10Layout.setHorizontalGroup(
            jpIsSelected10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jpIsSelected10Layout.setVerticalGroup(
            jpIsSelected10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jpMyAccount.add(jpIsSelected10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel4.add(jpMyAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 270, 40));

        jpMyDelivery.setBackground(new java.awt.Color(51, 51, 51));
        jpMyDelivery.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setBackground(new java.awt.Color(153, 153, 153));
        jLabel27.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 153, 153));
        jLabel27.setText("My Delivery");
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        jpMyDelivery.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 210, 40));

        jLabel8.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/purchasedetails_dark.png"))); // NOI18N
        jpMyDelivery.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 30, 40));

        jpIsSelected9.setBackground(new java.awt.Color(51, 51, 51));
        jpIsSelected9.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpIsSelected9Layout = new javax.swing.GroupLayout(jpIsSelected9);
        jpIsSelected9.setLayout(jpIsSelected9Layout);
        jpIsSelected9Layout.setHorizontalGroup(
            jpIsSelected9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jpIsSelected9Layout.setVerticalGroup(
            jpIsSelected9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jpMyDelivery.add(jpIsSelected9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel4.add(jpMyDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 270, 40));

        jpDeliver.setBackground(new java.awt.Color(51, 51, 51));
        jpDeliver.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setBackground(new java.awt.Color(153, 153, 153));
        jLabel26.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 153, 153));
        jLabel26.setText("Delivery");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        jpDeliver.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 210, 40));

        jLabel7.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delivery_dark.png"))); // NOI18N
        jpDeliver.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 30, 40));

        jpIsSelected8.setBackground(new java.awt.Color(51, 51, 51));
        jpIsSelected8.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpIsSelected8Layout = new javax.swing.GroupLayout(jpIsSelected8);
        jpIsSelected8.setLayout(jpIsSelected8Layout);
        jpIsSelected8Layout.setHorizontalGroup(
            jpIsSelected8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jpIsSelected8Layout.setVerticalGroup(
            jpIsSelected8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jpDeliver.add(jpIsSelected8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel4.add(jpDeliver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 270, 40));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 270, 750));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 270, 770));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel15.setText("My Statistics");
        jPanel9.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 130, -1));

        jLabel17.setBackground(new java.awt.Color(51, 51, 51));
        jLabel17.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("My Delivery: 0.0");
        jPanel9.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 220, -1));

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 410, 210));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void init(){
        icons();
    }
    private void icons(){
        jLabel7.setVisible(true);
        jLabel8.setVisible(true);
        jLabel11.setVisible(true);
        
    }
    
    
    
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        //Button DeliveryDetails
        jpDeliver.setBackground(selectionColor);
        jpIsSelected8.setBackground(sideColor);
        jLabel26.setForeground(textSelectionColor);
        jLabel7.setVisible(true);
        
        DeliveryDetails deliveryDetails = new DeliveryDetails();
        deliveryDetails.setVisible(true);
        deliveryDetails.pack();


    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        //Button MyDelivery
        jpMyDelivery.setBackground(selectionColor);
        jpIsSelected9.setBackground(sideColor);
        jLabel27.setForeground(textSelectionColor);
        jLabel8.setVisible(true);

        MyDeliveryy myDeliveryy = new MyDeliveryy();
        myDeliveryy.setVisible(true);
        myDeliveryy.pack();
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        //Button MyAccount
        jpMyAccount.setBackground(selectionColor);
        jpIsSelected10.setBackground(sideColor);
        jLabel28.setForeground(textSelectionColor);
        jLabel11.setVisible(true);

        SupplierAccount supplierAccount = new SupplierAccount();
        supplierAccount.setVisible(true);
        supplierAccount.pack();
    }//GEN-LAST:event_jLabel28MouseClicked

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
            java.util.logging.Logger.getLogger(SupplierDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SupplierDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SupplierDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupplierDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SupplierDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel26;
    public static javax.swing.JLabel jLabel27;
    public static javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    public static javax.swing.JPanel jpDeliver;
    public static javax.swing.JPanel jpIsSelected10;
    public static javax.swing.JPanel jpIsSelected8;
    public static javax.swing.JPanel jpIsSelected9;
    public static javax.swing.JPanel jpMyAccount;
    public static javax.swing.JPanel jpMyDelivery;
    // End of variables declaration//GEN-END:variables
}
