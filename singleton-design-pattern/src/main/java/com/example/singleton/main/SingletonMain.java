package com.example.singleton.main;

import com.example.singleton.Singleton;

public class SingletonMain {

	public static void main(String[] args) {
		
		// Will Cause Error as the Constructor is private
		//Singleton singleton = new Singleton();
		
	      // Step 5 -->  Get the singleton instance or the Singleton Object , First Time
        Singleton first = Singleton.getInstance();

        /* Step 6  -->  Use the singleton instance or the Singleton Object, 
           to call the required method */
        first.doSomething();
        
	      /* Get the singleton instance second time, constructor is not called
           and object is not created  */
        Singleton second = Singleton.getInstance();

        
        /* Use the singleton instance or the Singleton Object, 
        to call the required method again*/
        
        second.doSomething();
        
        }
}



