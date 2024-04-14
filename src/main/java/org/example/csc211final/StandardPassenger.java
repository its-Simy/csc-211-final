package org.example.csc211final;

public class StandardPassenger extends Passenger {


    @Override
    public boolean requestElevator(direction _direction, SimulationSettings _settings) {
    //This has to call elevator

        return false;
    }
}
