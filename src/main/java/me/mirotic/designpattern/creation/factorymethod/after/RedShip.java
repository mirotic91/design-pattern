package me.mirotic.designpattern.creation.factorymethod.after;

import me.mirotic.designpattern.creation.factorymethod.Ship;


/**
 * Concrete Product
 */
public class RedShip extends Ship {

    public RedShip(String name) {
        setName(name);
        setColor("red");
        setLogo("🚢");
    }
}
