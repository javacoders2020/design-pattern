package com.example.singleton.main;

import com.example.singleton.Singleton;

public class SingletonMain {

	public static void main(String[] args) {
		
		//Singleton singleton = new Singleton();
		
	      // Get the singleton instance , First Time
        Singleton first = Singleton.getInstance();

        // Use the singleton instance
        first.doSomething();
        
	      // Get the singleton instance , second Time
        Singleton second = Singleton.getInstance();

        // Use the singleton instance , second time. Constructor is is not called and object is not created.
        second.doSomething();
        
        }

}
