package org.example.csc211final;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        ElevatorSimulation _simulation = new ElevatorSimulation();
        _simulation.initSimulation("File Name");
        //
    }
}

