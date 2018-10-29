package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalculateWindowController {

    @FXML
    private Label FF_INI;

    @FXML
    private Label FF_UCOM;

    @FXML
    private Label FF_TO_UEP;

    @FXML
    private Label PE_MD_INI;

    @FXML
    private Label PE_MOD_INI;

    @FXML
    private Label PE_MD_COM_TER;

    @FXML
    private Label PE_MD_INF;

    @FXML
    private Label PE_MD_UAC;

    @FXML
    private Label PE_CIF_INI;

    @FXML
    private Label PE_CC_INI;

    @FXML
    private Label PE_MOD_COM_TER;

    @FXML
    private Label PE_MOD_INF;

    @FXML
    private Label PE_MOD_UAC;

    @FXML
    private Label PE_CIF_COM_TER;

    @FXML
    private Label PE_CIF_INF;

    @FXML
    private Label PE_CIF_UAC;

    @FXML
    private Label PE_CC_COM_TER;

    @FXML
    private Label PE_CC_INF;

    @FXML
    private Label PE_CC_UAC;

    @FXML
    private Label CU_MD;

    @FXML
    private Label CU_MOD;

    @FXML
    private Label CU_CIF;

    @FXML
    private Label CU_TOTAL;

    @FXML
    private Label PT_MD;

    @FXML
    private Label PT_MOD;

    @FXML
    private Label PT_CIF;

    @FXML
    private Label PT_INI_TERMI;

    @FXML
    private Label PT_TO_PRO_TERMI;

    @FXML
    private Label PT_INI;

    @FXML
    private Label PP_MD;

    @FXML
    private Label PP_MOD;

    @FXML
    private Label PP_CIF;

    @FXML
    private Label PT_TOTAL_PP;

    @FXML
    private Label PP_COSTRA;

    @FXML
    private Button volver;

    @FXML
    void back(ActionEvent event) {
    	Main.back();
    }
    
    public void initialize() {
    	FF_INI.setText(Main.getCompany().getDepartament().getInventarioInicialUnidades()+"");
    	FF_UCOM.setText(Main.getCompany().getDepartament().getProductoEnProceso()+"");
    	FF_TO_UEP.setText(Main.getCompany().getDepartament().getFlujoFisico().getUnidadesEnProceso()+"");
    	
    	PE_MD_INI.setText(Main.getCompany().getDepartament().getFlujoFisico().getMDequivalenteInventarioInicial()+"");
    	PE_MD_COM_TER.setText(Main.getCompany().getDepartament().getFlujoFisico().getUnidadesComenzadasYterminadas()+"");	
    	PE_MD_INF.setText(Main.getCompany().getDepartament().getFlujoFisico().getMDequivalenteInventarioFinal()+"");
    	PE_MD_UAC.setText(Main.getCompany().getDepartament().getFlujoFisico().getUnidadesAcostearMD()+"");
    	
    	PE_MOD_INI
    	PE_MD_COM_TER
    	PE_MD_INF
    	PE_MOD_INI
    	
    	
    	FF_TO_UEP.setText(Main.getCompany().getDepartament().getFlujoFisico().getUnidadesEnProceso()+"");
    	FF_TO_UEP.setText(Main.getCompany().getDepartament().getFlujoFisico().getUnidadesEnProceso()+"");
    	FF_TO_UEP.setText(Main.getCompany().getDepartament().getFlujoFisico().getUnidadesEnProceso()+"");
	}

}
