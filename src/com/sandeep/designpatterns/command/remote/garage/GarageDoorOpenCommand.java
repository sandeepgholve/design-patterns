package com.sandeep.designpatterns.command.remote.garage;

import com.sandeep.designpatterns.command.remote.Command;

/**
 * Created by sandeep on 10/11/14.
 */
public class GarageDoorOpenCommand implements Command {
    private Garage garage;

    public GarageDoorOpenCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.openDoor();
    }
}
