package com.designpatterns.structural.facade;

/**
 * Created by ryang on 09/06/2017.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
