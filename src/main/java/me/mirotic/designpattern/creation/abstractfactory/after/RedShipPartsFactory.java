package me.mirotic.designpattern.creation.abstractfactory.after;


import me.mirotic.designpattern.creation.abstractfactory.before.RedAnchor;
import me.mirotic.designpattern.creation.abstractfactory.before.RedWheel;


public class RedShipPartsFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new RedAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new RedWheel();
    }
}
