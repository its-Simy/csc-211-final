package org.example.csc211final;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Elevator Simulator");
        stage.setScene(scene);
        stage.show();
        //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
        //public class Main {
           // public static void main(String[] args) {

        /*
        AddElevator a = new AddElevator();
        a.move(direction.UP);
*/

                //StandardPassenger standardPassenger = new StandardPassenger();

                //StandardPassenger.addsPassengers();

                //ExpressPassneger expressPassneger = new ExpressPassneger();

                //ExpressPassneger.addePassengers();





            }
        }
    }

    public static void main(String[] args) {
        launch();
    }
    /*

     */
}