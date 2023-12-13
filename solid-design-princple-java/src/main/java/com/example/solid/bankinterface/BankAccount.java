package com.example.solid.bankinterface;

//Interface for Bank Account
// Open and Closed Principle: The BankAccount interface can be designed to be open for extension by allowing the addition of new account types 
//(e.g., future account types) without modifying existing code.

public interface BankAccount {
 double getBalance();
 void deposit(double amount);
 void withdraw(double amount);
 // double calcultateInterest(); /Interface Segregation Principle (ISP) as Current Account does not provide Interest. I will have 
                                 //separate  Interface for calculating calcultateInterest()
 
}
