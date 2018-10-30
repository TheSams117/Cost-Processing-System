package model;

public class CostoPorUnidad {
// CALLESE VIEJO LESBIANO 
	private double costoMDporUnidad;
	private double costoMODporUnidad;
	private double costoCIFporUnidad;
	private double totalCostoPorUnidad;
	private double costoTransferido;
	
	private boolean porCC;

	public CostoPorUnidad(boolean porCC ) {	
		this.porCC = porCC;
	}
	
	public void costoPorUnidadMD(double MDprecio, double unidadesMD) {
		costoMDporUnidad = MDprecio/unidadesMD;
	}
	public void costoPorUnidadMOD(double MODprecio, double unidadesMOD, double unidadesCC) {
		
		if(porCC) {
			costoMODporUnidad = MODprecio/unidadesCC;			
		}else {
			costoMODporUnidad = MODprecio/unidadesMOD;	
		}
	}
	public void costoPorUnidadCIF(double CIFprecio, double unidadesCIF, double unidadesCC) {
		
		if(porCC) {
			costoCIFporUnidad = CIFprecio/unidadesCC;			
		}else {
			costoCIFporUnidad = CIFprecio/unidadesCIF;	
		}
	}
	public void totalCostoPorUnidad(double costoTransferidoPorUnidad){
		costoTransferido = costoTransferidoPorUnidad;
		totalCostoPorUnidad  = costoTransferido + costoMDporUnidad + costoMODporUnidad + costoCIFporUnidad ;
	}

	
	
	//Set and Get
	public double getCostoMDporUnidad() {
		return costoMDporUnidad;
	}

	public void setCostoMDporUnidad(double costoMDporUnidad) {
		this.costoMDporUnidad = costoMDporUnidad;
	}

	public double getCostoMODporUnidad() {
		return costoMODporUnidad;
	}

	public void setCostoMODporUnidad(double costoMODporUnidad) {
		this.costoMODporUnidad = costoMODporUnidad;
	}

	public double getCostoCIFporUnidad() {
		return costoCIFporUnidad;
	}

	public void setCostoCIFporUnidad(double costoCIFporUnidad) {
		this.costoCIFporUnidad = costoCIFporUnidad;
	}

	public double getTotalCostoPorUnidad() {
		return totalCostoPorUnidad;
	}

	public void setTotalCostoPorUnidad(double totalCostoPorUnidad) {
		this.totalCostoPorUnidad = totalCostoPorUnidad;
	}

	public double getCostoTransferido() {
		return costoTransferido;
	}

	public void setCostoTransferido(double costoTransferido) {
		this.costoTransferido = costoTransferido;
	}

	
	
	

	
	
}
