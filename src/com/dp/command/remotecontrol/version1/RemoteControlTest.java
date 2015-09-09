package com.dp.command.remotecontrol.version1;

/**
 * Created by sandeep on 23/8/15.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        Garage garage = new Garage();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GaradeDoorOpenCommand doorOpenCommand = new GaradeDoorOpenCommand(garage);

        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();
        remote.setCommand(doorOpenCommand);
        remote.buttonWasPressed();
    }
}
