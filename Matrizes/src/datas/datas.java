/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


/**
 *
 * @author Antonio
 */
public class datas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(sdf.format(d));
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();
        int minutes = cal.get(Calendar.MINUTE);
        int month = cal.get(Calendar.MONTH)+ 1 ;
        System.out.println(month);
        System.out.println(minutes);
        
        System.out.println(sdf.format(d));
        
                
        
        /*SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("25/06/2018 15:42:07");
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        
        
        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = new Date(0L);
        Date x4 = new Date(1000L * 60L * 60L * 5L);
        System.out.println("------------");
        System.out.println(sdf2.format(y3));
        System.out.println(sdf2.format(x4));
        System.out.println(sdf2.format(x2));
        System.out.println(sdf2.format(x1));
        System.out.println(sdf2.format(x3));
        System.out.println(sdf2.format(y1));
        System.out.println(sdf2.format(y2));
        System.out.println("------------");
        System.out.println(sdf3.format(y3));
        System.out.println(sdf3.format(x4));
        System.out.println(sdf3.format(x2));
        System.out.println(sdf3.format(x1));
        System.out.println(sdf3.format(x3));
        System.out.println(sdf3.format(y1));
        System.out.println(sdf3.format(y2));*/
        
        
        
    }
    
}
