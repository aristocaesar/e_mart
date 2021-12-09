/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pointofsale;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

/**
 *
 * @author Acer
 */
public class KonfirmasiBayar extends javax.swing.JFrame {

    /**
     * Creates new form KonfirmasiBayar
     */
     public static java.sql.Connection conn = (Connection)Database.configDB();
     public static Utilities utilities = new Utilities();
    String Data[][];
    String total_belanja;
    
    public KonfirmasiBayar(String[][] data) {
        this.setResizable(false);
        initComponents();
        
        this.setTitle("Konfirmasi Pembayaran");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/pointofsale/src/trolley.png")));
        
        // set total belanja
        int total_belanja = 0;
        for(int i = 0; i < data.length; i++){
            total_belanja = total_belanja + Integer.parseInt(data[i][6]);
        }
        
        input_total_belanja.setText(""+total_belanja);
        this.total_belanja = ""+total_belanja;
        
        this.Data = data;
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_diskon = new javax.swing.JLabel();
        label_total_belanja = new javax.swing.JLabel();
        label_bayar = new javax.swing.JLabel();
        label_total_kembalian = new javax.swing.JLabel();
        input_bayar = new javax.swing.JTextField();
        total_kembalian = new javax.swing.JLabel();
        input_total_belanja = new javax.swing.JLabel();
        btn_konfirmasiPembayaran = new javax.swing.JButton();
        input_diskon = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        label_diskon.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        label_diskon.setText("Diskon =");

        label_total_belanja.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        label_total_belanja.setText("Total Belanja =");

        label_bayar.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        label_bayar.setText("Bayar =");

        label_total_kembalian.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        label_total_kembalian.setText("Total Kembalian =");

        input_bayar.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        input_bayar.setText("0");
        input_bayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_bayarKeyTyped(evt);
            }
        });

        total_kembalian.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        total_kembalian.setText("0");

        input_total_belanja.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        input_total_belanja.setText("0");

        btn_konfirmasiPembayaran.setBackground(new java.awt.Color(73, 148, 255));
        btn_konfirmasiPembayaran.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btn_konfirmasiPembayaran.setForeground(new java.awt.Color(255, 255, 255));
        btn_konfirmasiPembayaran.setText("KONFIRMASI PEMBAYARAN");
        btn_konfirmasiPembayaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_konfirmasiPembayaranMouseClicked(evt);
            }
        });

        input_diskon.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        input_diskon.setText("0");
        input_diskon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_diskonKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_konfirmasiPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_total_kembalian, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(label_diskon, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(label_bayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_total_belanja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input_bayar, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(total_kembalian, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                    .addComponent(input_total_belanja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(input_diskon))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_diskon)
                    .addComponent(input_diskon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_total_belanja)
                    .addComponent(input_total_belanja))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_bayar)
                    .addComponent(input_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_total_kembalian)
                    .addComponent(total_kembalian))
                .addGap(31, 31, 31)
                .addComponent(btn_konfirmasiPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void input_diskonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_diskonKeyTyped
        // TODO add your handling code here:
        int diskon = 0;
        String nilai_input_diskon = input_diskon.getText().replaceAll("[^0-9]", "");
        if(!nilai_input_diskon.equals("")){
            diskon = Integer.parseInt(nilai_input_diskon);
        }
        
        int harga = Integer.parseInt(this.total_belanja);
        int diskon_new = harga*diskon/100;
        int res_diskon = harga-diskon_new;
        
        input_total_belanja.setText(String.valueOf(res_diskon));
    }//GEN-LAST:event_input_diskonKeyTyped

    private void input_bayarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_bayarKeyTyped
        // TODO add your handling code here:
        int bayar = 0;
        String nilai_bayar = input_bayar.getText().replaceAll("[^0-9]", "");
        
        if(!nilai_bayar.equals("")){
            bayar = Integer.parseInt(nilai_bayar);
        }
        
        int total_belanja = Integer.parseInt(input_total_belanja.getText());
        int hasil = bayar-total_belanja;
        
        total_kembalian.setText(""+hasil);
    }//GEN-LAST:event_input_bayarKeyTyped

    private void btn_konfirmasiPembayaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_konfirmasiPembayaranMouseClicked
        // masukkan ke database
        Random ran = new Random();
        String transaksi = "TR"+ran.nextInt(1000000000);
        
        //buat transaksi
        try{
            String sql_transaksi = "INSERT INTO transaksi VALUES(?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql_transaksi);
            pst.setString(1, transaksi);
            pst.setString(2, input_diskon.getText());
            pst.setString(3, input_total_belanja.getText());
            pst.setString(4, input_bayar.getText());
            pst.setString(5, "U001");
            pst.setString(6, utilities.getCurrentTimeStamp());
            
            pst.execute();
        }catch(SQLException err){
            System.out.println(err.getMessage());
        }
        
        
        for(int i = 0; i < this.Data.length; i++){
            
//            System.out.println(this.Data[i][0]);
//            System.out.println(this.Data[i][1]);
//            System.out.println(this.Data[i][2]);
//            System.out.println(this.Data[i][3]);
//            System.out.println(this.Data[i][4]);
//            System.out.println(this.Data[i][5]);
//            System.out.println(this.Data[i][6]);
            
            //masukkan ke detail transaksi
            try{
                String sql_transaksi = "INSERT INTO transaksi_detail VALUES(?, ?, ?, ?)";
                PreparedStatement pst_d_transaksi = conn.prepareStatement(sql_transaksi);
                pst_d_transaksi.setString(1, transaksi);
                pst_d_transaksi.setString(2, this.Data[i][4]);
                pst_d_transaksi.setString(3, this.Data[i][6]);
                pst_d_transaksi.setString(4, this.Data[i][0]);
                pst_d_transaksi.execute();
                
                // update pada databara
                int new_stok = Integer.parseInt(this.Data[i][3]) - Integer.parseInt(this.Data[i][4]);
                String sql = "UPDATE barang SET stok = '"+String.valueOf(new_stok)+"' WHERE kode_barang = '"+this.Data[i][0]+"'";
                PreparedStatement pst_barang = conn.prepareStatement(sql);
                pst_barang.execute();
                
            }catch(SQLException err){
                System.out.println(err.getMessage());
            }
            
        }
        
        System.out.println("Berhasil !");
    }//GEN-LAST:event_btn_konfirmasiPembayaranMouseClicked

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
            java.util.logging.Logger.getLogger(KonfirmasiBayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonfirmasiBayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonfirmasiBayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonfirmasiBayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new KonfirmasiBayar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_konfirmasiPembayaran;
    private javax.swing.JTextField input_bayar;
    private javax.swing.JTextField input_diskon;
    private javax.swing.JLabel input_total_belanja;
    private javax.swing.JLabel label_bayar;
    private javax.swing.JLabel label_diskon;
    private javax.swing.JLabel label_total_belanja;
    private javax.swing.JLabel label_total_kembalian;
    private javax.swing.JLabel total_kembalian;
    // End of variables declaration//GEN-END:variables
}
