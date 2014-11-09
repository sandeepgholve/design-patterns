package com.sandeep.designpatterns.command.remote;

/**
 * Created by sandeep on 10/11/14.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {

    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
