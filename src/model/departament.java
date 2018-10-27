package model;

public class departament {
	
	private double directMaterial;
	private double directWorkforce;
	private double indirectManufacturingCosts;
	private double initialInventory;
	private double productOnProcess;
	private double finalInventory;
	private double initialDirectMaterialPercentage;
	private double initialDirectWorkforcePercentage;
	private double initialIndirectManufacturingCostsPercentage;
	private double finalDirectMaterialPercentage;
	private double finalDirectWorkforcePercentage;
	private double finalIndirectManufacturingCostsPercentage;
	
	
	private physicalFlow physicalFlow;
	private costForUnit costForUnit;
	private assignmentOfCost assignmentOfCost;
	
		
	public departament(double directMaterial, double directWorkforce, double indirectManufacturingCosts,
			double initialInventory, double productOnProcess, double finalInventory,
			double initialDirectMaterialPercentage, double initialDirectWorkforcePercentage,
			double initialIndirectManufacturingCostsPercentage, double finalDirectMaterialPercentage,
			double finalDirectWorkforcePercentage, double finalIndirectManufacturingCostsPercentage) {
		super();
		this.directMaterial = directMaterial;
		this.directWorkforce = directWorkforce;
		this.indirectManufacturingCosts = indirectManufacturingCosts;
		this.initialInventory = initialInventory;
		this.productOnProcess = productOnProcess;
		this.finalInventory = finalInventory;
		this.initialDirectMaterialPercentage = initialDirectMaterialPercentage;
		this.initialDirectWorkforcePercentage = initialDirectWorkforcePercentage;
		this.initialIndirectManufacturingCostsPercentage = initialIndirectManufacturingCostsPercentage;
		this.finalDirectMaterialPercentage = finalDirectMaterialPercentage;
		this.finalDirectWorkforcePercentage = finalDirectWorkforcePercentage;
		this.finalIndirectManufacturingCostsPercentage = finalIndirectManufacturingCostsPercentage;
	}
	
	
	public double getDirectMaterial() {
		return directMaterial;
	}
	public void setDirectMaterial(double directMaterial) {
		this.directMaterial = directMaterial;
	}
	public double getDirectWorkforce() {
		return directWorkforce;
	}
	public void setDirectWorkforce(double directWorkforce) {
		this.directWorkforce = directWorkforce;
	}
	public double getIndirectManufacturingCosts() {
		return indirectManufacturingCosts;
	}
	public void setIndirectManufacturingCosts(double indirectManufacturingCosts) {
		this.indirectManufacturingCosts = indirectManufacturingCosts;
	}
	public double getInitialInventory() {
		return initialInventory;
	}
	public void setInitialInventory(double initialInventory) {
		this.initialInventory = initialInventory;
	}
	public double getProductOnProcess() {
		return productOnProcess;
	}
	public void setProductOnProcess(double productOnProcess) {
		this.productOnProcess = productOnProcess;
	}
	public double getFinalInventory() {
		return finalInventory;
	}
	public void setFinalInventory(double finalInventory) {
		this.finalInventory = finalInventory;
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
