package me.mirotic.designpattern.structure.bridge.before;


public class BloodKnight implements Champion {

    @Override
    public void move() {
        System.out.println("Blood Knight move.");
    }

    @Override
    public void hold() {
        System.out.println("Blood Knight hold.");
    }

    @Override
    public void attack() {
        System.out.println("Blood Knight attack!!");
    }
}
