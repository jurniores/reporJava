/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import model.exceptions.DomainException;

/**
 *
 * @author Antonio
 */
public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;
    public int length;
    
    public Account(){
        
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }


    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(double balance){
        this.balance += balance;
    }
    public void withdraw(double balance) throws DomainException{
        if(balance>withdrawLimit){
            throw new DomainException("Você não pode sacar mais do que o seu limit de retirada");
        }
        if(balance>this.balance){
            throw new DomainException("Você não pode sacar mais do que o seu Saldo");
        }
        this.balance-=balance;
    }
    
    
}
