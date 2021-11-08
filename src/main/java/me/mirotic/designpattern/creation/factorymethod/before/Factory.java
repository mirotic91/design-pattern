package me.mirotic.designpattern.creation.factorymethod.before;

import me.mirotic.designpattern.creation.factorymethod.Ship;

import java.util.Objects;


/**
 * Creator -> Product
 */
public class Factory {

    public Ship order(String name, String email, String color) { // color 변경에 따른 코드 변동 가능성 존재
        // validate
        if (Objects.isNull(name) || name.isBlank()) {
            throw new IllegalArgumentException("this name is blank.");
        }
        if (Objects.isNull(email) || email.isBlank()) {
            throw new IllegalArgumentException("this email is blank.");
        }

        prepare(name);

        // create
        Ship ship = new Ship();
        ship.setName(name);

        if ("white".equals(color)) {
            ship.setColor(color);
            ship.setLogo("🛳");
        } else if ("red".equals(color)) {
            ship.setColor(color);
            ship.setLogo("🚢");
        } else {
            throw new IllegalArgumentException("this color is not supported.");
        }

        complete(name, email);

        return ship;
    }

    private void prepare(String name) {
        System.out.println(name + " ship is being prepared");
    }

    private void complete(String name, String email) {
        System.out.println(name + " ship is completed. send to " + email);
    }

}
