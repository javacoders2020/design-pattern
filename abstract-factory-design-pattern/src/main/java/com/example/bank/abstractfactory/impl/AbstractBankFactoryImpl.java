/* Author You tube Channel Handle  @javafullstack2023.
 * https://www.youtube.com/@javafullstack2023/playlists 
*  AbstractBankFactoryImplementation returning BankAccountFactory and BankFundTransferFactory objects
*  Please use Java 11
*  */


package com.example.bank.abstractfactory.impl;

import com.example.bank.abstractfactory.interfaces.AbstractBankFactoryInterface;
import com.example.bank.account.factoryimpl.BankAccountFactory;
import com.example.bank.account.factoryinterface.BankAccountFactoryInterface;
import com.example.bank.fundtransfer.factoryimpl.BankFundTransferFactory;
import com.example.bank.fundtransfer.factoryinterface.BankFundTransferFactoryInterface;

public class AbstractBankFactoryImpl implements AbstractBankFactoryInterface {

	
	public BankAccountFactoryInterface getBankAccountFactory() {
		
		return new BankAccountFactory();
	}

	
	public BankFundTransferFactoryInterface getBankFundTransferFactory() {
	
		return new BankFundTransferFactory();
	}

	


}
