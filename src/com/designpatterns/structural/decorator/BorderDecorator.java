package com.designpatterns.structural.decorator;

/**
 * Created by ryang on 11/06/2017.
 */
public class BorderDecorator extends Decorator {
    public BorderDecorator(Widget widget) {
        super(widget);
    }

    public void draw() {
        super.draw();
        System.out.println("BorderDecorator");
    }
}
