/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pointofsale;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    
    public String getWaktu(){
        
        
//        t = new Timer(0, new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent ae) {
////                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//                Date dt = new Date();
//                df = new SimpleDateFormat("hh:mm:ss a");
//                String dTime = df.format(dt);
//                
//                return dTime;
//            }
//            
//        });
        return "ok";
    }
    
}
