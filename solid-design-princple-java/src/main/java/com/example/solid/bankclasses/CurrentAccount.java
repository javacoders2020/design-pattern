package com.example.solid.bankclasses;

import com.example.solid.bankinterface.BankAccount;

//Implementation for Current Account
// Implementation of single responsibility principle
public class CurrentAccount implements BankAccount {
 private double balance;

 
 public double getBalance() {
     return balance;
 }

 
 public void deposit(double amount) {
     balance += amount;
     // Additional logic specific to Current Account deposit
 }

 
 public void withdraw(double amount) {
     if (balance >= amount) {
         balance -= amount;
     } else {
         System.out.println("Overdraft not allowed");
     }
 }


}