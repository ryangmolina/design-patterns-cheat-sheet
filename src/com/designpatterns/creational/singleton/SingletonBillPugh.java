package com.designpatterns.creational.singleton;

/**
 * Created by ryang on 05/06/2017.
 */
public class SingletonBillPugh {

    private SingletonBillPugh() {
        System.out.println("Creating...");
    }

    static class Holder {
        static final SingletonBillPugh INSTANCE = new SingletonBillPugh(); // Lazy Initialization.
    }

    public static SingletonBillPugh getInstance() {
        return Holder.INSTANCE;
    }
}
