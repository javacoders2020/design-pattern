package com.example.singleton.main;

import com.example.singleton.Singleton;

public class SingletonMain {

	public static void main(String[] args) {

		   // Create three threads
        Thread thread1 = new Thread(() -> {
            Singleton singleton = Singleton.getInstance();
            singleton.doSomething();
        });

        Thread thread2 = new Thread(() -> {
            Singleton singleton = Singleton.getInstance();
            singleton.doSomething();
        });

        Thread thread3 = new Thread(() -> {
            Singleton singleton = Singleton.getInstance();
            singleton.doSomething();
        });

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
		
        
        }

}
