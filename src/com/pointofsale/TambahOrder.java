/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pointofsale;

import com.mysql.jdbc.Connection;
import com.sun.glass.events.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PLAYER
 */
public class TambahOrder extends javax.swing.JFrame {

    public static java.sql.Connection conn = (java.sql.Connection)Database.configDB();
    public static DefaultTableModel tb = new DefaultTableModel();
    /**
     * Creates new form TambahOrder
     */
    public TambahOrder() {
        this.setResizable(false);
        initComponents();
        
        showDataBarang("");
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
        jLabel2 = new javax.swing.JLabel();
        input_search_order_barang = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableGetDataOrder = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tambah Data Order");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pointofsale/src/search.png"))); // NOI18N

        input_search_order_barang.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        input_search_order_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_search_order_barangActionPerformed(evt);
            }
        });
        input_search_order_barang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_search_order_barangKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(input_search_order_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(input_search_order_barang))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableGetDataOrder.setDefaultEditor(Object.class, null);
        tableGetDataOrder.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        tableGetDataOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode", "Nama Barang", "Stok", "Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableGetDataOrder.setRowHeight(30);
        tableGetDataOrder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableGetDataOrderKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tableGetDataOrder);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void input_search_order_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_search_order_barangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_search_order_barangActionPerformed

    private void input_search_order_barangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_search_order_barangKeyTyped
        // TODO add your handling code here:
        showDataBarang(input_search_order_barang.getText());
    }//GEN-LAST:event_input_search_order_barangKeyTyped

    private void tableGetDataOrderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableGetDataOrderKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            // kirimkan data ke table kasir
           DefaultTableModel model = (DefaultTableModel)tableGetDataOrder.getModel();
           int selectedRowIndex = tableGetDataOrder.getSelectedRow();
           String id_barang = model.getValueAt(selectedRowIndex, 0).toString();
           String[] data = new String[4];
           
           try{
            String sql = "SELECT kode_barang, nama_barang, harga, stok FROM barang WHERE kode_barang = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, id_barang);
            ResultSet res = pst.executeQuery();
            if(res.next()){
                data[0] = res.getString(1);
                data[1] = res.getString(2);
                data[2] = res.getString(3);
                data[3] = res.getString(4);
            }else{
                throw new SQLException("Gagal Memasukkan Barang Ke Order !");
            }
           }catch(SQLException err){
               JOptionPane.showMessageDialog(null, err.getMessage(), "Terjadi Kesalahan !", JOptionPane.INFORMATION_MESSAGE);
           }
           
           this.dispose();
           Dashboard dashboard = new Dashboard("", "", 0);
           dashboard.test = "ok";
           dashboard.pushDataOrderToMain(data);
           
        }
    }//GEN-LAST:event_tableGetDataOrderKeyPressed

    public void showDataBarang(String keyword){
        try{
            
            tb.setColumnCount(0);
            tb.addColumn("Kode");
            tb.addColumn("Nama Barang");
            tb.addColumn("Stok oke");
            tb.addColumn("Harga");

            tableGetDataOrder.setModel(tb);
            tableGetDataOrder.setEnabled(true);
            tb.setRowCount(0);
            
            String sql = "";
            if(keyword.equals("")){
                sql = "SELECT kode_barang, nama_barang, stok, harga FROM barang ORDER BY kode_barang ASC";
            }else{
                sql = "SELECT kode_barang, nama_barang, stok, harga FROM barang WHERE nama_barang LIKE '%"+keyword+"%' OR kode_barang LIKE '%"+keyword+"%' ORDER BY kode_barang ASC";
            }
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet res = pst.executeQuery();
            
            while(res.next()){
                tb.addRow(new Object[]{
                    res.getString(1),
                    res.getString(2),
                    res.getString(3),
                    res.getString(4)
                });
            }
            
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, "Gagal Memuat Data Barang !", "Terjadi Kesalahan !", JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(TambahOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField input_search_order_barang;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableGetDataOrder;
    // End of variables declaration//GEN-END:variables
}
