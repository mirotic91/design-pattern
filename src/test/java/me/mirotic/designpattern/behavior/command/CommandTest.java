package me.mirotic.designpattern.behavior.command;

import me.mirotic.designpattern.behavior.command.after.ButtonAfter;
import me.mirotic.designpattern.behavior.command.after.LightOnCommand;
import me.mirotic.designpattern.behavior.command.before.ButtonBefore;
import me.mirotic.designpattern.behavior.command.before.Light;
import org.junit.jupiter.api.Test;

class CommandTest {

    @Test
    void before() {
        ButtonBefore button = new ButtonBefore(new Light());
        button.pressOn();
        button.pressOff();
        button.pressOff();
    }

    @Test
    void after() {
        ButtonAfter button = new ButtonAfter();
        button.press(new LightOnCommand(new Light()));
        button.undo();
        button.undo();
    }
}