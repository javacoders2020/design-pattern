package com.example.singleton;

/* Author You tube Channel Handle  @javafullstack2023.
 * https://www.youtube.com/@javafullstack2023/playlists
 *  Eager initialization in a Singleton Design pattern
 *  
 *  */

public class Singleton {

    // The singleton instance
    // Eagerly initialized singleton instance

    private static final Singleton instance = new Singleton();

    // Private constructor to prevent instantiation from outside the class
    private Singleton() {
    	System.out.println("Singleton Constructor Invoked..");
    }

    // Public method to get the singleton instance
    public static Singleton getInstance() {
 
        return instance;
    }

    // Other methods, if any
    public void doSomething() {
        System.out.println("Singleton is doing something.");
    }

 
}
