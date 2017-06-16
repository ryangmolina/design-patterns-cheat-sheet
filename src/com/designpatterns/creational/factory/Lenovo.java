package com.designpatterns.creational.factory;

/**
 * Created by ryang on 06/06/2017.
 */
public class Lenovo implements Mobile {
    @Override
    public void cost() {
        System.out.println("Lenovo cost");
    }

    @Override
    public void pictureCapacity() {
        System.out.println("Lenovo picture");
    }

    @Override
    public void batteryPower() {
        System.out.println("Lenovo battery");
    }
}
