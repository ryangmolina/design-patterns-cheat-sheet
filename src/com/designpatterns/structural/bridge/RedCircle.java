package com.designpatterns.structural.bridge;

/**
 * Concrete implementer class implementing DrawAPI
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int raidus, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + raidus + ", x: " + x + ", y: " + y);
    }
}
