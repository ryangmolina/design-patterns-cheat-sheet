package com.designpatterns.structural.bridge;

/**
 * Abstract class Shape using the DrawAPI interface.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
