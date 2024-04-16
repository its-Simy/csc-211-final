package org.example.csc211final;

import javafx.fxml.FXML;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.shape.*;

public class HelloController {

    @FXML
    private Button btnStart;
    @FXML
    private Rectangle RectangleElevator1;
    @FXML
    private Rectangle RectangleElevator2;
    @FXML
    private Label lblIteration3;
    @FXML
    private Label lblIteration1;
    @FXML
    private Label lblIteration2;
    @FXML
    private Label IterationLabel2;
    @FXML
    private Label IterationLabel1;
    @FXML
    private Label IterationLabel3;

    @FXML
    protected void onHelloButtonClick() {
        ElevatorSimulation _simulation = new ElevatorSimulation();
        _simulation.initSimulation("File Name");
        //
    }

    @FXML
    public void onStartButtonClick(ActionEvent actionEvent) {
    }
}

