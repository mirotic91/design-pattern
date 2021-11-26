package me.mirotic.designpattern.structure.bridge.before;


public class BloodMonk implements Champion {

    @Override
    public void move() {
        System.out.println("Blood Monk move.");
    }

    @Override
    public void hold() {
        System.out.println("Blood Monk hold.");
    }

    @Override
    public void attack() {
        System.out.println("Blood Monk attack!!");
    }
}
