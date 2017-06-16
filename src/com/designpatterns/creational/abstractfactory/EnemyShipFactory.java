package com.designpatterns.creational.abstractfactory;

/**
 * Created by ryang on 07/06/2017.
 */
public interface EnemyShipFactory {

    public EnemyShipWeapon addGun();
    public EnemyShipEngine addEngine();

}
