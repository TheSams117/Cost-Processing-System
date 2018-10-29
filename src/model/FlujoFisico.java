package model;

public class FlujoFisico {
// jejeje
	private double unidadesEnProceso;
	private double unidadesAcostear;

	private double MDequivalenteInventarioInicial;
	private double MODequivalenteInventarioInicial;
	private double CIFequivalenteInventarioInicial;
	private double CCequivalenteInventarioInicial;

	private double unidadesComenzadasYterminadas; 

	private double MDequivalenteInventarioFinal;
	private double MODequivalenteInventarioFinal;
	private double CIFequivalenteInventarioFinal;
	private double CCequivalenteInventarioFinal;

	private double unidadesAcostearMD;
	private double unidadesAcostearMOD;
	private double unidadesAcostearCIF;
	private double unidadesAcostearCC;
	
	private boolean porCC;

	public FlujoFisico(boolean porCC) {
		this.porCC = porCC;
	}
	
	public void unidadesEnProceso(double inventarioInicial, double unidadesComenzadas) {
		unidadesEnProceso = inventarioInicial + unidadesComenzadas;
	}
	
	public void unidadesComenzadasYterminadas(double comenzadasYterminadas) {
		this.unidadesComenzadasYterminadas = comenzadasYterminadas;
	}

	public void totalUnidadesAcostear(double inventarioInicial,  double inventarioFinal) {
		unidadesAcostear = inventarioInicial + unidadesComenzadasYterminadas + inventarioFinal;
	}

	public void produccionEquivalenteInventarioInicial(double porcentajeMD, double porcentajeMOD, double porcentajeCIF,
			double porcentajeCC, double inventarioInicialPP) {
		
		MDequivalenteInventarioInicial = ((100 - porcentajeMD) / 100) * inventarioInicialPP;
		if(porCC) {
			CCequivalenteInventarioInicial = ((100 - porcentajeCC) / 100) * inventarioInicialPP;			
		}else {
			MODequivalenteInventarioInicial = ((100 - porcentajeMOD) / 100) * inventarioInicialPP;
			CIFequivalenteInventarioInicial = ((100 - porcentajeCIF) / 100) * inventarioInicialPP;			
		}
	
	}

	public void produccionEquivalenteInventarioFinal(double porcentajeMD, double porcentajeMOD, double porcentajeCIF,
			double porcentajeCC, double inventarioFinalPP) {
		
		MDequivalenteInventarioFinal = ((porcentajeMD) / 100) * inventarioFinalPP;
		if(porCC) {
			CCequivalenteInventarioFinal = (( porcentajeCC) / 100) * inventarioFinalPP;			
		}else {
			MODequivalenteInventarioFinal = ((porcentajeMOD) / 100) * inventarioFinalPP;
			CIFequivalenteInventarioFinal = ((porcentajeCIF) / 100) * inventarioFinalPP;			
		}
	}

	public void unidadesAcostearMD() {
		unidadesAcostearMD = MDequivalenteInventarioInicial + unidadesComenzadasYterminadas + MDequivalenteInventarioFinal;
	}

	public void unidadesAcostearM0D() {
		if(porCC) {
			unidadesAcostearMOD = 0;
		}else {
			unidadesAcostearMOD = MODequivalenteInventarioInicial + unidadesComenzadasYterminadas + MODequivalenteInventarioFinal;						
		}
	}

	public void unidadesAcostearCIF() {
		if(porCC) {
			unidadesAcostearCIF = 0;
		}else {
			unidadesAcostearCIF = CIFequivalenteInventarioInicial + unidadesComenzadasYterminadas + CIFequivalenteInventarioFinal;			
		}
	}

	public void unidadesAcostearCC() {
		if(porCC) {
			unidadesAcostearCC = CCequivalenteInventarioInicial + unidadesComenzadasYterminadas + CCequivalenteInventarioFinal;			
		}else {
			unidadesAcostearCC = 0;
		}
	}
	
	
	//SET AND GET
	public double getUnidadesEnProceso() {
		return unidadesEnProceso;
	}

	public void setUnidadesEnProceso(double unidadesEnProceso) {
		this.unidadesEnProceso = unidadesEnProceso;
	}

	public double getUnidadesAcostear() {
		return unidadesAcostear;
	}

	public void setUnidadesAcostear(double unidadesAcostear) {
		this.unidadesAcostear = unidadesAcostear;
	}

	public double getMDequivalenteInventarioInicial() {
		return MDequivalenteInventarioInicial;
	}

	public void setMDequivalenteInventarioInicial(double mDequivalenteInventarioInicial) {
		MDequivalenteInventarioInicial = mDequivalenteInventarioInicial;
	}

	public double getMODequivalenteInventarioInicial() {
		return MODequivalenteInventarioInicial;
	}

	public void setMODequivalenteInventarioInicial(double mODequivalenteInventarioInicial) {
		MODequivalenteInventarioInicial = mODequivalenteInventarioInicial;
	}

	public double getCIFequivalenteInventarioInicial() {
		return CIFequivalenteInventarioInicial;
	}

	public void setCIFequivalenteInventarioInicial(double cIFequivalenteInventarioInicial) {
		CIFequivalenteInventarioInicial = cIFequivalenteInventarioInicial;
	}

	public double getCCequivalenteInventarioInicial() {
		return CCequivalenteInventarioInicial;
	}

	public void setCCequivalenteInventarioInicial(double cCequivalenteInventarioInicial) {
		CCequivalenteInventarioInicial = cCequivalenteInventarioInicial;
	}

	public double getUnidadesComenzadasYterminadas() {
		return unidadesComenzadasYterminadas;
	}

	public void setUnidadesComenzadasYterminadas(double unidadesComenzadasYterminadas) {
		this.unidadesComenzadasYterminadas = unidadesComenzadasYterminadas;
	}

	public double getMDequivalenteInventarioFinal() {
		return MDequivalenteInventarioFinal;
	}

	public void setMDequivalenteInventarioFinal(double mDequivalenteInventarioFinal) {
		MDequivalenteInventarioFinal = mDequivalenteInventarioFinal;
	}

	public double getMODequivalenteInventarioFinal() {
		return MODequivalenteInventarioFinal;
	}

	public void setMODequivalenteInventarioFinal(double mODequivalenteInventarioFinal) {
		MODequivalenteInventarioFinal = mODequivalenteInventarioFinal;
	}

	public double getCIFequivalenteInventarioFinal() {
		return CIFequivalenteInventarioFinal;
	}

	public void setCIFequivalenteInventarioFinal(double cIFequivalenteInventarioFinal) {
		CIFequivalenteInventarioFinal = cIFequivalenteInventarioFinal;
	}

	public double getCCequivalenteInventarioFinal() {
		return CCequivalenteInventarioFinal;
	}

	public void setCCequivalenteInventarioFinal(double cCequivalenteInventarioFinal) {
		CCequivalenteInventarioFinal = cCequivalenteInventarioFinal;
	}

	public double getUnidadesAcostearMD() {
		return unidadesAcostearMD;
	}

	public void setUnidadesAcostearMD(double unidadesAcostearMD) {
		this.unidadesAcostearMD = unidadesAcostearMD;
	}

	public double getUnidadesAcostearMOD() {
		return unidadesAcostearMOD;
	}

	public void setUnidadesAcostearMOD(double unidadesAcostearMOD) {
		this.unidadesAcostearMOD = unidadesAcostearMOD;
	}

	public double getUnidadesAcostearCIF() {
		return unidadesAcostearCIF;
	}

	public void setUnidadesAcostearCIF(double unidadesAcostearCIF) {
		this.unidadesAcostearCIF = unidadesAcostearCIF;
	}

	public double getUnidadesAcostearCC() {
		return unidadesAcostearCC;
	}

	public void setUnidadesAcostearCC(double unidadesAcostearCC) {
		this.unidadesAcostearCC = unidadesAcostearCC;
	}
	
	
	

	
}
