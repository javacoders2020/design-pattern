package com.example.solid.main;

import com.example.solid.bankclasses.CurrentAccount;
import com.example.solid.bankclasses.FixedAccount;
import com.example.solid.bankclasses.SavingAccount;
import com.example.solid.bankinterface.BankAccount;

public class BankApp {
    public static void main(String[] args) {
        
    	//Liskov Substitution Principle (LSP)
    	BankAccount savingAccount = new SavingAccount();
       
        savingAccount.deposit(1000);
        System.out.println("Saving Account Balance: " + savingAccount.getBalance());

        //Liskov Substitution Principle (LSP)
        BankAccount fixedAccount = new FixedAccount();
        fixedAccount.deposit(2000);
        System.out.println("Fixed Account Balance: " + fixedAccount.getBalance());

        BankAccount currentAccount = new CurrentAccount();
        currentAccount.deposit(1500);
        System.out.println("Current Account Balance: " + currentAccount.getBalance());
    
    }
}