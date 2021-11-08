package me.mirotic.designpattern.creation.factorymethod.after;

import me.mirotic.designpattern.creation.factorymethod.Ship;


/**
 * Concrete Creator -> Concrete Product
 */
public class RedShipFactory implements ShipFactory {

    @Override
    public Ship create(String name) {
        return new RedShip(name);
    }
}
