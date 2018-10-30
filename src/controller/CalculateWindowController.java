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
    private Label U_INI_1;

    @FXML
    private Label U_COMENZADA_TER_1;

    @FXML
    private Label U_INF_FINAL_1;

    @FXML
    private Label TOTAL_U_COSTEAR_1;

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
    	
    	PE_MOD_INI.setText(Main.getCompany().getDepartament().getFlujoFisico().getMODequivalenteInventarioInicial()+"");
    	PE_MOD_COM_TER.setText(Main.getCompany().getDepartament().getFlujoFisico().getUnidadesComenzadasYterminadas()+"");
    	PE_MOD_INF.setText(Main.getCompany().getDepartament().getFlujoFisico().getMODequivalenteInventarioFinal()+"");
    	PE_MOD_UAC.setText(Main.getCompany().getDepartament().getFlujoFisico().getUnidadesAcostearMOD()+"");
    	
    	PE_CIF_INI.setText(Main.getCompany().getDepartament().getFlujoFisico().getCIFequivalenteInventarioInicial()+"");
    	PE_CIF_COM_TER.setText(Main.getCompany().getDepartament().getFlujoFisico().getUnidadesComenzadasYterminadas()+"");
    	PE_CIF_INF.setText(Main.getCompany().getDepartament().getFlujoFisico().getCIFequivalenteInventarioFinal()+"");
    	PE_CIF_UAC.setText(Main.getCompany().getDepartament().getFlujoFisico().getUnidadesAcostearCIF()+"");
    	
    	PE_CC_INI.setText(Main.getCompany().getDepartament().getFlujoFisico().getCCequivalenteInventarioInicial()+"");
    	PE_CC_COM_TER.setText(Main.getCompany().getDepartament().getFlujoFisico().getUnidadesComenzadasYterminadas()+"");
    	PE_CC_INF.setText(Main.getCompany().getDepartament().getFlujoFisico().getCCequivalenteInventarioFinal()+"");
    	PE_CC_UAC.setText(Main.getCompany().getDepartament().getFlujoFisico().getUnidadesAcostearCC()+"");
    	
    	CU_MD.setText(Main.getCompany().getDepartament().getCostoPorUnidad().getCostoMDporUnidad()+"");
    	CU_MOD.setText(Main.getCompany().getDepartament().getCostoPorUnidad().getCostoMODporUnidad()+"");
    	CU_CIF.setText(Main.getCompany().getDepartament().getCostoPorUnidad().getCostoCIFporUnidad()+"");
    	CU_TOTAL.setText(Main.getCompany().getDepartament().getCostoPorUnidad().getTotalCostoPorUnidad()+"");
    	
    	PT_INI.setText(Main.getCompany().getDepartament().getAsignacionDeCostos().getPrecioInventarioInicial()+"");
    	PT_MD.setText(Main.getCompany().getDepartament().getAsignacionDeCostos().getPrecioInventarioInicialMD()+"");
    	PT_MOD.setText(Main.getCompany().getDepartament().getAsignacionDeCostos().getPrecioInventarioInicialMOD()+"");
    	PT_CIF.setText(Main.getCompany().getDepartament().getAsignacionDeCostos().getPrecioInvetnarioIncialCIF()+"");
    	PT_INI_TERMI.setText(Main.getCompany().getDepartament().getAsignacionDeCostos().getPrecioIniciadasYterminadas()+"");
    	PT_TO_PRO_TERMI.setText(Main.getCompany().getDepartament().getAsignacionDeCostos().getTotalcostosProductoTerminado()+"");
    	
    	
    	PP_COSTRA.setText(Main.getCompany().getDepartament().getAsignacionDeCostos().getProductoEnProceso()+"");    		
    	PP_MD.setText(Main.getCompany().getDepartament().getAsignacionDeCostos().getProductoEnProcesoMD()+"");
    	PP_MOD.setText(Main.getCompany().getDepartament().getAsignacionDeCostos().getProductoEnProcesoMOD()+"");
    	PP_CIF.setText(Main.getCompany().getDepartament().getAsignacionDeCostos().getProductoEnProcesoCIF()+"");
    	PT_TOTAL_PP.setText(Main.getCompany().getDepartament().getAsignacionDeCostos().getTotalcostosProductoEnProceso()+"");
    	
    	U_INI_1.setText(Main.getCompany().getDepartament().getInventarioInicialUnidades()+"");
    	U_COMENZADA_TER_1.setText(Main.getCompany().getDepartament().getFlujoFisico().getUnidadesComenzadasYterminadas()+"");
    	U_INF_FINAL_1.setText(Main.getCompany().getDepartament().getInventarioFinal()+"");
    	TOTAL_U_COSTEAR_1.setText(Main.getCompany().getDepartament().getFlujoFisico().getUnidadesAcostear()+"");
    	
    	if(Main.isCalculaCostosConver()) {
    		PE_MOD_COM_TER.setText("0");
    		PE_CIF_COM_TER.setText("0");
    	}
    	 //Auxilio Me desmayo
    	
	}

}