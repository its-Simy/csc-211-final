package org.example.csc211final;

public class ExpressPassenger extends Passenger{


    @Override
    public boolean requestElevator(direction _direction, SimulationSettings _settings) {
//the inputs include the direction in which the express passenger needs to go
        // Also includes the simulation settings, in which it has
        //the passenger request percentage, add elevator, add passenger and add elevator




        return false;
    }

    /*
    import java.util.ArrayList;

public class ExpressPassneger extends Passenger{
    protected static ArrayList<ExpressPassneger> expressPassenger = new ArrayList<>();
        public ExpressPassneger(){
            passangerType = "Express";
        }

    public boolean requestElevator(direction _direction) {
        return false;
    }


    public static void addePassengers(){
        for(int i = 0; i < 6; i++){
            ExpressPassneger passenger1 = new ExpressPassneger();
            expressPassenger.add(passenger1);
            System.out.println(expressPassenger.size());
        }

    }
}

     */
}
