package com.designpatterns.creational.abstractfactory;

/**
 * This class encapsulates the selection of factory.
 */
public class UFOEnemyShipBuilding extends EnemyShipBuilding {
    @Override
    protected EnemyShip makeEnemyShip(String type) {

        EnemyShip enemyShip = null;

        if(type.equals("UFO")) {
            EnemyShipFactory shipFactory = new UFOEnemyShipFactory();

            enemyShip = new UFOEnemyShip(shipFactory);
            enemyShip.setName("UFO Grunt ship");
        }

        return enemyShip;
    }
}
