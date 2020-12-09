/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.security.InvalidParameterException;

/**
 *
 * @author Antonio
 */
public interface InterestService {
    double getInterestRate();
    
    
    default public double payment(double amount, int months) {
        if(months<1){
            throw new InvalidParameterException("Months must be greater than zero");
        }
        return amount * Math.pow(1 + getInterestRate() / 100,months);
    }
}
