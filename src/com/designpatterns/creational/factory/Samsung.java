package com.designpatterns.creational.factory;

/**
 * Created by ryang on 05/06/2017.
 */
public class Samsung implements Mobile {
    @Override
    public void cost() {
        System.out.println("Samsung cost");
    }

    @Override
    public void pictureCapacity() {
        System.out.println("Samsung picture");
    }

    @Override
    public void batteryPower() {
        System.out.println("Samsung battery power");
    }
}
