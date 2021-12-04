/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pointofsale;

//import javax.swing.JFrame;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author PLAYER
 */
public class Login extends javax.swing.JFrame {

    public static java.sql.Connection conn = (Connection)Database.configDB();
    public static Utilities utilities = new Utilities();
    
    public Login() {
        initComponents();
        this.setResizable(false);
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/pointofsale/src/title.png")));
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
        jPanel2 = new javax.swing.JPanel();
        SelamatDatang = new javax.swing.JLabel();
        SilahkanLogin = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        inputUsername = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        inputPassword = new javax.swing.JPasswordField();
        btnMasuk = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        foothr = new javax.swing.JPanel();
        foot1 = new javax.swing.JLabel();
        foot2 = new javax.swing.JLabel();
        foot3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/rsz_12-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(198, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(103, 103, 103))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        SelamatDatang.setFont(new java.awt.Font("Trebuchet MS", 1, 40)); // NOI18N
        SelamatDatang.setText("Selamat Datang !");

        SilahkanLogin.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        SilahkanLogin.setForeground(new java.awt.Color(153, 153, 153));
        SilahkanLogin.setText("Silahkan Login");

        username.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        username.setText("Username");

        inputUsername.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        inputUsername.setToolTipText("Masukkan Username");
        inputUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        inputUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputUsernameMouseClicked(evt);
            }
        });
        inputUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputUsernameKeyPressed(evt);
            }
        });

        password.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        password.setText("Password");

        inputPassword.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        inputPassword.setToolTipText("Masukkan Password");
        inputPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        inputPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPasswordActionPerformed(evt);
            }
        });
        inputPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputPasswordKeyPressed(evt);
            }
        });

        btnMasuk.setBackground(new java.awt.Color(21, 101, 216));
        btnMasuk.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnMasuk.setForeground(new java.awt.Color(255, 255, 255));
        btnMasuk.setText("MASUK");
        btnMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasukActionPerformed(evt);
            }
        });
        btnMasuk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnMasukKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Lupa Password ? Hubungi Administrator");

        foothr.setBackground(new java.awt.Color(153, 153, 153));
        foothr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout foothrLayout = new javax.swing.GroupLayout(foothr);
        foothr.setLayout(foothrLayout);
        foothrLayout.setHorizontalGroup(
            foothrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );
        foothrLayout.setVerticalGroup(
            foothrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        foot1.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        foot1.setForeground(new java.awt.Color(153, 153, 153));
        foot1.setText("Build With");

        foot2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/heart.png"))); // NOI18N

        foot3.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        foot3.setForeground(new java.awt.Color(153, 153, 153));
        foot3.setText("By Kelompok 2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(foot1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(foot2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(foot3))
                    .addComponent(username)
                    .addComponent(SelamatDatang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(password)
                    .addComponent(inputUsername)
                    .addComponent(btnMasuk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(foothr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SilahkanLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(SelamatDatang)
                .addGap(0, 0, 0)
                .addComponent(SilahkanLogin)
                .addGap(27, 27, 27)
                .addComponent(username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(90, 90, 90)
                .addComponent(foothr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foot2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(foot3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(foot1))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasukActionPerformed
        Login();
    }//GEN-LAST:event_btnMasukActionPerformed

    private void inputPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPasswordActionPerformed

    private void btnMasukKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnMasukKeyPressed
        Login();
    }//GEN-LAST:event_btnMasukKeyPressed

    private void inputPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputPasswordKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Login();
        }
    }//GEN-LAST:event_inputPasswordKeyPressed

    private void inputUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputUsernameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUsernameMouseClicked

    private void inputUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputUsernameKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Login();
        }
    }//GEN-LAST:event_inputUsernameKeyPressed

    private void Login(){
        try{
            String sql = "SELECT * FROM users WHERE username =? AND password =? ";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,inputUsername.getText());
            pst.setString(2, inputPassword.getText());
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                
                String aktif = rs.getString(7);
                if(aktif.equals("Aktif")){
                    // tutup frame login
                    dispose();
                    
                    // udpate data last_login pada user
                    String sql_user = "UPDATE users SET login_terbaru = ? WHERE id_user =  ?";
                    PreparedStatement pst_user = conn.prepareStatement(sql_user);
                    pst_user.setString(1, utilities.getCurrentTimeStamp());
                    pst_user.setString(2, rs.getString(1));
                    
                    pst_user.execute();
                    
                    // kirimlkan data ke dashboard
                    String id = rs.getString(1);
                    String nama = rs.getString(3);
                    int role = rs.getInt(5);
                    Dashboard dashboard = new Dashboard(id, nama, role);
                    dashboard.show();
                    
                }else{
                    throw new Exception("Akun anda dinonaktifkan !");
                }
                
            }else{
                throw new Exception("Username atau Password Anda Salah !");
            }
            
        }catch(Exception er){
            JOptionPane.showMessageDialog(null, er.getMessage(), "Terjadi Kesalahan!", JOptionPane.WARNING_MESSAGE);
        }
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
    private javax.swing.JLabel SelamatDatang;
    private javax.swing.JLabel SilahkanLogin;
    private javax.swing.JButton btnMasuk;
    private javax.swing.JLabel foot1;
    private javax.swing.JLabel foot2;
    private javax.swing.JLabel foot3;
    private javax.swing.JPanel foothr;
    private javax.swing.JPasswordField inputPassword;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel password;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
