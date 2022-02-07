package me.mirotic.designpattern.behavior.command.before;

public class ButtonBefore {

    private Light light;

    public ButtonBefore(Light light) {
        this.light = light;
    }

    public void pressOn() {
        this.light.on();
    }

    public void pressOff() {
        this.light.off();
    }
}
