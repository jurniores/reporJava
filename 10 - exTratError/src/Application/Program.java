/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import model.entities.Account;
import model.exceptions.DomainException;

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
        List<Account> list = new ArrayList<>();
        
        

      try{
        System.out.println("Quantas contas são? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
        System.out.println("The Account data");
        System.out.println("Number: ");
        int number = sc.nextInt();
        System.out.println("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Initial Balance: ");
        double iBalance = sc.nextDouble();
        System.out.println("Withdraw limit");
        double withdrawLimit = sc.nextDouble();
        list.add(new Account(number,holder,iBalance,withdrawLimit));
        
    
        }
              }catch(RuntimeException e){
                  System.out.println("Ocorreu um erro inesperado! Tente novamente");
              }

        for(Account ac:list){
            try{
                System.out.println("Withdraw: ");
                double withdraw = sc.nextDouble();
                ac.withdraw(withdraw);
                System.out.println("Seu saldo é de: "+ac.getBalance());
            }catch(DomainException e){
                System.out.println("Error: "+e.getMessage());
            }catch(RuntimeException e){
                System.out.println("Ocorreu um erro inesperado");
            }
            
        }
        
    }

}
