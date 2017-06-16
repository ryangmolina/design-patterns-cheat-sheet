package com.designpatterns.structural.proxy;

/**
 * A class represents functionality of another class
 *
 * We create object having original object to interface its functionality to outer world.
 *
 * ProxyImage is a proxy class to reduce memory footprint of RealImage.
 * the second call doesn't need to load new RealImage.
 *
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null) {
            realImage = new RealImage(fileName);
        }

        realImage.display();
    }
}
