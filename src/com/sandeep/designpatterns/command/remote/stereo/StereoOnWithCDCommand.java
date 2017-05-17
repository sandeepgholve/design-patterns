package com.sandeep.designpatterns.command.remote.stereo;

import com.sandeep.designpatterns.command.remote.Command;

/**
 * Created by sandeep on 10/11/14.
 */
public class StereoOnWithCDCommand implements Command {
    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(10);
    }
}
