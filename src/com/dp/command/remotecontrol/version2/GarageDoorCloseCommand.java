package com.dp.command.remotecontrol.version2;

/**
 * Created by sandeep on 23/8/15.
 */
public class GarageDoorCloseCommand implements Command {
    private Garage garage;

    public GarageDoorCloseCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.lightOff();
        garage.down();
        garage.stop();
    }
}
