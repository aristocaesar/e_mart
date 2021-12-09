/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pointofsale;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Alkaafi Komputer
 */
public class TambahUser extends javax.swing.JFrame {

    public String kondisi;
    public String id_user;
    public static java.sql.Connection conn = (Connection)Database.configDB();
    public static Utilities utilities = new Utilities();
    
    public TambahUser(String aksi, String id_user_update) throws Exception {
        initComponents();
        this.setResizable(false);
        this.kondisi = aksi;
        this.id_user = id_user_update;
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/pointofsale/src/trolley.png")));
        
        
        
        label_idUser.setVisible(false);
        label_namadepanLama_tambahuser.setVisible(false);
        label_namabelakangLama_tambahuser.setVisible(false);
        label_usernameLama_tambahuser.setVisible(false);
        label_passwordLama_tambahuser.setVisible(false);
        label_konfirmasipasswordLama_tambahuser.setVisible(false);
        label_notelpLama_tambahuser.setVisible(false);
        label_roleLama_tambahuser.setVisible(false);
        label_statusLama_tambahuser.setVisible(false);
        
        label_last_login.setVisible(false);
        field_last_login.setVisible(false);
        
        label_updated_at.setVisible(false);
        field_updated_at.setVisible(false);
        
        label_created_at.setVisible(false);
        field_created_at.setVisible(false);
        
        if(aksi.equals("tambah")){
            //tambah user
            this.setTitle("Tambah User");
            this.setPreferredSize(new Dimension(713, 500));
            this.pack();
            
            label_status_tambahuser.setVisible(false);
            combobox_status_tambahuser.setVisible(false);
            button_hapus_tambahuser.setVisible(false);
            
            try{
                String sql = "SELECT id_user FROM users ORDER BY id_user DESC LIMIT 1 ";
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet res = pst.executeQuery();

                if(res.next()){
                    String a = res.getString(1).replaceAll("[a-zA-Z]", "");
                    String b = "";
                    String c[] = a.split("( ?!^)");
                    String u = "";

                    if("0".equals(c[0])){
                        if("0".equals(c[1])){
                            b = c[2];
                        }else{
                            b = c[1]+c[2];
                        }
                    }else{
                        b = a;
                    }

                    int d = Integer.parseInt(b)+1;

                    if(d <= 9){
                        u = "U00";
                    }else if(d <= 99 ){
                        u = "U0";
                    }else{
                        u = "U";
                    }

                    this.id_user = u+""+d;
                    
                }
                
            }catch(SQLException err){
                JOptionPane.showMessageDialog(null, "Gagal Memuat Data!", "Terjadi Kesalahan !", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
            
        }else{
            
            // update user
            this.setTitle("Update User");
            this.setPreferredSize(new Dimension(713, 589));
            this.pack();
            
            String sql = "SELECT * FROM users WHERE id_user = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, this.id_user);
            ResultSet res = pst.executeQuery();
            
            if(res.next()){
                
                label_last_login.setVisible(true);
                field_last_login.setVisible(true);
                field_last_login.setText(res.getString(8));

                label_updated_at.setVisible(true);
                field_updated_at.setVisible(true);
                field_updated_at.setText(res.getString(10));

                label_created_at.setVisible(true);
                field_created_at.setVisible(true);
                field_created_at.setText(res.getString(9));
                
                String nama_lengkap[] = res.getString(3).split("\\s+",2);
                label_namadepanLama_tambahuser.setText(nama_lengkap[0]);
                field_namadepan_tambahuser.setText(nama_lengkap[0]);
                
                label_namabelakangLama_tambahuser.setText(nama_lengkap[1]);
                field_namabelakang_tambahuser.setText(nama_lengkap[1]);
                
                label_usernameLama_tambahuser.setText(res.getString(2));
                field_username_tambahuser.setText(res.getString(2));
                
                label_notelpLama_tambahuser.setText(res.getString(6));
                field_notelpon_tambahuser.setText(res.getString(6));
                
                label_passwordLama_tambahuser.setText(res.getString(4));
                label_konfirmasipasswordLama_tambahuser.setText(res.getString(4));
                
                String role_desc = "";
                if(res.getInt(5) == 1){
                    role_desc = "Administrator";
                }else{
                    role_desc = "Kasir/User";
                }
                label_roleLama_tambahuser.setText(role_desc);
                combobox_role_tambahuser.setSelectedItem(role_desc);
                
                label_statusLama_tambahuser.setText(res.getString(7));
                combobox_status_tambahuser.setSelectedItem(res.getString(7));
                
               
            }
            
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        field_namadepan_tambahuser = new javax.swing.JTextField();
        field_namabelakang_tambahuser = new javax.swing.JTextField();
        field_username_tambahuser = new javax.swing.JTextField();
        field_notelpon_tambahuser = new javax.swing.JTextField();
        field_password_tambahuser = new javax.swing.JTextField();
        field_konfirmasipassword_tambahuser = new javax.swing.JTextField();
        button_simpan_tambahuser = new javax.swing.JButton();
        label_namadepan_tambahuser = new javax.swing.JLabel();
        label_namabelakang_tambahuser = new javax.swing.JLabel();
        label_username_tambahuser = new javax.swing.JLabel();
        label_notelp_tambahuser = new javax.swing.JLabel();
        label_password_tambahuser = new javax.swing.JLabel();
        label_konfirmasipassword_tambahuser = new javax.swing.JLabel();
        button_hapus_tambahuser = new javax.swing.JButton();
        label_role_tambahuser = new javax.swing.JLabel();
        label_status_tambahuser = new javax.swing.JLabel();
        combobox_status_tambahuser = new javax.swing.JComboBox<>();
        combobox_role_tambahuser = new javax.swing.JComboBox<>();
        label_idUser = new javax.swing.JLabel();
        label_namadepanLama_tambahuser = new javax.swing.JLabel();
        label_usernameLama_tambahuser = new javax.swing.JLabel();
        label_passwordLama_tambahuser = new javax.swing.JLabel();
        label_roleLama_tambahuser = new javax.swing.JLabel();
        label_namabelakangLama_tambahuser = new javax.swing.JLabel();
        label_notelpLama_tambahuser = new javax.swing.JLabel();
        label_konfirmasipasswordLama_tambahuser = new javax.swing.JLabel();
        label_statusLama_tambahuser = new javax.swing.JLabel();
        label_last_login = new javax.swing.JLabel();
        field_last_login = new javax.swing.JTextField();
        label_updated_at = new javax.swing.JLabel();
        field_updated_at = new javax.swing.JTextField();
        label_created_at = new javax.swing.JLabel();
        field_created_at = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        field_namadepan_tambahuser.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        field_namadepan_tambahuser.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        field_namabelakang_tambahuser.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        field_namabelakang_tambahuser.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        field_username_tambahuser.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        field_username_tambahuser.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        field_notelpon_tambahuser.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        field_notelpon_tambahuser.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        field_password_tambahuser.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        field_password_tambahuser.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        field_konfirmasipassword_tambahuser.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        field_konfirmasipassword_tambahuser.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        button_simpan_tambahuser.setBackground(new java.awt.Color(73, 148, 255));
        button_simpan_tambahuser.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        button_simpan_tambahuser.setForeground(new java.awt.Color(255, 255, 255));
        button_simpan_tambahuser.setText("SIMPAN");
        button_simpan_tambahuser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_simpan_tambahuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_simpan_tambahuserMouseClicked(evt);
            }
        });

        label_namadepan_tambahuser.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        label_namadepan_tambahuser.setText("Nama Depan");

        label_namabelakang_tambahuser.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        label_namabelakang_tambahuser.setText("Nama Belakang");

        label_username_tambahuser.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        label_username_tambahuser.setText("Username");

        label_notelp_tambahuser.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        label_notelp_tambahuser.setText("No. Telp");

        label_password_tambahuser.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        label_password_tambahuser.setText("Password");

        label_konfirmasipassword_tambahuser.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        label_konfirmasipassword_tambahuser.setText("Konfirmasi Password");

        button_hapus_tambahuser.setBackground(new java.awt.Color(255, 69, 69));
        button_hapus_tambahuser.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        button_hapus_tambahuser.setForeground(new java.awt.Color(255, 255, 255));
        button_hapus_tambahuser.setText("HAPUS");
        button_hapus_tambahuser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_hapus_tambahuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_hapus_tambahuserMouseClicked(evt);
            }
        });

        label_role_tambahuser.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        label_role_tambahuser.setText("Role");

        label_status_tambahuser.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        label_status_tambahuser.setText("Status");

        combobox_status_tambahuser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aktif", "Non-Aktif" }));

        combobox_role_tambahuser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrator", "Kasir/User" }));

        label_idUser.setText("id_user");

        label_namadepanLama_tambahuser.setText("nama_depan_lama");

        label_usernameLama_tambahuser.setText("username_lama");

        label_passwordLama_tambahuser.setText("password_lama");

        label_roleLama_tambahuser.setText("role_lama");

        label_namabelakangLama_tambahuser.setText("nama_belakang_lama");

        label_notelpLama_tambahuser.setText("no_telp_lama");

        label_konfirmasipasswordLama_tambahuser.setText("konfimasi_pass_lama");

        label_statusLama_tambahuser.setText("status_lama");

        label_last_login.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        label_last_login.setText("Last Login");

        field_last_login.setEditable(false);
        field_last_login.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        field_last_login.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        label_updated_at.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        label_updated_at.setText("Updated At");

        field_updated_at.setEditable(false);
        field_updated_at.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        field_updated_at.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        label_created_at.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        label_created_at.setText("Created At");

        field_created_at.setEditable(false);
        field_created_at.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        field_created_at.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(field_created_at, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_created_at, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(field_last_login, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_last_login, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(field_namadepan_tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_namadepan_tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_namadepanLama_tambahuser)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_namabelakang_tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_namabelakangLama_tambahuser))
                                    .addComponent(field_namabelakang_tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(field_username_tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_username_tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_usernameLama_tambahuser)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_notelp_tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_notelpLama_tambahuser))
                                    .addComponent(field_notelpon_tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(label_idUser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button_hapus_tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button_simpan_tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_role_tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_roleLama_tambahuser))
                                    .addComponent(combobox_role_tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combobox_status_tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_status_tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_statusLama_tambahuser))
                                    .addComponent(field_updated_at, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_updated_at, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(field_password_tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_password_tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_passwordLama_tambahuser)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_konfirmasipassword_tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_konfirmasipasswordLama_tambahuser))
                                    .addComponent(field_konfirmasipassword_tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_namadepan_tambahuser)
                    .addComponent(label_namabelakang_tambahuser)
                    .addComponent(label_namadepanLama_tambahuser)
                    .addComponent(label_namabelakangLama_tambahuser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field_namadepan_tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field_namabelakang_tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_username_tambahuser)
                    .addComponent(label_notelp_tambahuser)
                    .addComponent(label_usernameLama_tambahuser)
                    .addComponent(label_notelpLama_tambahuser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field_username_tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field_notelpon_tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_password_tambahuser)
                    .addComponent(label_konfirmasipassword_tambahuser)
                    .addComponent(label_passwordLama_tambahuser)
                    .addComponent(label_konfirmasipasswordLama_tambahuser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field_password_tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field_konfirmasipassword_tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_role_tambahuser)
                            .addComponent(label_roleLama_tambahuser)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_status_tambahuser)
                            .addComponent(label_statusLama_tambahuser))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combobox_status_tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combobox_role_tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_last_login)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(field_last_login, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_updated_at)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(field_updated_at, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(label_created_at)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(field_created_at, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_simpan_tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_hapus_tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_idUser))
                .addGap(31, 31, 31))
        );

        setSize(new java.awt.Dimension(729, 628));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_simpan_tambahuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_simpan_tambahuserMouseClicked
        
        try{
            String nama_depan = field_namadepan_tambahuser.getText();
            String nama_belakang = field_namabelakang_tambahuser.getText();
            String nama_lengkap = (nama_depan + " " + nama_belakang).toUpperCase();
            String username = field_username_tambahuser.getText();
            String no_telp = field_notelpon_tambahuser.getText();
            String pass1 = field_password_tambahuser.getText();
            String pass2 = field_konfirmasipassword_tambahuser.getText();
            Object role = combobox_role_tambahuser.getSelectedItem();
            Object status = combobox_status_tambahuser.getSelectedItem();
            if(this.kondisi.equals("tambah")){

                try{
                    if(!nama_depan.equals("") && !nama_belakang.equals("") && !username.equals("") && !no_telp.equals("") && !pass1.equals("") && !pass2.equals("")){
                        if(pass1.equals(pass2)){
                            // tambah user
                            int res_role = 2;
                            if(role.toString().equals("Administrator")){
                               res_role = 1;
                            }

                            String sql = "INSERT INTO users VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                            PreparedStatement pst = conn.prepareStatement(sql);
                            pst.setString(1, this.id_user);
                            pst.setString(2, username);
                            pst.setString(3, nama_lengkap);
                            pst.setString(4, pass1);
                            pst.setInt(5, res_role);
                            pst.setString(6, no_telp.replaceAll("[a-zA-Z]", ""));
                            pst.setString(7, "Aktif");
                            pst.setTimestamp(8, Timestamp.valueOf(LocalDateTime.now()));
                            pst.setTimestamp(9, Timestamp.valueOf(LocalDateTime.now()));
                            pst.setTimestamp(10, Timestamp.valueOf(LocalDateTime.now()));

                            pst.execute();

                            ImageIcon successIcon = new ImageIcon(getClass().getResource("/com/pointofsale/src/check.png"));
                            JOptionPane.showMessageDialog(null, "User Berhasil Ditambahkan !", "Sukses !", JOptionPane.INFORMATION_MESSAGE,successIcon);
                            dispose();
                            Dashboard dashboard = new Dashboard("", "", 0, true);
                            dashboard.getDataTableListuser("");

                        }else{
                            throw new SQLException("Password Yang Anda Masukkan Tidak Sama !");
                        }
                    }else{
                        throw new SQLException("Data Tidak Boleh Kosong !");
                    }
                }catch(SQLException err){
                    String em = "Username Sudah Digunakan !";
                    if(err.getErrorCode() == 1062){
                        em = em;
                    }else{
                        em = err.getMessage();
                    }
                    JOptionPane.showMessageDialog(null, em, "Terjadi Kesalahan !", JOptionPane.ERROR_MESSAGE);
                }

            }else{
                // udpate user
                try{
                    
                    if(nama_depan.equals(label_namadepanLama_tambahuser.getText()) && nama_belakang.equals(label_namabelakangLama_tambahuser.getText()) && username.equals(label_usernameLama_tambahuser.getText()) && no_telp.equals(label_notelpLama_tambahuser.getText()) && pass1.equals("") && pass2.equals("") && role.toString().equals(label_roleLama_tambahuser.getText()) && status.toString().equals(label_statusLama_tambahuser.getText())){
                    
                       JOptionPane.showMessageDialog(null, "Tidak Ada Perubahan, Data Sudah Terbaru !", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    
                    }else{
                        if(!nama_depan.equals("") && !nama_belakang.equals("") && !username.equals("") && !no_telp.equals("")){

                            if(!label_passwordLama_tambahuser.getText().equals(pass1)){

                                if(pass1.equals(pass2)){

                                    //lakukan update
                                    String sql_update = "UPDATE users SET username = ?, nama_lengkap = ?, password = ?, role = ?, no_hp = ?, isAktif = ?, updated_at = ? WHERE id_user = ?"; 
                                    PreparedStatement pst = conn.prepareStatement(sql_update);
                                    pst.setString(1, username);
                                    pst.setString(2, nama_lengkap);
                                    if(pass1.equals("")){
                                        pst.setString(3, label_passwordLama_tambahuser.getText());
                                    }else{
                                        pst.setString(3, pass1);
                                    }
                                    int role_desc = 0;
                                    if(role.toString().equals("Administrator")){
                                        role_desc = 1;
                                    }else{
                                        role_desc = 2;
                                    }
                                    pst.setInt(4, role_desc);
                                    pst.setString(5, no_telp.replaceAll("[a-zA-Z]", ""));
                                    pst.setString(6, status.toString());
                                    pst.setString(7, utilities.getCurrentTimeStamp());
                                    pst.setString(8, this.id_user);

                                    pst.execute();

                                    ImageIcon successIcon = new ImageIcon(getClass().getResource("/com/pointofsale/src/check.png"));
                                    JOptionPane.showMessageDialog(null, "Data User "+ this.id_user +" Berhasil Diperbarui !", "Success !", JOptionPane.INFORMATION_MESSAGE, successIcon);

                                    dispose();
                                    Dashboard dashboard = new Dashboard("", "", 0, true);
                                    dashboard.getDataTableListuser("");

                                }else{
                                    throw new SQLException("Passoword Yang Anda Masukkan Tidak Sama !");
                                }

                            }else{
                                throw new SQLException("Password Ini Sedang Digunakan, Masukkan Password Lain !");
                            }

                        }else{
                            throw new SQLException("Data Tidak Boleh Kosong !");
                        }
                    }
                    
                    
                }catch(SQLException err){
                    String em = "Username Sudah Digunakan !";
                    if(err.getErrorCode() == 1062){
                        em = em;
                    }else{
                        em = err.getMessage();
                    }
                    JOptionPane.showMessageDialog(null, em, "Terjadi Kesalahan !", JOptionPane.ERROR_MESSAGE);
                }
            }
        }catch(HeadlessException err){
            JOptionPane.showMessageDialog(null, err.getMessage(), "Terjadi Kesalahan !", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_button_simpan_tambahuserMouseClicked

    private void button_hapus_tambahuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_hapus_tambahuserMouseClicked
        // hapus user
        int Hapus = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Menghapus User"+ this.id_user +" Ini ?", "Peringatan !", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(Hapus == 0){
            try {String sql = "DELETE FROM users WHERE id_user = ?";
                PreparedStatement pst;
                pst = conn.prepareStatement(sql);
                pst.setString(1, this.id_user);
                pst.execute();
                
                ImageIcon successIcon = new ImageIcon(getClass().getResource("/com/pointofsale/src/check.png"));
                JOptionPane.showMessageDialog(null, "User Berhasil Dihapus !", "Sukses !", JOptionPane.INFORMATION_MESSAGE,successIcon);
                dispose();
                
                Dashboard dashboard = new Dashboard("", "", 0, true);
                dashboard.getDataTableListuser("");
                
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Gagal Menghapus User !", "Terjadi Kesalahan !", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_button_hapus_tambahuserMouseClicked

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
            java.util.logging.Logger.getLogger(TambahUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TambahUser().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_hapus_tambahuser;
    private javax.swing.JButton button_simpan_tambahuser;
    private javax.swing.JComboBox<String> combobox_role_tambahuser;
    private javax.swing.JComboBox<String> combobox_status_tambahuser;
    private javax.swing.JTextField field_created_at;
    private javax.swing.JTextField field_konfirmasipassword_tambahuser;
    private javax.swing.JTextField field_last_login;
    private javax.swing.JTextField field_namabelakang_tambahuser;
    private javax.swing.JTextField field_namadepan_tambahuser;
    private javax.swing.JTextField field_notelpon_tambahuser;
    private javax.swing.JTextField field_password_tambahuser;
    private javax.swing.JTextField field_updated_at;
    private javax.swing.JTextField field_username_tambahuser;
    private javax.swing.JLabel label_created_at;
    private javax.swing.JLabel label_idUser;
    private javax.swing.JLabel label_konfirmasipasswordLama_tambahuser;
    private javax.swing.JLabel label_konfirmasipassword_tambahuser;
    private javax.swing.JLabel label_last_login;
    private javax.swing.JLabel label_namabelakangLama_tambahuser;
    private javax.swing.JLabel label_namabelakang_tambahuser;
    private javax.swing.JLabel label_namadepanLama_tambahuser;
    private javax.swing.JLabel label_namadepan_tambahuser;
    private javax.swing.JLabel label_notelpLama_tambahuser;
    private javax.swing.JLabel label_notelp_tambahuser;
    private javax.swing.JLabel label_passwordLama_tambahuser;
    private javax.swing.JLabel label_password_tambahuser;
    private javax.swing.JLabel label_roleLama_tambahuser;
    private javax.swing.JLabel label_role_tambahuser;
    private javax.swing.JLabel label_statusLama_tambahuser;
    private javax.swing.JLabel label_status_tambahuser;
    private javax.swing.JLabel label_updated_at;
    private javax.swing.JLabel label_usernameLama_tambahuser;
    private javax.swing.JLabel label_username_tambahuser;
    // End of variables declaration//GEN-END:variables
}
