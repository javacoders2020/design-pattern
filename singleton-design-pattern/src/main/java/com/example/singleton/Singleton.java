package com.example.singleton;

/* Author You tube Channel Handle  @javafullstack2023.
 * https://www.youtube.com/@javafullstack2023/playlists
 *  */

public class Singleton {

    // The singleton instance
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside the class
    private Singleton() {
    	System.out.println("Singleton Constructor Invoked..");
    }

    // Public method to get the singleton instance
    public static Singleton getInstance() {
        // Lazy initialization: create the instance only if it doesn't exist yet
        if (instance == null) {
            instance = new Singleton();
            System.out.println("Singleton Object Created..");
        }
        return instance;
    }

    // Other methods, if any
    public void doSomething() {
        System.out.println("Singleton is doing something.");
    }

 
}
