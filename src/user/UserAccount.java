package user;

import dao.UserDao;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UserAccount extends javax.swing.JFrame {

    UserDao user = new UserDao();
    Color textPrimaryColor = new Color(153, 153, 153);
    Color bgColor = new Color(51, 51, 51);
    Color notEdit = new Color(204, 204, 204);
    private int uID;
    String[] value = new String[9];

    public UserAccount() {
        initComponents();
        init();
        setValue();
        noEdit();
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
        txtID = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        lblHide = new javax.swing.JLabel();
        lblVisible = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(153, 153, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Password");
        jPanel6.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 120, 24));

        txtID.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jPanel6.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 280, -1));

        jLabel37.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("ID");
        jPanel6.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 120, 24));

        jLabel38.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Username");
        jPanel6.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 120, 24));

        txtGender.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jPanel6.add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 280, -1));

        txtEmail.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jPanel6.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 280, -1));

        jLabel39.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Email");
        jPanel6.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 120, 24));

        txtPhone.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jPanel6.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 280, -1));

        jLabel40.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Phone");
        jPanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 120, 24));

        btnUpdate.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(153, 153, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel6.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 130, 40));

        jLabel43.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Address");
        jPanel6.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 250, 24));

        txtAddress.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jPanel6.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 280, -1));

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gender");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 80, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 36)); // NOI18N
        jLabel3.setText("USER ACCOUNT");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 230, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit_button.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 40, 50));

        jPanel6.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 50));

        btnDelete.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(153, 153, 255));
        btnDelete.setText("DELETE");
        jPanel6.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 130, 40));

        txtPassword.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jPanel6.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 280, 40));

        txtUsername.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        jPanel6.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 280, -1));

        lblHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hide.png"))); // NOI18N
        lblHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHideMouseClicked(evt);
            }
        });
        lblHide.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblHideKeyPressed(evt);
            }
        });
        jPanel6.add(lblHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 30, 60));

        lblVisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/visible.png"))); // NOI18N
        lblVisible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVisibleMouseClicked(evt);
            }
        });
        lblVisible.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblVisibleKeyPressed(evt);
            }
        });
        jPanel6.add(lblVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 30, 60));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 730, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void init() {
        uID = user.getUserID(UserDashboard.userEmail.getText());
        value = user.getUserValue(uID);
        setValue();

    }

    private void noEdit() {
        txtID.setBackground(notEdit);
        txtID.setEditable(false);

        txtPhone.setBackground(notEdit);
        txtPhone.setEditable(false);

    }

    private void setValue() {
        txtID.setText(value[0]);
        txtUsername.setText(value[1]);
        txtGender.setText(value[2]);
        txtEmail.setText(value[3]);
        txtPassword.setText(value[4]);
        txtPhone.setText(value[5]);
        txtAddress.setText(value[6]);

    }

    public boolean isEmpty() {
        if (txtUsername.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username is required", "Warning", 2);
            return false;
        }
        if (txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Email address is required", "Warning", 2);
            return false;
        }
        if (!txtEmail.getText().matches("^.+@.+\\..+$")) {
            JOptionPane.showMessageDialog(this, "Invalid email address", "Warning", 2);
            return false;
        }
        if (String.valueOf(txtPassword.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password is required", "Warning", 2);
            return false;
        }
        if (txtPhone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Phone number is required", "Warning", 2);
            return false;
        }
        if (txtAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Address is required", "Warning", 2);
            return false;
        }
        return true;
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        for (double i = 0.1; i <= 1.0; i += 0.1) {
            try {
                String s = "" + i;
                float f = Float.parseFloat(s);
                this.setOpacity(f);
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        setVisible(false);
        UserDashboard.jpMyAccount.setBackground(bgColor);
        UserDashboard.jpIsSelected10.setBackground(bgColor);
        UserDashboard.jLabel28.setForeground(textPrimaryColor);
        UserDashboard.jLabel11.setVisible(true);

    }//GEN-LAST:event_jLabel1MouseClicked

    private void lblHideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHideMouseClicked
        // TODO add your handling code here:
        txtPassword.setEchoChar((char) 0);
        lblHide.setVisible(false);
        lblVisible.setVisible(true);

    }//GEN-LAST:event_lblHideMouseClicked

    private void lblHideKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblHideKeyPressed

    }//GEN-LAST:event_lblHideKeyPressed

    private void lblVisibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVisibleMouseClicked
        txtPassword.setEchoChar('*');
        lblHide.setVisible(true);
        lblVisible.setVisible(false);
    }//GEN-LAST:event_lblVisibleMouseClicked

    private void lblVisibleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblVisibleKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblVisibleKeyPressed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (isEmpty()) {
            if (!check()) {
                int id = Integer.parseInt(txtID.getText());
                String username = txtUsername.getText();
                String gender = txtGender.getText();
                String email = txtEmail.getText();
                String password = String.valueOf(txtPassword.getPassword());
                String phone = txtPhone.getText();
                String address = txtAddress.getText();               
                
                user.update(id, username, gender, email, password, phone, address);
                this.dispose();

            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    //checking for update:
    private boolean check() {
        String newEmail = txtEmail.getText();
        String newPhone = txtPhone.getText();
        if (newEmail.equals(value[3]) && newPhone.equals(value[5])) {
            return false;
        } else {
            if (!newEmail.equals(value[3])) {
                boolean x = user.isEmailExists(newEmail);
                if (x) {
                    JOptionPane.showMessageDialog(this, "This email already exists", "Warning", 2);
                }
                return x;
            }

            if (!newPhone.equals(value[5])) {
                boolean x = user.isPhoneExists(newPhone);
                if (x) {
                    JOptionPane.showMessageDialog(this, "This phone number already exists", "Warning", 2);
                }
                return x;
            }
        }
        return false;
    }

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
            java.util.logging.Logger.getLogger(UserAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel lblHide;
    private javax.swing.JLabel lblVisible;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtID;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
