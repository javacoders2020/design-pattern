/* Author You tube Channel Handle  @javafullstack2023.
 * https://www.youtube.com/@javafullstack2023/playlists 
*  Factory Interface for returning factory of BankFundTransfer Objects
*  
*  */

package com.example.bank.fundtransfer.factoryinterface;

import com.example.bank.fundtransfer.interfaces.BankFundTransferInterface;

public interface BankFundTransferFactoryInterface {

	public BankFundTransferInterface FundTransferType(String FundType);
}
