package com.dp.command.remotecontrol.version1;

/**
 * Created by sandeep on 23/8/15.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
