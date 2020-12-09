/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.BrazilInterestService;
import entities.InterestService;
import entities.UsaInterestService;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Amount: ");
        double amount = sc.nextDouble();
        System.out.println("Months: ");
        int months = sc.nextInt();
        
        InterestService is = new BrazilInterestService(1.0);
        double payment = is.payment(amount, months);
        
        System.out.println("Payment after "+months+" months: ");
        System.out.printf("%.2f", payment);
        sc.close();
        
        
        
    }
    
}
