package com.example.demo.controller;

import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

@FXMLController
public class PrimaryStageController implements Initializable {
    @FXML
    private Label dividendLabel;
    @FXML
    private Label divisorLabel;
    @FXML
    private Label resultLabel;
    @FXML
    private TextField dividendField;
    @FXML
    private TextField divisorField;
    @FXML
    private TextField resultField;
    @FXML
    private Button caculateBt;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        caculateBt.setOnAction(e->{
            String dividendText = dividendField.getText();
            String divisorText = divisorField.getText();
            double dividend = Double.parseDouble(dividendText);
            double divisor = Double.parseDouble(divisorText);
            double result = dividend/divisor;
            resultField.setText(String.valueOf(result));
        });
    }

}
