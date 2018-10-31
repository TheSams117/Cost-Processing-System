package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;

public class MainWindowController {
	@FXML
    private TextField txtNombreDepartamento1;

    @FXML
    private TextField txtMdPrecioIniDepartamento1;

    @FXML
    private Label textoModIniDepartamento1;

    @FXML
    private TextField txtModPrecioIniDepartamento1;

    @FXML
    private Label textoCifIniDepartamento1;

    @FXML
    private TextField txtCifPrecioIniDepartamento1;

    @FXML
    private TextField txtUnidadesIniDepartamento1;

    @FXML
    private TextField txtMdPorIniDepartamento1;

    @FXML
    private TextField txtModPorIniDepartamento1;

    @FXML
    private Label textoModPorIniDepartamento1;

    @FXML
    private TextField txtCifPorIniDepartamento1;

    @FXML
    private Label textoCifPorIniDepartamento1;

    @FXML
    private Label textoPorcentajeIniDepartamento1;

    @FXML
    private Separator lineaIniDepartamento1;

    @FXML
    private TextField txtMdPrecioProceDepartamento1;

    @FXML
    private Label textoModProceDepartamento1;

    @FXML
    private TextField txtModPrecioProceDepartamento1;

    @FXML
    private Label textoCifProceDepartamento1;

    @FXML
    private TextField txtCifPrecioProceDepartamento1;

    @FXML
    private TextField txtUnidadesProceDepartamento1;

    @FXML
    private TextField txtUnidadesFinDepartamento1;

    @FXML
    private TextField txtMdPorFinDepartamento1;

    @FXML
    private TextField txtModPorFinDepartamento1;

    @FXML
    private Label textoModPorFinDepartamento1;

    @FXML
    private TextField txtCifPorFinDepartamento1;

    @FXML
    private Label textoCifPorFinDepartamento1;

    @FXML
    private Label textoPorcentajeFinDepartamento1;

    @FXML
    private Separator lineaFinDepartamento1;

    @FXML
    private Button butCalcularCostos;

    @FXML
    private CheckBox chkbCostosDeConversión;

    @FXML
    private TextField txtUnidadesFinDepartamento11;

    @FXML
    private TextField txtUnidadesFinDepartamento111;

    
    @FXML
    void butEvento(ActionEvent event) {

    	if(event.getSource().equals(butCalcularCostos)) {
    		Main.calculate(Double.parseDouble(txtUnidadesIniDepartamento1.getText()), 
    				Double.parseDouble(txtMdPrecioIniDepartamento1.getText()), 
    				Double.parseDouble(txtModPrecioIniDepartamento1.getText()), 
    				Double.parseDouble(txtCifPrecioIniDepartamento1.getText()), 
					0, 
					Double.parseDouble(txtMdPorIniDepartamento1.getText()), 
					Double.parseDouble(txtModPorIniDepartamento1.getText()), 
					Double.parseDouble(txtCifPorIniDepartamento1.getText()), 
					Double.parseDouble(txtModPorIniDepartamento1.getText()), 
					Double.parseDouble(txtUnidadesProceDepartamento1.getText()), 
					Double.parseDouble(txtMdPrecioProceDepartamento1.getText()), 
					Double.parseDouble(txtModPrecioProceDepartamento1.getText()), 
					Double.parseDouble(txtCifPrecioProceDepartamento1.getText()), 
					0, 
					Double.parseDouble(txtUnidadesFinDepartamento1.getText()), 
					Double.parseDouble(txtMdPorFinDepartamento1.getText()), 
					Double.parseDouble(txtModPorFinDepartamento1.getText()), 
					Double.parseDouble(txtCifPorFinDepartamento1.getText()), 
					Double.parseDouble(txtModPorFinDepartamento1.getText()), 
					Double.parseDouble(txtUnidadesFinDepartamento111.getText()), 
					Double.parseDouble(txtUnidadesFinDepartamento11.getText()), 
					chkbCostosDeConversión.isSelected(),txtNombreDepartamento1.getText());
    	}
    }

    @FXML
    void costC(ActionEvent event) {
    	if(chkbCostosDeConversión.isSelected()) {
    		textoModPorIniDepartamento1.setText("CC =");
    		lineaIniDepartamento1.setVisible(false);
    		textoCifPorIniDepartamento1.setVisible(false);
    		txtCifPorIniDepartamento1.setVisible(false);
    		textoPorcentajeIniDepartamento1.setVisible(false);
//    		textoModIniDepartamento1.setText("Costos de conversión:");
//    		textoCifIniDepartamento1.setVisible(false);
//    		txtCifPrecioIniDepartamento1.setVisible(false);
//    		textoModProceDepartamento1.setText("Costos de conversión:");
//    		textoCifProceDepartamento1.setVisible(false);
//    		txtCifPrecioProceDepartamento1.setVisible(false);
    		textoModPorFinDepartamento1.setText("CC =");
    		lineaFinDepartamento1.setVisible(false);
    		textoCifPorFinDepartamento1.setVisible(false);
    		txtCifPorFinDepartamento1.setVisible(false);
    		textoPorcentajeFinDepartamento1.setVisible(false);

    	}else {
    		textoModPorIniDepartamento1.setText("MOD =");
    		lineaIniDepartamento1.setVisible(true);
    		textoCifPorIniDepartamento1.setVisible(true);
    		txtCifPorIniDepartamento1.setVisible(true);
    		textoPorcentajeIniDepartamento1.setVisible(true);
    		textoModIniDepartamento1.setText("Mano de obra directa:");
    		textoCifIniDepartamento1.setVisible(true);
    		txtCifPrecioIniDepartamento1.setVisible(true);   		
    		textoModProceDepartamento1.setText("Mano de obra directa:");
    		textoCifProceDepartamento1.setVisible(true);
    		txtCifPrecioProceDepartamento1.setVisible(true);
    		textoModPorFinDepartamento1.setText("MOD =");
    		lineaFinDepartamento1.setVisible(true);
    		textoCifPorFinDepartamento1.setVisible(true);
    		txtCifPorFinDepartamento1.setVisible(true);
    		textoPorcentajeFinDepartamento1.setVisible(true);   		
    	}
    }
}

