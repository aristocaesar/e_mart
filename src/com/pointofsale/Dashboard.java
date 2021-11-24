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
        frameIconMenu = new javax.swing.JPanel();
        iconMenu = new javax.swing.JLabel();
        container_panel = new javax.swing.JPanel();
        setting_panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        laporan_panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        dataBarang_kategori = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        dataBarang_supplier = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        dataBarang_update = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dataBarang_tambah = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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

        jLabel4.setText("setting");

        javax.swing.GroupLayout setting_panelLayout = new javax.swing.GroupLayout(setting_panel);
        setting_panel.setLayout(setting_panelLayout);
        setting_panelLayout.setHorizontalGroup(
            setting_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setting_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(1177, Short.MAX_VALUE))
        );
        setting_panelLayout.setVerticalGroup(
            setting_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setting_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(649, Short.MAX_VALUE))
        );

        container_panel.add(setting_panel, "card5");

        jLabel3.setText("laporan");

        javax.swing.GroupLayout laporan_panelLayout = new javax.swing.GroupLayout(laporan_panel);
        laporan_panel.setLayout(laporan_panelLayout);
        laporan_panelLayout.setHorizontalGroup(
            laporan_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(laporan_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(1174, Short.MAX_VALUE))
        );
        laporan_panelLayout.setVerticalGroup(
            laporan_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(laporan_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(649, Short.MAX_VALUE))
        );

        container_panel.add(laporan_panel, "card4");

        jLabel6.setText("kategori");

        javax.swing.GroupLayout dataBarang_kategoriLayout = new javax.swing.GroupLayout(dataBarang_kategori);
        dataBarang_kategori.setLayout(dataBarang_kategoriLayout);
        dataBarang_kategoriLayout.setHorizontalGroup(
            dataBarang_kategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataBarang_kategoriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(1171, Short.MAX_VALUE))
        );
        dataBarang_kategoriLayout.setVerticalGroup(
            dataBarang_kategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataBarang_kategoriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(649, Short.MAX_VALUE))
        );

        container_panel.add(dataBarang_kategori, "card9");

        jLabel5.setText("supplier");

        javax.swing.GroupLayout dataBarang_supplierLayout = new javax.swing.GroupLayout(dataBarang_supplier);
        dataBarang_supplier.setLayout(dataBarang_supplierLayout);
        dataBarang_supplierLayout.setHorizontalGroup(
            dataBarang_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataBarang_supplierLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(1173, Short.MAX_VALUE))
        );
        dataBarang_supplierLayout.setVerticalGroup(
            dataBarang_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataBarang_supplierLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(649, Short.MAX_VALUE))
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
                .addContainerGap(1176, Short.MAX_VALUE))
        );
        dataBarang_updateLayout.setVerticalGroup(
            dataBarang_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataBarang_updateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(649, Short.MAX_VALUE))
        );

        container_panel.add(dataBarang_update, "card7");

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout dataBarang_tambahLayout = new javax.swing.GroupLayout(dataBarang_tambah);
        dataBarang_tambah.setLayout(dataBarang_tambahLayout);
        dataBarang_tambahLayout.setHorizontalGroup(
            dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataBarang_tambahLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(1176, Short.MAX_VALUE))
        );
        dataBarang_tambahLayout.setVerticalGroup(
            dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataBarang_tambahLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(649, Short.MAX_VALUE))
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
                            .addComponent(search_box, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(76, 76, 76)
                        .addGroup(dataBarang_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel_kat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(filter_box, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(0, 250, Short.MAX_VALUE)))
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 492, Short.MAX_VALUE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
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
    private javax.swing.JButton btn_tambah_barang;
    private javax.swing.JPanel container_panel;
    private javax.swing.JPanel dataBarang_kategori;
    private javax.swing.JPanel dataBarang_panel;
    private javax.swing.JPanel dataBarang_supplier;
    private javax.swing.JPanel dataBarang_tambah;
    private javax.swing.JPanel dataBarang_update;
    private javax.swing.JLabel enter_label;
    private javax.swing.JLabel f10_label;
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
    private javax.swing.JLabel icon_box;
    private javax.swing.JLabel icon_filter;
    private javax.swing.JTextField icon_input_search;
    private javax.swing.JLabel icon_kategori;
    private javax.swing.JLabel icon_search_box;
    private javax.swing.JLabel icon_sup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel kasir_panel;
    private javax.swing.JLabel labelNamaUser;
    private javax.swing.JLabel labelTanggal;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel label_kategori;
    private javax.swing.JLabel label_nilaiTotal;
    private javax.swing.JLabel label_suplier;
    private javax.swing.JLabel label_totalBarang;
    private javax.swing.JPanel laporan_panel;
    private javax.swing.JPanel navHorizontal;
    private javax.swing.JPanel navVertikal;
    private javax.swing.JLabel nilai_kategori;
    private javax.swing.JLabel nilai_suplier;
    private javax.swing.JLabel nilai_total;
    private javax.swing.JLabel nilai_totalBarang;
    private javax.swing.JPanel panel_box;
    private javax.swing.JPanel panel_kat;
    private javax.swing.JPanel panel_sup;
    private javax.swing.JPanel search_box;
    private javax.swing.JPanel setting_panel;
    private javax.swing.JTable table_order;
    // End of variables declaration//GEN-END:variables
}
