package com.pointofsale;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.xml.transform.Result;

/**
 *
 * @author KELOMPOK 2
 */

public class Dashboard extends javax.swing.JFrame {

    public static java.sql.Connection conn = (Connection)Database.configDB();
    public static Login jFrameLogin = new Login();
    public static Utilities utilities = new Utilities();
    public static DefaultTableModel tb = new DefaultTableModel();
    public static DefaultTableModel tb_order = new DefaultTableModel();
    public String id;
    public String test;
    
    public Dashboard(String id, String nama_username, int role) {
        initComponents();
        
        this.setTitle("E-MART | Elektronik Market Application");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/pointofsale/src/trolley.png")));
        
        // set nama
        labelNamaUser.setText(nama_username);
        // set user id login
        this.id = id;
        
        // fungsi fulscreen from 
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //menampilkan panel kasir pertamakali
        container_panel.removeAll();
        container_panel.add(kasir_panel);
        container_panel.repaint();
        container_panel.revalidate();
        
        // menampilkan data toko
        try{
            String sql = "SELECT * FROM toko";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                // kirimlkan data ke dashboard
                String nama_toko = rs.getString(2);
                labelNamaToko.setText("E-MART | " + nama_toko);
            }
            
        }catch(SQLException er){
            JOptionPane.showMessageDialog(null, "Data toko pada server gagal dimuat !", "Terjadi Kesalahan !", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
      
        // menampilkan tanggal;
        String tgl = utilities.getTime();
        labelTanggal.setText(tgl);
        
        // visibilitas role
        if(role != 1){
            frameIconDatabase.setVisible(false);
            frameIconLaporan.setVisible(false);
            panel_listuser.setVisible(false);
            panel_toko.setVisible(false);
        }
        
        
        
        // Konfirmasi Keluar app
         addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                int keluar = JOptionPane.showOptionDialog(null, "Apakah Yakin Anda Ingin Keluar ?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
                if(keluar == JOptionPane.YES_OPTION){
                    dispose();
                }
            }
        });
         
         // konfigurasi table order
         // buat sebuah table
            tb_order.setColumnCount(0);
            tb_order.addColumn("No");
            tb_order.addColumn("Kode Barang");
            tb_order.addColumn("Nama Barang");
            tb_order.addColumn("Harga");
            tb_order.addColumn("Stok");
            tb_order.addColumn("Qyt");
            tb_order.addColumn("Diskon");
            tb_order.addColumn("Total");

            table_order.setModel(tb_order);
            table_order.setEnabled(true);
            tb_order.setRowCount(0);
            tb_order.addRow(new Object[]{
                "1","","","","","","",""
            });
            System.out.println(this.test);
            System.out.println("dahsbord dijalankan kembali");
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
        label_idUser_profile = new javax.swing.JLabel();
        label_passwordLama_profile = new javax.swing.JLabel();
        label_nohplama_profile = new javax.swing.JLabel();
        label_namabelakanglama_profile = new javax.swing.JLabel();
        label_Usernamelama_profile = new javax.swing.JLabel();
        label_konfirmasipasswordlama_profile = new javax.swing.JLabel();
        label_namadepanlama_profile = new javax.swing.JLabel();
        container_panel_setting_listuser = new javax.swing.JPanel();
        panel_search_listuser = new RoundedPanel(10, new Color(255, 255, 255));
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
        label_namatokolama_toko = new javax.swing.JLabel();
        label_notelplama_toko = new javax.swing.JLabel();
        label_alamatLama_toko = new javax.swing.JLabel();
        laporan_panel = new javax.swing.JPanel();
        navigasi_laporan = new javax.swing.JPanel();
        panel_TrPenjualan = new javax.swing.JPanel();
        icon_TransaksiJual = new javax.swing.JLabel();
        label_TrPenjualan = new javax.swing.JLabel();
        konten_Laporan = new javax.swing.JPanel();
        konten_laporanTrJual = new javax.swing.JPanel();
        panel_cariTrPenjualan = new RoundedPanel(20, new Color(255, 255, 255));
        icon_cariTrPenjualan = new javax.swing.JLabel();
        input_textTrPenjualan = new javax.swing.JTextField();
        panel_filter = new RoundedPanel(20, new Color(255, 255, 255));
        filter_TrPenjualan = new javax.swing.JComboBox<>();
        Btn_TrPenjualan = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableTrPenjualan = new javax.swing.JTable();
        dataBarang_kategori = new javax.swing.JPanel();
        btn_backToMenu_kategori = new javax.swing.JLabel();
        panel_search_kategori = new RoundedPanel(20, new Color(255, 255, 255));
        icon_search_kategori = new javax.swing.JLabel();
        input_search_kategori = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabel_data_kategori = new javax.swing.JTable();
        box_menu_kategori = new RoundedPanel(20, new Color(255, 255, 255));
        label_kode_kategori = new javax.swing.JLabel();
        input_kode_kategori = new javax.swing.JTextField();
        input_nama_kategori = new javax.swing.JTextField();
        label_namaSupplier_kategori = new javax.swing.JLabel();
        kode_kategori_check = new javax.swing.JLabel();
        nama_kategore_check = new javax.swing.JLabel();
        btn_simpan_kategori = new javax.swing.JButton();
        btn_hapus_kategori = new javax.swing.JButton();
        btn_reset_kategori = new javax.swing.JButton();
        dataBarang_supplier = new javax.swing.JPanel();
        btn_backToMenu_supplier = new javax.swing.JLabel();
        panel_search_supplier = new RoundedPanel(20, new Color(255, 255, 255));
        icon_search_supplier = new javax.swing.JLabel();
        input_search_supplier = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabel_data_supplier = new javax.swing.JTable();
        box_menu_supplier = new RoundedPanel(20, new Color(255, 255, 255));
        label_kode_supplier = new javax.swing.JLabel();
        input_kode_supplier = new javax.swing.JTextField();
        input_namaSupplier_supplier = new javax.swing.JTextField();
        label_namaSupplier_supplier = new javax.swing.JLabel();
        labelIdSupplier = new javax.swing.JLabel();
        label_namaSupplier = new javax.swing.JLabel();
        btn_simpan_supplier = new javax.swing.JButton();
        btn_hapus_supplier = new javax.swing.JButton();
        btn_reset_supplier = new javax.swing.JButton();
        dataBarang_tambah = new javax.swing.JPanel();
        btn_backTomenu_tambah = new javax.swing.JLabel();
        panel_box_dataBarang_tambah = new RoundedPanel(40, new Color(255, 255, 255));
        label_kode_dataBarang_tambah = new javax.swing.JLabel();
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
        label_rp_dataBarang_tambah = new javax.swing.JLabel();
        input_harga_dataBarang_tambah = new javax.swing.JTextField();
        input_tglMasuk_dataBarang_tambah = new javax.swing.JTextField();
        label_kodeLama_tambahBarang = new javax.swing.JLabel();
        label_namaBarang_tambahBarang = new javax.swing.JLabel();
        label_kategoriLama_tambahBarang = new javax.swing.JLabel();
        label_supplierLama_tambahBarang = new javax.swing.JLabel();
        label_stokLama_tambahBarang = new javax.swing.JLabel();
        label_hargaLama_tambahBarang = new javax.swing.JLabel();
        input_stok_dataBarang_tambah = new javax.swing.JTextField();
        btn_simpan_dataBarang_tambah = new javax.swing.JButton();
        btn_hapus_dataBarang_tambah = new javax.swing.JButton();
        dataBarang_panel = new javax.swing.JPanel();
        panel_sup = new RoundedPanel(40, new Color(255, 255, 255));
        icon_sup = new javax.swing.JLabel();
        nilai_suplier = new javax.swing.JLabel();
        label_suplier = new javax.swing.JLabel();
        panel_box = new RoundedPanel(40, new Color(255, 255, 255));
        icon_box = new javax.swing.JLabel();
        nilai_totalBarang = new javax.swing.JLabel();
        label_totalBarang = new javax.swing.JLabel();
        panel_kat = new RoundedPanel(40, new Color(255, 255, 255));
        icon_kategori = new javax.swing.JLabel();
        nilai_kategori = new javax.swing.JLabel();
        label_kategori = new javax.swing.JLabel();
        btn_tambah_barang = new javax.swing.JButton();
        search_box = new RoundedPanel(20, new Color(255, 255, 255));
        icon_search_box = new javax.swing.JLabel();
        input_search_barang = new javax.swing.JTextField();
        filter_box = new RoundedPanel(20, new Color(255, 255, 255));
        icon_filter = new javax.swing.JLabel();
        filter_combo_box = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_databarang = new javax.swing.JTable();
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
                .addGap(26, 26, 26)
                .addComponent(icon_profile)
                .addGap(18, 18, 18)
                .addComponent(label_profile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_profileLayout.setVerticalGroup(
            panel_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_profileLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icon_profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
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
                .addGap(26, 26, 26)
                .addComponent(icon_listuser)
                .addGap(18, 18, 18)
                .addComponent(label_listuser)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        panel_listuserLayout.setVerticalGroup(
            panel_listuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_listuserLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel_listuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icon_listuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_listuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
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
                .addGap(26, 26, 26)
                .addComponent(icon_toko)
                .addGap(18, 18, 18)
                .addComponent(label_toko)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_tokoLayout.setVerticalGroup(
            panel_tokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tokoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel_tokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icon_toko, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_toko, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout navigasi_settingLayout = new javax.swing.GroupLayout(navigasi_setting);
        navigasi_setting.setLayout(navigasi_settingLayout);
        navigasi_settingLayout.setHorizontalGroup(
            navigasi_settingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_profile, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
            .addComponent(panel_listuser, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
            .addComponent(panel_toko, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
        );
        navigasi_settingLayout.setVerticalGroup(
            navigasi_settingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigasi_settingLayout.createSequentialGroup()
                .addComponent(panel_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_listuser, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_toko, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        label_ubahpassword_profile.setText("Password Baru");

        label_konfirmasipassword_profile.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        label_konfirmasipassword_profile.setText("Konfirmasi Password");

        label_loginterbaru_profile.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        label_loginterbaru_profile.setText("Login Terbaru");

        field_Username_profile.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        field_Username_profile.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        label_Username_profile.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        label_Username_profile.setText("Username");

        label_idUser_profile.setText("id_user");

        label_passwordLama_profile.setText("password_lama");

        label_nohplama_profile.setText("nohp_lama");

        label_namabelakanglama_profile.setText("nama_belakang_lama");

        label_Usernamelama_profile.setText("username_lama");

        label_konfirmasipasswordlama_profile.setText("konfirmasi_password_lama");

        label_namadepanlama_profile.setText("nama_depan_lama");

        javax.swing.GroupLayout container_panel_setting_profileLayout = new javax.swing.GroupLayout(container_panel_setting_profile);
        container_panel_setting_profile.setLayout(container_panel_setting_profileLayout);
        container_panel_setting_profileLayout.setHorizontalGroup(
            container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container_panel_setting_profileLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(container_panel_setting_profileLayout.createSequentialGroup()
                        .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label_profile2_logo)
                            .addGroup(container_panel_setting_profileLayout.createSequentialGroup()
                                .addComponent(label_profile_logo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label_idUser_profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(container_panel_setting_profileLayout.createSequentialGroup()
                        .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(container_panel_setting_profileLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(button_simpan_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(container_panel_setting_profileLayout.createSequentialGroup()
                                .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_loginterbaru_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(container_panel_setting_profileLayout.createSequentialGroup()
                                        .addComponent(label_namadepan_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_namadepanlama_profile))
                                    .addGroup(container_panel_setting_profileLayout.createSequentialGroup()
                                        .addComponent(label_nohp_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_nohplama_profile))
                                    .addGroup(container_panel_setting_profileLayout.createSequentialGroup()
                                        .addComponent(label_ubahpassword_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_passwordLama_profile))
                                    .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(field_loginterbaru_profile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                                        .addComponent(field_ubahpassword_profile, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(field_nohp_profile, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(field_namadepan_profile, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                                .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(container_panel_setting_profileLayout.createSequentialGroup()
                                        .addComponent(label_konfirmasipassword_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_konfirmasipasswordlama_profile))
                                    .addComponent(label_role_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(container_panel_setting_profileLayout.createSequentialGroup()
                                        .addComponent(label_Username_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_Usernamelama_profile))
                                    .addGroup(container_panel_setting_profileLayout.createSequentialGroup()
                                        .addComponent(label_namabelakang_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_namabelakanglama_profile))
                                    .addComponent(field_konfirmasipassword_profile)
                                    .addComponent(field_Username_profile)
                                    .addComponent(field_namabelakang_profile, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                                    .addComponent(field_role_profile))))
                        .addGap(30, 30, 30))))
        );
        container_panel_setting_profileLayout.setVerticalGroup(
            container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container_panel_setting_profileLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_profile_logo)
                    .addComponent(label_idUser_profile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_profile2_logo)
                .addGap(34, 34, 34)
                .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container_panel_setting_profileLayout.createSequentialGroup()
                        .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_namadepan_profile)
                            .addComponent(label_namadepanlama_profile))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(field_namadepan_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_nohp_profile)
                            .addComponent(label_nohplama_profile))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(field_nohp_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_ubahpassword_profile)
                            .addComponent(label_passwordLama_profile))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(field_ubahpassword_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(label_loginterbaru_profile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(field_loginterbaru_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container_panel_setting_profileLayout.createSequentialGroup()
                        .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_namabelakang_profile)
                            .addComponent(label_namabelakanglama_profile))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(field_namabelakang_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_Username_profile)
                            .addComponent(label_Usernamelama_profile))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(field_Username_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(container_panel_setting_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_konfirmasipassword_profile)
                            .addComponent(label_konfirmasipasswordlama_profile))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(field_konfirmasipassword_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(label_role_profile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(field_role_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(button_simpan_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        container_panel_setting.add(container_panel_setting_profile, "card2");

        search_listuser.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        search_listuser.setBorder(null);
        search_listuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                search_listuserKeyPressed(evt);
            }
        });

        icon_search_listuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/search (1).png"))); // NOI18N

        javax.swing.GroupLayout panel_search_listuserLayout = new javax.swing.GroupLayout(panel_search_listuser);
        panel_search_listuser.setLayout(panel_search_listuserLayout);
        panel_search_listuserLayout.setHorizontalGroup(
            panel_search_listuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_search_listuserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icon_search_listuser)
                .addGap(18, 18, 18)
                .addComponent(search_listuser, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        button_tambahuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_tambahuserMouseClicked(evt);
            }
        });
        button_tambahuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_tambahuserActionPerformed(evt);
            }
        });

        table_listuser.setDefaultEditor(Object.class, null);
        table_listuser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        table_listuser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table_listuser.setRowHeight(30);
        table_listuser.getTableHeader().setResizingAllowed(false);
        table_listuser.getTableHeader().setReorderingAllowed(false);
        table_listuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_listuserMouseClicked(evt);
            }
        });
        paneltabellistuser.setViewportView(table_listuser);

        javax.swing.GroupLayout container_panel_setting_listuserLayout = new javax.swing.GroupLayout(container_panel_setting_listuser);
        container_panel_setting_listuser.setLayout(container_panel_setting_listuserLayout);
        container_panel_setting_listuserLayout.setHorizontalGroup(
            container_panel_setting_listuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container_panel_setting_listuserLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(container_panel_setting_listuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneltabellistuser)
                    .addGroup(container_panel_setting_listuserLayout.createSequentialGroup()
                        .addComponent(panel_search_listuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                        .addComponent(button_tambahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        container_panel_setting_listuserLayout.setVerticalGroup(
            container_panel_setting_listuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container_panel_setting_listuserLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(container_panel_setting_listuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_search_listuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_tambahuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneltabellistuser, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
                .addGap(30, 30, 30))
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

        label_idToko.setBackground(new java.awt.Color(0, 0, 0));
        label_idToko.setText("id_toko");

        label_namatokolama_toko.setText("nama_tokoLama");

        label_notelplama_toko.setText("no_hpLama");

        label_alamatLama_toko.setText("alamat_lama");

        javax.swing.GroupLayout container_panel_setting_tokoLayout = new javax.swing.GroupLayout(container_panel_setting_toko);
        container_panel_setting_toko.setLayout(container_panel_setting_tokoLayout);
        container_panel_setting_tokoLayout.setHorizontalGroup(
            container_panel_setting_tokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container_panel_setting_tokoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(container_panel_setting_tokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_toko_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_toko2_logo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(container_panel_setting_tokoLayout.createSequentialGroup()
                        .addGroup(container_panel_setting_tokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(container_panel_setting_tokoLayout.createSequentialGroup()
                                .addComponent(label_namatoko_toko, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label_namatokolama_toko))
                            .addComponent(field_namatoko_toko, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                            .addGroup(container_panel_setting_tokoLayout.createSequentialGroup()
                                .addComponent(label_idToko)
                                .addGap(18, 18, 18)
                                .addComponent(label_notelplama_toko))
                            .addComponent(label_notelp_toko, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field_notelp_toko))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                        .addGroup(container_panel_setting_tokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, container_panel_setting_tokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(label_update_toko, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field_alamat_toko, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(container_panel_setting_tokoLayout.createSequentialGroup()
                                    .addComponent(label_alamat_toko, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(label_alamatLama_toko, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(button_simpan_toko, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field_update_toko, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );
        container_panel_setting_tokoLayout.setVerticalGroup(
            container_panel_setting_tokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(container_panel_setting_tokoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(label_toko_logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_toko2_logo)
                .addGap(34, 34, 34)
                .addGroup(container_panel_setting_tokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(container_panel_setting_tokoLayout.createSequentialGroup()
                        .addGroup(container_panel_setting_tokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_namatoko_toko)
                            .addComponent(label_namatokolama_toko))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(field_namatoko_toko, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(label_notelp_toko)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(field_notelp_toko, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(container_panel_setting_tokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_idToko)
                            .addComponent(label_notelplama_toko)))
                    .addGroup(container_panel_setting_tokoLayout.createSequentialGroup()
                        .addGroup(container_panel_setting_tokoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_alamat_toko)
                            .addComponent(label_alamatLama_toko))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(field_alamat_toko, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(label_update_toko)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(field_update_toko, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(button_simpan_toko, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(440, Short.MAX_VALUE))
        );

        container_panel_setting.add(container_panel_setting_toko, "card2");

        javax.swing.GroupLayout setting_panelLayout = new javax.swing.GroupLayout(setting_panel);
        setting_panel.setLayout(setting_panelLayout);
        setting_panelLayout.setHorizontalGroup(
            setting_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setting_panelLayout.createSequentialGroup()
                .addComponent(navigasi_setting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
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
                .addGap(26, 26, 26)
                .addComponent(icon_TransaksiJual)
                .addGap(18, 18, 18)
                .addComponent(label_TrPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        panel_TrPenjualanLayout.setVerticalGroup(
            panel_TrPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TrPenjualanLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel_TrPenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icon_TransaksiJual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_TrPenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
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

        panel_filter.setPreferredSize(new java.awt.Dimension(353, 46));

        filter_TrPenjualan.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        filter_TrPenjualan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Satu Minggu", "Satu Bulan" }));
        filter_TrPenjualan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panel_filterLayout = new javax.swing.GroupLayout(panel_filter);
        panel_filter.setLayout(panel_filterLayout);
        panel_filterLayout.setHorizontalGroup(
            panel_filterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_filterLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(filter_TrPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_filterLayout.setVerticalGroup(
            panel_filterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_filterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filter_TrPenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
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
                        .addComponent(Btn_TrPenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)))
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
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

        icon_search_kategori.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/search (1).png"))); // NOI18N

        input_search_kategori.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        input_search_kategori.setBorder(null);
        input_search_kategori.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_search_kategoriKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_search_kategoriLayout = new javax.swing.GroupLayout(panel_search_kategori);
        panel_search_kategori.setLayout(panel_search_kategoriLayout);
        panel_search_kategoriLayout.setHorizontalGroup(
            panel_search_kategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_search_kategoriLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(icon_search_kategori)
                .addGap(18, 18, 18)
                .addComponent(input_search_kategori)
                .addContainerGap())
        );
        panel_search_kategoriLayout.setVerticalGroup(
            panel_search_kategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_search_kategoriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_search_kategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(input_search_kategori)
                    .addComponent(icon_search_kategori))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabel_data_kategori.setDefaultEditor(Object.class, null);
        tabel_data_kategori.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabel_data_kategori.setRowHeight(30);
        tabel_data_kategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_data_kategoriMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tabel_data_kategori);

        label_kode_kategori.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        label_kode_kategori.setText("Kode");

        input_kode_kategori.setEditable(false);
        input_kode_kategori.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        input_nama_kategori.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        label_namaSupplier_kategori.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        label_namaSupplier_kategori.setText("Nama Kategori");

        kode_kategori_check.setText("Kode_Lama");

        nama_kategore_check.setText("Nama_Kategori_Lama");

        javax.swing.GroupLayout box_menu_kategoriLayout = new javax.swing.GroupLayout(box_menu_kategori);
        box_menu_kategori.setLayout(box_menu_kategoriLayout);
        box_menu_kategoriLayout.setHorizontalGroup(
            box_menu_kategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(box_menu_kategoriLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(box_menu_kategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_kode_kategori)
                    .addComponent(input_nama_kategori)
                    .addGroup(box_menu_kategoriLayout.createSequentialGroup()
                        .addGroup(box_menu_kategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(box_menu_kategoriLayout.createSequentialGroup()
                                .addComponent(label_kode_kategori)
                                .addGap(18, 18, 18)
                                .addComponent(kode_kategori_check))
                            .addGroup(box_menu_kategoriLayout.createSequentialGroup()
                                .addComponent(label_namaSupplier_kategori)
                                .addGap(18, 18, 18)
                                .addComponent(nama_kategore_check)))
                        .addGap(0, 345, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );
        box_menu_kategoriLayout.setVerticalGroup(
            box_menu_kategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(box_menu_kategoriLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(box_menu_kategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_kode_kategori)
                    .addComponent(kode_kategori_check))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_kode_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(box_menu_kategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_namaSupplier_kategori)
                    .addComponent(nama_kategore_check))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_nama_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btn_simpan_kategori.setBackground(new java.awt.Color(21, 101, 216));
        btn_simpan_kategori.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn_simpan_kategori.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan_kategori.setText("Simpan");
        btn_simpan_kategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_simpan_kategoriMouseClicked(evt);
            }
        });

        btn_hapus_kategori.setBackground(new java.awt.Color(255, 69, 69));
        btn_hapus_kategori.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn_hapus_kategori.setForeground(new java.awt.Color(255, 255, 255));
        btn_hapus_kategori.setText("Hapus");
        btn_hapus_kategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_hapus_kategoriMouseClicked(evt);
            }
        });

        btn_reset_kategori.setBackground(new java.awt.Color(102, 102, 102));
        btn_reset_kategori.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn_reset_kategori.setForeground(new java.awt.Color(255, 255, 255));
        btn_reset_kategori.setText("Reset");
        btn_reset_kategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_reset_kategoriMouseClicked(evt);
            }
        });

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
                    .addComponent(btn_hapus_kategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_reset_kategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_reset_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(dataBarang_kategoriLayout.createSequentialGroup()
                        .addComponent(panel_search_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
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

        icon_search_supplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/search (1).png"))); // NOI18N

        input_search_supplier.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        input_search_supplier.setBorder(null);
        input_search_supplier.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_search_supplierKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_search_supplierLayout = new javax.swing.GroupLayout(panel_search_supplier);
        panel_search_supplier.setLayout(panel_search_supplierLayout);
        panel_search_supplierLayout.setHorizontalGroup(
            panel_search_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_search_supplierLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(icon_search_supplier)
                .addGap(18, 18, 18)
                .addComponent(input_search_supplier)
                .addContainerGap())
        );
        panel_search_supplierLayout.setVerticalGroup(
            panel_search_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_search_supplierLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_search_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(input_search_supplier)
                    .addComponent(icon_search_supplier))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabel_data_supplier.setDefaultEditor(Object.class, null);
        tabel_data_supplier.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabel_data_supplier.setCellSelectionEnabled(false);
        tabel_data_supplier.setRowHeight(30);
        tabel_data_supplier.setRowSelectionAllowed(true);
        tabel_data_supplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_data_supplierMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabel_data_supplier);

        label_kode_supplier.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        label_kode_supplier.setText("Kode");

        input_kode_supplier.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        input_namaSupplier_supplier.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        label_namaSupplier_supplier.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        label_namaSupplier_supplier.setText("Nama Supplier");

        labelIdSupplier.setText("Kode_sup");

        label_namaSupplier.setText("Nama_sup");

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
                            .addGroup(box_menu_supplierLayout.createSequentialGroup()
                                .addComponent(label_kode_supplier)
                                .addGap(54, 54, 54)
                                .addComponent(labelIdSupplier))
                            .addGroup(box_menu_supplierLayout.createSequentialGroup()
                                .addComponent(label_namaSupplier_supplier)
                                .addGap(26, 26, 26)
                                .addComponent(label_namaSupplier)))
                        .addGap(0, 393, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );
        box_menu_supplierLayout.setVerticalGroup(
            box_menu_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(box_menu_supplierLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(box_menu_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_kode_supplier)
                    .addComponent(labelIdSupplier))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_kode_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(box_menu_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_namaSupplier_supplier)
                    .addComponent(label_namaSupplier))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_namaSupplier_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btn_simpan_supplier.setBackground(new java.awt.Color(21, 101, 216));
        btn_simpan_supplier.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn_simpan_supplier.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan_supplier.setText("Simpan");
        btn_simpan_supplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_simpan_supplierMouseClicked(evt);
            }
        });

        btn_hapus_supplier.setBackground(new java.awt.Color(255, 69, 69));
        btn_hapus_supplier.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn_hapus_supplier.setForeground(new java.awt.Color(255, 255, 255));
        btn_hapus_supplier.setText("Hapus");
        btn_hapus_supplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_hapus_supplierMouseClicked(evt);
            }
        });

        btn_reset_supplier.setBackground(new java.awt.Color(102, 102, 102));
        btn_reset_supplier.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn_reset_supplier.setForeground(new java.awt.Color(255, 255, 255));
        btn_reset_supplier.setText("Reset");
        btn_reset_supplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_reset_supplierMouseClicked(evt);
            }
        });

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
                    .addComponent(btn_hapus_supplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_reset_supplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_reset_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(dataBarang_supplierLayout.createSequentialGroup()
                        .addComponent(panel_search_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                        .addGap(30, 30, 30))))
        );

        container_panel.add(dataBarang_supplier, "card8");

        btn_backTomenu_tambah.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn_backTomenu_tambah.setText("Barang > Tambah Barang");
        btn_backTomenu_tambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_backTomenu_tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backTomenu_tambahMouseClicked(evt);
            }
        });

        label_kode_dataBarang_tambah.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        label_kode_dataBarang_tambah.setText("Kode");

        input_kode_dataBarang_tambah.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N

        label_namaBarang_dataBarang_tambah.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        label_namaBarang_dataBarang_tambah.setText("Nama Barang");

        input_namaBarang_dataBarang_tambah.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        input_namaBarang_dataBarang_tambah.setMaximumSize(new java.awt.Dimension(512, 515));

        label_kategori_dataBarang_tambah.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        label_kategori_dataBarang_tambah.setText("Kategori");

        select_kategori_dataBarang_tambah.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N

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

        label_rp_dataBarang_tambah.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        label_rp_dataBarang_tambah.setText("Rp");

        input_harga_dataBarang_tambah.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N

        input_tglMasuk_dataBarang_tambah.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N

        label_kodeLama_tambahBarang.setText("kode_lama");

        label_namaBarang_tambahBarang.setText("nama_barang_lama");

        label_kategoriLama_tambahBarang.setText("kategori_lama");

        label_supplierLama_tambahBarang.setText("supplier_lama");

        label_stokLama_tambahBarang.setText("stok_lama");

        label_hargaLama_tambahBarang.setText("harga_lama");

        input_stok_dataBarang_tambah.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N

        javax.swing.GroupLayout panel_box_dataBarang_tambahLayout = new javax.swing.GroupLayout(panel_box_dataBarang_tambah);
        panel_box_dataBarang_tambah.setLayout(panel_box_dataBarang_tambahLayout);
        panel_box_dataBarang_tambahLayout.setHorizontalGroup(
            panel_box_dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_box_dataBarang_tambahLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panel_box_dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_box_dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panel_box_dataBarang_tambahLayout.createSequentialGroup()
                            .addComponent(label_supplier_dataBarang_tambah)
                            .addGap(18, 18, 18)
                            .addComponent(label_supplierLama_tambahBarang))
                        .addGroup(panel_box_dataBarang_tambahLayout.createSequentialGroup()
                            .addComponent(label_kategori_dataBarang_tambah)
                            .addGap(18, 18, 18)
                            .addComponent(label_kategoriLama_tambahBarang))
                        .addGroup(panel_box_dataBarang_tambahLayout.createSequentialGroup()
                            .addComponent(label_namaBarang_dataBarang_tambah)
                            .addGap(18, 18, 18)
                            .addComponent(label_namaBarang_tambahBarang))
                        .addGroup(panel_box_dataBarang_tambahLayout.createSequentialGroup()
                            .addComponent(label_kode_dataBarang_tambah)
                            .addGap(18, 18, 18)
                            .addComponent(label_kodeLama_tambahBarang))
                        .addComponent(select_kategori_dataBarang_tambah, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(select_supplier_dataBarang_tambah, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(input_namaBarang_dataBarang_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(input_kode_dataBarang_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 325, Short.MAX_VALUE)
                .addGroup(panel_box_dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_box_dataBarang_tambahLayout.createSequentialGroup()
                        .addComponent(label_rp_dataBarang_tambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_box_dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_box_dataBarang_tambahLayout.createSequentialGroup()
                                .addComponent(label_harga_dataBarang_tambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label_hargaLama_tambahBarang))
                            .addComponent(input_harga_dataBarang_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_box_dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label_tglMasuk_dataBarang_tambah)
                        .addComponent(input_tglMasuk_dataBarang_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel_box_dataBarang_tambahLayout.createSequentialGroup()
                            .addComponent(label_stok_dataBarang_tambah)
                            .addGap(18, 18, 18)
                            .addComponent(label_stokLama_tambahBarang))
                        .addComponent(input_stok_dataBarang_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        panel_box_dataBarang_tambahLayout.setVerticalGroup(
            panel_box_dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_box_dataBarang_tambahLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panel_box_dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_box_dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_kode_dataBarang_tambah)
                        .addComponent(label_kodeLama_tambahBarang))
                    .addGroup(panel_box_dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_stok_dataBarang_tambah)
                        .addComponent(label_stokLama_tambahBarang)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_box_dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_kode_dataBarang_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_stok_dataBarang_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(panel_box_dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_box_dataBarang_tambahLayout.createSequentialGroup()
                        .addGroup(panel_box_dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_namaBarang_dataBarang_tambah)
                            .addComponent(label_namaBarang_tambahBarang))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(input_namaBarang_dataBarang_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(panel_box_dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_kategori_dataBarang_tambah)
                            .addComponent(label_tglMasuk_dataBarang_tambah)
                            .addComponent(label_kategoriLama_tambahBarang))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_box_dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(select_kategori_dataBarang_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_tglMasuk_dataBarang_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(panel_box_dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_supplier_dataBarang_tambah)
                            .addComponent(label_supplierLama_tambahBarang))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(select_supplier_dataBarang_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_box_dataBarang_tambahLayout.createSequentialGroup()
                        .addGroup(panel_box_dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_harga_dataBarang_tambah)
                            .addComponent(label_hargaLama_tambahBarang))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_box_dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_rp_dataBarang_tambah)
                            .addComponent(input_harga_dataBarang_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(195, 195, 195)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        btn_simpan_dataBarang_tambah.setBackground(new java.awt.Color(73, 148, 255));
        btn_simpan_dataBarang_tambah.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        btn_simpan_dataBarang_tambah.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan_dataBarang_tambah.setText("Simpan");
        btn_simpan_dataBarang_tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_simpan_dataBarang_tambahMouseClicked(evt);
            }
        });

        btn_hapus_dataBarang_tambah.setBackground(new java.awt.Color(255, 69, 69));
        btn_hapus_dataBarang_tambah.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        btn_hapus_dataBarang_tambah.setForeground(new java.awt.Color(255, 255, 255));
        btn_hapus_dataBarang_tambah.setText("Hapus");
        btn_hapus_dataBarang_tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_hapus_dataBarang_tambahMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout dataBarang_tambahLayout = new javax.swing.GroupLayout(dataBarang_tambah);
        dataBarang_tambah.setLayout(dataBarang_tambahLayout);
        dataBarang_tambahLayout.setHorizontalGroup(
            dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataBarang_tambahLayout.createSequentialGroup()
                .addGroup(dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dataBarang_tambahLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_hapus_dataBarang_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
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
                .addGroup(dataBarang_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpan_dataBarang_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hapus_dataBarang_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(186, Short.MAX_VALUE))
        );

        container_panel.add(dataBarang_tambah, "card6");

        panel_sup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                .addContainerGap(106, Short.MAX_VALUE))
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

        panel_kat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_kat.setPreferredSize(new java.awt.Dimension(260, 115));
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        icon_search_box.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/search (1).png"))); // NOI18N

        input_search_barang.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        input_search_barang.setBorder(null);
        input_search_barang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_search_barangKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout search_boxLayout = new javax.swing.GroupLayout(search_box);
        search_box.setLayout(search_boxLayout);
        search_boxLayout.setHorizontalGroup(
            search_boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_boxLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icon_search_box)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(input_search_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        search_boxLayout.setVerticalGroup(
            search_boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_boxLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(search_boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icon_search_box, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(input_search_barang))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        icon_filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/filter_baru.png"))); // NOI18N

        filter_combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua Barang", "Barang Baru", "Barang Lama" }));

        javax.swing.GroupLayout filter_boxLayout = new javax.swing.GroupLayout(filter_box);
        filter_box.setLayout(filter_boxLayout);
        filter_boxLayout.setHorizontalGroup(
            filter_boxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filter_boxLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(icon_filter)
                .addGap(18, 18, 18)
                .addComponent(filter_combo_box, 0, 179, Short.MAX_VALUE)
                .addGap(29, 29, 29))
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

        table_databarang.setDefaultEditor(Object.class, null);
        table_databarang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        table_databarang.setRowHeight(30);
        table_databarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_databarangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_databarang);

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
                        .addGap(50, 50, 50)
                        .addGroup(dataBarang_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel_sup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(search_box, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(dataBarang_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(filter_box, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel_kat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(search_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_tambah_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filter_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        container_panel.add(dataBarang_panel, "card3");

        kasir_panel.setBackground(new java.awt.Color(219, 219, 219));

        table_order.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table_order.setFont(new java.awt.Font("Trebuchet MS", 0, 17)); // NOI18N
        table_order.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
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
                false, false, false, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_order.setRowHeight(30);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 701, Short.MAX_VALUE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
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
            
            getDataInfoBarang();

            //menampilkan data barang kedalam table
            getDataTableBarang("");

    }//GEN-LAST:event_iconDatabaseMouseClicked
    public void getDataInfoBarang(){
            // total barang
            try{
                String sql_barang = "SELECT COUNT(kode_barang) AS jumlah_barang FROM barang";
                PreparedStatement pst = conn.prepareStatement(sql_barang);
                ResultSet res_brg = pst.executeQuery();

                if(res_brg.next()){
                    nilai_totalBarang.setText(res_brg.getString("jumlah_barang"));
                }
                
                String sql_supplier = "SELECT COUNT(id_supplier) AS jumlah_supplier FROM supplier";
                PreparedStatement pst_res = conn.prepareStatement(sql_supplier);
                ResultSet res_sup = pst_res.executeQuery();

                if(res_sup.next()){
                    nilai_suplier.setText(res_sup.getString("jumlah_supplier"));
                }
                
                String sql_kat = "SELECT COUNT(id_kategori) AS jumlah_kategori FROM kategori";
                PreparedStatement pst_kat = conn.prepareStatement(sql_kat);
                ResultSet res_kat = pst_kat.executeQuery();

                if(res_kat.next()){
                    nilai_kategori.setText(res_kat.getString("jumlah_kategori"));
                }

            }catch(SQLException err){
                JOptionPane.showMessageDialog(null, "Gagal Memuat Data Barang !", "Terjadi Kesalahan!", JOptionPane.ERROR_MESSAGE);
            }
    }
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
            
            //mengambil data user
            try{
                String sql = "SELECT * FROM users WHERE id_user =?";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, this.id);

                ResultSet rs = pst.executeQuery();

                if(rs.next()){

                     String nama_lengkap = rs.getString(3);
                     String[] nama = nama_lengkap.split("\\s+",2);
                     
                     label_idUser_profile.setText(rs.getString(1));
                     label_idUser_profile.setVisible(false);
                     
                     field_namadepan_profile.setText(nama[0]);
                     label_namadepanlama_profile.setText(nama[0]);
                     label_namadepanlama_profile.setVisible(false);
                     
                     field_namabelakang_profile.setText(nama[1]);
                     label_namabelakanglama_profile.setText(nama[1]);
                     label_namabelakanglama_profile.setVisible(false);
                     
                     field_ubahpassword_profile.setText("");
                     label_passwordLama_profile.setText(rs.getString(4));
                     label_passwordLama_profile.setVisible(false);
                     
                     field_konfirmasipassword_profile.setText("");
                     label_konfirmasipasswordlama_profile.setText(rs.getString(4));
                     label_konfirmasipasswordlama_profile.setVisible(false);
                     
                     field_nohp_profile.setText(rs.getString(6));
                     label_nohplama_profile.setText(rs.getString(6));
                     label_nohplama_profile.setVisible(false);
                     
                     field_Username_profile.setText(rs.getString(2));
                     label_Usernamelama_profile.setText(rs.getString(2));
                     label_Usernamelama_profile.setVisible(false);
                     
                     
                     
                     field_loginterbaru_profile.setText(rs.getString(8));
                     field_role_profile.setText(rs.getString(5));

                }

            }catch(SQLException err){
                JOptionPane.showMessageDialog(null, err.getMessage());
                System.exit(0);
            }
            getDataTableListuser("");
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
             
             
             try{
                // barang masih kosong
                String sql = "SELECT kode_barang FROM barang ORDER BY kode_barang DESC LIMIT 1";
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet res = pst.executeQuery(sql);
                if(!res.next()){
                    int barang_kosong = JOptionPane.showConfirmDialog(null, "Barang Tidak Tersedia, Silakukan Tambah Barang !", "Terjadi Kesalahan !", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    if(barang_kosong == 0){
                        // ketika btn_tambah_barang diklik
                        container_panel.removeAll();
                        container_panel.add(dataBarang_tambah);
                        container_panel.repaint();
                        container_panel.revalidate();

                        // set nama halaman
                        btn_backTomenu_tambah.setText("Barang > Tambah Barang");

                        // set value
                        setValueDataBarang("");
                    }
                }else{
                    TambahOrder tambah_order = new TambahOrder();
                    tambah_order.setVisible(true);
                    tambah_order.show();
                }
             }catch(SQLException err){
                 JOptionPane.showConfirmDialog(null, "Gagal Memuat Informasi Barang !", "Terjadi Kesalahan !", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE);
             }

            
        }else if(evt.getKeyCode()==KeyEvent.VK_F10){
            
            if(nilai_total.getText().equals("Rp.1")){
                JOptionPane.showMessageDialog(null, "Barang Masih Kosong");
            }else{
            KonfirmasiBayar konfirmasi= new KonfirmasiBayar();
            konfirmasi.setVisible(true);
            konfirmasi.show();
            
            }
             
        }else if(evt.getKeyCode()==KeyEvent.VK_F5){
            resetDataOrder();
        }   

    }//GEN-LAST:event_table_orderKeyPressed

    public void pushDataOrderToMain(String[] data){
        
        if(data.length != 0){
            System.out.println(data[0]);
            System.out.println(data[1]);
            System.out.println(data[2]);
            System.out.println(data[3]);
            tb_order.addRow(new Object[]{
                "3", data[0], data[1], data[2], data[3], "1", "0", data[2]
            });
            tb_order.addRow(new Object[]{
                "3", data[0], data[1], data[2], data[3], "1", "0", data[2]
            });
        }
    
    }
    
    public void resetDataOrder(){
        int resetData = JOptionPane.showOptionDialog(null, "Apakah Anda Yakin Ingin Menghapus Data Order ?", "Informasi !", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
        if(resetData == 0){
            tb_order.setRowCount(0);
            tb_order.addRow(new Object[]{
                "1", "", "", "", "", "", "", ""
            });
        }
    }
    
    private void btn_tambah_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambah_barangMouseClicked
        // ketika btn_tambah_barang diklik
        container_panel.removeAll();
        container_panel.add(dataBarang_tambah);
        container_panel.repaint();
        container_panel.revalidate();
        
        // set nama halaman
        btn_backTomenu_tambah.setText("Barang > Tambah Barang");
        
        // set value
        setValueDataBarang("");
        
    }//GEN-LAST:event_btn_tambah_barangMouseClicked

    public void setValueDataBarang(String updateId){
        
        // default val
        label_kodeLama_tambahBarang.setVisible(false);
        
        JLabel kode_lama = label_kodeLama_tambahBarang;
        JTextField input_kode = input_kode_dataBarang_tambah;
        
        JLabel nama_barang_lama = label_namaBarang_tambahBarang;
        JTextField input_nama_barang = input_namaBarang_dataBarang_tambah;
        
        JLabel nama_kategori_lama = label_kategoriLama_tambahBarang;
        JComboBox<String> nama_kategori = select_kategori_dataBarang_tambah;
        
        JLabel nama_supplier_lama = label_supplierLama_tambahBarang;
        JComboBox<String> nama_supplier = select_supplier_dataBarang_tambah;
        
        JLabel stok_lama = label_stokLama_tambahBarang;
        JTextField stok = input_stok_dataBarang_tambah;
        
        JLabel harga_lama = label_hargaLama_tambahBarang;
        JTextField harga = input_harga_dataBarang_tambah;
        
        JLabel tgl_masul_label = label_tglMasuk_dataBarang_tambah;
        JTextField tgl_masuk = input_tglMasuk_dataBarang_tambah;
        
        JButton btn_hapus = btn_hapus_dataBarang_tambah;
        
        // set isi select kategori dan supplier
        select_kategori_dataBarang_tambah.setModel(new javax.swing.DefaultComboBoxModel<>(dataKategori()));
        select_supplier_dataBarang_tambah.setModel(new javax.swing.DefaultComboBoxModel<>(dataSupplier()));
        
        // jika tidak ada id
        if(updateId.equals("")){
            // tambah
            String id_barang = getIdBarang(false);
            
            // kode barang
            kode_lama.setText(id_barang);
            input_kode.setText(id_barang);
            input_kode.disable();
            
            //nama barang
            nama_barang_lama.setText("");
            nama_barang_lama.setVisible(false);
            input_nama_barang.setText("");
            
            //kategori
            nama_kategori_lama.setText("");
            nama_kategori_lama.setVisible(false);
            nama_kategori.setSelectedIndex(0);
            
            //supplier
            nama_supplier_lama.setText("");
            nama_supplier_lama.setVisible(false);
            nama_supplier.setSelectedIndex(0);
            
            //stok
            stok_lama.setText("");
            stok_lama.setVisible(false);
            stok.setText("");
            
            // harga
            harga_lama.setText("");
            harga_lama.setVisible(false);
            harga.setText("");
            
            //tgl masuk
            tgl_masul_label.setVisible(false);
            tgl_masuk.setVisible(false);
            
            //btn hapus
            btn_hapus.setVisible(false);
            
        }else{
            
            try{
                String sql = "SELECT * FROM barang WHERE kode_barang = ?";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, updateId);
                ResultSet res = pst.executeQuery();
                
                if(res.next()){
                
                    // kode barang
                    kode_lama.setText(updateId);
                    input_kode.setText(updateId);
                    input_kode.disable();

                    //nama barang
                    nama_barang_lama.setText(res.getString("nama_barang"));
//                    nama_barang_lama.setVisible(false);
                    input_nama_barang.setText(res.getString("nama_barang"));

                    //kategori
//                    nama_kategori_lama.setVisible(false);
                    
                    String sql_kat = "SELECT nama_kategori FROM kategori WHERE id_kategori = ?";
                    PreparedStatement pst_kat = conn.prepareStatement(sql_kat);
                    pst_kat.setString(1, res.getString("kategori"));
                    ResultSet res_kat = pst_kat.executeQuery();
                    if(res_kat.next()){
                     nama_kategori_lama.setText(res_kat.getString(1));
                     nama_kategori.setSelectedItem(res_kat.getString(1));   
                    }

                    //supplier
//                    nama_supplier_lama.setVisible(false);
                    
                    String sql_sup = "SELECT nama_supplier FROM supplier WHERE id_supplier = ?";
                    PreparedStatement pst_sup = conn.prepareStatement(sql_sup);
                    pst_sup.setString(1, res.getString("supplier"));
                    ResultSet res_sup = pst_sup.executeQuery();
                    if(res_sup.next()){
                        nama_supplier_lama.setText(res_sup.getString(1));
                        nama_supplier.setSelectedItem(res_sup.getString(1));   
                    }

                    //stok
                    stok_lama.setText(res.getString("stok"));
//                    stok_lama.setVisible(false);
                    stok.setText(res.getString("stok"));

                    // harga
                    harga_lama.setText(res.getString("harga"));
//                    harga_lama.setVisible(false);
                    harga.setText(res.getString("harga"));

                    //tgl masuk
                    tgl_masuk.setText(res.getString("created_at"));
                    tgl_masul_label.setVisible(true);
                    tgl_masuk.setVisible(true);
                    tgl_masuk.disable();
                    
                }
                
            }catch(SQLException err){
                System.out.println(err.getMessage());
                JOptionPane.showMessageDialog(null, "Gagal Memuat Data barang !", "Terjadi Kesalahan !", JOptionPane.INFORMATION_MESSAGE);
                //menampilkan data barang ketika icon diklik
                container_panel.removeAll();
                container_panel.add(dataBarang_panel);
                container_panel.repaint();
                container_panel.revalidate();
            }
            
            //btn hapus
            btn_hapus.setVisible(true);
        }
    }
    
    public String getIdBarang(boolean setNewKode){
        try{
            String sql_getIdSupplier = "SELECT kode_barang FROM barang ORDER BY kode_barang DESC LIMIT 1";
            PreparedStatement pst = conn.prepareStatement(sql_getIdSupplier);
            ResultSet res = pst.executeQuery(sql_getIdSupplier);

            String hsl = "";
            if(res.next()){
                String a = res.getString(1).replaceAll("[a-zA-Z]", "");
                String b = "";
                String c[] = a.split("(?!^)");
                String u = "";

                if("0".equals(c[0])){
                    if("0".equals(c[1])){
                        if("0".equals(c[2])){
                            b = c[3];
                        }else{
                            b = c[2]+c[3];
                        }
                    }else{
                        b = c[1]+c[2]+c[3];
                    }
                }else{
                    b = a;
                }

                int d = Integer.parseInt(b)+1;

                if(d <= 9){
                    u = "BRG000";
                }else if(d <= 99 ){
                    u = "BRG00";
                }else if(d <= 999){
                    u = "BRG0";
                }else{
                    u = "BRG";
                }
                hsl = u+""+d;
            }else{
                hsl = "BRG0001";
            }
            if(setNewKode){
                label_kodeLama_tambahBarang.setText(hsl);
                input_kode_dataBarang_tambah.setText(hsl);
            }
            
            return hsl;
            
        }catch(SQLException err){
            return err.getMessage();
        }
    }
    
    private void panel_supMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_supMouseClicked
        // ketika panel_supplier diklik
        container_panel.removeAll();
        container_panel.add(dataBarang_supplier);
        container_panel.repaint();
        container_panel.revalidate();
        
        //set visible label supplier
        labelIdSupplier.setVisible(false);
        label_namaSupplier.setVisible(false);
        
        // set ""
        input_namaSupplier_supplier.setText("");
        label_namaSupplier.setText("");
        
        getDataSupplier("");
    }//GEN-LAST:event_panel_supMouseClicked
    public void getDataSupplier(String Keyword){
        tb.setColumnCount(0);
        tb.addColumn("No");
        tb.addColumn("Id Supplier");
        tb.addColumn("Nama Supplier");
        
        tabel_data_supplier.setModel(tb);
        tabel_data_supplier.setEnabled(true);
        tb.setRowCount(0);
        
         String sql = "";
         try{
           Statement stat = (Statement) Database.configDB().createStatement( );
           if(Keyword.equals("")){
               sql = "SELECT * FROM supplier ORDER BY id_supplier ASC";
           }else{
               sql = "SELECT * FROM supplier WHERE nama_supplier LIKE '%"+Keyword+"%' ORDER BY id_supplier ASC";
           }
           
           ResultSet res = stat.executeQuery(sql);
           int no=1;
           while(res.next()){
                 tb.addRow(new Object[]{
                     no++,
                     res.getString(1),
                     res.getString(2),
                 });  
            }
             getIdSupplier(true);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Terjadi Kesalahan !",JOptionPane.INFORMATION_MESSAGE);
        
            //menampilkan data barang ketika icon diklik
            container_panel.removeAll();
            container_panel.add(dataBarang_panel);
            container_panel.repaint();
            container_panel.revalidate();
        }
       
    }
    
    public String getIdSupplier(boolean setNewKode){
        try{
            String sql_getIdSupplier = "SELECT id_supplier FROM supplier ORDER BY id_supplier DESC LIMIT 1";
            PreparedStatement pst = conn.prepareStatement(sql_getIdSupplier);
            ResultSet res = pst.executeQuery(sql_getIdSupplier);

            String hsl = "";
            if(res.next()){
                String a = res.getString(1).replaceAll("[a-zA-Z]", "");
                String b = "";
                String c[] = a.split("(?!^)");
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
                    u = "S00";
                }else if(d <= 99 ){
                    u = "S0";
                }else{
                    u = "S";
                }
                hsl = u+""+d;
            }else{
                hsl = "S001";
            }
            
            if(setNewKode){
                input_kode_supplier.setText(hsl);
                labelIdSupplier.setText(hsl);
            }
            
            return hsl;
            
        }catch(SQLException err){
            return err.getMessage();
        }
    }
    
    public void resetInputSupplier(){
        String kode_sup = getIdSupplier(true);
        input_kode_supplier.setText(kode_sup);
        labelIdSupplier.setText(kode_sup);
        
        input_namaSupplier_supplier.setText("");
        label_namaSupplier.setText("");
    }
    
    private void panel_katMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_katMouseClicked
        // ketika panel_kategori diklik
        container_panel.removeAll();
        container_panel.add(dataBarang_kategori);
        container_panel.repaint();
        container_panel.revalidate();
        
        //set visibilitas
        kode_kategori_check.setVisible(false);
        nama_kategore_check.setVisible(false);
        
        //set ""
        input_nama_kategori.setText("");
        nama_kategore_check.setText("");
        
        //table data kategori
        getDataKategori("");
    }//GEN-LAST:event_panel_katMouseClicked
    public void getDataKategori(String Keyword){
        tb.setColumnCount(0);
        tb.addColumn("No");
        tb.addColumn("Kode Kategori");
        tb.addColumn("Nama Kategori");
        
        tabel_data_kategori.setModel(tb);
        tb.setRowCount(0); 
        
        try{
          String sql = "";
          if(Keyword.equals("")){
              sql = "SELECT * FROM kategori ORDER BY id_kategori ASC";
          }else{
              sql = "SELECT * FROM kategori WHERE nama_kategori LIKE '%"+Keyword+"%' ORDER BY id_kategori ASC";
          }
          PreparedStatement pst = conn.prepareStatement(sql);
          ResultSet res = pst.executeQuery(sql);

          int no=1;
            while(res.next()){
                 tb.addRow(new Object[]{
                     no++,
                     res.getString("id_kategori"),
                     res.getString("nama_kategori"),
                 });  
             }
          
          // SET NEW INPUT
          getIdKategori(true);
          
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Gagal Memuat Data Kategori !","Terjadi Kesalahan !",JOptionPane.ERROR_MESSAGE);
            
            //menampilkan data barang ketika icon diklik
            container_panel.removeAll();
            container_panel.add(dataBarang_panel);
            container_panel.repaint();
            container_panel.revalidate();
        }
    }
    
    public String getIdKategori(boolean setNewKode){
        try{
            String sql_getIdKategori = "SELECT id_kategori FROM kategori ORDER BY id_kategori DESC LIMIT 1";
            PreparedStatement pst = conn.prepareStatement(sql_getIdKategori);
            ResultSet res = pst.executeQuery(sql_getIdKategori);

            String hsl = "";
            if(res.next()){
                String a = res.getString(1).replaceAll("[a-zA-Z]", "");
                String b = "";
                String c[] = a.split("(?!^)");
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
                    u = "K00";
                }else if(d <= 99 ){
                    u = "K0";
                }else{
                    u = "K";
                }
                hsl = u+""+d;
            }else{
                hsl = "K001";
            }
            
            if(setNewKode){
                input_kode_kategori.setText(hsl);
                kode_kategori_check.setText(hsl);
            }
            
            return hsl;
            
        }catch(SQLException err){
            return err.getMessage();
        }
    }
    
    public void resetInputKategori(){
        String kode_kat = getIdKategori(true);
        input_kode_kategori.setText(kode_kat);
        kode_kategori_check.setText(kode_kat);
        
        input_nama_kategori.setText("");
        nama_kategore_check.setText("");
    }
    
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
        
        getDataInfoBarang();
        getDataTableBarang("");
    }//GEN-LAST:event_btn_backTomenu_tambahMouseClicked

    private void btn_backToMenu_supplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backToMenu_supplierMouseClicked
        // TODO add your handling code here:
        container_panel.removeAll();
        container_panel.add(dataBarang_panel);
        container_panel.repaint();
        container_panel.revalidate();
        
        getDataInfoBarang();
        getDataTableBarang("");
    }//GEN-LAST:event_btn_backToMenu_supplierMouseClicked

    private void btn_backToMenu_kategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backToMenu_kategoriMouseClicked
        // TODO add your handling code here:
        container_panel.removeAll();
        container_panel.add(dataBarang_panel);
        container_panel.repaint();
        container_panel.revalidate();
        
        getDataInfoBarang();
        getDataTableBarang("");
    }//GEN-LAST:event_btn_backToMenu_kategoriMouseClicked

    private void panel_profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_profileMouseClicked

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
        
        //memanggil fungsi table list user
        getDataTableListuser("");
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
        
    }//GEN-LAST:event_panel_tokoMouseClicked
    public void getDataToko(){
        try{
            java.sql.Connection conn = (Connection)Database.configDB();
            String sql = "SELECT * FROM toko limit 1";
            PreparedStatement pst = conn.prepareStatement(sql);
             
            ResultSet res=pst.executeQuery(sql);
            if(res.next()){
                label_idToko.setText(res.getString(1));
                label_idToko.setVisible(false);
                
                field_namatoko_toko.setText(res.getString(2));
                label_namatokolama_toko.setText(res.getString(2));
                label_namatokolama_toko.setVisible(false);
                
                field_alamat_toko.setText(res.getString(3));
                label_alamatLama_toko.setText(res.getString(3));
                label_alamatLama_toko.setVisible(false);
                
                field_notelp_toko.setText(res.getString(4));
                label_notelplama_toko.setText(res.getString(4));
                label_notelplama_toko.setVisible(false);
                
                field_update_toko.setText(res.getString(5));
                
                
            }
      }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
      }
    }
    private void button_tambahuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_tambahuserActionPerformed
        
    }//GEN-LAST:event_button_tambahuserActionPerformed

    private void frameIconSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameIconSettingMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_frameIconSettingMouseClicked

    private void button_simpan_profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_simpan_profileMouseClicked
        
        //menperbarui data user
        try{
            
            String username = field_Username_profile.getText().replaceAll("\\s+","");
            String nama_depan=field_namadepan_profile.getText();
            String nama_belakang =field_namabelakang_profile.getText();
            String no_hp = field_nohp_profile.getText();
            String pass1 = field_ubahpassword_profile.getText();
            String pass2 = field_konfirmasipassword_profile.getText();
            
            if(username.equals("") && nama_depan.equals("") && nama_belakang.equals("") && no_hp.equals("")){
                throw new SQLException("Data Tidak Boleh Kosong !");
            }
            
            if(!username.equals(label_Usernamelama_profile.getText()) ||
               !nama_depan.equals(label_namadepanlama_profile.getText()) ||
               !nama_belakang.equals(label_namabelakanglama_profile.getText()) ||
               !pass1.equals("") ||
               !pass2.equals("") ||
               !no_hp.equals(label_nohplama_profile.getText())
               ){
                
                String sql = "UPDATE users SET username=?,nama_lengkap=?,password=?,no_hp=?, updated_at =? where id_user=?";
                PreparedStatement pst = conn.prepareStatement(sql);

                pst.setString(1, username.toLowerCase());
                pst.setString(2, (nama_depan+" "+nama_belakang).toUpperCase());

                if(!field_ubahpassword_profile.getText().equals("")||!field_konfirmasipassword_profile.getText().equals("")){

                    if(label_passwordLama_profile.getText().equals(field_ubahpassword_profile.getText())){
                            throw new SQLException("Password Ini Sedang Digunakan, Masukkan Password Lain !");
                    }else{
                        if(field_ubahpassword_profile.getText().equals(field_konfirmasipassword_profile.getText())){
                            pst.setString(3, field_ubahpassword_profile.getText());
                        }else{
                            throw new SQLException("Password Yang Anda Masukkan Tidak Sama !");
                        }
                    }

                }else{
                    pst.setString(3, label_passwordLama_profile.getText());
                }

                pst.setString(4, field_nohp_profile.getText());
                pst.setString(5, utilities.getCurrentTimeStamp());
                pst.setString(6, label_idUser_profile.getText());

                pst.execute();

                ImageIcon successIcon = new ImageIcon(getClass().getResource("/com/pointofsale/src/check.png"));
                JOptionPane.showMessageDialog(null, "Data User Berhasil Diperbarui, Silakan Login Kembali !", "Success !", JOptionPane.INFORMATION_MESSAGE, successIcon);

                dispose();
                jFrameLogin.show();
                
            }else{
                throw new SQLException("Tidak Ada Perubahan, Data Sudah Terbaru !");
            }
            
//            
            
        }catch(SQLException err){
            if(err.getErrorCode() == 1062){
                JOptionPane.showMessageDialog(null, "Username Sudah Digunakan !", "Terjadi Kesalahan !", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, err.getMessage(), "Terjadi Kesalahan !", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_button_simpan_profileMouseClicked

    public void getDataTableListuser(String Keyword){     
        
        //memberi nama pada table list user
        tb.setColumnCount(0);
        tb.addColumn("No");
        tb.addColumn("User ID");
        tb.addColumn("username");
        tb.addColumn("Nama");
        tb.addColumn("Status");
        tb.addColumn("Role");
        tb.addColumn("No telp");
        tb.addColumn("Last Update");
        
        table_listuser.setModel(tb); 
        table_listuser.setEnabled(true);
        tb.setRowCount(0);
    
     try{
           //membuat statemen pemanggilan data pada table tblGaji dari database
           Statement stat = (Statement) Database.configDB().createStatement( );
           
           String sql = "";
           if(Keyword.equals("")){
               sql = "SELECT * FROM users ORDER BY id_user ASC";
           }else{
               sql = "SELECT * FROM users WHERE nama_lengkap LIKE '%"+Keyword+"%' ORDER BY id_user ASC";
           }
           
           ResultSet res = stat.executeQuery(sql);
           int no=1;
           //penelusuran baris pada tabel tblGaji dari database
           while(res.next ()){
                tb.addRow(new Object[]{
                    no++,
                    res.getString("id_user"),
                    res.getString("username"),
                    res.getString("nama_lengkap"),
                    res.getString("isAktif"),
                    res.getString("role"),
                    res.getString("no_hp"),
                    res.getString("updated_at")
                });  
            }
      }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
      }
}
    public void getDataTableBarang(String Keyword){
        tb.setColumnCount(0);
        tb.addColumn("No");
        tb.addColumn("Kode Barang");
        tb.addColumn("Nama Barang");
        tb.addColumn("Kategori");
        tb.addColumn("Harga");
        tb.addColumn("Stok");
        tb.addColumn("Supplier");
       
        table_databarang.setModel(tb);
        table_databarang.setEnabled(true);
        tb.setRowCount(0);
        
        try{
           String sql = "";
           if(Keyword.equals("")){
                sql = "SELECT * FROM barang ORDER BY kode_barang ASC";
           }else{
               sql = "SELECT * FROM barang WHERE nama_barang LIKE '%"+Keyword+"%' OR kode_barang LIKE '%"+Keyword+"%' ORDER BY kode_barang ASC";
           }
           PreparedStatement pst = conn.prepareStatement(sql);
           ResultSet res   = pst.executeQuery(sql);
           
           int no=1;
           //penelusuran baris pada tabel tblGaji dari database
           while(res.next()){
                tb.addRow(new Object[]{
                    no++,
                    res.getString("kode_barang"),
                    res.getString("nama_barang"),
                    res.getString("kategori"),
                    res.getString("harga"),
                    res.getString("stok"),
                    res.getString("supplier"),
                   
                });  
            }
           table_databarang.getColumnModel().getColumn(0).setPreferredWidth(1);
           table_databarang.getColumnModel().getColumn(2).setPreferredWidth(350);

           
        }catch(SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Gagal Memuat Data Barang!","Terjadi Kesalahan!",JOptionPane.INFORMATION_MESSAGE);
        }
       
    }
    
    private void button_simpan_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_simpan_profileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_simpan_profileActionPerformed

    private void button_simpan_tokoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_simpan_tokoMouseClicked
        // TODO add your handling code here:
        simpanDataToko();
    }//GEN-LAST:event_button_simpan_tokoMouseClicked

    private void button_tambahuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_tambahuserMouseClicked
        try {
            // buka frame tambah user
            TambahUser tambahUser = new TambahUser("tambah", "");
            tambahUser.show();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Tambah User Gagal Ditambahkan !", "Terjadi Kesalahan !", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_button_tambahuserMouseClicked

    private void table_listuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_listuserMouseClicked
        DefaultTableModel model = (DefaultTableModel)table_listuser.getModel();
        int selectedRowIndex = table_listuser.getSelectedRow();
        String id_user_update = model.getValueAt(selectedRowIndex, 1).toString();
        try {
            if(id_user_update.equals(this.id)){
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
            }else{
                TambahUser tambahUser = new TambahUser("update", id_user_update);
                tambahUser.show();
            }
        } catch (Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Update User Gagal Dijalankan !", "Terjad Kesalahan !", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }//GEN-LAST:event_table_listuserMouseClicked

    private void tabel_data_supplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_data_supplierMouseClicked
 
        DefaultTableModel model = (DefaultTableModel)tabel_data_supplier.getModel();
        int selectedRowIndex = tabel_data_supplier.getSelectedRow();
        
        String kode_sup_update = model.getValueAt(selectedRowIndex, 1).toString();
        String nama_sup_update =model.getValueAt(selectedRowIndex, 2).toString();
        
        input_kode_supplier.setText(kode_sup_update);
        input_namaSupplier_supplier.setText(nama_sup_update);
        
        labelIdSupplier.setText(kode_sup_update);
        label_namaSupplier.setText(nama_sup_update);
    }//GEN-LAST:event_tabel_data_supplierMouseClicked

    private void btn_simpan_kategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpan_kategoriMouseClicked

        String new_kode = getIdKategori(false);
        String input_kode = input_kode_kategori.getText();
        String input_nama_kategori = this.input_nama_kategori.getText().replaceAll("[0-9]", "");
        
        try{
            String sql = "";
            ImageIcon successIcon = new ImageIcon(getClass().getResource("/com/pointofsale/src/check.png"));
            if(!input_nama_kategori.equals("")){
                if(new_kode.equals(input_kode)){
                    //lakukan tambah
                    sql = "INSERT INTO kategori VALUES (?, ?)";
                    PreparedStatement pst = conn.prepareStatement(sql);
                    pst.setString(1, input_kode);
                    pst.setString(2, input_nama_kategori);
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Kategori Berhasil Ditambahkan !", "Sukses !", JOptionPane.INFORMATION_MESSAGE,successIcon);
                    getDataKategori("");
                    resetInputKategori();
                }else{
                    //lakukan update
                    if(!input_nama_kategori.equals(nama_kategore_check.getText())){
                        sql = "UPDATE kategori SET nama_kategori = ? WHERE id_kategori = ?";
                        PreparedStatement pst = conn.prepareStatement(sql);
                        pst.setString(1, input_nama_kategori);
                        pst.setString(2, input_kode);
                        pst.execute();
                        JOptionPane.showMessageDialog(null, "Kategori Berhasil Diperbarui !", "Sukses !", JOptionPane.INFORMATION_MESSAGE,successIcon);
                        getDataKategori("");
                        resetInputKategori();
                    }else{
                        throw new SQLException("Tidak Ada Perubahan, Data Sudah Terbaru !");
                    }
                }
            }else{
                throw new SQLException("Data Tidak Boleh Kosong !");
            }
            
        }catch(SQLException err){
            String em = "";
            if(err.getErrorCode() == 1062){
                em = "Nama Kategori Sudah Digunakan !";
            }else{
                em = err.getMessage();
            }
            JOptionPane.showMessageDialog(null, em, "Terjadi Kesalahan !", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btn_simpan_kategoriMouseClicked

    private void tabel_data_kategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_data_kategoriMouseClicked
         // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tabel_data_kategori.getModel();
        int selectedRowIndex = tabel_data_kategori.getSelectedRow();
        
        String kode_kategori_update = model.getValueAt(selectedRowIndex, 1).toString();
        String nama_kategori_update =model.getValueAt(selectedRowIndex, 2).toString();
        
        input_kode_kategori.setText(kode_kategori_update);
        input_nama_kategori.setText(nama_kategori_update);
        
        kode_kategori_check.setText(kode_kategori_update);
        nama_kategore_check.setText(nama_kategori_update);
        
    }//GEN-LAST:event_tabel_data_kategoriMouseClicked

    private void search_listuserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_listuserKeyPressed
        // TODO add your handling code here:
        getDataTableListuser(search_listuser.getText());
    }//GEN-LAST:event_search_listuserKeyPressed

    private void btn_reset_kategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reset_kategoriMouseClicked
        // TODO add your handling code here:
        resetInputKategori();
    }//GEN-LAST:event_btn_reset_kategoriMouseClicked

    private void btn_hapus_kategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapus_kategoriMouseClicked
        
        String new_kode = getIdKategori(false);
        String input_kode = input_kode_kategori.getText();
        try{
            if(!input_kode.equals(new_kode)){
                int hapus = JOptionPane.showOptionDialog(null, "Menghapus data kategori menyebabkan data barang dengan kategori yang sama akan ikut terhapus !", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, null, null, null);
                if(hapus == JOptionPane.YES_OPTION){
                    String sql = "DELETE FROM kategori WHERE id_kategori = ?";
                    PreparedStatement pst = conn.prepareStatement(sql);
                    pst.setString(1, input_kode);
                    pst.execute();
                    ImageIcon successIcon = new ImageIcon(getClass().getResource("/com/pointofsale/src/check.png"));
                    JOptionPane.showMessageDialog(null, "Kategori Berhasil Dihapus !", "Sukses !", JOptionPane.INFORMATION_MESSAGE,successIcon);
                    getDataKategori("");
                    resetInputKategori();
                }
            }else{
                throw new SQLException("Silakan Pilih Kategori !");
            }
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage(), "Terjadi Kesalahan !", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btn_hapus_kategoriMouseClicked

    private void input_search_kategoriKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_search_kategoriKeyPressed
        // TODO add your handling code here:
        getDataKategori(input_search_kategori.getText());
    }//GEN-LAST:event_input_search_kategoriKeyPressed

    private void btn_simpan_supplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpan_supplierMouseClicked
        String new_kode = getIdSupplier(false);
        String input_kode = input_kode_supplier.getText();
        String input_nama_supplier = this.input_namaSupplier_supplier.getText().replaceAll("[0-9]", "");
        
        try{
            String sql = "";
            ImageIcon successIcon = new ImageIcon(getClass().getResource("/com/pointofsale/src/check.png"));
            if(!input_nama_supplier.equals("")){
                if(new_kode.equals(input_kode)){
                    //lakukan tambah
                    sql = "INSERT INTO supplier VALUES (?, ?)";
                    PreparedStatement pst = conn.prepareStatement(sql);
                    pst.setString(1, input_kode);
                    pst.setString(2, input_nama_supplier);
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Supplier Berhasil Ditambahkan !", "Sukses !", JOptionPane.INFORMATION_MESSAGE,successIcon);
                    getDataSupplier("");
                    resetInputSupplier();
                }else{
                    //lakukan update
                    if(!input_nama_supplier.equals(label_namaSupplier.getText())){
                        sql = "UPDATE supplier SET nama_supplier = ? WHERE id_supplier = ?";
                        PreparedStatement pst = conn.prepareStatement(sql);
                        pst.setString(1, input_nama_supplier);
                        pst.setString(2, input_kode);
                        pst.execute();
                        JOptionPane.showMessageDialog(null, "Supplier Berhasil Diperbarui !", "Sukses !", JOptionPane.INFORMATION_MESSAGE,successIcon);
                        getDataSupplier("");
                        resetInputSupplier();
                    }else{
                        throw new SQLException("Tidak Ada Perubahan, Data Sudah Terbaru !");
                    }
                }
            }else{
                throw new SQLException("Data Tidak Boleh Kosong !");
            }
            
        }catch(SQLException err){
            String em = "";
            if(err.getErrorCode() == 1062){
                em = "Nama Kategori Sudah Digunakan !";
            }else{
                em = err.getMessage();
            }
            JOptionPane.showMessageDialog(null, em, "Terjadi Kesalahan !", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_simpan_supplierMouseClicked

    private void btn_hapus_supplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapus_supplierMouseClicked
        
        String new_kode = getIdSupplier(false);
        String input_kode = input_kode_supplier.getText();
        try{
            if(!input_kode.equals(new_kode)){
                int hapus = JOptionPane.showOptionDialog(null, "Menghapus data supplier menyebabkan data transaksi dengan supplier yang sama akan ikut terhapus !", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, null, null, null);
                if(hapus == JOptionPane.YES_OPTION){
                    String sql = "DELETE FROM supplier WHERE id_supplier = ?";
                    PreparedStatement pst = conn.prepareStatement(sql);
                    pst.setString(1, input_kode);
                    pst.execute();
                    ImageIcon successIcon = new ImageIcon(getClass().getResource("/com/pointofsale/src/check.png"));
                    JOptionPane.showMessageDialog(null, "Supplier Berhasil Dihapus !", "Sukses !", JOptionPane.INFORMATION_MESSAGE,successIcon);
                    getDataSupplier("");
                    resetInputSupplier();
                }
            }else{
                throw new SQLException("Silakan Pilih Supplier !");
            }
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage(), "Terjadi Kesalahan !", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btn_hapus_supplierMouseClicked

    private void btn_reset_supplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reset_supplierMouseClicked
        // TODO add your handling code here:
        resetInputSupplier();
    }//GEN-LAST:event_btn_reset_supplierMouseClicked

    private void input_search_supplierKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_search_supplierKeyPressed
        // TODO add your handling code here:
        getDataSupplier(input_search_supplier.getText());
    }//GEN-LAST:event_input_search_supplierKeyPressed

    private void table_databarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_databarangMouseClicked
        // ketika table diklik
        container_panel.removeAll();
        container_panel.add(dataBarang_tambah);
        container_panel.repaint();
        container_panel.revalidate();
        
        //set update data barang
        
        // set nama halaman
        btn_backTomenu_tambah.setText("Barang > Update Barang");
        
        DefaultTableModel model = (DefaultTableModel)table_databarang.getModel();
        int selectedRowIndex = table_databarang.getSelectedRow();
        String id_user_update = model.getValueAt(selectedRowIndex, 1).toString();
        
        setValueDataBarang(id_user_update);
    }//GEN-LAST:event_table_databarangMouseClicked

    private void btn_simpan_dataBarang_tambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_simpan_dataBarang_tambahMouseClicked
        // tambah barang
        
        JLabel kode_lama = label_kodeLama_tambahBarang;
        JTextField input_kode = input_kode_dataBarang_tambah;
        
        JLabel nama_barang_lama = label_namaBarang_tambahBarang;
        JTextField input_nama_barang = input_namaBarang_dataBarang_tambah;
        
        JLabel nama_kategori_lama = label_kategoriLama_tambahBarang;
        JComboBox<String> nama_kategori = select_kategori_dataBarang_tambah;
        
        JLabel nama_supplier_lama = label_supplierLama_tambahBarang;
        JComboBox<String> nama_supplier = select_supplier_dataBarang_tambah;
        
        JLabel stok_lama = label_stokLama_tambahBarang;
        JTextField stok = input_stok_dataBarang_tambah;
        
        JLabel harga_lama = label_hargaLama_tambahBarang;
        JTextField harga = input_harga_dataBarang_tambah;
        
        JLabel tgl_masul_label = label_tglMasuk_dataBarang_tambah;
        JTextField tgl_masuk = input_tglMasuk_dataBarang_tambah;
        
        JButton btn_hapus = btn_hapus_dataBarang_tambah;
        
        // jika tidak ada id
        String new_id_barang = getIdBarang(false);
        if(new_id_barang.equals(input_kode.getText())){
           try{
                // tambah
                    //jika data kosong semua
                    if(!input_nama_barang.getText().equals("") && !stok.getText().equals("") && !harga.getText().equals("")){
                        
                        String sql = "INSERT INTO barang VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                        PreparedStatement pst = conn.prepareStatement(sql);
                        pst.setString(1, new_id_barang);
                        pst.setString(2, input_nama_barang.getText());
                        
                        String sql_kategori = "SELECT id_kategori FROM kategori WHERE nama_kategori = ?";
                        PreparedStatement pst_kat = conn.prepareStatement(sql_kategori);
                        pst_kat.setString(1, nama_kategori.getSelectedItem().toString());
                        ResultSet res_kat = pst_kat.executeQuery();
                        if(res_kat.next()){
                            pst.setString(3, res_kat.getString(1));
                        }
                        
                        
                        pst.setString(4, harga.getText().replaceAll("[^a-zA-Z0-9]", "").replaceAll("[a-zA-Z]", ""));
                        pst.setString(5, stok.getText().replaceAll("[^a-zA-Z0-9]", "").replaceAll("[a-zA-Z]", ""));
                        
                        String sql_supplier = "SELECT id_supplier FROM supplier WHERE nama_supplier = ?";
                        PreparedStatement pst_sup = conn.prepareStatement(sql_supplier);
                        pst_sup.setString(1, nama_supplier.getSelectedItem().toString());
                        ResultSet res_sup = pst_sup.executeQuery();
                        if(res_sup.next()){
                            pst.setString(6, res_sup.getString(1));
                        }
                        
                        pst.setString(7, utilities.getCurrentTimeStamp());
                        pst.setString(8, utilities.getCurrentTimeStamp());
                        
                        pst.execute();
                        
                        ImageIcon successIcon = new ImageIcon(getClass().getResource("/com/pointofsale/src/check.png"));
                        JOptionPane.showMessageDialog(null, "Barang Berhasil Ditambahkan !", "Sukses !", JOptionPane.INFORMATION_MESSAGE,successIcon);
                        
                                
                        //menampilkan data barang ketika icon diklik
                        container_panel.removeAll();
                        container_panel.add(dataBarang_panel);
                        container_panel.repaint();
                        container_panel.revalidate();
                        getDataInfoBarang();
                        getDataTableBarang("");
                        
                    }else{
                        throw new SQLException("Data Tidak Bolehh Kosong !");
                    }
                
           }catch(SQLException err){
               JOptionPane.showMessageDialog(null, err.getMessage(), "Terjadi Kesalahan !", JOptionPane.INFORMATION_MESSAGE);
           }         
        }else{
            
            try{
                if(!input_nama_barang.getText().equals(nama_barang_lama.getText()) || 
                   !stok.getText().equals(stok_lama.getText()) ||
                   !nama_kategori.getSelectedItem().toString().equals(nama_kategori_lama.getText()) ||
                   !nama_supplier.getSelectedItem().toString().equals(nama_supplier_lama.getText()) ||
                   !harga.getText().equals(harga_lama.getText())
                   ){
                    if(!input_nama_barang.getText().equals("") && 
                       !stok.getText().equals("") &&
                       !harga.getText().equals(""))
                    {
                        
                        //lakukan update
                        String sql = "UPDATE barang SET nama_barang = ?, kategori = ?, harga = ?, stok = ?, supplier = ?, updated_at = ? WHERE kode_barang = ?";
                        PreparedStatement pst = conn.prepareStatement(sql);
                        pst.setString(1, input_nama_barang.getText());
                        
                        String sql_kategori = "SELECT id_kategori FROM kategori WHERE nama_kategori = ?";
                        PreparedStatement pst_kat = conn.prepareStatement(sql_kategori);
                        pst_kat.setString(1, nama_kategori.getSelectedItem().toString());
                        ResultSet res_kat = pst_kat.executeQuery();
                        if(res_kat.next()){
                            pst.setString(2, res_kat.getString(1));
                        }
                        
                        
                        pst.setString(3, harga.getText().replaceAll("[^a-zA-Z0-9]", "").replaceAll("[a-zA-Z]", ""));
                        pst.setString(4, stok.getText().replaceAll("[^a-zA-Z0-9]", "").replaceAll("[a-zA-Z]", ""));
                        
                        String sql_supplier = "SELECT id_supplier FROM supplier WHERE nama_supplier = ?";
                        PreparedStatement pst_sup = conn.prepareStatement(sql_supplier);
                        pst_sup.setString(1, nama_supplier.getSelectedItem().toString());
                        ResultSet res_sup = pst_sup.executeQuery();
                        if(res_sup.next()){
                            pst.setString(5, res_sup.getString(1));
                        }
                        
                        pst.setString(6, utilities.getCurrentTimeStamp());
                        pst.setString(7, input_kode.getText());
                        
                        pst.execute();
                        
                        ImageIcon successIcon = new ImageIcon(getClass().getResource("/com/pointofsale/src/check.png"));
                        JOptionPane.showMessageDialog(null, "Barang Berhasil Diperbarui !", "Sukses !", JOptionPane.INFORMATION_MESSAGE,successIcon);
                        
                                
                        //menampilkan data barang ketika icon diklik
                        container_panel.removeAll();
                        container_panel.add(dataBarang_panel);
                        container_panel.repaint();
                        container_panel.revalidate();
                        getDataInfoBarang();
                        getDataTableBarang("");
                        
                    }else{
                        throw new SQLException("Data Tidak Boleh Kosong !");
                    }
                }else{
                    throw new SQLException("Tidak Ad Perubahan, Data Sudah Terbaru !");
                }
                
            }catch(SQLException err){
                JOptionPane.showMessageDialog(null, err.getMessage(), "Terjadi Kesalahan !", JOptionPane.INFORMATION_MESSAGE);
            }
            
        }
        
    }//GEN-LAST:event_btn_simpan_dataBarang_tambahMouseClicked

    private void btn_hapus_dataBarang_tambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapus_dataBarang_tambahMouseClicked
       // hapus data barang
        String kode = input_kode_dataBarang_tambah.getText();
        try{
            int hapus = JOptionPane.showOptionDialog(null, "Apakah Anda Yakin Menghapus Barang ini ?", "Konfirmasi !", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
            System.out.println(hapus);
            if(hapus == 0){
                String sql = "DELETE FROM barang WHERE kode_barang = ?";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, kode);
                pst.execute();
                
                ImageIcon successIcon = new ImageIcon(getClass().getResource("/com/pointofsale/src/check.png"));
                JOptionPane.showMessageDialog(null, "Barang Berhasil Dihapus !", "Sukses !", JOptionPane.INFORMATION_MESSAGE,successIcon);
                
                //menampilkan data barang ketika icon diklik
                container_panel.removeAll();
                container_panel.add(dataBarang_panel);
                container_panel.repaint();
                container_panel.revalidate();
                
                getDataInfoBarang();
                getDataTableBarang("");
            }
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, "Gagal Menghapus Barang !", "Terjadi Kesalahan !", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_hapus_dataBarang_tambahMouseClicked

    private void input_search_barangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_search_barangKeyTyped
        getDataTableBarang(input_search_barang.getText());
    }//GEN-LAST:event_input_search_barangKeyTyped

    public void simpanDataToko() {
        try{
         
            String nama_toko = field_namatoko_toko.getText();
            String alamat = field_alamat_toko.getText();
            String no_telp = field_notelp_toko.getText();
            
            if(!nama_toko.equals("") && !alamat.equals("") && !no_telp.equals("")){
                
                if(!nama_toko.equals(label_namatokolama_toko.getText()) ||
                    !alamat.equals(label_alamatLama_toko.getText()) ||
                    !no_telp.equals(label_notelplama_toko.getText())){

                     String sql = "UPDATE toko SET nama_toko=?,alamat=?,no_telp=?,updated_at=? WHERE id_toko=?";
                     PreparedStatement pst = conn.prepareStatement(sql);
                     pst.setString(1, nama_toko);
                     pst.setString(2, alamat);
                     no_telp = no_telp.replaceAll("[a-zA-Z]", "");
                     if(no_telp.equals("")){
                         no_telp = "0";
                     }
                     pst.setString(3, no_telp);
                     pst.setString(4, utilities.getCurrentTimeStamp());
                     pst.setString(5, label_idToko.getText());

                     pst.execute();


                     ImageIcon successIcon = new ImageIcon(getClass().getResource("/com/pointofsale/src/check.png"));
                     JOptionPane.showMessageDialog(null, "Data Berhasil Diperbarui, Silahkan Login Kembali !", "Success !", JOptionPane.INFORMATION_MESSAGE, successIcon);
                     dispose();
                     jFrameLogin.show();

                 }else{
                    throw new Exception("Tidak Ada Perubahan, Data Sudah Terbaru !");
                 }
                
            }else{
                throw new Exception("Data Tidak Boleh Kosong !");
            }
            
        }catch(Exception err){
            JOptionPane.showMessageDialog(null, err.getMessage(), "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
         
    }
    public String[] dataKategori(){
        
        int jumlah_kategori = 0;
        String[] error = new String[1];
        
        try{
            String sql = "SELECT COUNT(id_kategori) AS jumlah_kategori FROM kategori";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet res = pst.executeQuery();
            
            if(res.next()){
                jumlah_kategori = res.getInt(1);
            }
            
        }catch(SQLException err){
            error[0] = err.getMessage();
            return error;
        }
        
        String data[] = new String[jumlah_kategori];
        try{
          String sql = "SELECT nama_kategori FROM kategori";
          PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet res = pst.executeQuery();
            int i = 0;
            while(res.next()){
                data[i] = res.getString(1);
                i++;
            }
        }catch(SQLException err){
            error[0] = err.getMessage();
            return error;
        }
        return data;
    }
    public String[] dataSupplier(){
        
        int jumlah_kategori = 0;
        String[] error = new String[1];
        
        try{
            String sql = "SELECT COUNT(id_supplier) AS jumlah_supplier FROM supplier";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet res = pst.executeQuery();
            
            if(res.next()){
                jumlah_kategori = res.getInt(1);
            }
            
        }catch(SQLException err){
            error[0] = err.getMessage();
            return error;
        }
        
        String data[] = new String[jumlah_kategori];
        try{
          String sql = "SELECT nama_supplier FROM supplier";
          PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet res = pst.executeQuery();
            int i = 0;
            while(res.next()){
                data[i] = res.getString(1);
                i++;
            }
        }catch(SQLException err){
            error[0] = err.getMessage();
            return error;
        }
        return data;
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
    private javax.swing.JButton btn_hapus_dataBarang_tambah;
    private javax.swing.JButton btn_hapus_kategori;
    private javax.swing.JButton btn_hapus_supplier;
    private javax.swing.JButton btn_reset_kategori;
    private javax.swing.JButton btn_reset_supplier;
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
    private javax.swing.JTextField input_namaSupplier_supplier;
    private javax.swing.JTextField input_nama_kategori;
    private javax.swing.JTextField input_search_barang;
    private javax.swing.JTextField input_search_kategori;
    private javax.swing.JTextField input_search_supplier;
    private javax.swing.JTextField input_stok_dataBarang_tambah;
    private javax.swing.JTextField input_textTrPenjualan;
    private javax.swing.JTextField input_tglMasuk_dataBarang_tambah;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel kasir_panel;
    private javax.swing.JLabel kode_kategori_check;
    private javax.swing.JPanel konten_Laporan;
    private javax.swing.JPanel konten_laporanTrJual;
    private javax.swing.JLabel labelIdSupplier;
    private javax.swing.JLabel labelNamaToko;
    private javax.swing.JLabel labelNamaUser;
    private javax.swing.JLabel labelTanggal;
    private javax.swing.JLabel label_TrPenjualan;
    private javax.swing.JLabel label_Username_profile;
    private javax.swing.JLabel label_Usernamelama_profile;
    private javax.swing.JLabel label_alamatLama_toko;
    private javax.swing.JLabel label_alamat_toko;
    private javax.swing.JLabel label_hargaLama_tambahBarang;
    private javax.swing.JLabel label_harga_dataBarang_tambah;
    private javax.swing.JLabel label_idToko;
    private javax.swing.JLabel label_idUser_profile;
    private javax.swing.JLabel label_kategori;
    private javax.swing.JLabel label_kategoriLama_tambahBarang;
    private javax.swing.JLabel label_kategori_dataBarang_tambah;
    private javax.swing.JLabel label_kodeLama_tambahBarang;
    private javax.swing.JLabel label_kode_dataBarang_tambah;
    private javax.swing.JLabel label_kode_kategori;
    private javax.swing.JLabel label_kode_supplier;
    private javax.swing.JLabel label_konfirmasipassword_profile;
    private javax.swing.JLabel label_konfirmasipasswordlama_profile;
    private javax.swing.JLabel label_listuser;
    private javax.swing.JLabel label_loginterbaru_profile;
    private javax.swing.JLabel label_namaBarang_dataBarang_tambah;
    private javax.swing.JLabel label_namaBarang_tambahBarang;
    private javax.swing.JLabel label_namaSupplier;
    private javax.swing.JLabel label_namaSupplier_kategori;
    private javax.swing.JLabel label_namaSupplier_supplier;
    private javax.swing.JLabel label_namabelakang_profile;
    private javax.swing.JLabel label_namabelakanglama_profile;
    private javax.swing.JLabel label_namadepan_profile;
    private javax.swing.JLabel label_namadepanlama_profile;
    private javax.swing.JLabel label_namatoko_toko;
    private javax.swing.JLabel label_namatokolama_toko;
    private javax.swing.JLabel label_nilaiTotal;
    private javax.swing.JLabel label_nohp_profile;
    private javax.swing.JLabel label_nohplama_profile;
    private javax.swing.JLabel label_notelp_toko;
    private javax.swing.JLabel label_notelplama_toko;
    private javax.swing.JLabel label_passwordLama_profile;
    private javax.swing.JLabel label_profile;
    private javax.swing.JLabel label_profile2_logo;
    private javax.swing.JLabel label_profile_logo;
    private javax.swing.JLabel label_role_profile;
    private javax.swing.JLabel label_rp_dataBarang_tambah;
    private javax.swing.JLabel label_stokLama_tambahBarang;
    private javax.swing.JLabel label_stok_dataBarang_tambah;
    private javax.swing.JLabel label_suplier;
    private javax.swing.JLabel label_supplierLama_tambahBarang;
    private javax.swing.JLabel label_supplier_dataBarang_tambah;
    private javax.swing.JLabel label_tglMasuk_dataBarang_tambah;
    private javax.swing.JLabel label_toko;
    private javax.swing.JLabel label_toko2_logo;
    private javax.swing.JLabel label_toko_logo;
    private javax.swing.JLabel label_totalBarang;
    private javax.swing.JLabel label_ubahpassword_profile;
    private javax.swing.JLabel label_update_toko;
    private javax.swing.JPanel laporan_panel;
    private javax.swing.JLabel nama_kategore_check;
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
    private javax.swing.JTable table_databarang;
    private javax.swing.JTable table_listuser;
    private javax.swing.JTable table_order;
    // End of variables declaration//GEN-END:variables
    class RoundedPanel extends JPanel{
        private Color backgroundColor;
        private int cornerRadius = 15;
        
        public RoundedPanel(LayoutManager layout, int radius ) {
            super(layout);
            cornerRadius = radius;
        }
        
        public RoundedPanel(LayoutManager layout, int radius, Color bgColor){
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        
        public RoundedPanel(int radius){
            super();
            cornerRadius = radius;
        }
        
        public RoundedPanel(int radius, Color bgColor){
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width =getWidth();
            int height = getHeight();
            Graphics2D grapich =  (Graphics2D) g;
            grapich.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
            if(backgroundColor != null){
                grapich.setColor(backgroundColor);
            }else{
                grapich.setColor(getBackground());
            }
            
            grapich.fillRoundRect(0,0, width-1, height-1, arcs.width, arcs.height);
            grapich.setColor(getForeground());
            
        }
        
    }
}
