package com.designpatterns.creational.abstractfactory;

/**
 * Created by ryang on 07/06/2017.
 */
public abstract class EnemyShip {

    private String name;

    EnemyShipWeapon weapon;
    EnemyShipEngine engine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void makeShip();

    public void followHeroShip() {

        System.out.println(getName() + " is following the hero at " + engine);

    }

    public String getInfo() {
        String shipInfo = "The " + name + " has a top speed of " + engine + " and an attack power of " + weapon;
        return shipInfo;
    }

}
