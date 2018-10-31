package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class StartWindowController {
    @FXML
    private Button startCost;
    @FXML
    void Button(ActionEvent event) {
				Main.costCompany(1);		
			
    }
}