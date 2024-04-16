package org.example.csc211final;

public abstract class Passenger {
    protected int startFloor;
    protected int endFloor;
    public abstract boolean requestElevator(direction _direction, SimulationSettings _settings);
    /*
    public abstract class Passenger {


    protected String passangerType;

}

//i should make an arraylist of passenger objects, that has one standard and one express person on each floor
//then the elevator is going to contain its own arraylist
     */
}
