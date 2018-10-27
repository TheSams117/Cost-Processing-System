package model;

public class CostForUnit {

	private double DirectMaterialCostUnit;
	private double DirectWorkforceCostUnit;
	private double indirectManufacturingCostsUnit;
	private double totalCostsForUnit;
	private double costTransferred;
	
	
	private double costMD;
	private double costMOD;
	private double costCIF;
	
	private double unitMD;
	private double unitMOD;
	private double unitCIF;
	
	
	
	public CostForUnit(double directMaterial, double md, double directWorkforce, double mod, double indirectManufacturingCosts, double cif, double costTransferredPerUnit) {
		super();
		this.costMD = directMaterial;
		this.unitMD = md;
		this.costMOD = directWorkforce;
		this.unitMOD = mod;
		this.costCIF = indirectManufacturingCosts;
		this.unitCIF = cif;
		this.costTransferred = costTransferredPerUnit;
	}
	
	public double getDirectMaterialCostUnit() {
		return DirectMaterialCostUnit;
	}
	public void setDirectMaterialCostUnit(double directMaterialCostUnit) {
		DirectMaterialCostUnit = directMaterialCostUnit;
	}
	public double getDirectWorkforceCostUnit() {
		return DirectWorkforceCostUnit;
	}
	public void setDirectWorkforceCostUnit(double directWorkforceCostUnit) {
		DirectWorkforceCostUnit = directWorkforceCostUnit;
	}
	public double getIndirectManufacturingCostsUnit() {
		return indirectManufacturingCostsUnit;
	}
	public void setIndirectManufacturingCostsUnit(double indirectManufacturingCostsUnit) {
		this.indirectManufacturingCostsUnit = indirectManufacturingCostsUnit;
	}
	public double getTotalCostsForUnit() {
		return totalCostsForUnit;
	}
	public void setTotalCostsForUnit(double totalCostsForUnit) {
		this.totalCostsForUnit = totalCostsForUnit;
	}
	public double getCostTransferred() {
		return costTransferred;
	}
	public void setCostTransferred(double costTransferred) {
		this.costTransferred = costTransferred;
	}
	
	
	
	
}
