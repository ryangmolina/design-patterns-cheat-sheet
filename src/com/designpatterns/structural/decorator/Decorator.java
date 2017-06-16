package com.designpatterns.structural.decorator;

/**
 * Created by ryang on 11/06/2017.
 */
public abstract class Decorator implements Widget{
    private Widget widget;

    public Decorator(Widget widget) {
        this.widget = widget;
    }

    public void draw() {
        widget.draw();
    }
}
