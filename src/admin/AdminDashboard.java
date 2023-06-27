package admin;

import user.*;
import admin.ManageProduct;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class AdminDashboard extends javax.swing.JFrame {

    Color selectionColor = new Color(34, 48, 62);
    Color sideColor = new Color(64, 194, 150);
    Color textSelectionColor = new Color(255, 255, 255);
    
    public AdminDashboard() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpTItleBar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        adminEmail = new javax.swing.JLabel();
        jpMenuBar = new javax.swing.JPanel();
        jpDashBoard = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jpManageCategory = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jpIsSelected8 = new javax.swing.JPanel();
        jpManageProduct = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jpIsSelected4 = new javax.swing.JPanel();
        jpManageUser = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jpIsSelected12 = new javax.swing.JPanel();
        jpAddSuppliers = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jpIsSelected1 = new javax.swing.JPanel();
        jpManageSuppliers = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jpIsSelected2 = new javax.swing.JPanel();
        jpTransactions1 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jpIsSelected6 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jpSelectSuppliers = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jpIsSelected5 = new javax.swing.JPanel();
        jpStatisticBoard = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpTItleBar.setBackground(new java.awt.Color(0, 204, 153));
        jpTItleBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shopping.png"))); // NOI18N
        jpTItleBar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 50, 80));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BABY MART MANAGEMENT SYSTEM");
        jpTItleBar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 680, 80));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        jLabel2.setText("Logout");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jpTItleBar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 0, 100, 80));

        adminEmail.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        adminEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/account_light.png"))); // NOI18N
        adminEmail.setText("exmple@gmail.com");
        jpTItleBar.add(adminEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 0, 220, 80));

        getContentPane().add(jpTItleBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 80));

        jpMenuBar.setBackground(new java.awt.Color(51, 51, 51));
        jpMenuBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpDashBoard.setBackground(new java.awt.Color(153, 153, 255));
        jpDashBoard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dashboard.png"))); // NOI18N
        jLabel9.setText("    DASHBOARD");
        jpDashBoard.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 220, 60));

        jpMenuBar.add(jpDashBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 270, 60));

        jpManageCategory.setBackground(new java.awt.Color(51, 51, 51));
        jpManageCategory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/category_dark.png"))); // NOI18N
        jpManageCategory.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 30, 40));

        jLabel26.setBackground(new java.awt.Color(153, 153, 153));
        jLabel26.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 153, 153));
        jLabel26.setText("Manage Category");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        jpManageCategory.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 210, 40));

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

        jpManageCategory.add(jpIsSelected8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        jpMenuBar.add(jpManageCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 270, 40));

        jpManageProduct.setBackground(new java.awt.Color(51, 51, 51));
        jpManageProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpManageProductMouseClicked(evt);
            }
        });
        jpManageProduct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/product_dark.png"))); // NOI18N
        jpManageProduct.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 40));

        jLabel22.setBackground(new java.awt.Color(153, 153, 153));
        jLabel22.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 153, 153));
        jLabel22.setText("Manage Products");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jpManageProduct.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 180, 40));

        jpIsSelected4.setBackground(new java.awt.Color(51, 51, 51));
        jpIsSelected4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpIsSelected4Layout = new javax.swing.GroupLayout(jpIsSelected4);
        jpIsSelected4.setLayout(jpIsSelected4Layout);
        jpIsSelected4Layout.setHorizontalGroup(
            jpIsSelected4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jpIsSelected4Layout.setVerticalGroup(
            jpIsSelected4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jpManageProduct.add(jpIsSelected4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jpMenuBar.add(jpManageProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 180, 290, 40));

        jpManageUser.setBackground(new java.awt.Color(51, 51, 51));
        jpManageUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user_dark.png"))); // NOI18N
        jpManageUser.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 40));

        jLabel24.setBackground(new java.awt.Color(153, 153, 153));
        jLabel24.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 153, 153));
        jLabel24.setText("Manage Users");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jpManageUser.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 140, 40));

        jpIsSelected12.setBackground(new java.awt.Color(51, 51, 51));
        jpIsSelected12.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpIsSelected12Layout = new javax.swing.GroupLayout(jpIsSelected12);
        jpIsSelected12.setLayout(jpIsSelected12Layout);
        jpIsSelected12Layout.setHorizontalGroup(
            jpIsSelected12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jpIsSelected12Layout.setVerticalGroup(
            jpIsSelected12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jpManageUser.add(jpIsSelected12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        jpMenuBar.add(jpManageUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 230, 290, 40));

        jpAddSuppliers.setBackground(new java.awt.Color(51, 51, 51));
        jpAddSuppliers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/supplier_dark.png"))); // NOI18N
        jpAddSuppliers.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 40));

        jLabel25.setBackground(new java.awt.Color(153, 153, 153));
        jLabel25.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 153, 153));
        jLabel25.setText("Add Employees");
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jpAddSuppliers.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 170, 40));

        jpIsSelected1.setBackground(new java.awt.Color(51, 51, 51));
        jpIsSelected1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpIsSelected1Layout = new javax.swing.GroupLayout(jpIsSelected1);
        jpIsSelected1.setLayout(jpIsSelected1Layout);
        jpIsSelected1Layout.setHorizontalGroup(
            jpIsSelected1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jpIsSelected1Layout.setVerticalGroup(
            jpIsSelected1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jpAddSuppliers.add(jpIsSelected1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jpMenuBar.add(jpAddSuppliers, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 280, 290, 40));

        jpManageSuppliers.setBackground(new java.awt.Color(51, 51, 51));
        jpManageSuppliers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit_supplier_dark.png"))); // NOI18N
        jpManageSuppliers.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 40));

        jLabel30.setBackground(new java.awt.Color(153, 153, 153));
        jLabel30.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(153, 153, 153));
        jLabel30.setText("Manage Employees");
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        jpManageSuppliers.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 210, 40));

        jpIsSelected2.setBackground(new java.awt.Color(51, 51, 51));
        jpIsSelected2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpIsSelected2Layout = new javax.swing.GroupLayout(jpIsSelected2);
        jpIsSelected2.setLayout(jpIsSelected2Layout);
        jpIsSelected2Layout.setHorizontalGroup(
            jpIsSelected2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jpIsSelected2Layout.setVerticalGroup(
            jpIsSelected2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jpManageSuppliers.add(jpIsSelected2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        jpMenuBar.add(jpManageSuppliers, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 330, 290, 40));

        jpTransactions1.setBackground(new java.awt.Color(51, 51, 51));
        jpTransactions1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setBackground(new java.awt.Color(153, 153, 153));
        jLabel38.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(153, 153, 153));
        jLabel38.setText("Transaction");
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });
        jpTransactions1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 140, 40));

        jpIsSelected6.setBackground(new java.awt.Color(51, 51, 51));
        jpIsSelected6.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpIsSelected6Layout = new javax.swing.GroupLayout(jpIsSelected6);
        jpIsSelected6.setLayout(jpIsSelected6Layout);
        jpIsSelected6Layout.setHorizontalGroup(
            jpIsSelected6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jpIsSelected6Layout.setVerticalGroup(
            jpIsSelected6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jpTransactions1.add(jpIsSelected6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        jLabel36.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/transaction_dark.png"))); // NOI18N
        jpTransactions1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 40));

        jpMenuBar.add(jpTransactions1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 430, 290, 40));

        jpSelectSuppliers.setBackground(new java.awt.Color(51, 51, 51));
        jpSelectSuppliers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/selection_outline.png"))); // NOI18N
        jLabel31.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpSelectSuppliers.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 30, 40));

        jLabel34.setBackground(new java.awt.Color(153, 153, 153));
        jLabel34.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(153, 153, 153));
        jLabel34.setText("Select Employees");
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });
        jpSelectSuppliers.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 170, 40));

        jpIsSelected5.setBackground(new java.awt.Color(51, 51, 51));
        jpIsSelected5.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpIsSelected5Layout = new javax.swing.GroupLayout(jpIsSelected5);
        jpIsSelected5.setLayout(jpIsSelected5Layout);
        jpIsSelected5Layout.setHorizontalGroup(
            jpIsSelected5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jpIsSelected5Layout.setVerticalGroup(
            jpIsSelected5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jpSelectSuppliers.add(jpIsSelected5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        jpMenuBar.add(jpSelectSuppliers, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 380, 290, 40));

        getContentPane().add(jpMenuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 270, 760));

        jpStatisticBoard.setBackground(new java.awt.Color(255, 255, 255));
        jpStatisticBoard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel13.setText("Statistics");
        jpStatisticBoard.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 100, -1));

        jLabel14.setBackground(new java.awt.Color(51, 51, 51));
        jLabel14.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Today Sales: 0");
        jpStatisticBoard.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 50, 220, -1));

        jLabel15.setBackground(new java.awt.Color(51, 51, 51));
        jLabel15.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Total Categories:  4.0");
        jpStatisticBoard.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 220, -1));

        jLabel16.setBackground(new java.awt.Color(51, 51, 51));
        jLabel16.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Total Products:  21.0");
        jpStatisticBoard.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 200, -1));

        jLabel28.setBackground(new java.awt.Color(51, 51, 51));
        jLabel28.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 102, 102));
        jLabel28.setText("Total Users: 3.0");
        jpStatisticBoard.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 220, -1));

        jLabel32.setBackground(new java.awt.Color(51, 51, 51));
        jLabel32.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 102, 102));
        jLabel32.setText("Total Salse: 0");
        jpStatisticBoard.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 120, 200, -1));

        jLabel35.setBackground(new java.awt.Color(51, 51, 51));
        jLabel35.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 102, 102));
        jLabel35.setText("Total Employees: 4.0");
        jpStatisticBoard.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 200, -1));

        getContentPane().add(jpStatisticBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 1180, 180));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        //Button ManageProduct
        jpManageProduct.setBackground(selectionColor);        
        jpIsSelected4.setBackground(sideColor);
        jLabel22.setForeground(textSelectionColor);
        jLabel6.setVisible(true);
        
        ManageProduct manageProduct = new ManageProduct();
        manageProduct.setVisible(true);
        manageProduct.pack();
    }//GEN-LAST:event_jLabel22MouseClicked

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

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        //Button Manage Users
        jpManageUser.setBackground(selectionColor);        
        jpIsSelected12.setBackground(sideColor);
        jLabel24.setForeground(textSelectionColor);
        jLabel17.setVisible(true);
        
        ManageUsers manageUsers = new ManageUsers();
        manageUsers.setVisible(true);
        manageUsers.pack();
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        //Button Add Suppliers
        jpAddSuppliers.setBackground(selectionColor);        
        jpIsSelected1.setBackground(sideColor);
        jLabel25.setForeground(textSelectionColor);
        jLabel18.setVisible(true);
        
        AddEmployees addSuppliers = new AddEmployees();
        addSuppliers.setVisible(true);
        addSuppliers.pack();
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        //Button Manage Suppliers
        jpManageSuppliers.setBackground(selectionColor);        
        jpIsSelected2.setBackground(sideColor);
        jLabel30.setForeground(textSelectionColor);
        jLabel23.setVisible(true);
        
        ManageEmployees manageSuppliers = new ManageEmployees();
        manageSuppliers.setVisible(true);
        manageSuppliers.pack();
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        //Button SelectSuppliers
        jpSelectSuppliers.setBackground(selectionColor);        
        jpIsSelected5.setBackground(sideColor);
        jLabel34.setForeground(textSelectionColor);
        jLabel31.setVisible(true);
        
        SelectEmployees selectSuppliers = new SelectEmployees();
        selectSuppliers.setVisible(true);
        selectSuppliers.pack();
    }//GEN-LAST:event_jLabel34MouseClicked

    private void init(){
        icons();
    }
    private void icons(){
        jLabel5.setVisible(true);
//        jLabel26.setVisible(false);
        
        jLabel6.setVisible(true);
//        jLabel22.setVisible(false);
        
        jLabel17.setVisible(true);
//        jLabel24.setVisible(false);
        
        jLabel18.setVisible(true);
//        jLabel25.setVisible(false);
        
        jLabel23.setVisible(true);
//        jLabel30.setVisible(false);
        
        jLabel31.setVisible(true);
//        jLabel34.setVisible(false);
        
        jLabel36.setVisible(true);
//        jLabel38.setVisible(false);
    }  
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        //Button Management Category
        jpManageCategory.setBackground(selectionColor);        
        jpIsSelected8.setBackground(sideColor);
        jLabel26.setForeground(textSelectionColor);
        jLabel5.setVisible(true);

        ManageCategory manageCategory = new ManageCategory();
        manageCategory.setVisible(true);
        manageCategory.pack();
        
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
        //Button Transaction
        jpTransactions1.setBackground(selectionColor);        
        jpIsSelected6.setBackground(sideColor);
        jLabel38.setForeground(textSelectionColor);
        jLabel36.setVisible(true);

        Transactions transactions = new Transactions();
        transactions.setVisible(true);
        transactions.pack();
    }//GEN-LAST:event_jLabel38MouseClicked

    private void jpManageProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpManageProductMouseClicked
        //nothing
    }//GEN-LAST:event_jpManageProductMouseClicked

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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel adminEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel17;
    public static javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel22;
    public static javax.swing.JLabel jLabel23;
    public static javax.swing.JLabel jLabel24;
    public static javax.swing.JLabel jLabel25;
    public static javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel30;
    public static javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    public static javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    public static javax.swing.JLabel jLabel36;
    public static javax.swing.JLabel jLabel38;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jpAddSuppliers;
    private javax.swing.JPanel jpDashBoard;
    public static javax.swing.JPanel jpIsSelected1;
    public static javax.swing.JPanel jpIsSelected12;
    public static javax.swing.JPanel jpIsSelected2;
    public static javax.swing.JPanel jpIsSelected4;
    public static javax.swing.JPanel jpIsSelected5;
    public static javax.swing.JPanel jpIsSelected6;
    public static javax.swing.JPanel jpIsSelected8;
    public static javax.swing.JPanel jpManageCategory;
    public static javax.swing.JPanel jpManageProduct;
    public static javax.swing.JPanel jpManageSuppliers;
    public static javax.swing.JPanel jpManageUser;
    private javax.swing.JPanel jpMenuBar;
    public static javax.swing.JPanel jpSelectSuppliers;
    private javax.swing.JPanel jpStatisticBoard;
    private javax.swing.JPanel jpTItleBar;
    public static javax.swing.JPanel jpTransactions1;
    // End of variables declaration//GEN-END:variables
}
