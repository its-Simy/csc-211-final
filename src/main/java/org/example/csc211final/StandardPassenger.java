package org.example.csc211final;

public class StandardPassenger extends Passenger {


    @Override
    public boolean requestElevator(direction _direction, SimulationSettings _settings) {
    //This has to call elevator

        return false;
    }
    /*
    import java.util.ArrayList;

public class StandardPassenger extends Passenger{
    protected static ArrayList<StandardPassenger> sPassenger = new ArrayList<>();
    public StandardPassenger(){
        passangerType = "Standard";
        //sPassenger = new ArrayList<>();
    }

    public static void addsPassengers(){
        for(int i = 0; i < 6; i++){
            StandardPassenger passenger = new StandardPassenger();
            sPassenger.add(passenger);
            System.out.println(sPassenger.size());
        }

    }

}

     */
}
