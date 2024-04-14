package org.example.csc211final;

public class AddElevator extends Elevator{

    AddElevator(){
    elevatorType = "";
    maximumCapacity = 8;
    elevatorRequestPercentage =  0;
    
}










    @Override
    public boolean move(direction _direction) {
        return false;
    }
}
