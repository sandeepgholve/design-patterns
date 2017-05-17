package com.dp.command.remotecontrol.version2;

/**
 * Created by sandeep on 23/8/15.
 */
public class Light {
    String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + ": Light On");
    }

    public void off() {
        System.out.println(name + ": Light Off");
    }
}
