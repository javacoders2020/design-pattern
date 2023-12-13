package com.example.solid.bankclasses;

import com.example.solid.bankinterface.AccountInterest;
import com.example.solid.bankinterface.BankAccount;


//Implementation for Fixed Account
//Implementation of single responsibility principle
// Interface Segregation Principle (ISP) by using 2 Interfaces for  BankAccount,AccountInterest
public class FixedAccount implements BankAccount,AccountInterest {
    private double balance;

    
    public double getBalance() {
        return balance;
    }

    
    public void deposit(double amount) {
        balance += amount;
        // Additional logic specific to Fixed Account deposit
    }

    
    public void withdraw(double amount) {
        // Fixed Account might not allow withdrawals before maturity
        System.out.println("Withdrawals not allowed before maturity");
    }


	public double calcultateInterest() {
		
		return 7;
	}
}
