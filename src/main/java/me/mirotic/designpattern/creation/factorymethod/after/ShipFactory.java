package me.mirotic.designpattern.creation.factorymethod.after;

import me.mirotic.designpattern.creation.factorymethod.Ship;

import java.util.Objects;


/**
 * Creator
 * 구체적으로 어떤 인스턴스를 만들지는 서브 클래스가 정한다.
 */
public interface ShipFactory {

    default Ship order(String name, String email) {
        validate(name, email);
        prepare(name);
        Ship ship = create(name);
        complete(name, email);
        return ship;
    }

    private void validate(String name, String email) {
        if (Objects.isNull(name) || name.isBlank()) {
            throw new IllegalArgumentException("this name is blank.");
        }
        if (Objects.isNull(email) || email.isBlank()) {
            throw new IllegalArgumentException("this email is blank.");
        }
    }

    private void prepare(String name) {
        System.out.println(name + " ship is being prepared");
    }

    Ship create(String name);

    private void complete(String name, String email) {
        System.out.println(name + " ship is completed. send to " + email);
    }
}
