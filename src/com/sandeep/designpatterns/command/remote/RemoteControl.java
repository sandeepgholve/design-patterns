package com.sandeep.designpatterns.command.remote;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sandeep on 10/11/14.
 */
public class RemoteControl {
    List<Command> onCommands;
    List<Command> offCommands;

    public RemoteControl() {
        onCommands = new ArrayList<Command>();
        offCommands = new ArrayList<Command>();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands.add(slot, onCommand);
        offCommands.add(slot, offCommand);
    }

    public void onButtonWasPushed(int slot) {
        onCommands.get(slot).execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands.get(slot).execute();
    }

    @Override
    public String toString() {
        return "RemoteControl{" +
                "onCommands=" + onCommands +
                ", offCommands=" + offCommands +
                '}';
    }
}
