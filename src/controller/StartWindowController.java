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
    private ComboBox<String> selectedAmount;

    @FXML
    void Button(ActionEvent event) {
			String value = selectedAmount.getValue();
			if(value != null && !(value.equalsIgnoreCase("Seleccionar"))) {
				Main.costCompany(Integer.parseInt(value));
			}
			
    }

    @FXML
    void combox(ActionEvent event) {
    	
    }
    
    public void initialize() {
    	ObservableList<String> items = FXCollections.observableArrayList("Seleccionar","1", "2");
    	selectedAmount.setItems(items);
	}

}