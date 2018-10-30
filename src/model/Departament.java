package model;

public class Departament {
	//hOLA QUIEN TIENE HAMBRE=?
	private double inventarioInicialUnidades;
	private double MDinvenrarioInicial;
	private double MODinventarioInicial;
	private double CIFinventarioInicial;

	
	private double porcentajeMDinventarioInicial;
	private double porcentajeMODinventarioInicial;
	private double porcentajeCIFinventarioInicial;
	private double porcentajeCCinventarioIncial;
	
	private double productoEnProceso;
	private double MD;
	private double MOD;
	private double CIF;
	
	private double inventarioFinal;
	private double porcentajeMDinventarioFinal;
	private double porcentajeMODinventarioFinal;
	private double porcentajeCIFinventarioFinal;
	private double porcentajeCCinventarioFinal;
	
	private double unidadesTerminadas;
	
	private FlujoFisico flujoFisico;
	private CostoPorUnidad costoPorUnidad;
	private AsignacionDeCostos asignacionDeCostos;
	
	private double costoTransferidoPorUnidad;
	
	public Departament(double inventarioInicialUnidades, double mDinvenrarioInicial, double mODinventarioInicial,
			double cIFinventarioInicial, double cCinventarioIncial, double porcentajeMDinventarioInicial,
			double porcentajeMODinventarioInicial, double porcentajeCIFinventarioInicial,
			double porcentajeCCinventarioIncial, double productoEnProceso, double mD, double mOD, double cIF, double cC,
			double inventarioFinal, double porcentajeMDinventarioFinal, double porcentajeMODinventarioFinal,
			double porcentajeCIFinventarioFinal, double porcentajeCCinventarioFinal, double unidadesTerminadas,
			double costoTransferidoPorUnidad, boolean porCC) {
		super();
		this.inventarioInicialUnidades = inventarioInicialUnidades;
		MDinvenrarioInicial = mDinvenrarioInicial;
		MODinventarioInicial = mODinventarioInicial;
		CIFinventarioInicial = cIFinventarioInicial;
//		CCinventarioIncial = cCinventarioIncial;
		this.porcentajeMDinventarioInicial = porcentajeMDinventarioInicial;
		this.porcentajeMODinventarioInicial = porcentajeMODinventarioInicial;
		this.porcentajeCIFinventarioInicial = porcentajeCIFinventarioInicial;
		this.porcentajeCCinventarioIncial = porcentajeCCinventarioIncial;
		this.productoEnProceso = productoEnProceso;
		MD = mD;
		MOD = mOD;
		CIF = cIF;
//		CC = cC;
		this.inventarioFinal = inventarioFinal;
		this.porcentajeMDinventarioFinal = porcentajeMDinventarioFinal;
		this.porcentajeMODinventarioFinal = porcentajeMODinventarioFinal;
		this.porcentajeCIFinventarioFinal = porcentajeCIFinventarioFinal;
		this.porcentajeCCinventarioFinal = porcentajeCCinventarioFinal;
		this.unidadesTerminadas = unidadesTerminadas;
		this.costoTransferidoPorUnidad = costoTransferidoPorUnidad;
		
		flujoFisico = new FlujoFisico(porCC);
		costoPorUnidad = new CostoPorUnidad(porCC);
		asignacionDeCostos = new AsignacionDeCostos(porCC);
	}

	public void calcularCostos() {
		//flujo
		flujoFisico.unidadesEnProceso(inventarioInicialUnidades, productoEnProceso); 
		
		flujoFisico.unidadesComenzadasYterminadas(productoEnProceso-inventarioFinal);
				
		//Produccion Equivalente
		flujoFisico.totalUnidadesAcostear(inventarioInicialUnidades, inventarioFinal);
		flujoFisico.produccionEquivalenteInventarioInicial(porcentajeMDinventarioInicial,porcentajeMODinventarioInicial,porcentajeCIFinventarioInicial, porcentajeCCinventarioIncial, inventarioInicialUnidades);
		flujoFisico.produccionEquivalenteInventarioFinal(porcentajeMDinventarioFinal,porcentajeMODinventarioFinal,porcentajeCIFinventarioFinal, porcentajeCCinventarioFinal , inventarioFinal);
		flujoFisico.unidadesAcostearMD();
		flujoFisico.unidadesAcostearM0D();
		flujoFisico.unidadesAcostearCIF();
		flujoFisico.unidadesAcostearCC();
		
		
		//costo por Unidad
		costoPorUnidad.costoPorUnidadMD(MD, flujoFisico.getUnidadesAcostearMD());
		costoPorUnidad.costoPorUnidadMOD(MOD, flujoFisico.getUnidadesAcostearMOD(), flujoFisico.getUnidadesAcostearCC());
		costoPorUnidad.costoPorUnidadCIF(CIF, flujoFisico.getUnidadesAcostearCIF(), flujoFisico.getUnidadesAcostearCC());
		costoPorUnidad.totalCostoPorUnidad(costoTransferidoPorUnidad);
		
		//Asignacion de costos
		asignacionDeCostos.totalCostoProductoTerminado(MDinvenrarioInicial, MODinventarioInicial, CIFinventarioInicial, flujoFisico.getMDequivalenteInventarioInicial(), costoPorUnidad.getCostoMDporUnidad(), flujoFisico.getMODequivalenteInventarioInicial(), costoPorUnidad.getCostoMODporUnidad(), flujoFisico.getCIFequivalenteInventarioInicial(), costoPorUnidad.getCostoCIFporUnidad(), flujoFisico.getCCequivalenteInventarioInicial(), (productoEnProceso-inventarioFinal), costoPorUnidad.getTotalCostoPorUnidad());
		asignacionDeCostos.totalCostoProductoEnProceso(inventarioFinal, costoTransferidoPorUnidad, flujoFisico.getMDequivalenteInventarioFinal(), costoPorUnidad.getCostoMDporUnidad(), flujoFisico.getMODequivalenteInventarioFinal(), costoPorUnidad.getCostoMODporUnidad(), flujoFisico.getCIFequivalenteInventarioFinal(), costoPorUnidad.getCostoCIFporUnidad(), flujoFisico.getCCequivalenteInventarioFinal());
			
		
	}
	
	


	public double getInventarioInicialUnidades() {
		return inventarioInicialUnidades;
	}


	public void setInventarioInicialUnidades(double inventarioInicialUnidades) {
		this.inventarioInicialUnidades = inventarioInicialUnidades;
	}


	public double getMDinvenrarioInicial() {
		return MDinvenrarioInicial;
	}


	public void setMDinvenrarioInicial(double mDinvenrarioInicial) {
		MDinvenrarioInicial = mDinvenrarioInicial;
	}


	public double getMODinventarioInicial() {
		return MODinventarioInicial;
	}


	public void setMODinventarioInicial(double mODinventarioInicial) {
		MODinventarioInicial = mODinventarioInicial;
	}


	public double getCIFinventarioInicial() {
		return CIFinventarioInicial;
	}


	public void setCIFinventarioInicial(double cIFinventarioInicial) {
		CIFinventarioInicial = cIFinventarioInicial;
	}


	public double getProductoEnProceso() {
		return productoEnProceso;
	}


	public void setProductoEnProceso(double productoEnProceso) {
		this.productoEnProceso = productoEnProceso;
	}


	public double getMD() {
		return MD;
	}


	public void setMD(double mD) {
		MD = mD;
	}


	public double getMOD() {
		return MOD;
	}


	public void setMOD(double mOD) {
		MOD = mOD;
	}


	public double getCIF() {
		return CIF;
	}


	public void setCIF(double cIF) {
		CIF = cIF;
	}


	public double getInventarioFinal() {
		return inventarioFinal;
	}


	public void setInventarioFinal(double inventarioFinal) {
		this.inventarioFinal = inventarioFinal;
	}


	public double getPorcentajeMDinventarioInicial() {
		return porcentajeMDinventarioInicial;
	}


	public void setPorcentajeMDinventarioInicial(double porcentajeMDinventarioInicial) {
		this.porcentajeMDinventarioInicial = porcentajeMDinventarioInicial;
	}


	public double getPorcentajeMODinventarioInicial() {
		return porcentajeMODinventarioInicial;
	}


	public void setPorcentajeMODinventarioInicial(double porcentajeMODinventarioInicial) {
		this.porcentajeMODinventarioInicial = porcentajeMODinventarioInicial;
	}


	public double getPorcentajeCIFinventarioInicial() {
		return porcentajeCIFinventarioInicial;
	}


	public void setPorcentajeCIFinventarioInicial(double porcentajeCIFinventarioInicial) {
		this.porcentajeCIFinventarioInicial = porcentajeCIFinventarioInicial;
	}


	public double getPorcentajeMDinventarioFinal() {
		return porcentajeMDinventarioFinal;
	}


	public void setPorcentajeMDinventarioFinal(double porcentajeMDinventarioFinal) {
		this.porcentajeMDinventarioFinal = porcentajeMDinventarioFinal;
	}


	public double getPorcentajeMODinventarioFinal() {
		return porcentajeMODinventarioFinal;
	}


	public void setPorcentajeMODinventarioFinal(double porcentajeMODinventarioFinal) {
		this.porcentajeMODinventarioFinal = porcentajeMODinventarioFinal;
	}


	public double getPorcentajeCIFinventarioFinal() {
		return porcentajeCIFinventarioFinal;
	}


	public void setPorcentajeCIFinventarioFinal(double porcentajeCIFinventarioFinal) {
		this.porcentajeCIFinventarioFinal = porcentajeCIFinventarioFinal;
	}


	public double getInventarioFinalUnidades() {
		return unidadesTerminadas;
	}


	public void setInventarioFinalUnidades(double inventarioFinalUnidades) {
		this.unidadesTerminadas = inventarioFinalUnidades;
	}


	public FlujoFisico getFlujoFisico() {
		return flujoFisico;
	}


	public void setFlujoFisico(FlujoFisico flujoFisico) {
		this.flujoFisico = flujoFisico;
	}


	public CostoPorUnidad getCostoPorUnidad() {
		return costoPorUnidad;
	}


	public void setCostoPorUnidad(CostoPorUnidad costoPorUnidad) {
		this.costoPorUnidad = costoPorUnidad;
	}


	public AsignacionDeCostos getAsignacionDeCostos() {
		return asignacionDeCostos;
	}


	public void setAsignacionDeCostos(AsignacionDeCostos asignacionDeCostos) {
		this.asignacionDeCostos = asignacionDeCostos;
	}


	public double getCostoTransferidoPorUnidad() {
		return costoTransferidoPorUnidad;
	}


	public void setCostoTransferidoPorUnidad(double costoTransferidoPorUnidad) {
		this.costoTransferidoPorUnidad = costoTransferidoPorUnidad;
	}
	
	
	

	
}
