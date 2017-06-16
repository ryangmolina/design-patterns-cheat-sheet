package com.designpatterns.behavioral.observer;

/**
 * Created by ryang on 12/06/2017.
 */
public class Lighting implements AlarmListener {
    @Override
    public void alarm() {
        System.out.print("lights up");
    }
}
