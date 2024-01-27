/* Author You tube Channel Handle  @javafullstack2023.
 * https://www.youtube.com/@javafullstack2023/playlists 
*  Bank Account Factory Interface for returning factory of Objects
*  
*  */

package com.example.bank.account.factoryinterface;

import com.example.bank.account.interfaces.BankAccount;

public interface BankAccountFactoryInterface {

	public BankAccount AccountType(String AccountType);
}
