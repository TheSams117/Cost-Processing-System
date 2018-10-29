package controller;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;

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
    private TextField txtMdPrecioFinDepartamento1;

    @FXML
    private Label textoModFinDepartamento1;

    @FXML
    private TextField txtModPrecioFinDepartamento1;

    @FXML
    private Label textoCifFinDepartamento1;

    @FXML
    private TextField txtCifPrecioFinDepartamento1;

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
    private AnchorPane contenedorDepartamento2;

    @FXML
    private Rectangle rectangulo;

    @FXML
    private TextField txtNombreDepartamento2;

    @FXML
    private Separator linea1;

    @FXML
    private Label textoTitulo1;

    @FXML
    private Label Unidades1;

    @FXML
    private TextField txtMdPrecioIniDepartamento2;

    @FXML
    private Label textoModIniDepartamento2;

    @FXML
    private TextField txtModPrecioIniDepartamento2;

    @FXML
    private Label textoCifIniDepartamento2;

    @FXML
    private TextField txtCifPrecioIniDepartamento2;

    @FXML
    private TextField txtUnidadesIniDepartamento2;

    @FXML
    private TextField txtMdPorIniDepartamento2;

    @FXML
    private TextField txtModPorIniDepartamento2;

    @FXML
    private Label textoModPorIniDepartamento2;

    @FXML
    private TextField txtCifPorIniDepartamento2;

    @FXML
    private Label textoCifPorIniDepartamento2;

    @FXML
    private Label textoPorcentajeIniDepartamento2;

    @FXML
    private Separator lineaIniDepartamento2;

    @FXML
    private TextField txtMdPrecioProceDepartamento2;

    @FXML
    private Label textoModProceDepartamento2;

    @FXML
    private TextField txtModPrecioProceDepartamento2;

    @FXML
    private Label textoCifProceDepartamento2;

    @FXML
    private TextField txtCifPrecioProceDepartamento2;

    @FXML
    private TextField txtUnidadesProceDepartamento2;

    @FXML
    private TextField txtMdPrecioFinDepartamento2;

    @FXML
    private Label textoModFinDepartamento2;

    @FXML
    private TextField txtModPrecioFinDepartamento2;

    @FXML
    private Label textoCifFinDepartamento2;

    @FXML
    private TextField txtCifPrecioFinDepartamento2;

    @FXML
    private TextField txtUnidadesFinDepartamento2;

    @FXML
    private TextField txtMdPorFinDepartamento2;

    @FXML
    private TextField txtModPorFinDepartamento2;

    @FXML
    private Label textoModPorFinDepartamento2;

    @FXML
    private TextField txtCifPorFinDepartamento2;

    @FXML
    private Label textoCifPorFinDepartamento2;

    @FXML
    private Label textoPorcentajeFinDepartamento2;

    @FXML
    private Separator lineaFinDepartamento2;

    @FXML
    private Button butVolver;

    @FXML
    void butEvento(ActionEvent event) {
    	if(event.getSource().equals(butVolver)) {
    		Main.back();
    	}else if(event.getSource().equals(butCalcularCostos)) {
    		System.out.println("calcula");
    	}
    }


    @FXML
    void costC(ActionEvent event) {
    	if(chkbCostosDeConversión.isSelected()) {
    		textoModPorIniDepartamento1.setText("CC =");
    		textoModPorIniDepartamento2.setText("CC =");
    		lineaIniDepartamento1.setVisible(false);
    		lineaIniDepartamento2.setVisible(false);
    		textoCifPorIniDepartamento1.setVisible(false);
    		textoCifPorIniDepartamento2.setVisible(false);
    		txtCifPorIniDepartamento1.setVisible(false);
    		txtCifPorIniDepartamento2.setVisible(false);
    		textoPorcentajeIniDepartamento1.setVisible(false);
    		textoPorcentajeIniDepartamento2.setVisible(false);
    		
    		
    		textoModIniDepartamento1.setText("Costos de conversión:");
    		textoModIniDepartamento2.setText("Costos de conversión:");
    		textoCifIniDepartamento1.setVisible(false);
    		textoCifIniDepartamento2.setVisible(false);
    		txtCifPrecioIniDepartamento1.setVisible(false);
    		txtCifPrecioIniDepartamento2.setVisible(false);
    		
    		
    		textoModProceDepartamento1.setText("Costos de conversión:");
    		textoModProceDepartamento2.setText("Costos de conversión:");
    		textoCifProceDepartamento1.setVisible(false);
    		textoCifProceDepartamento2.setVisible(false);
    		txtCifPrecioProceDepartamento1.setVisible(false);
    		txtCifPrecioProceDepartamento2.setVisible(false);
    		
    		textoModPorFinDepartamento1.setText("CC =");
    		textoModPorFinDepartamento2.setText("CC =");
    		lineaFinDepartamento1.setVisible(false);
    		lineaFinDepartamento2.setVisible(false);
    		textoCifPorFinDepartamento1.setVisible(false);
    		textoCifPorFinDepartamento2.setVisible(false);
    		txtCifPorFinDepartamento1.setVisible(false);
    		txtCifPorFinDepartamento2.setVisible(false);
    		textoPorcentajeFinDepartamento1.setVisible(false);
    		textoPorcentajeFinDepartamento2.setVisible(false);
    		
    		textoModFinDepartamento1.setText("Costos de conversión:");
    		textoModFinDepartamento2.setText("Costos de conversión:");
    		
    		textoCifFinDepartamento1.setVisible(false);
    		textoCifFinDepartamento2.setVisible(false);
    		
    		txtCifPrecioFinDepartamento1.setVisible(false);
    		txtCifPrecioFinDepartamento2.setVisible(false);
    	}else {
    		textoModPorIniDepartamento1.setText("MOD =");
    		textoModPorIniDepartamento2.setText("MOD =");
    		lineaIniDepartamento1.setVisible(true);
    		lineaIniDepartamento2.setVisible(true);
    		textoCifPorIniDepartamento1.setVisible(true);
    		textoCifPorIniDepartamento2.setVisible(true);
    		txtCifPorIniDepartamento1.setVisible(true);
    		txtCifPorIniDepartamento2.setVisible(true);
    		textoPorcentajeIniDepartamento1.setVisible(true);
    		textoPorcentajeIniDepartamento2.setVisible(true);
    		
    		
    		textoModIniDepartamento1.setText("Mano de obra directa:");
    		textoModIniDepartamento2.setText("Mano de obra directa:");
    		textoCifIniDepartamento1.setVisible(true);
    		textoCifIniDepartamento2.setVisible(true);
    		txtCifPrecioIniDepartamento1.setVisible(true);
    		txtCifPrecioIniDepartamento2.setVisible(true);
    		
    		
    		textoModProceDepartamento1.setText("Mano de obra directa:");
    		textoModProceDepartamento2.setText("Mano de obra directa:");
    		textoCifProceDepartamento1.setVisible(true);
    		textoCifProceDepartamento2.setVisible(true);
    		txtCifPrecioProceDepartamento1.setVisible(true);
    		txtCifPrecioProceDepartamento2.setVisible(true);
    		
    		textoModPorFinDepartamento1.setText("MOD =");
    		textoModPorFinDepartamento2.setText("MOD =");
    		lineaFinDepartamento1.setVisible(true);
    		lineaFinDepartamento2.setVisible(true);
    		textoCifPorFinDepartamento1.setVisible(true);
    		textoCifPorFinDepartamento2.setVisible(true);
    		txtCifPorFinDepartamento1.setVisible(true);
    		txtCifPorFinDepartamento2.setVisible(true);
    		textoPorcentajeFinDepartamento1.setVisible(true);
    		textoPorcentajeFinDepartamento2.setVisible(true);
    		
    		textoModFinDepartamento1.setText("Mano de obra directa:");
    		textoModFinDepartamento2.setText("Mano de obra directa:");
    		
    		textoCifFinDepartamento1.setVisible(true);
    		textoCifFinDepartamento2.setVisible(true);
    	
    		txtCifPrecioFinDepartamento1.setVisible(true);
    		txtCifPrecioFinDepartamento2.setVisible(true);   		
    	}
    }
    
    public void initialize() {
    	if(Main.getDepartments() == 1) {
    		contenedorDepartamento2.setVisible(false);
    	}
    	
	}


	public AnchorPane getContenedorDepartamento2() {
		// TODO Auto-generated method stub
		return contenedorDepartamento2;
	}

}

