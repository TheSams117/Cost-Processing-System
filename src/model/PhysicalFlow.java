package model;

public class PhysicalFlow {

	private double initialInventoryPP;
	private double startedUnits;
	private double unitsInProcess;
	
	
	private double initialDirectMaterial;
	private double initialDirectWorkforce;
	private double initialIndirectManufacturingCosts;
	
	
	private double startedAndFinished;
	
	
	private double finalInventoryPP;
	private double finalInventoryPPDirectMaterial;
	private double finalInventoryPPDirectWorkforce;
	private double finalInventoryPPIndirectManufacturingCosts;
	
	
	private double unitsToPay;
	private double unitsToPayDirectMaterial;
	private double unitsToPayDirectWorkforce;
	private double unitsToPayIndirectManufacturingCosts;
	
	private double initialDirectMaterialPercentage;
	private double initialDirectWorkforcePercentage;
	private double initialIndirectManufacturingCostsPercentage;
	private double finalDirectMaterialPercentage;
	private double finalDirectWorkforcePercentage;
	private double finalIndirectManufacturingCostsPercentage;
	
	
	public PhysicalFlow(double initialInventoryPP, double productOnProcess, double startedAndFinished, double finalInventory ,double initialDirectMaterialPercentage, double initialDirectWorkforcePercentage,
			double initialIndirectManufacturingCostsPercentage, double finalDirectMaterialPercentage,
			double finalDirectWorkforcePercentage, double finalIndirectManufacturingCostsPercentage) {
		
		this.initialInventoryPP = initialInventoryPP;
		this.startedUnits = productOnProcess;
		
		this.startedAndFinished = startedAndFinished;
		this.finalInventoryPP = finalInventory;
		
		this.initialDirectMaterialPercentage = initialDirectMaterialPercentage;
		this.initialDirectWorkforcePercentage = initialDirectWorkforcePercentage;
		this.initialIndirectManufacturingCostsPercentage = initialIndirectManufacturingCostsPercentage;
		this.finalDirectMaterialPercentage = finalDirectMaterialPercentage;
		this.finalDirectWorkforcePercentage = finalDirectWorkforcePercentage;
		this.finalIndirectManufacturingCostsPercentage = finalIndirectManufacturingCostsPercentage;
	}

	public void unitsInProcess() {
		unitsInProcess = initialInventoryPP+startedUnits;
	}
	
	public void equivalentProduction() {
		initialDirectMaterial = ((100-initialDirectMaterialPercentage)/100)*initialInventoryPP;
		initialDirectWorkforce = ((100-initialDirectWorkforce)/100)*initialInventoryPP;
		initialIndirectManufacturingCosts = ((100-initialIndirectManufacturingCostsPercentage)/100)*initialInventoryPP;
		
		
		finalInventoryPPDirectMaterial = finalDirectMaterialPercentage*finalInventoryPP;
		finalInventoryPPDirectWorkforce = finalDirectWorkforcePercentage*finalInventoryPP;
		finalInventoryPPIndirectManufacturingCosts = finalIndirectManufacturingCostsPercentage*finalInventoryPP;
		
		unitsToPay = initialInventoryPP+startedUnits+finalInventoryPP;
		unitsToPayDirectMaterial = initialDirectMaterial + startedAndFinished +  finalInventoryPPDirectMaterial;
		unitsToPayDirectWorkforce = initialDirectWorkforce + startedAndFinished + finalInventoryPPDirectWorkforce ;
		unitsToPayIndirectManufacturingCosts = initialIndirectManufacturingCosts + startedAndFinished + finalInventoryPPDirectWorkforce ;
	}

	public double getInitialInventoryPP() {
		return initialInventoryPP;
	}


	public void setInitialInventoryPP(double initialInventoryPP) {
		this.initialInventoryPP = initialInventoryPP;
	}


	public double getStartedUnits() {
		return startedUnits;
	}


	public void setStartedUnits(double startedUnits) {
		this.startedUnits = startedUnits;
	}


	public double getUnitsInProcess() {
		return unitsInProcess;
	}


	public void setUnitsInProcess(double unitsInProcess) {
		this.unitsInProcess = unitsInProcess;
	}


	public double getStartedAndFinished() {
		return startedAndFinished;
	}


	public void setStartedAndFinished(double startedAndFinished) {
		this.startedAndFinished = startedAndFinished;
	}


	public double getFinalInventoryPP() {
		return finalInventoryPP;
	}


	public void setFinalInventoryPP(double finalInventoryPP) {
		this.finalInventoryPP = finalInventoryPP;
	}


	public double getFinalInventoryPPDirectMaterial() {
		return finalInventoryPPDirectMaterial;
	}


	public void setFinalInventoryPPDirectMaterial(double finalInventoryPPDirectMaterial) {
		this.finalInventoryPPDirectMaterial = finalInventoryPPDirectMaterial;
	}


	public double getFinalInventoryPPDirectWorkforce() {
		return finalInventoryPPDirectWorkforce;
	}


	public void setFinalInventoryPPDirectWorkforce(double finalInventoryPPDirectWorkforce) {
		this.finalInventoryPPDirectWorkforce = finalInventoryPPDirectWorkforce;
	}


	public double getFinalInventoryPPIndirectManufacturingCosts() {
		return finalInventoryPPIndirectManufacturingCosts;
	}


	public void setFinalInventoryPPIndirectManufacturingCosts(double finalInventoryPPIndirectManufacturingCosts) {
		this.finalInventoryPPIndirectManufacturingCosts = finalInventoryPPIndirectManufacturingCosts;
	}


	public double getUnitsToPay() {
		return unitsToPay;
	}


	public void setUnitsToPay(double unitsToPay) {
		this.unitsToPay = unitsToPay;
	}


	public double getUnitsToPayDirectMaterial() {
		return unitsToPayDirectMaterial;
	}


	public void setUnitsToPayDirectMaterial(double unitsToPayDirectMaterial) {
		this.unitsToPayDirectMaterial = unitsToPayDirectMaterial;
	}


	public double getUnitsToPayDirectWorkforce() {
		return unitsToPayDirectWorkforce;
	}


	public void setUnitsToPayDirectWorkforce(double unitsToPayDirectWorkforce) {
		this.unitsToPayDirectWorkforce = unitsToPayDirectWorkforce;
	}


	public double getUnitsToPayIndirectManufacturingCosts() {
		return unitsToPayIndirectManufacturingCosts;
	}


	public void setUnitsToPayIndirectManufacturingCosts(double unitsToPayIndirectManufacturingCosts) {
		this.unitsToPayIndirectManufacturingCosts = unitsToPayIndirectManufacturingCosts;
	}


	public double getInitialDirectMaterial() {
		return initialDirectMaterial;
	}


	public void setInitialDirectMaterial(double initialDirectMaterial) {
		this.initialDirectMaterial = initialDirectMaterial;
	}


	public double getInitialDirectWorkforce() {
		return initialDirectWorkforce;
	}


	public void setInitialDirectWorkforce(double initialDirectWorkforce) {
		this.initialDirectWorkforce = initialDirectWorkforce;
	}


	public double getInitialIndirectManufacturingCosts() {
		return initialIndirectManufacturingCosts;
	}


	public void setInitialIndirectManufacturingCosts(double initialIndirectManufacturingCosts) {
		this.initialIndirectManufacturingCosts = initialIndirectManufacturingCosts;
	}


	public double getInitialDirectMaterialPercentage() {
		return initialDirectMaterialPercentage;
	}


	public void setInitialDirectMaterialPercentage(double initialDirectMaterialPercentage) {
		this.initialDirectMaterialPercentage = initialDirectMaterialPercentage;
	}


	public double getInitialDirectWorkforcePercentage() {
		return initialDirectWorkforcePercentage;
	}


	public void setInitialDirectWorkforcePercentage(double initialDirectWorkforcePercentage) {
		this.initialDirectWorkforcePercentage = initialDirectWorkforcePercentage;
	}


	public double getInitialIndirectManufacturingCostsPercentage() {
		return initialIndirectManufacturingCostsPercentage;
	}


	public void setInitialIndirectManufacturingCostsPercentage(double initialIndirectManufacturingCostsPercentage) {
		this.initialIndirectManufacturingCostsPercentage = initialIndirectManufacturingCostsPercentage;
	}


	public double getFinalDirectMaterialPercentage() {
		return finalDirectMaterialPercentage;
	}


	public void setFinalDirectMaterialPercentage(double finalDirectMaterialPercentage) {
		this.finalDirectMaterialPercentage = finalDirectMaterialPercentage;
	}


	public double getFinalDirectWorkforcePercentage() {
		return finalDirectWorkforcePercentage;
	}


	public void setFinalDirectWorkforcePercentage(double finalDirectWorkforcePercentage) {
		this.finalDirectWorkforcePercentage = finalDirectWorkforcePercentage;
	}


	public double getFinalIndirectManufacturingCostsPercentage() {
		return finalIndirectManufacturingCostsPercentage;
	}


	public void setFinalIndirectManufacturingCostsPercentage(double finalIndirectManufacturingCostsPercentage) {
		this.finalIndirectManufacturingCostsPercentage = finalIndirectManufacturingCostsPercentage;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
