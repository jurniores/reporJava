/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Antonio
 */
public class Sobreposicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Java");
        /*//Classes abstratas, usando os métodos abstratos para usar poliformismo
        
        List <Account> list = new ArrayList<>();
        list.add(new SavingsAccount(1001,"Alex",500.0,0.01));
        list.add(new BusinessAccount(1002,"Maria",1000.1,400.0));
        list.add(new SavingsAccount(1004,"Bob",300.0,0.01));
        list.add(new BusinessAccount(1005,"Anna",500.0,500.0));
        
        double sum = 0.0;
        for(Account acc :list){
            sum+=acc.getBalance();
        }
        System.out.printf("Total balance: %.2f%n", sum);
        for(Account acc:list){
            acc.deposit(10);
        }
        for(Account acc : list){
            System.out.println("Updated get balance "+acc.getBalance());
        }*/
      /*Account acc1 = new Account(1001,"Alex",1000.0);
      acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());
      Account acc2 = new SavingsAccount(1002,"Maria",1000.0,0.01);
      acc2.withdraw(200);
        System.out.println(acc2.getBalance());
      Account acc3 = new BusinessAccount(1003,"Bob",1000.0,500.0);
      acc3.withdraw(200);
        System.out.println(acc3.getBalance());
     */
    }
    
}
