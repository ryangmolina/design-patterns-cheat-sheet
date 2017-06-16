package com.designpatterns.creational.abstractfactory;

/**
 * Created by ryang on 07/06/2017.
 */
public class UFOEnemyShip extends EnemyShip {

    EnemyShipFactory shipFactory;

    public UFOEnemyShip(EnemyShipFactory shipFactory) {
        this.shipFactory = shipFactory;
    }

    @Override
    void makeShip() {
        System.out.println("Making enemy ship " + getName());

        weapon = shipFactory.addGun();
        engine = shipFactory.addEngine();
    }
}
