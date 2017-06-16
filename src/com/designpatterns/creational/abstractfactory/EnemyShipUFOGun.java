package com.designpatterns.creational.abstractfactory;

/**
 * Created by ryang on 07/06/2017.
 */
public class EnemyShipUFOGun implements EnemyShipWeapon {
    @Override
    public void showDamage() {
        System.out.println("20 damage");
    }
}
