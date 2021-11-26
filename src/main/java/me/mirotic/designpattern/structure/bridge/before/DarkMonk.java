package me.mirotic.designpattern.structure.bridge.before;


public class DarkMonk implements Champion {

    @Override
    public void move() {
        System.out.println("Dark Monk move.");
    }

    @Override
    public void hold() {
        System.out.println("Dark Monk hold.");
    }

    @Override
    public void attack() {
        System.out.println("Dark Monk attack!!");
    }
}
