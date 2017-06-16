package com.designpatterns.creational.factory;

/**
 * When to use: When we have a super class with multiple sub-classes and based on input (dynamic), we need to return
 * one of the sub-classes. Here, we can dynamically create a specific Mobile Brand.
 */
public class MobileFactory {

    public Mobile createMobile(String type) {
        Mobile mobile = null;
        if("lenovo".equalsIgnoreCase(type)) {
            mobile = new Lenovo();
        } else if("samsung".equalsIgnoreCase(type)) {
            mobile = new Samsung();
        }

        return mobile;
    }

}
