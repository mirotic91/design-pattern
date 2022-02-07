package me.mirotic.designpattern.behavior.command.before;

public class Light {

    private boolean power;

    public void on() {
        System.out.println("Light On");
        this.power = true;
    }

    public void off() {
        System.out.println("Light Off");
        this.power = false;
    }

}
