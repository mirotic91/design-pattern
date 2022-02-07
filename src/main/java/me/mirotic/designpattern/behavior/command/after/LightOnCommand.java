package me.mirotic.designpattern.behavior.command.after;

import me.mirotic.designpattern.behavior.command.before.Light;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }

    @Override
    public void undo() {
        new LightOffCommand(this.light).execute();
    }
}
