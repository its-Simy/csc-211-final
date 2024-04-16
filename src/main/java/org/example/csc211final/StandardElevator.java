package org.example.csc211final;

import java.util.ArrayList;

public class StandardElevator extends Elevator{

    public StandardElevator(){

        elevatorType = "Standard";
        maximumCapacity = 10;
        elevatorRequestPercentage = 70;
    }

        ArrayList<SimulationSettings> sElevator = new ArrayList<>(SimulationSettings.getFloors());


    @Override
    public boolean move(direction _direction) {

        if(_direction == direction.UP ){
            return true;
        }
        else if(_direction == direction.DOWN ){
            return true;
        }
        else{
            System.out.println("Incorrect Input");
            return false;
        }
        /*
        import java.util.ArrayList;
public class StandardElevator extends Elevator{

    private int floorLocation;
    //array list of passengers that acts as the standard elevator
    public static ArrayList<Passenger> se;
    public StandardElevator(){
        floorLocation = 0;
        elevatorType = "Standard";
        maximumCapacity = 10;
        elevatorRequestPercentage = 70;
        floornum = 6;
        se = new ArrayList<>(floornum);

    }

    // this adds an elevator to the
    public void addStandardElevator(Passenger p1){

    }

    @Override
    public boolean move(direction _direction) {

        if(_direction == direction.UP && floorLocation < se.size()){

            addPassenger(se, floorLocation);
            return true;
        }
        else if(_direction == direction.DOWN ){
            return true;
        }
        else{
            System.out.println("Incorrect Input");
            return false;
        }

    }


    public void addPassenger(ArrayList<Passenger> passengers, int floorLocation) {

    }

    public void removePassenger(ArrayList<Passenger> passengers, int floorLocation) {

    }




}

         */

    }
}
