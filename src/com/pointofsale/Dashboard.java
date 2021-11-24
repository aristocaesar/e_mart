package com.pointofsale;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author KELOMPOK 2
 */

public class Dashboard extends javax.swing.JFrame {
    
    
    public Dashboard() {
        initComponents();
        
        // fungsi fulscreen from 
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //menampilkan panel kasir pertamakali
        container_panel.removeAll();
        container_panel.add(kasir_panel);
        container_panel.repaint();
        container_panel.revalidate();
      
        Utilities utilities = new Utilities();
        String tgl = utilities.getTime();
        labelTanggal.setText(tgl);
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
        labelTitle = new javax.swing.JLabel();
        labelNamaUser = new javax.swing.JLabel();
        iconUser = new javax.swing.JLabel();
        conten_container = new javax.swing.JPanel();
        frameIconMenu = new javax.swing.JPanel();
        iconMenu = new javax.swing.JLabel();
        container_panel = new javax.swing.JPanel();
        setting_panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        laporan_panel = new javax.swing.JPanel();
        navigasi = new javax.swing.JPanel();
        Panel_TrPenjualan = new javax.swing.JPanel();
        icon_transaksi = new javax.swing.JLabel();
        label_penjualan = new javax.swing.JLabel();
        Panel_TrBarang = new javax.swing.JPanel();
        icon_Tr_barang = new javax.swing.JLabel();
        Label_TrBarang = new javax.swing.JLabel();
        konten_panel = new javax.swing.JPanel();
        kontenBarang_panel = new javax.swing.JPanel();
        panelCariBarang_Barang = new javax.swing.JPanel();
        icon_CariBarang_Barang = new javax.swing.JLabel();
        text_Cari_barang = new javax.swing.JTextField();
        panel_filterBarang = new javax.swing.JPanel();
        filter_Trbarang = new javax.swing.JComboBox<>();
        Export_button_brg = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_transaksiBarang = new javax.swing.JTable();
        KontenJual_panel = new javax.swing.JPanel();
        panelCariBarang = new javax.swing.JPanel();
        icon_CariBarang = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        panel_FilterJualBarang = new javax.swing.JPanel();
        filter_TrPenjualan = new javax.swing.JComboBox<>();
        export_btn_jual = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_transaksiJual = new javax.swing.JTable();
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
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_DataBarang = new javax.swing.JTable();
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

        labelTitle.setFont(new java.awt.Font("Josefin Sans", 1, 28)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(254, 254, 254));
        labelTitle.setText("E - MART");

        labelNamaUser.setBackground(new java.awt.Color(254, 254, 254));
        labelNamaUser.setFont(new java.awt.Font("Josefin Sans", 1, 20)); // NOI18N
        labelNamaUser.setForeground(new java.awt.Color(254, 254, 254));
        labelNamaUser.setText("ARISTO CAESAR");

        iconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/profile-user (1).png"))); // NOI18N

        conten_container.setBackground(new java.awt.Color(219, 219, 219));
        conten_container.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout navHorizontalLayout = new javax.swing.GroupLayout(navHorizontal);
        navHorizontal.setLayout(navHorizontalLayout);
        navHorizontalLayout.setHorizontalGroup(
            navHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navHorizontalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(navHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitle)
                    .addComponent(labelTanggal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelNamaUser)
                .addGap(18, 18, 18)
                .addComponent(iconUser)
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navHorizontalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conten_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        navHorizontalLayout.setVerticalGroup(
            navHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navHorizontalLayout.createSequentialGroup()
                .addGroup(navHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navHorizontalLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(labelTitle)
                        .addGap(0, 0, 0)
                        .addComponent(labelTanggal))
                    .addGroup(navHorizontalLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(navHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(iconUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelNamaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
                .addComponent(conten_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

        jLabel4.setText("setting");

        javax.swing.GroupLayout setting_panelLayout = new javax.swing.GroupLayout(setting_panel);
        setting_panel.setLayout(setting_panelLayout);
        setting_panelLayout.setHorizontalGroup(
            setting_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setting_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(1257, Short.MAX_VALUE))
        );
        setting_panelLayout.setVerticalGroup(
            setting_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setting_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(657, Short.MAX_VALUE))
        );

        container_panel.add(setting_panel, "card5");

        navigasi.setBackground(new java.awt.Color(237, 237, 237));

        Panel_TrPenjualan.setBackground(new java.awt.Color(73, 148, 255));
        Panel_TrPenjualan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_TrPenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_TrPenjualanMouseClicked(evt);
            }
        });

        icon_transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/trend (1).png"))); // NOI18N

        label_penjualan.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        label_penjualan.setForeground(new java.awt.Color(255, 255, 255));
        label_penjualan.setText("Transaksi Penjualan");

        javax.swing.GroupLayout Panel_TrPenjualanLayout = new javax.swing.GroupLayout(Panel_TrPenjualan);
        Panel_TrPenjualan.setLayout(Panel_TrPenjualanLayout);
        Panel_TrPenjualanLayout.setHorizontalGroup(
            Panel_TrPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_TrPenjualanLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(icon_transaksi)
                .addGap(18, 18, 18)
                .addComponent(label_penjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        Panel_TrPenjualanLayout.setVerticalGroup(
            Panel_TrPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_TrPenjualanLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(Panel_TrPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icon_transaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_penjualan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        Panel_TrBarang.setBackground(new java.awt.Color(255, 255, 255));
        Panel_TrBarang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_TrBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_TrBarangMouseClicked(evt);
            }
        });

        icon_Tr_barang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/archive.png"))); // NOI18N

        Label_TrBarang.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        Label_TrBarang.setText("Transaksi Barang");

        javax.swing.GroupLayout Panel_TrBarangLayout = new javax.swing.GroupLayout(Panel_TrBarang);
        Panel_TrBarang.setLayout(Panel_TrBarangLayout);
        Panel_TrBarangLayout.setHorizontalGroup(
            Panel_TrBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_TrBarangLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(icon_Tr_barang)
                .addGap(18, 18, 18)
                .addComponent(Label_TrBarang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_TrBarangLayout.setVerticalGroup(
            Panel_TrBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_TrBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_TrBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icon_Tr_barang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Label_TrBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout navigasiLayout = new javax.swing.GroupLayout(navigasi);
        navigasi.setLayout(navigasiLayout);
        navigasiLayout.setHorizontalGroup(
            navigasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_TrPenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panel_TrBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        navigasiLayout.setVerticalGroup(
            navigasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigasiLayout.createSequentialGroup()
                .addComponent(Panel_TrPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Panel_TrBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        konten_panel.setBackground(new java.awt.Color(153, 153, 255));
        konten_panel.setLayout(new java.awt.CardLayout());

        kontenBarang_panel.setBackground(new java.awt.Color(237, 237, 237));

        panelCariBarang_Barang.setBackground(new java.awt.Color(255, 255, 255));
        panelCariBarang_Barang.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        icon_CariBarang_Barang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/search (1).png"))); // NOI18N

        text_Cari_barang.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        text_Cari_barang.setBorder(null);

        javax.swing.GroupLayout panelCariBarang_BarangLayout = new javax.swing.GroupLayout(panelCariBarang_Barang);
        panelCariBarang_Barang.setLayout(panelCariBarang_BarangLayout);
        panelCariBarang_BarangLayout.setHorizontalGroup(
            panelCariBarang_BarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCariBarang_BarangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_CariBarang_Barang)
                .addGap(18, 18, 18)
                .addComponent(text_Cari_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        panelCariBarang_BarangLayout.setVerticalGroup(
            panelCariBarang_BarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCariBarang_BarangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCariBarang_BarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icon_CariBarang_Barang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text_Cari_barang))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_filterBarang.setBackground(new java.awt.Color(255, 255, 255));
        panel_filterBarang.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        filter_Trbarang.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        filter_Trbarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PerHari", "PerMinggu", "PerBulan" }));

        javax.swing.GroupLayout panel_filterBarangLayout = new javax.swing.GroupLayout(panel_filterBarang);
        panel_filterBarang.setLayout(panel_filterBarangLayout);
        panel_filterBarangLayout.setHorizontalGroup(
            panel_filterBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_filterBarangLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(filter_Trbarang, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        panel_filterBarangLayout.setVerticalGroup(
            panel_filterBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_filterBarangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filter_Trbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Export_button_brg.setBackground(new java.awt.Color(73, 148, 255));
        Export_button_brg.setForeground(new java.awt.Color(255, 255, 255));
        Export_button_brg.setText("EXPORT");
        Export_button_brg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 148, 255), 1, true));
        Export_button_brg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        table_transaksiBarang.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        table_transaksiBarang.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        table_transaksiBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Status", "Tanggal", "Admin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(table_transaksiBarang);

        javax.swing.GroupLayout kontenBarang_panelLayout = new javax.swing.GroupLayout(kontenBarang_panel);
        kontenBarang_panel.setLayout(kontenBarang_panelLayout);
        kontenBarang_panelLayout.setHorizontalGroup(
            kontenBarang_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kontenBarang_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kontenBarang_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addGroup(kontenBarang_panelLayout.createSequentialGroup()
                        .addComponent(panelCariBarang_Barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panel_filterBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(Export_button_brg, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );
        kontenBarang_panelLayout.setVerticalGroup(
            kontenBarang_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kontenBarang_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kontenBarang_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Export_button_brg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCariBarang_Barang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_filterBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        konten_panel.add(kontenBarang_panel, "card3");

        KontenJual_panel.setBackground(new java.awt.Color(237, 237, 237));

        panelCariBarang.setBackground(new java.awt.Color(255, 255, 255));
        panelCariBarang.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        icon_CariBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/search (1).png"))); // NOI18N

        jTextField2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jTextField2.setBorder(null);

        javax.swing.GroupLayout panelCariBarangLayout = new javax.swing.GroupLayout(panelCariBarang);
        panelCariBarang.setLayout(panelCariBarangLayout);
        panelCariBarangLayout.setHorizontalGroup(
            panelCariBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCariBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_CariBarang)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        panelCariBarangLayout.setVerticalGroup(
            panelCariBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCariBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCariBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icon_CariBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_FilterJualBarang.setBackground(new java.awt.Color(255, 255, 255));
        panel_FilterJualBarang.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        filter_TrPenjualan.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        filter_TrPenjualan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PerHari", "PerMinggu", "PerBulan" }));

        javax.swing.GroupLayout panel_FilterJualBarangLayout = new javax.swing.GroupLayout(panel_FilterJualBarang);
        panel_FilterJualBarang.setLayout(panel_FilterJualBarangLayout);
        panel_FilterJualBarangLayout.setHorizontalGroup(
            panel_FilterJualBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_FilterJualBarangLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(filter_TrPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        panel_FilterJualBarangLayout.setVerticalGroup(
            panel_FilterJualBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_FilterJualBarangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filter_TrPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        export_btn_jual.setBackground(new java.awt.Color(73, 148, 255));
        export_btn_jual.setForeground(new java.awt.Color(255, 255, 255));
        export_btn_jual.setText("EXPORT");
        export_btn_jual.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 148, 255), 1, true));
        export_btn_jual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        table_transaksiJual.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        table_transaksiJual.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        table_transaksiJual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Transaksi", "Barang", "Kasir", "Tgl Transaksi", "G.total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(table_transaksiJual);

        javax.swing.GroupLayout KontenJual_panelLayout = new javax.swing.GroupLayout(KontenJual_panel);
        KontenJual_panel.setLayout(KontenJual_panelLayout);
        KontenJual_panelLayout.setHorizontalGroup(
            KontenJual_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KontenJual_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(KontenJual_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(KontenJual_panelLayout.createSequentialGroup()
                        .addComponent(panelCariBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panel_FilterJualBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(export_btn_jual, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );
        KontenJual_panelLayout.setVerticalGroup(
            KontenJual_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KontenJual_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(KontenJual_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(export_btn_jual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCariBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_FilterJualBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        konten_panel.add(KontenJual_panel, "card4");

        javax.swing.GroupLayout laporan_panelLayout = new javax.swing.GroupLayout(laporan_panel);
        laporan_panel.setLayout(laporan_panelLayout);
        laporan_panelLayout.setHorizontalGroup(
            laporan_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(laporan_panelLayout.createSequentialGroup()
                .addComponent(navigasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(konten_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        laporan_panelLayout.setVerticalGroup(
            laporan_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navigasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(konten_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        container_panel.add(laporan_panel, "card4");

        panel_sup.setBackground(new java.awt.Color(255, 255, 255));
        panel_sup.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        icon_sup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/rsz_1delivery-truck.png"))); // NOI18N

        nilai_suplier.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        nilai_suplier.setText("123");

        label_suplier.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        label_suplier.setForeground(new java.awt.Color(141, 141, 141));
        label_suplier.setText("Suplier");

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

        jButton1.setBackground(new java.awt.Color(73, 148, 255));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Tambah Barang");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/search (1).png"))); // NOI18N

        jTextField1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextField1.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/filter_baru.png"))); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua Barang", "Barang Baru", "Barang Lama" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table_DataBarang.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        table_DataBarang.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(table_DataBarang);

        javax.swing.GroupLayout dataBarang_panelLayout = new javax.swing.GroupLayout(dataBarang_panel);
        dataBarang_panel.setLayout(dataBarang_panelLayout);
        dataBarang_panelLayout.setHorizontalGroup(
            dataBarang_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataBarang_panelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(dataBarang_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dataBarang_panelLayout.createSequentialGroup()
                        .addGroup(dataBarang_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addGroup(dataBarang_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_sup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(dataBarang_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_kat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dataBarang_panelLayout.setVerticalGroup(
            dataBarang_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataBarang_panelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(dataBarang_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panel_sup, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_box, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_kat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(dataBarang_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 572, Short.MAX_VALUE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
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
       
        //menampilkan kontenJual_pertamakali diklick 
        konten_panel.removeAll();
        konten_panel.add(KontenJual_panel);
        konten_panel.repaint();
        konten_panel.revalidate();
  
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
            TambahOrder tambah = new TambahOrder();
            tambah.setVisible(true);
            tambah.show();
        }else if(evt.getKeyCode()==KeyEvent.VK_F10){
            
            if(nilai_total.getText().equals("Rp.0")){
                JOptionPane.showMessageDialog(null, "Barang Masih Kosong");
            }else{
            KonfirmasiBayar konfirmasi= new KonfirmasiBayar();
            konfirmasi.setVisible(true);
            konfirmasi.show();
   
            }
                   
             
        }   

    }//GEN-LAST:event_table_orderKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Panel_TrPenjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_TrPenjualanMouseClicked
       //menampilkan kontenJual_panel
        konten_panel.removeAll();
        konten_panel.add(KontenJual_panel);
        konten_panel.repaint();
        konten_panel.revalidate();
        
        //panel menjadi berwarna biru
        Panel_TrPenjualan.setBackground(new Color(73,148,255));
        Panel_TrBarang.setBackground(new Color(255,255,255));
        
        //text label berwarna putih
        label_penjualan.setForeground(new Color(255,255,255));
        Label_TrBarang.setForeground(new Color(0,0,0));
        
        //icon berganti resource
        icon_transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/trend (1).png")));
        icon_Tr_barang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/archive.png")));
        
    }//GEN-LAST:event_Panel_TrPenjualanMouseClicked

    private void Panel_TrBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_TrBarangMouseClicked
        //menampilkan kontenBarang_panel
        konten_panel.removeAll();
        konten_panel.add(kontenBarang_panel);
        konten_panel.repaint();
        konten_panel.revalidate();
        
        //panel menjadi biru ketika diklik
        Panel_TrPenjualan.setBackground(new Color(255,255,255));
        Panel_TrBarang.setBackground(new Color(73,148,255));
        
        //text menjadi warna putih
        Label_TrBarang.setForeground(new Color(255,255,255));
        label_penjualan.setForeground(new Color(0,0,0));
        
        //icon menjadi warna putih
        icon_Tr_barang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/archive(1).png")));
        icon_transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/trend.png")));
    }//GEN-LAST:event_Panel_TrBarangMouseClicked

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Export_button_brg;
    private javax.swing.JPanel KontenJual_panel;
    private javax.swing.JLabel Label_TrBarang;
    private javax.swing.JPanel Panel_TrBarang;
    private javax.swing.JPanel Panel_TrPenjualan;
    private javax.swing.JPanel container_panel;
    private javax.swing.JPanel conten_container;
    private javax.swing.JPanel dataBarang_panel;
    private javax.swing.JLabel enter_label;
    private javax.swing.JButton export_btn_jual;
    private javax.swing.JLabel f10_label;
    private javax.swing.JComboBox<String> filter_TrPenjualan;
    private javax.swing.JComboBox<String> filter_Trbarang;
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
    private javax.swing.JLabel icon_CariBarang;
    private javax.swing.JLabel icon_CariBarang_Barang;
    private javax.swing.JLabel icon_Tr_barang;
    private javax.swing.JLabel icon_box;
    private javax.swing.JLabel icon_kategori;
    private javax.swing.JLabel icon_sup;
    private javax.swing.JLabel icon_transaksi;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel kasir_panel;
    private javax.swing.JPanel kontenBarang_panel;
    private javax.swing.JPanel konten_panel;
    private javax.swing.JLabel labelNamaUser;
    private javax.swing.JLabel labelTanggal;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel label_kategori;
    private javax.swing.JLabel label_nilaiTotal;
    private javax.swing.JLabel label_penjualan;
    private javax.swing.JLabel label_suplier;
    private javax.swing.JLabel label_totalBarang;
    private javax.swing.JPanel laporan_panel;
    private javax.swing.JPanel navHorizontal;
    private javax.swing.JPanel navVertikal;
    private javax.swing.JPanel navigasi;
    private javax.swing.JLabel nilai_kategori;
    private javax.swing.JLabel nilai_suplier;
    private javax.swing.JLabel nilai_total;
    private javax.swing.JLabel nilai_totalBarang;
    private javax.swing.JPanel panelCariBarang;
    private javax.swing.JPanel panelCariBarang_Barang;
    private javax.swing.JPanel panel_FilterJualBarang;
    private javax.swing.JPanel panel_box;
    private javax.swing.JPanel panel_filterBarang;
    private javax.swing.JPanel panel_kat;
    private javax.swing.JPanel panel_sup;
    private javax.swing.JPanel setting_panel;
    private javax.swing.JTable table_DataBarang;
    private javax.swing.JTable table_order;
    private javax.swing.JTable table_transaksiBarang;
    private javax.swing.JTable table_transaksiJual;
    private javax.swing.JTextField text_Cari_barang;
    // End of variables declaration//GEN-END:variables
}
