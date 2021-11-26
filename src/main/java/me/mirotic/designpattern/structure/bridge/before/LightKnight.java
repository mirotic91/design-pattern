package me.mirotic.designpattern.structure.bridge.before;


public class LightKnight implements Champion {

    @Override
    public void move() {
        System.out.println("Light Knight move.");
    }

    @Override
    public void hold() {
        System.out.println("Light Knight hold.");
    }

    @Override
    public void attack() {
        System.out.println("Light Knight attack!!");
    }
}
