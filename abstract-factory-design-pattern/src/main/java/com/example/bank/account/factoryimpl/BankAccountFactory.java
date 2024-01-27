/* Author You tube Channel Handle  @javafullstack2023.
 * https://www.youtube.com/@javafullstack2023/playlists
 *  Bank Account Factory which return the various accounts of BankAccount Interface
 *  */

package com.example.bank.account.factoryimpl;

import com.example.bank.account.factoryinterface.BankAccountFactoryInterface;
import com.example.bank.account.impl.CurrentAccount;
import com.example.bank.account.impl.FixedAccount;
import com.example.bank.account.impl.SavingAccount;
import com.example.bank.account.interfaces.BankAccount;

public class BankAccountFactory implements  BankAccountFactoryInterface{

	  public BankAccount AccountType(String AccountType)
	    {
	        if (AccountType == null || AccountType.isEmpty())
	            return null;
	        switch (AccountType.toLowerCase()) {
	        case "saving":
	            return new SavingAccount();
	        case "current":
	            return new CurrentAccount();
	        case "fixed":
	            return new FixedAccount();
	        default:
	            throw new IllegalArgumentException("Unknown Account Type ");
	        }
	
}


}