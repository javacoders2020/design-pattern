/* Author You tube Channel Handle  @javafullstack2023.
 * https://www.youtube.com/@javafullstack2023/playlists 
 * Main class where we use  
*  AbstractBankFactoryImplementation for obtaining  BankAccountFactory and BankFundTransferFactory objects
*  Using these Factory Object we can get  Concrete Classes objects and then call the related functions. 
*  Please use Java 11
*  */

package com.example.bank.app.main;

import com.example.bank.abstractfactory.impl.AbstractBankFactoryImpl;
import com.example.bank.account.factoryinterface.BankAccountFactoryInterface;
import com.example.bank.account.interfaces.BankAccount;
import com.example.bank.fundtransfer.factoryinterface.BankFundTransferFactoryInterface;
import com.example.bank.fundtransfer.interfaces.BankFundTransferInterface;

public class BankAppMain {

	public static void main(String[] args) {
		
		// Obtaining the AbstractBankFactoryImpl Object
		
		AbstractBankFactoryImpl abstractBankFactoryImpl = new AbstractBankFactoryImpl();

		// Obtaining the BankAccountFactory Object from AbstractBankFactoryImpl object
		
		BankAccountFactoryInterface bankAccountFactory = abstractBankFactoryImpl.getBankAccountFactory();
		
		// Obtaining the Saving Account Concrete Object from BankAccountFactory Object and then calling the open account function
		
		BankAccount  savingbankAccount = bankAccountFactory.AccountType("saving");
		savingbankAccount.openaccount();
		
	   // Obtaining the current Account Concrete Object from BankAccountFactory Object and then calling the open account function
		
       BankAccount  currentbankAccount = bankAccountFactory.AccountType("current");
	   currentbankAccount.openaccount();
	   
	   
	  // Obtaining the BankFundTransferFactory  Object from AbstractBankFactoryImpl object
	   
	   BankFundTransferFactoryInterface bankFundTransferFactory = abstractBankFactoryImpl.getBankFundTransferFactory();
	  
	  // Obtaining the IMPS Fund Transfer Concrete Object from bankFundTransferFactory Object and then calling the FundTransferType function
	   
	   BankFundTransferInterface imps = bankFundTransferFactory.FundTransferType("imps");
	   imps.transferFunds();
	
	   // Obtaining the RTGS Fund Transfer Concrete Object from bankFundTransferFactory Object and then calling the FundTransferType function
	   
	   BankFundTransferInterface rtgs = bankFundTransferFactory.FundTransferType("rtgs");
	   rtgs.transferFunds();
	
	
	
	
	}

}
