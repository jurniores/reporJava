/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Antonio
 */
public class SavingsAccount extends Account{
    private Double interestRate;
    
    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
      balance +=balance*interestRate;
  }
    
    /**
     *
     * @param amount
     */
    @Override
    public final void withdraw(double amount){
        balance -= amount;
    }
    
}
