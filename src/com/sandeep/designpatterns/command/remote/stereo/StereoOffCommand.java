package com.sandeep.designpatterns.command.remote.stereo;

import com.sandeep.designpatterns.command.remote.Command;

/**
 * Created by sandeep on 10/11/14.
 */
public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
