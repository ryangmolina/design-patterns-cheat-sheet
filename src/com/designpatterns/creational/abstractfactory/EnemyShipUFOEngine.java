package com.designpatterns.creational.abstractfactory;

/**
 * Created by ryang on 07/06/2017.
 */
public class EnemyShipUFOEngine implements EnemyShipEngine {
    @Override
    public void showSpeed() {
       System.out.println("10 mph");
    }
}
