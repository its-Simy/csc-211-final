package org.example.csc211final;

public class ExpressPassenger extends Passenger{
    @Override
    public boolean requestElevator(direction _direction, SimulationSettings _settings) {

        //this has to call an elevator
        return false;
    }
}
