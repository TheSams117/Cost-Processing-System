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
    	FF_INI.setText(formatearDecimales(Main.getCompany().getDepartament().getInventarioInicialUnidades(), 3)  +"");
    	FF_UCOM.setText(formatearDecimales(Main.getCompany().getDepartament().getProductoEnProceso(),3)+"");
    	FF_TO_UEP.setText(formatearDecimales(Main.getCompany().getDepartament().getFlujoFisico().getUnidadesEnProceso(), 3)+"");
    	
    	PE_MD_INI.setText(formatearDecimales(Main.getCompany().getDepartament().getFlujoFisico().getMDequivalenteInventarioInicial(), 3)+"");
    	PE_MD_COM_TER.setText(formatearDecimales(Main.getCompany().getDepartament().getFlujoFisico().getUnidadesComenzadasYterminadas(), 3)+"");	
    	PE_MD_INF.setText(formatearDecimales(Main.getCompany().getDepartament().getFlujoFisico().getMDequivalenteInventarioFinal(), 3)+"");
    	PE_MD_UAC.setText(formatearDecimales(Main.getCompany().getDepartament().getFlujoFisico().getUnidadesAcostearMD(),3)+"");
    	
    	PE_MOD_INI.setText(formatearDecimales(Main.getCompany().getDepartament().getFlujoFisico().getMODequivalenteInventarioInicial(),3)+"");
    	PE_MOD_COM_TER.setText(formatearDecimales(Main.getCompany().getDepartament().getFlujoFisico().getUnidadesComenzadasYterminadas(),3)+"");
    	PE_MOD_INF.setText(formatearDecimales(Main.getCompany().getDepartament().getFlujoFisico().getMODequivalenteInventarioFinal(),3)+"");
    	PE_MOD_UAC.setText(formatearDecimales(Main.getCompany().getDepartament().getFlujoFisico().getUnidadesAcostearMOD(),3)+"");
    	
    	PE_CIF_INI.setText(formatearDecimales(Main.getCompany().getDepartament().getFlujoFisico().getCIFequivalenteInventarioInicial(),3)+"");
    	PE_CIF_COM_TER.setText(formatearDecimales(Main.getCompany().getDepartament().getFlujoFisico().getUnidadesComenzadasYterminadas(),3)+"");
    	PE_CIF_INF.setText(formatearDecimales(Main.getCompany().getDepartament().getFlujoFisico().getCIFequivalenteInventarioFinal(),3)+"");
    	PE_CIF_UAC.setText(formatearDecimales(Main.getCompany().getDepartament().getFlujoFisico().getUnidadesAcostearCIF(),3)+"");
    	
    	PE_CC_INI.setText(formatearDecimales(Main.getCompany().getDepartament().getFlujoFisico().getCCequivalenteInventarioInicial(),3)+"");
    	PE_CC_COM_TER.setText(formatearDecimales(Main.getCompany().getDepartament().getFlujoFisico().getUnidadesComenzadasYterminadas(),3)+"");
    	PE_CC_INF.setText(formatearDecimales(Main.getCompany().getDepartament().getFlujoFisico().getCCequivalenteInventarioFinal(),3)+"");
    	PE_CC_UAC.setText(formatearDecimales(Main.getCompany().getDepartament().getFlujoFisico().getUnidadesAcostearCC(),3)+"");
    	
    	CU_MD.setText(formatearDecimales(Main.getCompany().getDepartament().getCostoPorUnidad().getCostoMDporUnidad(),3)+"");
    	CU_MOD.setText(formatearDecimales(Main.getCompany().getDepartament().getCostoPorUnidad().getCostoMODporUnidad(),3)+"");
    	CU_CIF.setText(formatearDecimales(Main.getCompany().getDepartament().getCostoPorUnidad().getCostoCIFporUnidad(),3)+"");
    	CU_TOTAL.setText(formatearDecimales(Main.getCompany().getDepartament().getCostoPorUnidad().getTotalCostoPorUnidad(),3)+"");
    	
    	PT_INI.setText(formatearDecimales(Main.getCompany().getDepartament().getAsignacionDeCostos().getPrecioInventarioInicial(),3)+"");
    	PT_MD.setText(formatearDecimales(Main.getCompany().getDepartament().getAsignacionDeCostos().getPrecioInventarioInicialMD(),3)+"");
    	PT_MOD.setText(formatearDecimales(Main.getCompany().getDepartament().getAsignacionDeCostos().getPrecioInventarioInicialMOD(),3)+"");
    	PT_CIF.setText(formatearDecimales(Main.getCompany().getDepartament().getAsignacionDeCostos().getPrecioInvetnarioIncialCIF(),3)+"");
    	PT_INI_TERMI.setText(formatearDecimales(Main.getCompany().getDepartament().getAsignacionDeCostos().getPrecioIniciadasYterminadas(),3)+"");
    	PT_TO_PRO_TERMI.setText(formatearDecimales(Main.getCompany().getDepartament().getAsignacionDeCostos().getTotalcostosProductoTerminado(),3)+"");
    	
    	
    	PP_COSTRA.setText(formatearDecimales(Main.getCompany().getDepartament().getAsignacionDeCostos().getProductoEnProceso(),3)+"");    		
    	PP_MD.setText(formatearDecimales(Main.getCompany().getDepartament().getAsignacionDeCostos().getProductoEnProcesoMD(),3)+"");
    	PP_MOD.setText(formatearDecimales(Main.getCompany().getDepartament().getAsignacionDeCostos().getProductoEnProcesoMOD(),3)+"");
    	PP_CIF.setText(formatearDecimales(Main.getCompany().getDepartament().getAsignacionDeCostos().getProductoEnProcesoCIF(),3)+"");
    	PT_TOTAL_PP.setText(formatearDecimales(Main.getCompany().getDepartament().getAsignacionDeCostos().getTotalcostosProductoEnProceso(),3)+"");
    	
    	U_INI_1.setText(formatearDecimales(Main.getCompany().getDepartament().getInventarioInicialUnidades(),3)+"");
    	U_COMENZADA_TER_1.setText(formatearDecimales(Main.getCompany().getDepartament().getFlujoFisico().getUnidadesComenzadasYterminadas(),3)+"");
    	U_INF_FINAL_1.setText(formatearDecimales(Main.getCompany().getDepartament().getInventarioFinal(),3)+"");
    	TOTAL_U_COSTEAR_1.setText(formatearDecimales(Main.getCompany().getDepartament().getFlujoFisico().getUnidadesAcostear(),3)+"");
    	
    	if(Main.isCalculaCostosConver()) {
    		PE_MOD_COM_TER.setText("0.000");
    		PE_CIF_COM_TER.setText("0.000");
    	}
    	 //Auxilio Me desmayo
    	
	}
    
    public static Double formatearDecimales(Double numero, Integer numeroDecimales) {
    	return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
    }
    
    

}