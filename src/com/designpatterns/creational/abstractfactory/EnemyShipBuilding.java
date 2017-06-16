package com.designpatterns.creational.abstractfactory;

/**
 * EnemyShipBuilding handles orders for new EnemyShips
 * You send it a code using the orderTheShip method &
 * it sends the order to the right factory for creation.
 */
public abstract class EnemyShipBuilding {

    protected abstract EnemyShip makeEnemyShip(String type);

    public EnemyShip orderTheShip(String type) {

        EnemyShip enemyShip = makeEnemyShip(type);

        enemyShip.makeShip();
        enemyShip.followHeroShip();

        return enemyShip;
    }

}
