package me.mirotic.designpattern.creation.factorymethod;

import me.mirotic.designpattern.creation.factorymethod.after.RedShipFactory;
import me.mirotic.designpattern.creation.factorymethod.after.ShipFactory;
import me.mirotic.designpattern.creation.factorymethod.after.WhiteShipFactory;
import me.mirotic.designpattern.creation.factorymethod.before.Factory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FactoryMethodTest {

    private static final String EMAIL = "test@mail.com";


    @Test
    void before() {
        Factory factory = new Factory();

        Ship whiteShip = factory.order("bang", EMAIL, "white");
        assertEquals("🛳", whiteShip.getLogo());

        Ship redShip = factory.order("hook", EMAIL, "red");
        assertEquals("🚢", redShip.getLogo());
    }

    @Test
    void after() {
        WhiteShipFactory whiteShipFactory = new WhiteShipFactory();
        Ship whiteShip = whiteShipFactory.order("bang", EMAIL);
        assertEquals("white", whiteShip.getColor());
        assertEquals("🛳", whiteShip.getLogo());

        RedShipFactory redShipFactory = new RedShipFactory();
        Ship redShip = redShipFactory.order("hook", EMAIL);
        assertEquals("red", whiteShip.getColor());
        assertEquals("🚢", redShip.getLogo());
    }

    @Test
    void after_interface_param() {
        Ship whiteShip = orderShip(new WhiteShipFactory(), "bang");
        assertEquals("white", whiteShip.getColor());
        assertEquals("🛳", whiteShip.getLogo());

        Ship redShip = orderShip(new RedShipFactory(), "hook");
        assertEquals("red", whiteShip.getColor());
        assertEquals("🚢", redShip.getLogo());
    }

    private Ship orderShip(ShipFactory shipFactory, String name) {
        return shipFactory.order(name, EMAIL);
    }

}