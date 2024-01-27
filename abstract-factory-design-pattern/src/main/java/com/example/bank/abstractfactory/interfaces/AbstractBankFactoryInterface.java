package com.example.bank.abstractfactory.interfaces;

import com.example.bank.account.factoryinterface.BankAccountFactoryInterface;
import com.example.bank.fundtransfer.factoryinterface.BankFundTransferFactoryInterface;

public interface AbstractBankFactoryInterface {

	BankAccountFactoryInterface getBankAccountFactory();
	
	BankFundTransferFactoryInterface getBankFundTransferFactory();
	
}
