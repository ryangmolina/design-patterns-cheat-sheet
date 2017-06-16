package com.designpatterns.behavioral.observer;

/**
 * Created by ryang on 12/06/2017.
 */
public class Surveillance extends CheckList implements AlarmListener {
    public void alarm() {
        System.out.println("Surveillance - by the numbers:");
        byTheNumbers();
    }

    protected void isolate() {
        System.out.println("   train the cameras");
    }
}
