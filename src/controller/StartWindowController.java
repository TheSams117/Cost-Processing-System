package controller;



import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class StartWindowController {
	public static final String COSTO_ONE_DEPARTMENT = "1";
	public static final String COSTO_TWO_DEPARTMENT = "2";
	public static final String COSTO_THREE_DEPARTMENT = "3";
	private Main main;

    @FXML
    private Button startCost;

    @FXML
    private ComboBox<String> selectedAmount;

    @FXML
    void Button(ActionEvent event) {
    	
    	String value = selectedAmount.getValue();
    	
    	if(value.equals(COSTO_ONE_DEPARTMENT)) {
    		
    		main.costCompany(Integer.parseInt(value));
    		
    	}else if(value.equals(COSTO_TWO_DEPARTMENT)) {
    		
    		main.costCompany(Integer.parseInt(value));
    		
    	}else if(value.equals(COSTO_THREE_DEPARTMENT)) {
    		
    		main.costCompany(Integer.parseInt(value));
    	}
    }

    @FXML
    void combox(ActionEvent event) {
    	
    }
    
    public void initialize() {
    	ObservableList<String> items = FXCollections.observableArrayList("Seleccionar","1", "2", "3");
    	selectedAmount.setItems(items);
	}

}