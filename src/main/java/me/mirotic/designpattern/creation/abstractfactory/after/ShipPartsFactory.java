package me.mirotic.designpattern.creation.abstractfactory.after;


public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();
}
