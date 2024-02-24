package com.example.singleton;

/* Author You tube Channel Handle  @javafullstack2023.
 * https://www.youtube.com/@javafullstack2023/playlists
 *  */



public class Singleton {

    // Step 1 -> Static member variable to hold the single instance
    private static Singleton instance;

    // Step 2 -> Private constructor to prevent instantiation from outside the class
    private Singleton() {
    	System.out.println("Singleton Constructor Invoked..");
    }

    //  Step 3 --> Static method to access the singleton instance 
    public static Singleton getInstance() {
        // Lazy initialization: create the instance only if it doesn't exist yet
        if (instance == null) {
            instance = new Singleton();
            System.out.println("Singleton Object Created..");
        }
        return instance;
    }

    // Step 4 -->  Optional: Add other methods and fields as per requirements
    public void doSomething() {
        System.out.println("Singleton is doing something.");
    }

 
}




