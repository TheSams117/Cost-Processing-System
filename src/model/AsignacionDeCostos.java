package model;

public class AsignacionDeCostos {
	
	private double totalcostosProductoTerminado;
	
	private double precioInventarioInicial;
	private double precioInventarioInicialMD;
	private double precioInventarioInicialMOD;
	private double precioInvetnarioIncialCIF;
	private double precioIniciadasYterminadas;
	
	private double totalcostosProductoEnProceso;
	private double productoEnProceso;
	private double productoEnProcesoMD;
	private double productoEnProcesoMOD;
	private double productoEnProcesoCIF;

	
	private boolean porCC;
		
	public AsignacionDeCostos(boolean porCC) {
		this.porCC = porCC;
	}
	
	
	public void totalCostoProductoTerminado(double precioMD, double precioMOD, double precioCIF,  
			double equivalenteInicialMD, double costoUnidadMD, double equivalenteInicialMOD, double costoUnidadMOD, 
			double equivalenteInicialCIF , double costoUnidadCIF, double equivalenteIncialCC,
			double comenzadasYterminadas, double costoTotalPorUnidad) {
		
		 precioInventarioInicial =  precioMD + precioMOD + precioCIF;
		 
		 precioInventarioInicialMD = equivalenteInicialMD * costoUnidadMD ;
		 
		 if(porCC) {
			 precioInventarioInicialMOD = equivalenteIncialCC * costoUnidadMOD;			 			 
		 }else {
			 precioInventarioInicialMOD = equivalenteInicialMOD * costoUnidadMOD;			 
		 }
		 
		 if(porCC) {
			 precioInvetnarioIncialCIF = equivalenteIncialCC * costoUnidadCIF;		
		 }else {
			 precioInvetnarioIncialCIF = equivalenteInicialCIF* costoUnidadCIF;			 
		 }
		
		 precioIniciadasYterminadas = comenzadasYterminadas * costoTotalPorUnidad;
		 
		 totalcostosProductoTerminado = precioInventarioInicial + precioInventarioInicialMD + precioInventarioInicialMOD + precioInvetnarioIncialCIF + precioIniciadasYterminadas;
		 
	}
	
	public void totalCostoProductoEnProceso(double unidadesInventarioFinal, double costoPorUnidadAgregado,double equivalenteFinalMD,
			double costoUnidadMD, double equivalenteFinalMOD, double costoUnidadMOD, 
			double equivalenteFinalCIF,double costoUnidadCIF,  double equivalenteFinalCC) {
		
		productoEnProceso = (unidadesInventarioFinal * costoPorUnidadAgregado) == 0?unidadesInventarioFinal:unidadesInventarioFinal * costoPorUnidadAgregado;
		productoEnProcesoMD =  equivalenteFinalMD * costoUnidadMD ;

		if(porCC) {
			productoEnProcesoMOD = equivalenteFinalCC * costoUnidadMOD;			
		}else {
			productoEnProcesoMOD = equivalenteFinalMOD * costoUnidadMOD;		
		}
		
		if(porCC) {
			productoEnProcesoCIF = equivalenteFinalCC * costoUnidadCIF;			
		}else {
			productoEnProcesoCIF = equivalenteFinalCIF * costoUnidadCIF;			
		}
	
		totalcostosProductoEnProceso = productoEnProcesoMD + productoEnProcesoMOD + productoEnProcesoCIF  +((productoEnProceso != unidadesInventarioFinal)?productoEnProceso:0);
	}


	
	//Set and get
	public double getTotalcostosProductoTerminado() {
		return totalcostosProductoTerminado;
	}


	public void setTotalcostosProductoTerminado(double totalcostosProductoTerminado) {
		this.totalcostosProductoTerminado = totalcostosProductoTerminado;
	}


	public double getPrecioInventarioInicial() {
		return precioInventarioInicial;
	}


	public void setPrecioInventarioInicial(double precioInventarioInicial) {
		this.precioInventarioInicial = precioInventarioInicial;
	}


	public double getPrecioInventarioInicialMD() {
		return precioInventarioInicialMD;
	}


	public void setPrecioInventarioInicialMD(double precioInventarioInicialMD) {
		this.precioInventarioInicialMD = precioInventarioInicialMD;
	}


	public double getPrecioInventarioInicialMOD() {
		return precioInventarioInicialMOD;
	}


	public void setPrecioInventarioInicialMOD(double precioInventarioInicialMOD) {
		this.precioInventarioInicialMOD = precioInventarioInicialMOD;
	}


	public double getPrecioInvetnarioIncialCIF() {
		return precioInvetnarioIncialCIF;
	}


	public void setPrecioInvetnarioIncialCIF(double precioInvetnarioIncialCIF) {
		this.precioInvetnarioIncialCIF = precioInvetnarioIncialCIF;
	}

	public double getPrecioIniciadasYterminadas() {
		return precioIniciadasYterminadas;
	}


	public void setPrecioIniciadasYterminadas(double precioIniciadasYterminadas) {
		this.precioIniciadasYterminadas = precioIniciadasYterminadas;
	}


	public double getTotalcostosProductoEnProceso() {
		return totalcostosProductoEnProceso;
	}


	public void setTotalcostosProductoEnProceso(double totalcostosProductoEnProceso) {
		this.totalcostosProductoEnProceso = totalcostosProductoEnProceso;
	}


	public double getProductoEnProceso() {
		return productoEnProceso;
	}


	public void setProductoEnProceso(double productoEnProceso) {
		this.productoEnProceso = productoEnProceso;
	}


	public double getProductoEnProcesoMD() {
		return productoEnProcesoMD;
	}


	public void setProductoEnProcesoMD(double productoEnProcesoMD) {
		this.productoEnProcesoMD = productoEnProcesoMD;
	}


	public double getProductoEnProcesoMOD() {
		return productoEnProcesoMOD;
	}


	public void setProductoEnProcesoMOD(double productoEnProcesoMOD) {
		this.productoEnProcesoMOD = productoEnProcesoMOD;
	}


	public double getProductoEnProcesoCIF() {
		return productoEnProcesoCIF;
	}


	public void setProductoEnProcesoCIF(double productoEnProcesoCIF) {
		this.productoEnProcesoCIF = productoEnProcesoCIF;
	}



	

}
