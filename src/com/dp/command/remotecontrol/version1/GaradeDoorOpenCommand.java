package com.dp.command.remotecontrol.version1;

/**
 * Created by sandeep on 23/8/15.
 */
public class GaradeDoorOpenCommand implements Command {
    private Garage garage;

    public GaradeDoorOpenCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.up();
        garage.stop();
        garage.lightOn();
    }
}
