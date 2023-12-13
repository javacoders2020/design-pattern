package com.example.solid.bankinterface;

public interface AccountInterest {

	 double calcultateInterest(); //Interface Segregation Principle (ISP) as Current Account does not provide Interest. 
                                 //  Will be implemented in Saving and Fixed Account Classes as both provide interest.
	
}
