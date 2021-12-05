/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pointofsale;

import static com.pointofsale.Dashboard.conn;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class TambahKategori {
    
    public String kondisi;
    public String kode_kategori;
    
    Dashboard dasbord = new Dashboard("","", 0);
    public TambahKategori(String aksi , String kode){
        this.kondisi=aksi ;
        this.kode_kategori=kode;
        
        if(aksi.equals("tambah")){
            
        try{    
        String sql = "INSERT INTO kategori VALUES (?, ?)";
       
        PreparedStatement pst = conn.prepareStatement(sql);
        
        pst.setString(1, dasbord.input_kategori_kode);
       
        //mengambil kode suplier terbaru yang belum dipakai
        input_kode_kategori.setText(this.kodeKategori);
        if(!input_kategori_nama.equals("")&&(!input_kategori_nama.equals(" "))){
            pst.setString(2, input_kategori_nama.toUpperCase());
        }
        else{
            throw  new SQLException("Data tidak boleh kosong");
        }
        //eksekusi prepare statement
        pst.execute();
        //image sucses
        ImageIcon successIcon = new ImageIcon(getClass().getResource("/com/pointofsale/src/check.png"));
        JOptionPane.showMessageDialog(null, "Kategori Berhasil Ditambahkan !", "Sukses !", JOptionPane.INFORMATION_MESSAGE,successIcon);
        
            } catch (Exception e) {
            }
        }
    }
    
    
}
