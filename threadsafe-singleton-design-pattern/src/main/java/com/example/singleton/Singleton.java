package com.example.singleton;

/* Author You tube Channel Handle  @javafullstack2023.
 * https://www.youtube.com/@javafullstack2023/playlists
 *  */

public class Singleton {

	/*
	The volatile keyword is used on the instance variable. This ensures that changes made by one thread to the instance are 
	visible to other threads. Without volatile, there is a potential risk of other threads seeing a partially initialized instance.
	*/
    
    private static volatile Singleton instance;
    
    
    

    // Private constructor to prevent instantiation from outside the class
    private Singleton() {
    	System.out.println("Singleton Constructor Invoked..");
    }

/* 
The outer if (instance == null) checks if an instance already exists. If no instance exists, it proceeds to the synchronized block.
Inside the synchronized block, the instance is checked again within the synchronized context to ensure that only one thread 
creates the instance. This is the double-check.
*/
    
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    // Double-checked locking: check if the instance is null before creating it
                	instance = new Singleton();
                	System.out.println("Singleton instance is created first time by thread -->" + Thread.currentThread());
                    try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                }
            }
        }
        return instance;
    }
    
 
    
    
    // Other methods, if any
    public void doSomething() {
        System.out.println("Singleton is doing something.");
    }

 
}
