package me.mirotic.designpattern.behavior.command.after;

import java.util.Stack;

public class ButtonAfter {

    private Stack<Command> commands = new Stack<>();

    public void press(Command command) {
        command.execute();
        this.commands.push(command);
    }

    public void undo() {
        if (!this.commands.isEmpty()) {
            Command command = this.commands.pop();
            command.undo();
        }
    }
}
