/* Author You tube Channel Handle  @javafullstack2023.
 * https://www.youtube.com/@javafullstack2023/playlists
 *  Bank Fund Transfer Factory which return the various types of FundTransfer Objects of Type BankFundTransferInterface
 *  */

package com.example.bank.fundtransfer.factoryimpl;

import com.example.bank.fundtransfer.factoryinterface.BankFundTransferFactoryInterface;
import com.example.bank.fundtransfer.impl.IMPS;
import com.example.bank.fundtransfer.impl.NEFT;
import com.example.bank.fundtransfer.impl.RTGS;
import com.example.bank.fundtransfer.interfaces.BankFundTransferInterface;

public class BankFundTransferFactory implements  BankFundTransferFactoryInterface{

	public BankFundTransferInterface FundTransferType(String FundType)
	    {
	        if (FundType == null || FundType.isEmpty())
	            return null;
	        switch (FundType.toLowerCase()) {
	        case "imps":
	            return new IMPS();
	        case "neft":
	            return new NEFT();
	        case "rtgs":
	            return new RTGS();
	        default:
	            throw new IllegalArgumentException("Unknown Transfer Type ");
	        }
	
}



}