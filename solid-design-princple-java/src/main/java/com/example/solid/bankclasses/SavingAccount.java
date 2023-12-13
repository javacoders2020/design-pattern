package com.example.solid.bankclasses;

import com.example.solid.bankinterface.AccountInterest;
import com.example.solid.bankinterface.BankAccount;


//Implementation for Saving Account
//Implementation of single responsibility principle

public class SavingAccount implements BankAccount,AccountInterest {
    private double balance;

    
    public double getBalance() {
        return balance;
    }

    
    public void deposit(double amount) {
        balance += amount;
    }

    
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }


	public double calcultateInterest() {
		// TODO Auto-generated method stub
		return 4;
	}
}
