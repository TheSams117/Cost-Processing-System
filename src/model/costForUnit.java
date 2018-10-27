package model;

public class costForUnit {

	private double DirectMaterialCostUnit;
	private double DirectWorkforceCostUnit;
	private double indirectManufacturingCostsUnit;
	private double totalCostsForUnit;
	private double costTransferred;
	
	public costForUnit(double directMaterialCostUnit, double directWorkforceCostUnit,
			double indirectManufacturingCostsUnit, double totalCostsForUnit, double costTransferred) {
		super();
		DirectMaterialCostUnit = directMaterialCostUnit;
		DirectWorkforceCostUnit = directWorkforceCostUnit;
		this.indirectManufacturingCostsUnit = indirectManufacturingCostsUnit;
		this.totalCostsForUnit = totalCostsForUnit;
		this.costTransferred = costTransferred;
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
