package com.designpatterns.creational.abstractfactory;

/**
 * Created by ryang on 07/06/2017.
 */
public class UFOEnemyShipFactory implements EnemyShipFactory {
    @Override
    public EnemyShipWeapon addGun() {
        return new EnemyShipUFOGun();
    }

    @Override
    public EnemyShipEngine addEngine() {
        return new EnemyShipUFOEngine();
    }
}
