package com.dp.command.remotecontrol.version2;

/**
 * Created by sandeep on 23/8/15.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Garage garage = new Garage();

        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);
        GarageDoorOpenCommand doorOpenCommand = new GarageDoorOpenCommand(garage);
        GarageDoorCloseCommand doorCloseCommand = new GarageDoorCloseCommand(garage);


        remote.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remote.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        remote.setCommand(2, doorOpenCommand, doorCloseCommand);

        System.out.println(remote.toString());

        remote.onButtonWasPushed(0);
        remote.onButtonWasPushed(2);
        remote.onButtonWasPushed(1);
        remote.offButtonWasPushed(2);
        remote.offButtonWasPushed(1);
        remote.offButtonWasPushed(0);
    }
}
