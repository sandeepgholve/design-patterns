package com.sandeep.designpatterns.command.remote.light;

import com.sandeep.designpatterns.command.remote.Command;

/**
 * Created by sandeep on 10/11/14.
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
