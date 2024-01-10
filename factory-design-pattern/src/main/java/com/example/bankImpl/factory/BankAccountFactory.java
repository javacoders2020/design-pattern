/* Author You tube Channel Handle  @javafullstack2023.
 * https://www.youtube.com/@javafullstack2023/playlists
 *  Bank Account Factory which return the various accounts of BankAccount Interface based on Logic
 *  Please Use Java 11
 *  */

package com.example.bankImpl.factory;
import com.example.bankImpl.CurrentAccount;
import com.example.bankImpl.FixedAccount;
import com.example.bankImpl.SavingAccount;
import com.example.bankInterface.BankAccount;
import com.example.bankfactoryInterface.BankFactoryInterface;

public class BankAccountFactory implements  BankFactoryInterface{

	  public BankAccount OpenAccount(String AccountType)
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