package com.example.bankmain;

/* Author You tube Channel Handle  @javafullstack2023.
 * https://www.youtube.com/@javafullstack2023/playlists 
*  Application Class using the Factory Method
*  Please use Java 11
*  */

import com.example.bankImpl.factory.BankAccountFactory;
import com.example.bankInterface.BankAccount;

public class BankAccountMain {

	public static void main(String[] args) {
		
		// Creating Factory Object
		BankAccountFactory bankAccountFactory = new BankAccountFactory();
       
		
		// Calling Factory Object and using the logic in it to get saving account object
		BankAccount  savingbankAccount = bankAccountFactory.OpenAccount("saving");
		savingbankAccount.openaccount();
		
		
		// Calling Factory Object and using the logic in it to get current account object
       BankAccount  currentbankAccount = bankAccountFactory.OpenAccount("current");
	   currentbankAccount.openaccount();
	   
	   // Calling Factory Object and using the logic in it to get fixed account object
       BankAccount  fixedbankAccount = bankAccountFactory.OpenAccount("fixed");
       fixedbankAccount.openaccount();
   
	
	
	}

}
