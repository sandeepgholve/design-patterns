package com.sandeep.designpatterns.command.remote;

import com.sandeep.designpatterns.command.remote.garage.Garage;
import com.sandeep.designpatterns.command.remote.garage.GarageDoorOpenCommand;
import com.sandeep.designpatterns.command.remote.light.Light;
import com.sandeep.designpatterns.command.remote.light.LightOnCommand;

/**
 * Created by sandeep on 10/11/14.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        Garage garage = new Garage();

        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand doorOpenCommand = new GarageDoorOpenCommand(garage);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        remote.setCommand(doorOpenCommand);
        remote.buttonWasPressed();
    }
}
