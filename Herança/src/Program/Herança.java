/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

/**
 *
 * @author Antonio
 */
public class Herança {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Account acc = new Account(1001,"Alex",0.0);
       BusinessAccount bacc = new BusinessAccount(1002,"Maria",0.0,500.0);
       //UPCASTING
       Account acc1 = bacc;
       acc1.getBalance();
       Account acc2 = new BusinessAccount(1003,"Bob",0.0,200.0);
       Account acc3 = new SavingsAccount(1004,"Ana",0.0,0.01);
       //DOWNCASTING
       
       BusinessAccount acc4 = (BusinessAccount)acc2;
       acc4.loan(100.0);
       if(acc3 instanceof BusinessAccount){
           BusinessAccount acc5 = (BusinessAccount)acc3;
           acc5.loan(200.0);
           System.out.println("Loan!");
       }
       if(acc3 instanceof SavingsAccount){
           SavingsAccount acc5 = (SavingsAccount)acc3;
           acc5.updateBalance();
           System.out.println("Update");
       }
       //BusinessAccount acc5 = (BusinessAccount)acc3;
       
       
    }
    
}
