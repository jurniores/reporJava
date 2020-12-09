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
public class BrazilInterestService implements InterestService{
    private double interestRate;
    
    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }
    
   

    @Override
    public double getInterestRate() {
        return interestRate;
    }
    
}
