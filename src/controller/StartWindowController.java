package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class StartWindowController {
	
    @FXML
    private Button startCost;
    


    @FXML
    void Button(ActionEvent event) {
		
				Main.costCompany(1);
			
			
    }


}