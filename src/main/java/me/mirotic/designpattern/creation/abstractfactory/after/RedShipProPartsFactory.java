package me.mirotic.designpattern.creation.abstractfactory.after;


public class RedShipProPartsFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new RedAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new RedWheelPro();
    }
}
