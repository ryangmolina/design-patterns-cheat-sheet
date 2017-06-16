package com.designpatterns.creational.singleton;

import java.io.Serializable;

/**
 * When to use: When we only to have one instance of the class.
 *              As an alternative to static class(Only if the class need to maintain state).
 */
public class Singleton implements Cloneable, Serializable {
    /**
     * Java runtime publishes half initialized variable. So we need to declare it as volatile.
     * Volatile variable will be published only when the change completes.
     */
    private static Singleton instance = null; //Lazy Initialization
    /**
     * Eager Initialization doesn't need this Double Lock Check.
     * This is needed to synchronize the getInstance in multithreaded environment.
     */
    public static Singleton getInstance() {
        if(instance == null) { // Check 1
            synchronized (Singleton.class) {
                if(instance == null) { // Check 2
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }


    private Singleton() {
        System.out.println("Creating...");
        if(instance != null) {
            throw new RuntimeException("can't create instance. Please use getInstance();");
        }
    }
    /**
     * Throws an exception when cloning since it violates the Singleton principle.
     * It doesn't match the actual object.
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    /**
     * This method is called immediately after an object of this class is deserialized.
     */
    protected Object readResolve() {
        return instance;
    }
}
