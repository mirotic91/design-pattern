package me.mirotic.designpattern.creation.abstractfactory;

import me.mirotic.designpattern.creation.abstractfactory.after.*;
import me.mirotic.designpattern.creation.abstractfactory.before.RedAnchor;
import me.mirotic.designpattern.creation.abstractfactory.before.RedShipBeforeFactory;
import me.mirotic.designpattern.creation.abstractfactory.before.RedWheel;
import me.mirotic.designpattern.creation.factorymethod.Ship;
import me.mirotic.designpattern.creation.factorymethod.after.RedShip;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AbstractFactoryTest {

    @Test
    void before() {
        RedShipBeforeFactory redShipFactory = new RedShipBeforeFactory();
        Ship redShip = redShipFactory.create("bang");

        assertEquals(RedShip.class, redShip.getClass());
        assertEquals(RedAnchor.class, redShip.getAnchor().getClass());
        assertEquals(RedWheel.class, redShip.getWheel().getClass());
    }

    @Test
    void after() {
        Ship redShip = new RedShipAfterFactory(new RedShipPartsFactory()).create("bang");

        assertEquals(RedShip.class, redShip.getClass());
        assertEquals(RedAnchor.class, redShip.getAnchor().getClass());
        assertEquals(RedWheel.class, redShip.getWheel().getClass());

        Ship redShipPro = new RedShipAfterFactory(new RedShipProPartsFactory()).create("bang");

        assertEquals(RedShip.class, redShipPro.getClass());
        assertEquals(RedAnchorPro.class, redShipPro.getAnchor().getClass());
        assertEquals(RedWheelPro.class, redShipPro.getWheel().getClass());
    }
}