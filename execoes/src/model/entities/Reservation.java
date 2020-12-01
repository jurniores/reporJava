/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import model.exceptions.DomainException;

/**
 *
 * @author Antonio
 */
public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;
    
    public Reservation(){
        
    }private static SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException{
        if (checkOut.before(checkIn)) {
                throw new DomainException("Error in reservation: Check-Out dates  must be after check-In date");
            }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }   
    
    public void updateDates(Date checkIn, Date checkOut) throws DomainException{
        Date now = new Date();
            if (checkIn.before(now) || checkOut.before(now)) {
                throw new DomainException("reservation: Reservation dates for update must be future dates");
                
            }
            if (checkOut.before(checkIn)) {
                throw new DomainException("Error in reservation: Check-Out dates  must be after check-In date");
            }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        
    }
    @Override
    public String toString(){
        return "Romm "
                +roomNumber
                +", check-In "
                +sdf.format(checkIn)
                + ", check-out: "
                + sdf.format(checkOut)
                + ", "
                + duration()
                + " nigths";
    }
    
}
