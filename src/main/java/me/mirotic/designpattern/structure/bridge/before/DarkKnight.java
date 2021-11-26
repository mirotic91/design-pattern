package me.mirotic.designpattern.structure.bridge.before;


public class DarkKnight implements Champion {

    @Override
    public void move() {
        System.out.println("Dark Knight move.");
    }

    @Override
    public void hold() {
        System.out.println("Dark Knight hold.");
    }

    @Override
    public void attack() {
        System.out.println("Dark Knight attack!!");
    }
}
