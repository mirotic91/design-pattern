package me.mirotic.designpattern.structure.bridge.before;


public class LightMonk implements Champion {

    @Override
    public void move() {
        System.out.println("Light Monk move.");
    }

    @Override
    public void hold() {
        System.out.println("Light Monk hold.");
    }

    @Override
    public void attack() {
        System.out.println("Light Monk attack!!");
    }
}
