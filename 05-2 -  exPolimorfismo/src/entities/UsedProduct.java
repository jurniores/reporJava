/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Antonio
 */
public class UsedProduct extends Product{
    Date manufatureDate;
    public UsedProduct(){
        
    }

    public UsedProduct(Date manufatureDate) {
        this.manufatureDate = manufatureDate;
    }

    public UsedProduct(String name, Double price,Date manufatureDate) {
        super(name, price);
        this.manufatureDate = manufatureDate;
    }

    public Date getManufatureDate() {
        return manufatureDate;
    }

    public void setManufatureDate(Date manufatureDate) {
        this.manufatureDate = manufatureDate;
    }
    @Override
    public String priceTag(){
        Calendar cd = Calendar.getInstance();
        cd.setTime(manufatureDate);
        StringBuilder sb = new StringBuilder();
        sb.append(name+" (used) $ ");
        sb.append(price);
        sb.append(" (Manufacture date: "+sdf.format(cd.getTime())+")");
        return sb.toString();
    }

   public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
}
