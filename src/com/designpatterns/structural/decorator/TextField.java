package com.designpatterns.structural.decorator;

/**
 * Created by ryang on 11/06/2017.
 */
public class TextField implements Widget {
    @Override
    public void draw() {
        System.out.println("TextField");
    }
}
