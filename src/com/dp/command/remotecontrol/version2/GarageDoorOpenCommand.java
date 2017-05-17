package com.dp.command.remotecontrol.version2;

/**
 * Created by sandeep on 23/8/15.
 */
public class GarageDoorOpenCommand implements Command {
    private Garage garage;

    public GarageDoorOpenCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.up();
        garage.stop();
        garage.lightOn();
    }
}
