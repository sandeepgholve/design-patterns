package com.sandeep.designpatterns.command.remote.stereo;

/**
 * Created by sandeep on 10/11/14.
 */
public class Stereo {
    public void on() {
        System.out.println("Stereo On");
    }

    public void off() {
        System.out.println("Stereo Off");
    }

    public void setCD() {
        System.out.println("Stereo Set CD");
    }

    public void setVolume(int volume) {
        System.out.println("Stereo volume set to " + volume);
    }
}
