package com.dp.command.remotecontrol.version2;

/**
 * Created by sandeep on 23/8/15.
 */
public class NoCommand implements Command {
    public NoCommand() { }

    @Override
    public void execute() {
        System.out.println(" Do nothing - No command");
    }
}
