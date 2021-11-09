package me.mirotic.designpattern.creation.abstractfactory;

import me.mirotic.designpattern.creation.abstractfactory.before.RedAnchor;
import me.mirotic.designpattern.creation.abstractfactory.before.RedShipFactory;
import me.mirotic.designpattern.creation.abstractfactory.before.RedWheel;
import me.mirotic.designpattern.creation.factorymethod.Ship;
import me.mirotic.designpattern.creation.factorymethod.after.RedShip;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AbstractFactoryTest {

    @Test
    void before() {
        RedShipFactory redShipFactory = new RedShipFactory();
        Ship redShip = redShipFactory.create("bang");

        assertEquals(RedShip.class, redShip.getClass());
        assertEquals(RedAnchor.class, redShip.getAnchor().getClass());
        assertEquals(RedWheel.class, redShip.getWheel().getClass());
    }
}