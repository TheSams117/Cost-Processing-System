package model;

public class Departament {
	
	
	private double initialInventory;
	private double InitialInventorydirectMaterial;
	private double InitialInventorydirectWorkforce;
	private double InitialInventoryindirectManufacturingCosts;
	
	
	private double productOnProcess;
	private double directMaterial;
	private double directWorkforce;
	private double indirectManufacturingCosts;
	
	private double finalInventory;
	

	private double initialDirectMaterialPercentage;
	private double initialDirectWorkforcePercentage;
	private double initialIndirectManufacturingCostsPercentage;
	private double finalDirectMaterialPercentage;
	private double finalDirectWorkforcePercentage;
	private double finalIndirectManufacturingCostsPercentage;
	private double finishedUnits;
	
	
	private PhysicalFlow physicalFlow;
	private CostForUnit costForUnit;
	private AssignmentOfCost assignmentOfCost;
	
	private double costTransferredPerUnit;
	
	
	
	
	public Departament(double initialInventory, double initialInventorydirectMaterial,
			double initialInventorydirectWorkforce, double initialInventoryindirectManufacturingCosts,
			double productOnProcess, double directMaterial, double directWorkforce, double indirectManufacturingCosts,
			double finalInventory, double initialDirectMaterialPercentage, double initialDirectWorkforcePercentage,
			double initialIndirectManufacturingCostsPercentage, double finalDirectMaterialPercentage,
			double finalDirectWorkforcePercentage, double finalIndirectManufacturingCostsPercentage,
			double finishedUnits, double costTransferredPerUnit) {
		super();
		this.initialInventory = initialInventory;
		InitialInventorydirectMaterial = initialInventorydirectMaterial;
		InitialInventorydirectWorkforce = initialInventorydirectWorkforce;
		InitialInventoryindirectManufacturingCosts = initialInventoryindirectManufacturingCosts;
		this.productOnProcess = productOnProcess;
		this.directMaterial = directMaterial;
		this.directWorkforce = directWorkforce;
		this.indirectManufacturingCosts = indirectManufacturingCosts;
		this.finalInventory = finalInventory;
		this.initialDirectMaterialPercentage = initialDirectMaterialPercentage;
		this.initialDirectWorkforcePercentage = initialDirectWorkforcePercentage;
		this.initialIndirectManufacturingCostsPercentage = initialIndirectManufacturingCostsPercentage;
		this.finalDirectMaterialPercentage = finalDirectMaterialPercentage;
		this.finalDirectWorkforcePercentage = finalDirectWorkforcePercentage;
		this.finalIndirectManufacturingCostsPercentage = finalIndirectManufacturingCostsPercentage;
		this.finishedUnits = finishedUnits;
		this.costTransferredPerUnit = costTransferredPerUnit;
		
		
		relations();
	}


	public void relations() {
		
		this.physicalFlow = new PhysicalFlow(this.initialInventory, this.productOnProcess, (this.productOnProcess-this.finalInventory), this.finalInventory , initialDirectMaterialPercentage, initialDirectWorkforcePercentage, initialIndirectManufacturingCostsPercentage, finalDirectMaterialPercentage, finalDirectWorkforcePercentage, finalIndirectManufacturingCostsPercentage);
		
		double md = physicalFlow.getUnitsToPayDirectMaterial();
		double mod = physicalFlow.getUnitsToPayDirectWorkforce();
		double cif = physicalFlow.getUnitsToPayIndirectManufacturingCosts();
		
		this.costForUnit = new CostForUnit(this.directMaterial, md, this.directWorkforce, mod, this.indirectManufacturingCosts, cif, this.costTransferredPerUnit );
		
		double InitialInvMd = physicalFlow.getInitialDirectMaterialPP();
		double InitialInvMod = physicalFlow.getInitialDirectWorkforcePP();
		double InitialInvCif = physicalFlow.getInitialIndirectManufacturingCostsPP();
		
		double CostUndMd = costForUnit.getDirectMaterialCostUnit();
		double CostUndMod = costForUnit.getDirectWorkforceCostUnit();
		double CostUndCif = costForUnit.getIndirectManufacturingCostsUnit();
		
		double startedAndFinished = physicalFlow.getStartedAndFinished();
		double  costUnd = costForUnit.getTotalCostsForUnit();
		
		double finalInvlMd = physicalFlow.getInitialDirectMaterialPP();
		double finalInvMod = physicalFlow.getInitialDirectWorkforcePP();
		double finalInvCif = physicalFlow.getInitialIndirectManufacturingCostsPP();
		
		this.assignmentOfCost = new AssignmentOfCost(this.InitialInventorydirectMaterial, this.InitialInventorydirectWorkforce, this.InitialInventoryindirectManufacturingCosts, InitialInvMd, InitialInvMod, InitialInvCif, CostUndMd, CostUndMod, CostUndCif, startedAndFinished, costUnd, finalInvlMd, finalInvMod, finalInvCif);
		
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


	public double getFinishedUnits() {
		return finishedUnits;
	}


	public void setFinishedUnits(double finishedUnits) {
		this.finishedUnits = finishedUnits;
	}


	public PhysicalFlow getPhysicalFlow() {
		return physicalFlow;
	}


	public void setPhysicalFlow(PhysicalFlow physicalFlow) {
		this.physicalFlow = physicalFlow;
	}


	public CostForUnit getCostForUnit() {
		return costForUnit;
	}


	public void setCostForUnit(CostForUnit costForUnit) {
		this.costForUnit = costForUnit;
	}


	public AssignmentOfCost getAssignmentOfCost() {
		return assignmentOfCost;
	}


	public void setAssignmentOfCost(AssignmentOfCost assignmentOfCost) {
		this.assignmentOfCost = assignmentOfCost;
	}


	
	
	
	
}
