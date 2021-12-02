package com.pointofsale;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KELOMPOK 2
 */

public class Dashboard extends javax.swing.JFrame {

   
    public Dashboard(String nama_username) {
        initComponents();
        
        //
       
        // set nama
        labelNamaUser.setText(nama_username);
        
        // fungsi fulscreen from 
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //menampilkan panel kasir pertamakali
        container_panel.removeAll();
        container_panel.add(kasir_panel);
        container_panel.repaint();
        container_panel.revalidate();
        
        try{
            java.sql.Connection conn = (Connection)Database.configDB();
            String sql = "SELECT * FROM toko";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                // kirimlkan data ke dashboard
                String nama_toko = rs.getString(2);
                labelNamaToko.setText("E-MART | " + nama_toko);
                
            }else{
                System.out.println("eeo");
                throw new Exception("");
            }
        }catch(Exception err){
        
        }
      
        Utilities utilities = new Utilities();
        String tgl = utilities.getTime();
        labelTanggal.setText(tgl);
    }

    Dashboard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navVertikal = new javax.swing.JPanel();
        frameIconLogout = new javax.swing.JPanel();
        iconLogout = new javax.swing.JLabel();
        frameIconSetting = new javax.swing.JPanel();
        iconSetting = new javax.swing.JLabel();
        frameIconLaporan = new javax.swing.JPanel();
        iconLaporan = new javax.swing.JLabel();
        frameIconDatabase = new javax.swing.JPanel();
        iconDatabase = new javax.swing.JLabel();
        frameIconKasir = new javax.swing.JPanel();
        iconKasir = new javax.swing.JLabel();
        navHorizontal = new javax.swing.JPanel();
        labelTanggal = new javax.swing.JLabel();
        labelNamaToko = new javax.swing.JLabel();
        labelNamaUser = new javax.swing.JLabel();
        iconUser = new javax.swing.JLabel();
        frameIconMenu = new javax.swing.JPanel();
        iconMenu = new javax.swing.JLabel();
        container_panel = new javax.swing.JPanel();
        setting_panel = new javax.swing.JPanel();
        navigasi_setting = new javax.swing.JPanel();
        panel_profile = new javax.swing.JPanel();
        icon_profile = new javax.swing.JLabel();
        label_profile = new javax.swing.JLabel();
        panel_listuser = new javax.swing.JPanel();
        icon_listuser = new javax.swing.JLabel();
        label_listuser = new javax.swing.JLabel();
        panel_toko = new javax.swing.JPanel();
        icon_toko = new javax.swing.JLabel();
        label_toko = new javax.swing.JLabel();
        container_panel_setting = new javax.swing.JPanel();
        container_panel_setting_profile = new javax.swing.JPanel();
        label_profile_logo = new javax.swing.JLabel();
        label_profile2_logo = new javax.swing.JLabel();
        field_namadepan_profile = new javax.swing.JTextField();
        button_simpan_profile = new javax.swing.JButton();
        field_namabelakang_profile = new javax.swing.JTextField();
        field_nohp_profile = new javax.swing.JTextField();
        field_role_profile = new javax.swing.JTextField();
        field_ubahpassword_profile = new javax.swing.JTextField();
        field_konfirmasipassword_profile = new javax.swing.JTextField();
        field_loginterbaru_profile = new javax.swing.JTextField();
        label_namadepan_profile = new javax.swing.JLabel();
        label_namabelakang_profile = new javax.swing.JLabel();
        label_nohp_profile = new javax.swing.JLabel();
        label_role_profile = new javax.swing.JLabel();
        label_ubahpassword_profile = new javax.swing.JLabel();
        label_konfirmasipassword_profile = new javax.swing.JLabel();
        label_loginterbaru_profile = new javax.swing.JLabel();
        field_Username_profile = new javax.swing.JTextField();
        label_Username_profile = new javax.swing.JLabel();
        container_panel_setting_listuser = new javax.swing.JPanel();
        panel_search_listuser = new javax.swing.JPanel();
        search_listuser = new javax.swing.JTextField();
        icon_search_listuser = new javax.swing.JLabel();
        button_tambahuser = new javax.swing.JButton();
        paneltabellistuser = new javax.swing.JScrollPane();
        table_listuser = new javax.swing.JTable();
        container_panel_setting_toko = new javax.swing.JPanel();
        label_toko_logo = new javax.swing.JLabel();
        label_toko2_logo = new javax.swing.JLabel();
        field_namatoko_toko = new javax.swing.JTextField();
        button_simpan_toko = new javax.swing.JButton();
        field_alamat_toko = new javax.swing.JTextField();
        field_notelp_toko = new javax.swing.JTextField();
        field_update_toko = new javax.swing.JTextField();
        label_namatoko_toko = new javax.swing.JLabel();
        label_alamat_toko = new javax.swing.JLabel();
        label_notelp_toko = new javax.swing.JLabel();
        label_update_toko = new javax.swing.JLabel();
        label_idToko = new javax.swing.JLabel();
        laporan_panel = new javax.swing.JPanel();
        navigasi_laporan = new javax.swing.JPanel();
        panel_TrPenjualan = new javax.swing.JPanel();
        icon_TransaksiJual = new javax.swing.JLabel();
        label_TrPenjualan = new javax.swing.JLabel();
        konten_Laporan = new javax.swing.JPanel();
        konten_laporanTrJual = new javax.swing.JPanel();
        panel_cariTrPenjualan = new javax.swing.JPanel();
        icon_cariTrPenjualan = new javax.swing.JLabel();
        input_textTrPenjualan = new javax.swing.JTextField();
        panel_filter = new javax.swing.JPanel();
        filter_TrPenjualan = new javax.swing.JComboBox<>();
        Btn_TrPenjualan = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableTrPenjualan = new javax.swing.JTable();
        dataBarang_kategori = new javax.swing.JPanel();
        btn_backToMenu_kategori = new javax.swing.JLabel();
        panel_search_kategori = new javax.swing.JPanel();
        icon_search_kategori = new javax.swing.JLabel();
        input_searxh_kategori = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabel_data_kategori = new javax.swing.JTable();
        box_menu_kategori = new javax.swing.JPanel();
        label_kode_kategori = new javax.swing.JLabel();
        input_kode_kategori = new javax.swing.JTextField();
        input_namaSupplier_kategori = new javax.swing.JTextField();
        label_namaSupplier_kategori = new javax.swing.JLabel();
        btn_simpan_kategori = new javax.swing.JButton();
        btn_hapus_kategori = new javax.swing.JButton();
        dataBarang_supplier = new javax.swing.JPanel();
        btn_backToMenu_supplier = new javax.swing.JLabel();
        panel_search_supplier = new javax.swing.JPanel();
        icon_search_supplier = new javax.swing.JLabel();
        input_searxh_supplier = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabel_data_supplier = new javax.swing.JTable();
        box_menu_supplier = new javax.swing.JPanel();
        label_kode_supplier = new javax.swing.JLabel();
        input_kode_supplier = new javax.swing.JTextField();
        input_namaSupplier_supplier = new javax.swing.JTextField();
        label_namaSupplier_supplier = new javax.swing.JLabel();
        btn_simpan_supplier = new javax.swing.JButton();
        btn_hapus_supplier = new javax.swing.JButton();
        dataBarang_update = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dataBarang_tambah = new javax.swing.JPanel();
        btn_backTomenu_tambah = new javax.swing.JLabel();
        panel_box_dataBarang_tambah = new javax.swing.JPanel();
        label_kode_dataBarang_tambah = new javax.swing.JLabel();
        label_brg_dataBarang_tambah = new javax.swing.JLabel();
        input_kode_dataBarang_tambah = new javax.swing.JTextField();
        label_namaBarang_dataBarang_tambah = new javax.swing.JLabel();
        input_namaBarang_dataBarang_tambah = new javax.swing.JTextField();
        label_kategori_dataBarang_tambah = new javax.swing.JLabel();
        select_kategori_dataBarang_tambah = new javax.swing.JComboBox<>();
        label_supplier_dataBarang_tambah = new javax.swing.JLabel();
        select_supplier_dataBarang_tambah = new javax.swing.JComboBox<>();
        label_tglMasuk_dataBarang_tambah = new javax.swing.JLabel();
        label_harga_dataBarang_tambah = new javax.swing.JLabel();
        label_stok_dataBarang_tambah = new javax.swing.JLabel();
        input_stok_dataBarang_tambah = new javax.swing.JSpinner();
        label_rp_dataBarang_tambah = new javax.swing.JLabel();
        input_harga_dataBarang_tambah = new javax.swing.JTextField();
        input_tglMasuk_dataBarang_tambah = new javax.swing.JTextField();
        btn_simpan_dataBarang_tambah = new javax.swing.JButton();
        dataBarang_panel = new javax.swing.JPanel();
        panel_sup = new javax.swing.JPanel();
        icon_sup = new javax.swing.JLabel();
        nilai_suplier = new javax.swing.JLabel();
        label_suplier = new javax.swing.JLabel();
        panel_box = new javax.swing.JPanel();
        icon_box = new javax.swing.JLabel();
        nilai_totalBarang = new javax.swing.JLabel();
        label_totalBarang = new javax.swing.JLabel();
        panel_kat = new javax.swing.JPanel();
        icon_kategori = new javax.swing.JLabel();
        nilai_kategori = new javax.swing.JLabel();
        label_kategori = new javax.swing.JLabel();
        btn_tambah_barang = new javax.swing.JButton();
        search_box = new javax.swing.JPanel();
        icon_search_box = new javax.swing.JLabel();
        icon_input_search = new javax.swing.JTextField();
        filter_box = new javax.swing.JPanel();
        icon_filter = new javax.swing.JLabel();
        filter_combo_box = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        kasir_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_order = new javax.swing.JTable();
        frame_grandTotal = new javax.swing.JPanel();
        label_nilaiTotal = new javax.swing.JLabel();
        nilai_total = new javax.swing.JLabel();
        enter_label = new javax.swing.JLabel();
        f10_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        navVertikal.setBackground(new java.awt.Color(254, 254, 254));

        frameIconLogout.setBackground(new java.awt.Color(255, 255, 255));
        frameIconLogout.setPreferredSize(new java.awt.Dimension(82, 81));

        iconLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/logout.png"))); // NOI18N
        iconLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconLogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout frameIconLogoutLayout = new javax.swing.GroupLayout(frameIconLogout);
        frameIconLogout.setLayout(frameIconLogoutLayout);
        frameIconLogoutLayout.setHorizontalGroup(
            frameIconLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameIconLogoutLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(iconLogout)
                .addGap(42, 42, 42))
        );
        frameIconLogoutLayout.setVerticalGroup(
            frameIconLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameIconLogoutLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(iconLogout)
                .addGap(27, 27, 27))
        );

        frameIconSetting.setBackground(new java.awt.Color(255, 255, 255));
        frameIconSetting.setPreferredSize(new java.awt.Dimension(82, 81));
        frameIconSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frameIconSettingMouseClicked(evt);
            }
        });

        iconSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/settings(1).png"))); // NOI18N
        iconSetting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconSettingMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout frameIconSettingLayout = new javax.swing.GroupLayout(frameIconSetting);
        frameIconSetting.setLayout(frameIconSettingLayout);
        frameIconSettingLayout.setHorizontalGroup(
            frameIconSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameIconSettingLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(iconSetting)
                .addGap(42, 42, 42))
        );
        frameIconSettingLayout.setVerticalGroup(
            frameIconSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameIconSettingLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(iconSetting)
                .addGap(27, 27, 27))
        );

        frameIconLaporan.setBackground(new java.awt.Color(255, 255, 255));
        frameIconLaporan.setPreferredSize(new java.awt.Dimension(82, 81));

        iconLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/activity(1).png"))); // NOI18N
        iconLaporan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconLaporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconLaporanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout frameIconLaporanLayout = new javax.swing.GroupLayout(frameIconLaporan);
        frameIconLaporan.setLayout(frameIconLaporanLayout);
        frameIconLaporanLayout.setHorizontalGroup(
            frameIconLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameIconLaporanLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(iconLaporan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frameIconLaporanLayout.setVerticalGroup(
            frameIconLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameIconLaporanLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(iconLaporan)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        frameIconDatabase.setBackground(new java.awt.Color(255, 255, 255));
        frameIconDatabase.setPreferredSize(new java.awt.Dimension(82, 81));

        iconDatabase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/database(1).png"))); // NOI18N
        iconDatabase.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconDatabase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconDatabaseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout frameIconDatabaseLayout = new javax.swing.GroupLayout(frameIconDatabase);
        frameIconDatabase.setLayout(frameIconDatabaseLayout);
        frameIconDatabaseLayout.setHorizontalGroup(
            frameIconDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameIconDatabaseLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(iconDatabase)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frameIconDatabaseLayout.setVerticalGroup(
            frameIconDatabaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameIconDatabaseLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(iconDatabase)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        frameIconKasir.setBackground(new java.awt.Color(73, 148, 255));
        frameIconKasir.setPreferredSize(new java.awt.Dimension(82, 81));

        iconKasir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/shopping-cart(2).png"))); // NOI18N
        iconKasir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconKasir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconKasirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout frameIconKasirLayout = new javax.swing.GroupLayout(frameIconKasir);
        frameIconKasir.setLayout(frameIconKasirLayout);
        frameIconKasirLayout.setHorizontalGroup(
            frameIconKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameIconKasirLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(iconKasir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frameIconKasirLayout.setVerticalGroup(
            frameIconKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameIconKasirLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(iconKasir)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout navVertikalLayout = new javax.swing.GroupLayout(navVertikal);
        navVertikal.setLayout(navVertikalLayout);
        navVertikalLayout.setHorizontalGroup(
            navVertikalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frameIconKasir, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
            .addComponent(frameIconDatabase, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
            .addComponent(frameIconLaporan, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
            .addComponent(frameIconSetting, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
            .addComponent(frameIconLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
        );
        navVertikalLayout.setVerticalGroup(
            navVertikalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navVertikalLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(frameIconKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(frameIconDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(frameIconLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(frameIconSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(frameIconLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        navHorizontal.setBackground(new java.awt.Color(21, 101, 216));

        labelTanggal.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        labelTanggal.setForeground(new java.awt.Color(204, 204, 204));
        labelTanggal.setText("19 Agustus 2001");

        labelNamaToko.setFont(new java.awt.Font("Josefin Sans", 1, 28)); // NOI18N
        labelNamaToko.setForeground(new java.awt.Color(254, 254, 254));
        labelNamaToko.setText("E - MART | Makmur Jaya");

        labelNamaUser.setBackground(new java.awt.Color(254, 254, 254));
        labelNamaUser.setFont(new java.awt.Font("Josefin Sans", 1, 20)); // NOI18N
        labelNamaUser.setForeground(new java.awt.Color(254, 254, 254));
        labelNamaUser.setText("ARISTO CAESAR");

        iconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/profile-user (1).png"))); // NOI18N

        javax.swing.GroupLayout navHorizontalLayout = new javax.swing.GroupLayout(navHorizontal);
        navHorizontal.setLayout(navHorizontalLayout);
        navHorizontalLayout.setHorizontalGroup(
            navHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navHorizontalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(navHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNamaToko)
                    .addComponent(labelTanggal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelNamaUser)
                .addGap(18, 18, 18)
                .addComponent(iconUser)
                .addGap(52, 52, 52))
        );
        navHorizontalLayout.setVerticalGroup(
            navHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navHorizontalLayout.createSequentialGroup()
                .addGroup(navHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navHorizontalLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(labelNamaToko)
                        .addGap(0, 0, 0)
                        .addComponent(labelTanggal))
                    .addGroup(navHorizontalLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(navHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(iconUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelNamaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        frameIconMenu.setBackground(new java.awt.Color(255, 255, 255));

        iconMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/align-left.png"))); // NOI18N

        javax.swing.GroupLayout frameIconMenuLayout = new javax.swing.GroupLayout(frameIconMenu);
        frameIconMenu.setLayout(frameIconMenuLayout);
        frameIconMenuLayout.setHorizontalGroup(
            frameIconMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameIconMenuLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(iconMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frameIconMenuLayout.setVerticalGroup(
            frameIconMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameIconMenuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(iconMenu)
                .addGap(30, 30, 30))
        );

        container_panel.setBackground(new java.awt.Color(204, 204, 204));
        container_panel.setLayout(new java.awt.CardLayout());

        navigasi_setting.setBackground(new java.awt.Color(237, 237, 237));

        panel_profile.setBackground(new java.awt.Color(73, 148, 255));
        panel_profile.setForeground(new java.awt.Color(255, 255, 255));
        panel_profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_profile.setPreferredSize(new java.awt.Dimension(315, 50));
        panel_profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_profileMouseClicked(evt);
            }
        });

        icon_profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/profile2.png"))); // NOI18N

        label_profile.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        label_profile.setForeground(new java.awt.Color(255, 255, 255));
        label_profile.setText("Profile");

        javax.swing.GroupLayout panel_profileLayout = new javax.swing.GroupLayout(panel_profile);
        panel_profile.setLayout(panel_profileLayout);
        panel_profileLayout.setHorizontalGroup(
            panel_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_profileLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(icon_profile)
                .addGap(31, 31, 31)
                .addComponent(label_profile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_profileLayout.setVerticalGroup(
            panel_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_profileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icon_profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_listuser.setBackground(new java.awt.Color(255, 255, 255));
        panel_listuser.setForeground(new java.awt.Color(255, 255, 255));
        panel_listuser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_listuser.setPreferredSize(new java.awt.Dimension(315, 50));
        panel_listuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_listuserMouseClicked(evt);
            }
        });

        icon_listuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/list.png"))); // NOI18N

        label_listuser.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        label_listuser.setText("List User");

        javax.swing.GroupLayout panel_listuserLayout = new javax.swing.GroupLayout(panel_listuser);
        panel_listuser.setLayout(panel_listuserLayout);
        panel_listuserLayout.setHorizontalGroup(
            panel_listuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_listuserLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(icon_listuser)
                .addGap(34, 34, 34)
                .addComponent(label_listuser)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        panel_listuserLayout.setVerticalGroup(
            panel_listuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_listuserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_listuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icon_listuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_listuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_toko.setBackground(new java.awt.Color(255, 255, 255));
        panel_toko.setForeground(new java.awt.Color(255, 255, 255));
        panel_toko.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_toko.setPreferredSize(new java.awt.Dimension(315, 50));
        panel_toko.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_tokoMouseClicked(evt);
            }
        });

        icon_toko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/toko.png"))); // NOI18N

        label_toko.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        label_toko.setText("Toko");

        javax.swing.GroupLayout panel_tokoLayout = new javax.swing.GroupLayout(panel_toko);
        panel_toko.setLayout(panel_tokoLayout);
        panel_tokoLayout.setHorizontalGroup(
            panel_tokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tokoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(icon_toko)
                .addGap(35, 35, 35)
                .addComponent(label_toko)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_tokoLayout.setVerticalGroup(
            panel_tokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tokoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_tokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icon_toko, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_toko, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout navigasi_settingLayout = new javax.swing.GroupLayout(navigasi_setting);
        navigasi_setting.setLayout(navigasi_settingLayout);
        navigasi_settingLayout.setHorizontalGroup(
            navigasi_settingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_listuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_toko, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        navigasi_settingLayout.setVerticalGroup(
            navigasi_settingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigasi_settingLayout.createSequentialGroup()
                .addComponent(panel_profile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_listuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_toko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        container_panel_setting.setLayout(new java.awt.CardLayout());

        label_profile_logo.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        label_profile_logo.setText("Profile");

        label_profile2_logo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        label_profile2_logo.setText("Halaman ini memuat informasi tentang akun yang sedang anda gunakan");

        field_namadepan_profile.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        field_namadepan_profile.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        button_simpan_profile.setBackground(new java.awt.Color(73, 148, 255));
        button_simpan_profile.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_simpan_profile.setForeground(new java.awt.Color(255, 255, 255));
        button_simpan_profile.setText("SIMPAN");
        button_simpan_profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_simpan_profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_simpan_profileMouseClicked(evt);
            }
        });
        button_simpan_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_simpan_profileActionPerformed(evt);
            }
        });

        field_namabelakang_profile.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        field_namabelakang_profile.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        field_nohp_profile.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        field_nohp_profile.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        field_role_profile.setEditable(false);
        field_role_profile.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        field_role_profile.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        field_ubahpassword_profile.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        field_ubahpassword_profile.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        field_konfirmasipassword_profile.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        field_konfirmasipassword_profile.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        field_loginterbaru_profile.setEditable(false);
        field_loginterbaru_profile.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        field_loginterbaru_profile.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        label_namadepan_profile.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        label_namadepan_profile.setText("Nama Depan");

        label_namabelakang_profile.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        label_namabelakang_profile.setText("Nama Belakang");

        label_nohp_profile.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        label_nohp_profile.setText("No. Hp");

        label_role_profile.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        label_role_profile.setText("Role");

        label_ubahpassword_profile.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        label_ubahpassword_profile.setText("Ubah Password");

        label_konfirmasipassword_profile.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        label_konfirmasipassword_profile.setText("Konfirmasi Password");

        label_loginterbaru_profile.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        label_loginterbaru_profile.setText("Login Terbaru");

        field_Username_profile.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        field_Username_profile.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        label_Username_profile.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        label_Username_profile.setText("Username");

        javax.swing.GroupLayout container_panel_setting_profileLayout = new javax.swing.GroupLayout(container_panel_setting_profile);
        container_panel_setting_profile.setLayout(container_panel_setting_profileLayout);
        container_panel_setting_profileLayout.setHorizontalGroup(
            container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container_panel_setting_profileLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_loginterbaru_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_profile2_logo)
                    .addComponent(label_profile_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, container_panel_setting_profileLayout.createSequentialGroup()
                            .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(field_namadepan_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_namadepan_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(81, 81, 81)
                            .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_namabelakang_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field_namabelakang_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(container_panel_setting_profileLayout.createSequentialGroup()
                            .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(container_panel_setting_profileLayout.createSequentialGroup()
                                    .addComponent(field_nohp_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container_panel_setting_profileLayout.createSequentialGroup()
                                    .addComponent(label_nohp_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(294, 294, 294)))
                            .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(field_Username_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_Username_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(container_panel_setting_profileLayout.createSequentialGroup()
                            .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(container_panel_setting_profileLayout.createSequentialGroup()
                                        .addComponent(field_ubahpassword_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container_panel_setting_profileLayout.createSequentialGroup()
                                        .addComponent(label_ubahpassword_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(294, 294, 294)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container_panel_setting_profileLayout.createSequentialGroup()
                                    .addComponent(field_loginterbaru_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(81, 81, 81)))
                            .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(field_konfirmasipassword_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_konfirmasipassword_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field_role_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_role_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(button_simpan_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(275, Short.MAX_VALUE))
        );
        container_panel_setting_profileLayout.setVerticalGroup(
            container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container_panel_setting_profileLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(label_profile_logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_profile2_logo)
                .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(container_panel_setting_profileLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(label_namabelakang_profile))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container_panel_setting_profileLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_namadepan_profile)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field_namadepan_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field_namabelakang_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nohp_profile)
                    .addComponent(label_Username_profile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field_nohp_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field_Username_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_ubahpassword_profile)
                    .addComponent(label_konfirmasipassword_profile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field_ubahpassword_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field_konfirmasipassword_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_loginterbaru_profile)
                    .addComponent(label_role_profile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field_loginterbaru_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field_role_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(button_simpan_profile)
                .addContainerGap(239, Short.MAX_VALUE))
        );

        container_panel_setting.add(container_panel_setting_profile, "card2");

        panel_search_listuser.setBackground(new java.awt.Color(255, 255, 255));

        search_listuser.setBorder(null);

        icon_search_listuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/search (1).png"))); // NOI18N

        javax.swing.GroupLayout panel_search_listuserLayout = new javax.swing.GroupLayout(panel_search_listuser);
        panel_search_listuser.setLayout(panel_search_listuserLayout);
        panel_search_listuserLayout.setHorizontalGroup(
            panel_search_listuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_search_listuserLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(icon_search_listuser)
                .addGap(18, 18, 18)
                .addComponent(search_listuser, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_search_listuserLayout.setVerticalGroup(
            panel_search_listuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_search_listuserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_search_listuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_search_listuserLayout.createSequentialGroup()
                        .addComponent(icon_search_listuser)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(search_listuser))
                .addContainerGap())
        );

        button_tambahuser.setBackground(new java.awt.Color(73, 148, 255));
        button_tambahuser.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        button_tambahuser.setForeground(new java.awt.Color(255, 255, 255));
        button_tambahuser.setText("TAMBAH USER");
        button_tambahuser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_tambahuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_tambahuserActionPerformed(evt);
            }
        });

        paneltabellistuser.setViewportView(table_listuser);

        javax.swing.GroupLayout container_panel_setting_listuserLayout = new javax.swing.GroupLayout(container_panel_setting_listuser);
        container_panel_setting_listuser.setLayout(container_panel_setting_listuserLayout);
        container_panel_setting_listuserLayout.setHorizontalGroup(
            container_panel_setting_listuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container_panel_setting_listuserLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(container_panel_setting_listuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(paneltabellistuser)
                    .addGroup(container_panel_setting_listuserLayout.createSequentialGroup()
                        .addComponent(panel_search_listuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button_tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        container_panel_setting_listuserLayout.setVerticalGroup(
            container_panel_setting_listuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container_panel_setting_listuserLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(container_panel_setting_listuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_search_listuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_tambahuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(paneltabellistuser, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        container_panel_setting.add(container_panel_setting_listuser, "card3");

        label_toko_logo.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        label_toko_logo.setText("Toko");

        label_toko2_logo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        label_toko2_logo.setText("Halaman ini memuat informasi mengenai detail toko");

        field_namatoko_toko.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        field_namatoko_toko.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        button_simpan_toko.setBackground(new java.awt.Color(73, 148, 255));
        button_simpan_toko.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_simpan_toko.setForeground(new java.awt.Color(255, 255, 255));
        button_simpan_toko.setText("SIMPAN");
        button_simpan_toko.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_simpan_toko.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_simpan_tokoMouseClicked(evt);
            }
        });

        field_alamat_toko.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        field_alamat_toko.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        field_notelp_toko.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        field_notelp_toko.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        field_update_toko.setEditable(false);
        field_update_toko.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        field_update_toko.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        label_namatoko_toko.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        label_namatoko_toko.setText("Nama Toko");

        label_alamat_toko.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        label_alamat_toko.setText("Alamat");

        label_notelp_toko.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        label_notelp_toko.setText("No. Telp");

        label_update_toko.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        label_update_toko.setText("Update At");

        label_idToko.setForeground(new java.awt.Color(240, 240, 240));
        label_idToko.setText("jLabel1");

        javax.swing.GroupLayout container_panel_setting_tokoLayout = new javax.swing.GroupLayout(container_panel_setting_toko);
        container_panel_setting_toko.setLayout(container_panel_setting_tokoLayout);
        container_panel_setting_tokoLayout.setHorizontalGroup(
            container_panel_setting_tokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container_panel_setting_tokoLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(container_panel_setting_tokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_toko2_logo)
                    .addComponent(label_toko_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(container_panel_setting_tokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, container_panel_setting_tokoLayout.createSequentialGroup()
                            .addGroup(container_panel_setting_tokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(field_namatoko_toko, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_namatoko_toko, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(81, 81, 81)
                            .addGroup(container_panel_setting_tokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_alamat_toko, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field_alamat_toko, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(container_panel_setting_tokoLayout.createSequentialGroup()
                            .addGroup(container_panel_setting_tokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(container_panel_setting_tokoLayout.createSequentialGroup()
                                    .addComponent(field_notelp_toko, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container_panel_setting_tokoLayout.createSequentialGroup()
                                    .addComponent(label_notelp_toko, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(294, 294, 294)))
                            .addGroup(container_panel_setting_tokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_update_toko, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field_update_toko, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(container_panel_setting_tokoLayout.createSequentialGroup()
                            .addComponent(label_idToko)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_simpan_toko, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(275, Short.MAX_VALUE))
        );
        container_panel_setting_tokoLayout.setVerticalGroup(
            container_panel_setting_tokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container_panel_setting_tokoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(label_toko_logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_toko2_logo)
                .addGroup(container_panel_setting_tokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(container_panel_setting_tokoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(label_alamat_toko))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container_panel_setting_tokoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_namatoko_toko)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(container_panel_setting_tokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field_namatoko_toko, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field_alamat_toko, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(container_panel_setting_tokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_notelp_toko)
                    .addComponent(label_update_toko))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(container_panel_setting_tokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field_notelp_toko, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field_update_toko, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(container_panel_setting_tokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(container_panel_setting_tokoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(button_simpan_toko))
                    .addGroup(container_panel_setting_tokoLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(label_idToko)))
                .addContainerGap(427, Short.MAX_VALUE))
        );

        container_panel_setting.add(container_panel_setting_toko, "card2");

        javax.swing.GroupLayout setting_panelLayout = new javax.swing.GroupLayout(setting_panel);
        setting_panel.setLayout(setting_panelLayout);
        setting_panelLayout.setHorizontalGroup(
            setting_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setting_panelLayout.createSequentialGroup()
                .addComponent(navigasi_setting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(container_panel_setting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        setting_panelLayout.setVerticalGroup(
            setting_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navigasi_setting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(container_panel_setting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        container_panel.add(setting_panel, "card5");

        navigasi_laporan.setBackground(new java.awt.Color(237, 237, 237));

        panel_TrPenjualan.setBackground(new java.awt.Color(73, 148, 255));
        panel_TrPenjualan.setForeground(new java.awt.Color(255, 255, 255));
        panel_TrPenjualan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_TrPenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_TrPenjualanMouseClicked(evt);
            }
        });

        icon_TransaksiJual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/trend (1).png"))); // NOI18N

        label_TrPenjualan.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        label_TrPenjualan.setForeground(new java.awt.Color(255, 255, 255));
        label_TrPenjualan.setText("Transaksi Penjualan");

        javax.swing.GroupLayout panel_TrPenjualanLayout = new javax.swing.GroupLayout(panel_TrPenjualan);
        panel_TrPenjualan.setLayout(panel_TrPenjualanLayout);
        panel_TrPenjualanLayout.setHorizontalGroup(
            panel_TrPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TrPenjualanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_TransaksiJual)
                .addGap(34, 34, 34)
                .addComponent(label_TrPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        panel_TrPenjualanLayout.setVerticalGroup(
            panel_TrPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TrPenjualanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_TrPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icon_TransaksiJual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_TrPenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout navigasi_laporanLayout = new javax.swing.GroupLayout(navigasi_laporan);
        navigasi_laporan.setLayout(navigasi_laporanLayout);
        navigasi_laporanLayout.setHorizontalGroup(
            navigasi_laporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_TrPenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        navigasi_laporanLayout.setVerticalGroup(
            navigasi_laporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigasi_laporanLayout.createSequentialGroup()
                .addComponent(panel_TrPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        konten_Laporan.setLayout(new java.awt.CardLayout());

        konten_laporanTrJual.setBackground(new java.awt.Color(219, 219, 219));

        panel_cariTrPenjualan.setBackground(new java.awt.Color(255, 255, 255));
        panel_cariTrPenjualan.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        icon_cariTrPenjualan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/search (1).png"))); // NOI18N

        input_textTrPenjualan.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        input_textTrPenjualan.setBorder(null);

        javax.swing.GroupLayout panel_cariTrPenjualanLayout = new javax.swing.GroupLayout(panel_cariTrPenjualan);
        panel_cariTrPenjualan.setLayout(panel_cariTrPenjualanLayout);
        panel_cariTrPenjualanLayout.setHorizontalGroup(
            panel_cariTrPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cariTrPenjualanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_cariTrPenjualan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(input_textTrPenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE))
        );
        panel_cariTrPenjualanLayout.setVerticalGroup(
            panel_cariTrPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_cariTrPenjualanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_cariTrPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(input_textTrPenjualan)
                    .addComponent(icon_cariTrPenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panel_filter.setBackground(new java.awt.Color(255, 255, 255));
        panel_filter.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        panel_filter.setPreferredSize(new java.awt.Dimension(353, 46));

        filter_TrPenjualan.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        filter_TrPenjualan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "satu minggu", "Satu Bulan" }));
        filter_TrPenjualan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_filterLayout = new javax.swing.GroupLayout(panel_filter);
        panel_filter.setLayout(panel_filterLayout);
        panel_filterLayout.setHorizontalGroup(
            panel_filterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_filterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filter_TrPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        panel_filterLayout.setVerticalGroup(
            panel_filterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_filterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filter_TrPenjualan)
                .addContainerGap())
        );

        Btn_TrPenjualan.setBackground(new java.awt.Color(73, 148, 255));
        Btn_TrPenjualan.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Btn_TrPenjualan.setForeground(new java.awt.Color(255, 255, 255));
        Btn_TrPenjualan.setText("Export");
        Btn_TrPenjualan.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 148, 255), 1, true));
        Btn_TrPenjualan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tableTrPenjualan.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        tableTrPenjualan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Id Transaksi", "Kasir", "Tgl Transaksi", "G.Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableTrPenjualan);

        javax.swing.GroupLayout konten_laporanTrJualLayout = new javax.swing.GroupLayout(konten_laporanTrJual);
        konten_laporanTrJual.setLayout(konten_laporanTrJualLayout);
        konten_laporanTrJualLayout.setHorizontalGroup(
            konten_laporanTrJualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, konten_laporanTrJualLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(konten_laporanTrJualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(konten_laporanTrJualLayout.createSequentialGroup()
                        .addComponent(panel_cariTrPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(panel_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(Btn_TrPenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)))
                .addGap(29, 29, 29))
        );
        konten_laporanTrJualLayout.setVerticalGroup(
            konten_laporanTrJualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(konten_laporanTrJualLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(konten_laporanTrJualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn_TrPenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_filter, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(panel_cariTrPenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                .addContainerGap())
        );

        konten_Laporan.add(konten_laporanTrJual, "card3");

        javax.swing.GroupLayout laporan_panelLayout = new javax.swing.GroupLayout(laporan_panel);
        laporan_panel.setLayout(laporan_panelLayout);
        laporan_panelLayout.setHorizontalGroup(
            laporan_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(laporan_panelLayout.createSequentialGroup()
                .addComponent(navigasi_laporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(konten_Laporan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        laporan_panelLayout.setVerticalGroup(
            laporan_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(laporan_panelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(laporan_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(navigasi_laporan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(konten_Laporan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        container_panel.add(laporan_panel, "card4");

        btn_backToMenu_kategori.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn_backToMenu_kategori.setText("Barang > Kategori");
        btn_backToMenu_kategori.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_backToMenu_kategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backToMenu_kategoriMouseClicked(evt);
            }
        });

        panel_search_kategori.setBackground(new java.awt.Color(255, 255, 255));

        icon_search_kategori.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/search (1).png"))); // NOI18N

        input_searxh_kategori.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        input_searxh_kategori.setBorder(null);

        javax.swing.GroupLayout panel_search_kategoriLayout = new javax.swing.GroupLayout(panel_search_kategori);
        panel_search_kategori.setLayout(panel_search_kategoriLayout);
        panel_search_kategoriLayout.setHorizontalGroup(
            panel_search_kategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_search_kategoriLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(icon_search_kategori)
                .addGap(18, 18, 18)
                .addComponent(input_searxh_kategori)
                .addContainerGap())
        );
        panel_search_kategoriLayout.setVerticalGroup(
            panel_search_kategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_search_kategoriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_search_kategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(input_searxh_kategori)
                    .addComponent(icon_search_kategori))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabel_data_kategori.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        tabel_data_kategori.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No", "Kode", "Nama Kategori"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tabel_data_kategori);

        box_menu_kategori.setBackground(new java.awt.Color(255, 255, 255));

        label_kode_kategori.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        label_kode_kategori.setText("Kode");

        input_kode_kategori.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        input_namaSupplier_kategori.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        label_namaSupplier_kategori.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        label_namaSupplier_kategori.setText("Nama Kategori");

        javax.swing.GroupLayout box_menu_kategoriLayout = new javax.swing.GroupLayout(box_menu_kategori);
        box_menu_kategori.setLayout(box_menu_kategoriLayout);
        box_menu_kategoriLayout.setHorizontalGroup(
            box_menu_kategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(box_menu_kategoriLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(box_menu_kategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_kode_kategori)
                    .addComponent(input_namaSupplier_kategori)
                    .addGroup(box_menu_kategoriLayout.createSequentialGroup()
                        .addGroup(box_menu_kategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_kode_kategori)
                            .addComponent(label_namaSupplier_kategori))
                        .addGap(0, 252, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );
        box_menu_kategoriLayout.setVerticalGroup(
            box_menu_kategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(box_menu_kategoriLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(label_kode_kategori)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_kode_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_namaSupplier_kategori)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_namaSupplier_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btn_simpan_kategori.setBackground(new java.awt.Color(21, 101, 216));
        btn_simpan_kategori.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn_simpan_kategori.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan_kategori.setText("Simpan");

        btn_hapus_kategori.setBackground(new java.awt.Color(255, 69, 69));
        btn_hapus_kategori.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn_hapus_kategori.setForeground(new java.awt.Color(255, 255, 255));
        btn_hapus_kategori.setText("Hapus");

        javax.swing.GroupLayout dataBarang_kategoriLayout = new javax.swing.GroupLayout(dataBarang_kategori);
        dataBarang_kategori.setLayout(dataBarang_kategoriLayout);
        dataBarang_kategoriLayout.setHorizontalGroup(
            dataBarang_kategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataBarang_kategoriLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(dataBarang_kategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_backToMenu_kategori)
                    .addComponent(panel_search_kategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dataBarang_kategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box_menu_kategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_simpan_kategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_hapus_kategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        dataBarang_kategoriLayout.setVerticalGroup(
            dataBarang_kategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataBarang_kategoriLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btn_backToMenu_kategori)
                .addGap(18, 18, 18)
                .addGroup(dataBarang_kategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataBarang_kategoriLayout.createSequentialGroup()
                        .addComponent(box_menu_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_simpan_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_hapus_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(dataBarang_kategoriLayout.createSequentialGroup()
                        .addComponent(panel_search_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                        .addGap(30, 30, 30))))
        );

        container_panel.add(dataBarang_kategori, "card9");

        btn_backToMenu_supplier.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn_backToMenu_supplier.setText("Barang > Supplier");
        btn_backToMenu_supplier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_backToMenu_supplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backToMenu_supplierMouseClicked(evt);
            }
        });

        panel_search_supplier.setBackground(new java.awt.Color(255, 255, 255));

        icon_search_supplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/search (1).png"))); // NOI18N

        input_searxh_supplier.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        input_searxh_supplier.setBorder(null);

        javax.swing.GroupLayout panel_search_supplierLayout = new javax.swing.GroupLayout(panel_search_supplier);
        panel_search_supplier.setLayout(panel_search_supplierLayout);
        panel_search_supplierLayout.setHorizontalGroup(
            panel_search_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_search_supplierLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(icon_search_supplier)
                .addGap(18, 18, 18)
                .addComponent(input_searxh_supplier)
                .addContainerGap())
        );
        panel_search_supplierLayout.setVerticalGroup(
            panel_search_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_search_supplierLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_search_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(input_searxh_supplier)
                    .addComponent(icon_search_supplier))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabel_data_supplier.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        tabel_data_supplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No", "Kode", "Nama Supplier"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tabel_data_supplier);

        box_menu_supplier.setBackground(new java.awt.Color(255, 255, 255));

        label_kode_supplier.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        label_kode_supplier.setText("Kode");

        input_kode_supplier.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        input_namaSupplier_supplier.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        label_namaSupplier_supplier.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        label_namaSupplier_supplier.setText("Nama Supplier");

        javax.swing.GroupLayout box_menu_supplierLayout = new javax.swing.GroupLayout(box_menu_supplier);
        box_menu_supplier.setLayout(box_menu_supplierLayout);
        box_menu_supplierLayout.setHorizontalGroup(
            box_menu_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(box_menu_supplierLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(box_menu_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_kode_supplier)
                    .addComponent(input_namaSupplier_supplier)
                    .addGroup(box_menu_supplierLayout.createSequentialGroup()
                        .addGroup(box_menu_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_kode_supplier)
                            .addComponent(label_namaSupplier_supplier))
                        .addGap(0, 254, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );
        box_menu_supplierLayout.setVerticalGroup(
            box_menu_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(box_menu_supplierLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(label_kode_supplier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_kode_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_namaSupplier_supplier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_namaSupplier_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btn_simpan_supplier.setBackground(new java.awt.Color(21, 101, 216));
        btn_simpan_supplier.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn_simpan_supplier.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan_supplier.setText("Simpan");

        btn_hapus_supplier.setBackground(new java.awt.Color(255, 69, 69));
        btn_hapus_supplier.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn_hapus_supplier.setForeground(new java.awt.Color(255, 255, 255));
        btn_hapus_supplier.setText("Hapus");

        javax.swing.GroupLayout dataBarang_supplierLayout = new javax.swing.GroupLayout(dataBarang_supplier);
        dataBarang_supplier.setLayout(dataBarang_supplierLayout);
        dataBarang_supplierLayout.setHorizontalGroup(
            dataBarang_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataBarang_supplierLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(dataBarang_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_backToMenu_supplier)
                    .addComponent(panel_search_supplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dataBarang_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(box_menu_supplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_simpan_supplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_hapus_supplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        dataBarang_supplierLayout.setVerticalGroup(
            dataBarang_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataBarang_supplierLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btn_backToMenu_supplier)
                .addGap(18, 18, 18)
                .addGroup(dataBarang_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataBarang_supplierLayout.createSequentialGroup()
                        .addComponent(box_menu_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_simpan_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_hapus_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(dataBarang_supplierLayout.createSequentialGroup()
                        .addComponent(panel_search_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                        .addGap(30, 30, 30))))
        );

        container_panel.add(dataBarang_supplier, "card8");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout dataBarang_updateLayout = new javax.swing.GroupLayout(dataBarang_update);
        dataBarang_update.setLayout(dataBarang_updateLayout);
        dataBarang_updateLayout.setHorizontalGroup(
            dataBarang_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataBarang_updateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(1252, Short.MAX_VALUE))
        );
        dataBarang_updateLayout.setVerticalGroup(
            dataBarang_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataBarang_updateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(709, Short.MAX_VALUE))
        );

        container_panel.add(dataBarang_update, "card7");

        btn_backTomenu_tambah.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn_backTomenu_tambah.setText("Barang > Tambah Barang");
        btn_backTomenu_tambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_backTomenu_tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backTomenu_tambahMouseClicked(evt);
            }
        });

        panel_box_dataBarang_tambah.setBackground(new java.awt.Color(255, 255, 255));

        label_kode_dataBarang_tambah.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        label_kode_dataBarang_tambah.setText("Kode");

        label_brg_dataBarang_tambah.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        label_brg_dataBarang_tambah.setText("BRG");

        input_kode_dataBarang_tambah.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N

        label_namaBarang_dataBarang_tambah.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        label_namaBarang_dataBarang_tambah.setText("Nama Barang");

        input_namaBarang_dataBarang_tambah.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N

        label_kategori_dataBarang_tambah.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        label_kategori_dataBarang_tambah.setText("Kategori");

        select_kategori_dataBarang_tambah.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        select_kategori_dataBarang_tambah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        label_supplier_dataBarang_tambah.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        label_supplier_dataBarang_tambah.setText("Supplier");

        select_supplier_dataBarang_tambah.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        select_supplier_dataBarang_tambah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        label_tglMasuk_dataBarang_tambah.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        label_tglMasuk_dataBarang_tambah.setText("Tanggal Masuk");

        label_harga_dataBarang_tambah.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        label_harga_dataBarang_tambah.setText("Harga");

        label_stok_dataBarang_tambah.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        label_stok_dataBarang_tambah.setText("Stok");

        input_stok_dataBarang_tambah.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        input_stok_dataBarang_tambah.setModel(new javax.swing.SpinnerNumberModel(0, null, 999, 1));

        label_rp_dataBarang_tambah.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        label_rp_dataBarang_tambah.setText("Rp");

        input_harga_dataBarang_tambah.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N

        input_tglMasuk_dataBarang_tambah.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N

        javax.swing.GroupLayout panel_box_dataBarang_tambahLayout = new javax.swing.GroupLayout(panel_box_dataBarang_tambah);
        panel_box_dataBarang_tambah.setLayout(panel_box_dataBarang_tambahLayout);
        panel_box_dataBarang_tambahLayout.setHorizontalGroup(
            panel_box_dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_box_dataBarang_tambahLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panel_box_dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_supplier_dataBarang_tambah)
                    .addComponent(label_kategori_dataBarang_tambah)
                    .addComponent(label_namaBarang_dataBarang_tambah)
                    .addComponent(label_kode_dataBarang_tambah)
                    .addGroup(panel_box_dataBarang_tambahLayout.createSequentialGroup()
                        .addComponent(label_brg_dataBarang_tambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(input_kode_dataBarang_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(input_namaBarang_dataBarang_tambah)
                    .addComponent(select_kategori_dataBarang_tambah, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(select_supplier_dataBarang_tambah, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100)
                .addGroup(panel_box_dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_tglMasuk_dataBarang_tambah)
                    .addComponent(label_harga_dataBarang_tambah)
                    .addComponent(label_stok_dataBarang_tambah)
                    .addComponent(input_stok_dataBarang_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_box_dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(input_tglMasuk_dataBarang_tambah, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_box_dataBarang_tambahLayout.createSequentialGroup()
                            .addComponent(label_rp_dataBarang_tambah)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(input_harga_dataBarang_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 46, 46))
        );
        panel_box_dataBarang_tambahLayout.setVerticalGroup(
            panel_box_dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_box_dataBarang_tambahLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panel_box_dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panel_box_dataBarang_tambahLayout.createSequentialGroup()
                        .addComponent(label_stok_dataBarang_tambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_stok_dataBarang_tambah))
                    .addGroup(panel_box_dataBarang_tambahLayout.createSequentialGroup()
                        .addComponent(label_kode_dataBarang_tambah)
                        .addGroup(panel_box_dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_box_dataBarang_tambahLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(label_brg_dataBarang_tambah))
                            .addGroup(panel_box_dataBarang_tambahLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(input_kode_dataBarang_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32)
                .addGroup(panel_box_dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_box_dataBarang_tambahLayout.createSequentialGroup()
                        .addComponent(label_namaBarang_dataBarang_tambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(input_namaBarang_dataBarang_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(label_kategori_dataBarang_tambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(select_kategori_dataBarang_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(label_supplier_dataBarang_tambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(select_supplier_dataBarang_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_box_dataBarang_tambahLayout.createSequentialGroup()
                        .addComponent(label_harga_dataBarang_tambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_box_dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_box_dataBarang_tambahLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(label_rp_dataBarang_tambah))
                            .addComponent(input_harga_dataBarang_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(label_tglMasuk_dataBarang_tambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(input_tglMasuk_dataBarang_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        btn_simpan_dataBarang_tambah.setBackground(new java.awt.Color(73, 148, 255));
        btn_simpan_dataBarang_tambah.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        btn_simpan_dataBarang_tambah.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan_dataBarang_tambah.setText("Simpan");

        javax.swing.GroupLayout dataBarang_tambahLayout = new javax.swing.GroupLayout(dataBarang_tambah);
        dataBarang_tambah.setLayout(dataBarang_tambahLayout);
        dataBarang_tambahLayout.setHorizontalGroup(
            dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataBarang_tambahLayout.createSequentialGroup()
                .addGroup(dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dataBarang_tambahLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_simpan_dataBarang_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dataBarang_tambahLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dataBarang_tambahLayout.createSequentialGroup()
                                .addComponent(btn_backTomenu_tambah)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(panel_box_dataBarang_tambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(30, 30, 30))
        );
        dataBarang_tambahLayout.setVerticalGroup(
            dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataBarang_tambahLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btn_backTomenu_tambah)
                .addGap(18, 18, 18)
                .addComponent(panel_box_dataBarang_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_simpan_dataBarang_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        container_panel.add(dataBarang_tambah, "card6");

        panel_sup.setBackground(new java.awt.Color(255, 255, 255));
        panel_sup.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        panel_sup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_supMouseClicked(evt);
            }
        });

        icon_sup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/rsz_1delivery-truck.png"))); // NOI18N

        nilai_suplier.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        nilai_suplier.setText("123");

        label_suplier.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        label_suplier.setForeground(new java.awt.Color(141, 141, 141));
        label_suplier.setText("Supplier");

        javax.swing.GroupLayout panel_supLayout = new javax.swing.GroupLayout(panel_sup);
        panel_sup.setLayout(panel_supLayout);
        panel_supLayout.setHorizontalGroup(
            panel_supLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_supLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(icon_sup)
                .addGap(18, 18, 18)
                .addGroup(panel_supLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nilai_suplier)
                    .addComponent(label_suplier))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        panel_supLayout.setVerticalGroup(
            panel_supLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_supLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panel_supLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_supLayout.createSequentialGroup()
                        .addComponent(nilai_suplier)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_suplier))
                    .addComponent(icon_sup))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panel_box.setBackground(new java.awt.Color(255, 255, 255));
        panel_box.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        icon_box.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/rsz_2boxes.png"))); // NOI18N

        nilai_totalBarang.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        nilai_totalBarang.setText("123");

        label_totalBarang.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        label_totalBarang.setForeground(new java.awt.Color(141, 141, 141));
        label_totalBarang.setText("Total Barang");

        javax.swing.GroupLayout panel_boxLayout = new javax.swing.GroupLayout(panel_box);
        panel_box.setLayout(panel_boxLayout);
        panel_boxLayout.setHorizontalGroup(
            panel_boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_boxLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(icon_box)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nilai_totalBarang)
                    .addComponent(label_totalBarang))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        panel_boxLayout.setVerticalGroup(
            panel_boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_boxLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panel_boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_boxLayout.createSequentialGroup()
                        .addComponent(nilai_totalBarang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_totalBarang))
                    .addComponent(icon_box))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_kat.setBackground(new java.awt.Color(255, 255, 255));
        panel_kat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        panel_kat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_katMouseClicked(evt);
            }
        });

        icon_kategori.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/grid_jadi.png"))); // NOI18N

        nilai_kategori.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        nilai_kategori.setText("123");

        label_kategori.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        label_kategori.setForeground(new java.awt.Color(141, 141, 141));
        label_kategori.setText("Kategori");

        javax.swing.GroupLayout panel_katLayout = new javax.swing.GroupLayout(panel_kat);
        panel_kat.setLayout(panel_katLayout);
        panel_katLayout.setHorizontalGroup(
            panel_katLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_katLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(icon_kategori)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_katLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nilai_kategori)
                    .addComponent(label_kategori))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        panel_katLayout.setVerticalGroup(
            panel_katLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_katLayout.createSequentialGroup()
                .addGroup(panel_katLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_katLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(icon_kategori))
                    .addGroup(panel_katLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(nilai_kategori)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_kategori)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_tambah_barang.setBackground(new java.awt.Color(73, 148, 255));
        btn_tambah_barang.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn_tambah_barang.setForeground(new java.awt.Color(255, 255, 255));
        btn_tambah_barang.setText("Tambah Barang");
        btn_tambah_barang.setBorder(null);
        btn_tambah_barang.setBorderPainted(false);
        btn_tambah_barang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_tambah_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tambah_barangMouseClicked(evt);
            }
        });
        btn_tambah_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambah_barangActionPerformed(evt);
            }
        });

        search_box.setBackground(new java.awt.Color(255, 255, 255));
        search_box.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        icon_search_box.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/search (1).png"))); // NOI18N

        icon_input_search.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        icon_input_search.setBorder(null);

        javax.swing.GroupLayout search_boxLayout = new javax.swing.GroupLayout(search_box);
        search_box.setLayout(search_boxLayout);
        search_boxLayout.setHorizontalGroup(
            search_boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_boxLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(icon_search_box)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icon_input_search, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        search_boxLayout.setVerticalGroup(
            search_boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_boxLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(search_boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icon_search_box, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icon_input_search))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        filter_box.setBackground(new java.awt.Color(255, 255, 255));

        icon_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/filter_baru.png"))); // NOI18N

        filter_combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua Barang", "Barang Baru", "Barang Lama" }));

        javax.swing.GroupLayout filter_boxLayout = new javax.swing.GroupLayout(filter_box);
        filter_box.setLayout(filter_boxLayout);
        filter_boxLayout.setHorizontalGroup(
            filter_boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filter_boxLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(icon_filter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filter_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
        );
        filter_boxLayout.setVerticalGroup(
            filter_boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filter_boxLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(filter_boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(filter_boxLayout.createSequentialGroup()
                        .addComponent(icon_filter)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(filter_combo_box))
                .addGap(10, 10, 10))
        );

        jTable1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Kode", "Nama Barang", "Kategori", "Harga", "Stok", "Supplier", "Updated"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout dataBarang_panelLayout = new javax.swing.GroupLayout(dataBarang_panel);
        dataBarang_panel.setLayout(dataBarang_panelLayout);
        dataBarang_panelLayout.setHorizontalGroup(
            dataBarang_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataBarang_panelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(dataBarang_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(dataBarang_panelLayout.createSequentialGroup()
                        .addGroup(dataBarang_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_tambah_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addGroup(dataBarang_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel_sup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(search_box, javax.swing.GroupLayout.PREFERRED_SIZE, 260, Short.MAX_VALUE))
                        .addGap(76, 76, 76)
                        .addGroup(dataBarang_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel_kat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(filter_box, javax.swing.GroupLayout.PREFERRED_SIZE, 250, Short.MAX_VALUE))
                        .addGap(316, 316, 316)))
                .addGap(30, 30, 30))
        );
        dataBarang_panelLayout.setVerticalGroup(
            dataBarang_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataBarang_panelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(dataBarang_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panel_sup, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_box, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_kat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(dataBarang_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search_box, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_tambah_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filter_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        container_panel.add(dataBarang_panel, "card3");

        kasir_panel.setBackground(new java.awt.Color(219, 219, 219));

        table_order.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table_order.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        table_order.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Kode", "Nama Barang", "Harga", "Stok", "Qyt", "Disc", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_order.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                table_orderKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(table_order);

        frame_grandTotal.setBackground(new java.awt.Color(255, 255, 255));
        frame_grandTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        label_nilaiTotal.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        label_nilaiTotal.setText("Grand Total :");

        nilai_total.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        nilai_total.setText("Rp.1");

        enter_label.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        enter_label.setText("Enter = Tambah Barang");

        f10_label.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        f10_label.setText("F10    = Konfirmasi Pembayaran");

        javax.swing.GroupLayout frame_grandTotalLayout = new javax.swing.GroupLayout(frame_grandTotal);
        frame_grandTotal.setLayout(frame_grandTotalLayout);
        frame_grandTotalLayout.setHorizontalGroup(
            frame_grandTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frame_grandTotalLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(frame_grandTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enter_label)
                    .addComponent(f10_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 568, Short.MAX_VALUE)
                .addComponent(label_nilaiTotal)
                .addGap(18, 18, 18)
                .addComponent(nilai_total, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        frame_grandTotalLayout.setVerticalGroup(
            frame_grandTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frame_grandTotalLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(frame_grandTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(frame_grandTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_nilaiTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nilai_total))
                    .addGroup(frame_grandTotalLayout.createSequentialGroup()
                        .addComponent(enter_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f10_label)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kasir_panelLayout = new javax.swing.GroupLayout(kasir_panel);
        kasir_panel.setLayout(kasir_panelLayout);
        kasir_panelLayout.setHorizontalGroup(
            kasir_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kasir_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kasir_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(frame_grandTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        kasir_panelLayout.setVerticalGroup(
            kasir_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kasir_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frame_grandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        container_panel.add(kasir_panel, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(navVertikal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(frameIconMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(navHorizontal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(container_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(navHorizontal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(frameIconMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(navVertikal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(container_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // ketika icon kasir diklik
    private void iconKasirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconKasirMouseClicked
        //menampilkan panel kasir ketika icon kasir diklick
        container_panel.removeAll();
        container_panel.add(kasir_panel);
        container_panel.repaint();
        container_panel.revalidate();
        
        
        //visibilitas frameIcon
            //icon kasir
            frameIconKasir.setBackground(new Color(73, 148, 255));
            iconKasir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/shopping-cart(2).png")));
            
            //icon data_barang
            frameIconDatabase.setBackground(new Color(255, 255, 255));
            iconDatabase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/database(1).png")));
            
            //icon laporan
            frameIconLaporan.setBackground(new Color(255, 255, 255));
            iconLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/activity(1).png")));
            
            //icon setting
            frameIconSetting.setBackground(new Color(255, 255, 255));
            iconSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/settings(1).png")));
            
    }//GEN-LAST:event_iconKasirMouseClicked

    private void iconDatabaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconDatabaseMouseClicked
        
        //menampilkan data barang ketika icon diklik
        container_panel.removeAll();
        container_panel.add(dataBarang_panel);
        container_panel.repaint();
        container_panel.revalidate();
 
        //visibilitas frameIcon
            //icon kasir
            frameIconKasir.setBackground(new Color(255, 255, 255));
            iconKasir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/shopping-cart(1).png")));
            
            //icon data_barang
            frameIconDatabase.setBackground(new Color(73, 148, 255));
            iconDatabase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/database(2).png")));
            
            //icon laporan
            frameIconLaporan.setBackground(new Color(255, 255, 255));
            iconLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/activity(1).png")));
            
            //icon setting
            frameIconSetting.setBackground(new Color(255, 255, 255));
            iconSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/settings(1).png")));
    }//GEN-LAST:event_iconDatabaseMouseClicked

    private void iconLaporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLaporanMouseClicked
        
        //menampilkan laporan ketika icon diclick
        
        container_panel.removeAll();
        container_panel.add(laporan_panel);
        container_panel.repaint();
        container_panel.revalidate();

        
        //visibilitas frameIcon

            //icon kasir
            frameIconKasir.setBackground(new Color(255, 255, 255));
            iconKasir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/shopping-cart(1).png")));
            
            //icon data_barang
            frameIconDatabase.setBackground(new Color(255, 255, 255));
            iconDatabase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/database(1).png")));
            
            //icon laporan
            frameIconLaporan.setBackground(new Color(73, 148, 255));
            iconLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/activity(2).png")));
            
            //icon setting
            frameIconSetting.setBackground(new Color(255, 255, 255));
            iconSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/settings(1).png")));
    }//GEN-LAST:event_iconLaporanMouseClicked

    private void iconSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconSettingMouseClicked
        //menampilkan seting ketika icon di klick
        container_panel.removeAll();
        container_panel.add(setting_panel);
        container_panel.repaint();
        container_panel.revalidate();
        
        //visibilitas frameIcon
        
            //icon kasir
            frameIconKasir.setBackground(new Color(255, 255, 255));
            iconKasir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/shopping-cart(1).png")));
            
            //icon data_barang
            frameIconDatabase.setBackground(new Color(255, 255, 255));
            iconDatabase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/database(1).png")));
            
            //icon laporan
            frameIconLaporan.setBackground(new Color(255, 255, 255));
            iconLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/activity(1).png")));
            
            //icon setting
            frameIconSetting.setBackground(new Color(73, 148, 255));
            iconSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/settings(2).png")));
            
            //update data
        try{
            java.sql.Connection conn = (Connection)Database.configDB();
            String sql = "SELECT * FROM users WHERE nama_lengkap =?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, labelNamaUser.getText());
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                
                 String nama_lengkap = rs.getString(3);
                 String[] nama = nama_lengkap.split("\\s+",2);
                 field_namadepan_profile.setText(nama[0]);
                 field_namabelakang_profile.setText(nama[1]);
                 field_nohp_profile.setText(rs.getString(6));
                 field_Username_profile.setText(rs.getString(2));
                 field_loginterbaru_profile.setText(rs.getString(7));
                 field_role_profile.setText(rs.getString(5));
                  
            }
            
        }catch(Exception err){
            JOptionPane.showMessageDialog(null, "Gagal Memuat Data Profile");
            System.exit(0);
        }
        
        
        //memanggil fungsi table list user
        getDataTableListuser();
    }//GEN-LAST:event_iconSettingMouseClicked

    private void iconLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLogoutMouseClicked
        // TODO add your handling code here:
        int logout = JOptionPane.showConfirmDialog(null, "Benarkah anda ingin keluar ?", "Keluar", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(logout == JOptionPane.OK_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_iconLogoutMouseClicked

    private void table_orderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table_orderKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            
            TambahOrder tambah_order = new TambahOrder();
             tambah_order.setVisible(true);
             tambah_order.show();
             table_order.disable();

            
        }else if(evt.getKeyCode()==KeyEvent.VK_F10){
            
            if(nilai_total.getText().equals("Rp.1")){
                JOptionPane.showMessageDialog(null, "Barang Masih Kosong");
            }else{
            KonfirmasiBayar konfirmasi= new KonfirmasiBayar();
            konfirmasi.setVisible(true);
            konfirmasi.show();
            
            }
                   
             
        }   

    }//GEN-LAST:event_table_orderKeyPressed

    private void btn_tambah_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambah_barangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_tambah_barangActionPerformed

    private void btn_tambah_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambah_barangMouseClicked
        // ketika btn_tambah_barang diklik
        container_panel.removeAll();
        container_panel.add(dataBarang_tambah);
        container_panel.repaint();
        container_panel.revalidate();
    }//GEN-LAST:event_btn_tambah_barangMouseClicked

    private void panel_supMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_supMouseClicked
        // ketika panel_supplier diklik
        container_panel.removeAll();
        container_panel.add(dataBarang_supplier);
        container_panel.repaint();
        container_panel.revalidate();
    }//GEN-LAST:event_panel_supMouseClicked

    private void panel_katMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_katMouseClicked
        // ketika panel_kategori diklik
        container_panel.removeAll();
        container_panel.add(dataBarang_kategori);
        container_panel.repaint();
        container_panel.revalidate();
    }//GEN-LAST:event_panel_katMouseClicked

    private void panel_TrPenjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_TrPenjualanMouseClicked
        //pindah konten ketika panel navigasi diklik
        konten_Laporan.removeAll();
        konten_Laporan.add(konten_laporanTrJual);
        konten_Laporan.repaint();
        konten_Laporan.revalidate();
        
        //validasi icon
        panel_TrPenjualan.setBackground(new Color(73,148,255));
        icon_TransaksiJual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/trend (1).png")));
        label_TrPenjualan.setForeground(new Color(255,255,255));
       
    }//GEN-LAST:event_panel_TrPenjualanMouseClicked

    private void btn_backTomenu_tambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backTomenu_tambahMouseClicked
        // TODO add your handling code here:
        container_panel.removeAll();
        container_panel.add(dataBarang_panel);
        container_panel.repaint();
        container_panel.revalidate();
    }//GEN-LAST:event_btn_backTomenu_tambahMouseClicked

    private void btn_backToMenu_supplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backToMenu_supplierMouseClicked
        // TODO add your handling code here:
        container_panel.removeAll();
        container_panel.add(dataBarang_panel);
        container_panel.repaint();
        container_panel.revalidate();
    }//GEN-LAST:event_btn_backToMenu_supplierMouseClicked

    private void btn_backToMenu_kategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backToMenu_kategoriMouseClicked
        // TODO add your handling code here:
        container_panel.removeAll();
        container_panel.add(dataBarang_panel);
        container_panel.repaint();
        container_panel.revalidate();
    }//GEN-LAST:event_btn_backToMenu_kategoriMouseClicked

    private void panel_profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_profileMouseClicked
        // TODO add your handling code here:
        container_panel_setting.removeAll();
        container_panel_setting.add(container_panel_setting_profile);
        container_panel_setting.repaint();
        container_panel_setting.revalidate();
        
        panel_profile.setBackground(new Color(73,148,255));
        panel_listuser.setBackground(new Color(255, 255, 255));
        panel_toko.setBackground(new Color(255, 255, 255));
        icon_profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/profile2.png")));
        icon_listuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/list.png")));
        icon_toko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/toko.png")));
        label_profile.setForeground(new Color(255,255,255));
        label_listuser.setForeground(new Color(0,0,0));
        label_toko.setForeground(new Color(0,0,0));
        
        
        
    }//GEN-LAST:event_panel_profileMouseClicked

    private void panel_listuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_listuserMouseClicked
        // TODO add your handling code here:
        container_panel_setting.removeAll();
        container_panel_setting.add(container_panel_setting_listuser);
        container_panel_setting.repaint();
        container_panel_setting.revalidate();
        
        panel_profile.setBackground(new Color(255,255,255));
        panel_listuser.setBackground(new Color(73,148,255));
        panel_toko.setBackground(new Color(255, 255, 255));
        icon_profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/profile.png")));
        icon_listuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/list2.png")));
        icon_toko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/toko.png")));
        label_profile.setForeground(new Color(0,0,0));
        label_listuser.setForeground(new Color(255,255,255));
        label_toko.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_panel_listuserMouseClicked

    private void panel_tokoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_tokoMouseClicked
        // TODO add your handling code here:
        container_panel_setting.removeAll();
        container_panel_setting.add(container_panel_setting_toko);
        container_panel_setting.repaint();
        container_panel_setting.revalidate();
        
        panel_profile.setBackground(new Color(255,255,255));
        panel_listuser.setBackground(new Color(255,255,255));
        panel_toko.setBackground(new Color(73,148, 255));
        icon_profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/profile.png")));
        icon_listuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/list.png")));
        icon_toko.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/toko1.png")));
        label_profile.setForeground(new Color(0,0,0));
        label_listuser.setForeground(new Color(0,0,0));
        label_toko.setForeground(new Color(255,255,255));
        
        getDataToko();
        label_idToko.setVisible(false);
        
    }//GEN-LAST:event_panel_tokoMouseClicked
    public void getDataToko(){
        try{
            java.sql.Connection conn = (Connection)Database.configDB();
            String sql = "SELECT * FROM toko limit 1";
            PreparedStatement pst = conn.prepareStatement(sql);
             
            ResultSet res=pst.executeQuery(sql);
            if(res.next()){
                field_namatoko_toko.setText(res.getString(2));
                field_alamat_toko.setText(res.getString(3));
                field_notelp_toko.setText(res.getString(4));
                field_update_toko.setText(res.getString(5));
                label_idToko.setText(res.getString(1));
            }
      }catch(Exception err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
      }
    }
    private void button_tambahuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_tambahuserActionPerformed
        // TODO add your handling code here:
        TambahUser tambah = new TambahUser();
        tambah.setVisible(true);
    }//GEN-LAST:event_button_tambahuserActionPerformed

    private void frameIconSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameIconSettingMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_frameIconSettingMouseClicked

    private void button_simpan_profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_simpan_profileMouseClicked
        // TODO add your handling code here:
        
        //menperbarui data user
        try{
            java.sql.Connection conn = (Connection)Database.configDB();
            String sql = "UPDATE users SET username=?,nama_lengkap=?,password=?,no_hp=? where nama_lengkap=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, field_Username_profile.getText());
            String nama_depan=field_namadepan_profile.getText();
            String nama_belakang =field_namabelakang_profile.getText();
            pst.setString(2, nama_depan+" "+nama_belakang);
            if(field_ubahpassword_profile.getText()!=null&&field_konfirmasipassword_profile.getText()!=null){
                if(field_ubahpassword_profile.equals(field_konfirmasipassword_profile)){
                    pst.setString(3,field_ubahpassword_profile.getText());
                }
                
            }
            pst.setString(3, field_ubahpassword_profile.getText());
            pst.setString(4, field_nohp_profile.getText());
            pst.setString(5, labelNamaUser.getText());
            
            pst.execute();
 
            System.out.println("oke");
         
        }catch(Exception err){
            System.err.println(err);
        }
    }//GEN-LAST:event_button_simpan_profileMouseClicked

    public void getDataTableListuser(){     
        DefaultTableModel tb = new DefaultTableModel();
        //memberi nama pada table list user
        tb.addColumn("No");
        tb.addColumn("Nama");
        tb.addColumn("Status");
        tb.addColumn("No telp");
        
        table_listuser.setModel(tb);
    
     try{
           //membuat statemen pemanggilan data pada table tblGaji dari database
           Statement stat = (Statement) Database.configDB().createStatement( );
           String sql      = "SELECT * FROM users WHERE role=2";
           ResultSet res   = stat.executeQuery(sql);
           int no=1;
           //penelusuran baris pada tabel tblGaji dari database
           while(res.next ()){
                tb.addRow(new Object[]{
                no++,
                res.getString("nama_lengkap"),
                res.getString("isAktif"),
                res.getString("no_hp")
                });  
            }
      }catch(Exception err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
      }
}
    
    
    private void button_simpan_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_simpan_profileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_simpan_profileActionPerformed

    private void button_simpan_tokoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_simpan_tokoMouseClicked
        // TODO add your handling code here:
        simpanDataToko();
    }//GEN-LAST:event_button_simpan_tokoMouseClicked

    public void simpanDataToko() {
        try{
         final SimpleDateFormat waktu = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         Timestamp timestamp = new Timestamp(System.currentTimeMillis());
         java.sql.Connection conn = (Connection)Database.configDB();
         String sql = "UPDATE toko SET nama_toko=?,alamat=?,no_telp=?,updated_at=? WHERE id_toko=?";
         PreparedStatement pst = conn.prepareStatement(sql);
         pst.setString(1,field_namatoko_toko.getText());
         pst.setString(2, field_alamat_toko.getText());
         pst.setString(3, field_notelp_toko.getText());
         pst.setString(4, waktu.format(timestamp));
         pst.setString(5, label_idToko.getText());
         
         pst.execute();
         JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui silahkan login kembali");
         dispose();
         Login login=new Login();
         login.show();
        }catch(Exception err){
            JOptionPane.showMessageDialog(null, "Data gagal diperbarui");
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_TrPenjualan;
    private javax.swing.JPanel box_menu_kategori;
    private javax.swing.JPanel box_menu_supplier;
    private javax.swing.JLabel btn_backToMenu_kategori;
    private javax.swing.JLabel btn_backToMenu_supplier;
    private javax.swing.JLabel btn_backTomenu_tambah;
    private javax.swing.JButton btn_hapus_kategori;
    private javax.swing.JButton btn_hapus_supplier;
    private javax.swing.JButton btn_simpan_dataBarang_tambah;
    private javax.swing.JButton btn_simpan_kategori;
    private javax.swing.JButton btn_simpan_supplier;
    private javax.swing.JButton btn_tambah_barang;
    private javax.swing.JButton button_simpan_profile;
    private javax.swing.JButton button_simpan_toko;
    private javax.swing.JButton button_tambahuser;
    private javax.swing.JPanel container_panel;
    private javax.swing.JPanel container_panel_setting;
    private javax.swing.JPanel container_panel_setting_listuser;
    private javax.swing.JPanel container_panel_setting_profile;
    private javax.swing.JPanel container_panel_setting_toko;
    private javax.swing.JPanel dataBarang_kategori;
    private javax.swing.JPanel dataBarang_panel;
    private javax.swing.JPanel dataBarang_supplier;
    private javax.swing.JPanel dataBarang_tambah;
    private javax.swing.JPanel dataBarang_update;
    private javax.swing.JLabel enter_label;
    private javax.swing.JLabel f10_label;
    private javax.swing.JTextField field_Username_profile;
    private javax.swing.JTextField field_alamat_toko;
    private javax.swing.JTextField field_konfirmasipassword_profile;
    private javax.swing.JTextField field_loginterbaru_profile;
    private javax.swing.JTextField field_namabelakang_profile;
    private javax.swing.JTextField field_namadepan_profile;
    private javax.swing.JTextField field_namatoko_toko;
    private javax.swing.JTextField field_nohp_profile;
    private javax.swing.JTextField field_notelp_toko;
    private javax.swing.JTextField field_role_profile;
    private javax.swing.JTextField field_ubahpassword_profile;
    private javax.swing.JTextField field_update_toko;
    private javax.swing.JComboBox<String> filter_TrPenjualan;
    private javax.swing.JPanel filter_box;
    private javax.swing.JComboBox<String> filter_combo_box;
    private javax.swing.JPanel frameIconDatabase;
    private javax.swing.JPanel frameIconKasir;
    private javax.swing.JPanel frameIconLaporan;
    private javax.swing.JPanel frameIconLogout;
    private javax.swing.JPanel frameIconMenu;
    private javax.swing.JPanel frameIconSetting;
    private javax.swing.JPanel frame_grandTotal;
    private javax.swing.JLabel iconDatabase;
    private javax.swing.JLabel iconKasir;
    private javax.swing.JLabel iconLaporan;
    private javax.swing.JLabel iconLogout;
    private javax.swing.JLabel iconMenu;
    private javax.swing.JLabel iconSetting;
    private javax.swing.JLabel iconUser;
    private javax.swing.JLabel icon_TransaksiJual;
    private javax.swing.JLabel icon_box;
    private javax.swing.JLabel icon_cariTrPenjualan;
    private javax.swing.JLabel icon_filter;
    private javax.swing.JTextField icon_input_search;
    private javax.swing.JLabel icon_kategori;
    private javax.swing.JLabel icon_listuser;
    private javax.swing.JLabel icon_profile;
    private javax.swing.JLabel icon_search_box;
    private javax.swing.JLabel icon_search_kategori;
    private javax.swing.JLabel icon_search_listuser;
    private javax.swing.JLabel icon_search_supplier;
    private javax.swing.JLabel icon_sup;
    private javax.swing.JLabel icon_toko;
    private javax.swing.JTextField input_harga_dataBarang_tambah;
    private javax.swing.JTextField input_kode_dataBarang_tambah;
    private javax.swing.JTextField input_kode_kategori;
    private javax.swing.JTextField input_kode_supplier;
    private javax.swing.JTextField input_namaBarang_dataBarang_tambah;
    private javax.swing.JTextField input_namaSupplier_kategori;
    private javax.swing.JTextField input_namaSupplier_supplier;
    private javax.swing.JTextField input_searxh_kategori;
    private javax.swing.JTextField input_searxh_supplier;
    private javax.swing.JSpinner input_stok_dataBarang_tambah;
    private javax.swing.JTextField input_textTrPenjualan;
    private javax.swing.JTextField input_tglMasuk_dataBarang_tambah;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel kasir_panel;
    private javax.swing.JPanel konten_Laporan;
    private javax.swing.JPanel konten_laporanTrJual;
    private javax.swing.JLabel labelNamaToko;
    private javax.swing.JLabel labelNamaUser;
    private javax.swing.JLabel labelTanggal;
    private javax.swing.JLabel label_TrPenjualan;
    private javax.swing.JLabel label_Username_profile;
    private javax.swing.JLabel label_alamat_toko;
    private javax.swing.JLabel label_brg_dataBarang_tambah;
    private javax.swing.JLabel label_harga_dataBarang_tambah;
    private javax.swing.JLabel label_idToko;
    private javax.swing.JLabel label_kategori;
    private javax.swing.JLabel label_kategori_dataBarang_tambah;
    private javax.swing.JLabel label_kode_dataBarang_tambah;
    private javax.swing.JLabel label_kode_kategori;
    private javax.swing.JLabel label_kode_supplier;
    private javax.swing.JLabel label_konfirmasipassword_profile;
    private javax.swing.JLabel label_listuser;
    private javax.swing.JLabel label_loginterbaru_profile;
    private javax.swing.JLabel label_namaBarang_dataBarang_tambah;
    private javax.swing.JLabel label_namaSupplier_kategori;
    private javax.swing.JLabel label_namaSupplier_supplier;
    private javax.swing.JLabel label_namabelakang_profile;
    private javax.swing.JLabel label_namadepan_profile;
    private javax.swing.JLabel label_namatoko_toko;
    private javax.swing.JLabel label_nilaiTotal;
    private javax.swing.JLabel label_nohp_profile;
    private javax.swing.JLabel label_notelp_toko;
    private javax.swing.JLabel label_profile;
    private javax.swing.JLabel label_profile2_logo;
    private javax.swing.JLabel label_profile_logo;
    private javax.swing.JLabel label_role_profile;
    private javax.swing.JLabel label_rp_dataBarang_tambah;
    private javax.swing.JLabel label_stok_dataBarang_tambah;
    private javax.swing.JLabel label_suplier;
    private javax.swing.JLabel label_supplier_dataBarang_tambah;
    private javax.swing.JLabel label_tglMasuk_dataBarang_tambah;
    private javax.swing.JLabel label_toko;
    private javax.swing.JLabel label_toko2_logo;
    private javax.swing.JLabel label_toko_logo;
    private javax.swing.JLabel label_totalBarang;
    private javax.swing.JLabel label_ubahpassword_profile;
    private javax.swing.JLabel label_update_toko;
    private javax.swing.JPanel laporan_panel;
    private javax.swing.JPanel navHorizontal;
    private javax.swing.JPanel navVertikal;
    private javax.swing.JPanel navigasi_laporan;
    private javax.swing.JPanel navigasi_setting;
    private javax.swing.JLabel nilai_kategori;
    private javax.swing.JLabel nilai_suplier;
    private javax.swing.JLabel nilai_total;
    private javax.swing.JLabel nilai_totalBarang;
    private javax.swing.JPanel panel_TrPenjualan;
    private javax.swing.JPanel panel_box;
    private javax.swing.JPanel panel_box_dataBarang_tambah;
    private javax.swing.JPanel panel_cariTrPenjualan;
    private javax.swing.JPanel panel_filter;
    private javax.swing.JPanel panel_kat;
    private javax.swing.JPanel panel_listuser;
    private javax.swing.JPanel panel_profile;
    private javax.swing.JPanel panel_search_kategori;
    private javax.swing.JPanel panel_search_listuser;
    private javax.swing.JPanel panel_search_supplier;
    private javax.swing.JPanel panel_sup;
    private javax.swing.JPanel panel_toko;
    private javax.swing.JScrollPane paneltabellistuser;
    private javax.swing.JPanel search_box;
    private javax.swing.JTextField search_listuser;
    private javax.swing.JComboBox<String> select_kategori_dataBarang_tambah;
    private javax.swing.JComboBox<String> select_supplier_dataBarang_tambah;
    private javax.swing.JPanel setting_panel;
    private javax.swing.JTable tabel_data_kategori;
    private javax.swing.JTable tabel_data_supplier;
    private javax.swing.JTable tableTrPenjualan;
    private javax.swing.JTable table_listuser;
    private javax.swing.JTable table_order;
    // End of variables declaration//GEN-END:variables
}
