/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pointofsale;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author ALPHA
 */
public class Utilities {
    
    public String getTime(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
        String dateTime = sdf.format(date);
        
        return dateTime;
    }
//    
//    Timer t;
//    SimpleDateFormat df;
    
    public String getCurrentTimeStamp(){
        
         final SimpleDateFormat waktu = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         Timestamp timestamp = new Timestamp(System.currentTimeMillis());
         return waktu.format(timestamp);
         
    }
    
}
