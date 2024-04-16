package org.example.csc211final;

import java.util.ArrayList;

public class SimulationSettings {
    public static int floors;
    public ArrayList<AddPassenger> add_passenger = new ArrayList<>();
    public ArrayList<PassengerRequestPercentage> passenger_request_percentage = new ArrayList<>();
    public ArrayList<AddElevator> add_elevator = new ArrayList<>();
    public ArrayList<ElevatorRequestPercentage> elevator_request_percentage = new ArrayList<>();
   // public ArrayList<Elevator> Elevator_create = new ArrayList<>(floors);
    public int elevatorfloorCount;
    public int number_of_elevators;
    public int run_simulation;

    @Override
    public String toString() {
        return super.toString();
    }


    public static int getFloors() {
        return floors;
    }

    /*
    public static int getElevatorfloorCount() {
        return elevatorfloorCount;
    }
    */

}







