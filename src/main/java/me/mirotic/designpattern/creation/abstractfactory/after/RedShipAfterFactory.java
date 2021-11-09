package me.mirotic.designpattern.creation.abstractfactory.after;

import me.mirotic.designpattern.creation.factorymethod.Ship;
import me.mirotic.designpattern.creation.factorymethod.after.RedShip;
import me.mirotic.designpattern.creation.factorymethod.after.ShipFactory;


public class RedShipAfterFactory implements ShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public RedShipAfterFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }


    @Override
    public Ship create(String name) {
        Ship redShip = new RedShip(name);
        redShip.setAnchor(shipPartsFactory.createAnchor());
        redShip.setWheel(shipPartsFactory.createWheel());
        return redShip;
    }
}
