package org.example.csc211final;

public class ExpressElevator extends Elevator{

    public ExpressElevator(){
        elevatorType = "VIP";
        maximumCapacity = 8;
        elevatorRequestPercentage = 20;
    }


    @Override
    public boolean move(direction _direction) {
        if(_direction == direction.UP ){


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
    /*
    public class ExpressElevator extends Elevator{


        public ExpressElevator(){
            elevatorType = "VIP";
            maximumCapacity = 8;
            elevatorRequestPercentage = 20;


        }


        @Override
        public boolean move(direction _direction) {
            if(_direction == direction.UP ){


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


    public void addPassenger(Passenger passenger) {

    }


    public void removePassenger(Passenger passenger) {

    }
}

     */
}