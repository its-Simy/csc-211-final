package org.example.csc211final;

public class StandardElevator extends Elevator{
    @Override
    public boolean move(direction _direction) {
        if(_direction == direction.UP){

        }
        else if(_direction == direction.DOWN)
        {

        }
        else{
            System.out.println("Incorrect Input");
            return false;
        }
        return true;
    }
}
