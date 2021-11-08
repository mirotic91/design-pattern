package me.mirotic.designpattern.creation.factorymethod.after;

import me.mirotic.designpattern.creation.factorymethod.Ship;


/**
 * Concrete Product
 */
public class WhiteShip extends Ship {

    public WhiteShip(String name) {
        setName(name);
        setColor("white");
        setLogo("🛳");
    }
}
