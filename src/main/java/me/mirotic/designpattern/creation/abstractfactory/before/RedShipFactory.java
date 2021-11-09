package me.mirotic.designpattern.creation.abstractfactory.before;

import me.mirotic.designpattern.creation.factorymethod.Ship;
import me.mirotic.designpattern.creation.factorymethod.after.RedShip;
import me.mirotic.designpattern.creation.factorymethod.after.ShipFactory;


public class RedShipFactory implements ShipFactory {

    @Override
    public Ship create(String name) {
        Ship redShip = new RedShip(name);
        redShip.setAnchor(new RedAnchor());
        redShip.setWheel(new RedWheel());
        return redShip;
    }
}
