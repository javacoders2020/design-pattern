/* Author You tube Channel Handle  @javafullstack2023.
 * https://www.youtube.com/@javafullstack2023/playlists 
*  Factory Interface for returning factory of Objects
*  Please use Java 11
*  */

package com.example.bankfactoryInterface;

import com.example.bankInterface.BankAccount;

public interface BankFactoryInterface {

	public BankAccount OpenAccount(String AccountType);
}
