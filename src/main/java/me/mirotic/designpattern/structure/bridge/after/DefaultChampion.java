package me.mirotic.designpattern.structure.bridge.after;

import me.mirotic.designpattern.structure.bridge.before.Champion;


/**
 * Abstraction
 */
public class DefaultChampion implements Champion {

    private Skin skin;
    private String name;

    public DefaultChampion(Skin skin, String name) {
        this.skin = skin;
        this.name = name;
    }


    @Override
    public void move() {
        System.out.println(String.format("%s %s move.", skin.getName(), name));
    }

    @Override
    public void hold() {
        System.out.println(String.format("%s %s hold.", skin.getName(), name));
    }

    @Override
    public void attack() {
        System.out.println(String.format("%s %s attack!!", skin.getName(), name));
    }
}
