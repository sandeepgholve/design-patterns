package com.dp.command.remotecontrol.version2;

/**
 * Created by sandeep on 23/8/15.
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
