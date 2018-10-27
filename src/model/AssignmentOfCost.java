package model;

public class AssignmentOfCost {
	
//	private double finishedProduct;
	private double initialInventory;
	
	private double initialInventoryMD;
	private double initialInventoryMOD;
	private double initialInventoryCIF;
	
	private double startedAndFinished;
	private double totalCostsFinishedProduct;
	private double totalProductOnProcess;
	
	private double productOnProcessMD;
	private double productOnProcessMOD;
	private double productOnProcessCIF;

	
	public AssignmentOfCost(double initialInventorydirectMaterial, double initialInventorydirectWorkforce, double initialInventoryindirectManufacturingCosts, double initialInvMd, double initialInvMod, double initialInvCif, double costUndMd, double costUndMod, double costUndCif, double startedAndFinished2, double costUnd, double finalInvlMd, double finalInvMod, double finalInvCif) {
		super();
		this.initialInventory = initialInventorydirectMaterial+initialInventorydirectWorkforce+initialInventoryindirectManufacturingCosts;
		this.initialInventoryMD = initialInvMd*costUndMd;
		this.initialInventoryMOD = initialInvMod*costUndMod;
		this.initialInventoryCIF = initialInvCif*costUndCif;
		this.startedAndFinished = startedAndFinished2*costUnd;
		this.totalCostsFinishedProduct = this.initialInventory+this.initialInventoryMD+this.initialInventoryMOD+this.initialInventoryCIF+this.startedAndFinished;
		this.productOnProcessMD = finalInvlMd*costUndMd;
		this.productOnProcessMOD = finalInvMod*costUndMod;
		this.productOnProcessCIF = finalInvCif*costUndCif;
		this.totalProductOnProcess = this.productOnProcessMD+this.productOnProcessMOD+this.productOnProcessCIF;
	}
	
	public double getInitialInventoy() {
		return initialInventory;
	}
	public void setInitialInventoy(double initialInventoy) {
		this.initialInventory = initialInventoy;
	}
	public double getInitialInventoyMD() {
		return initialInventoryMD;
	}
	public void setInitialInventoyMD(double initialInventoyMD) {
		this.initialInventoryMD = initialInventoyMD;
	}
	public double getInitialInventoyMOD() {
		return initialInventoryMOD;
	}
	public void setInitialInventoyMOD(double initialInventoyMOD) {
		this.initialInventoryMOD = initialInventoyMOD;
	}
	public double getInitialInventoyCIF() {
		return initialInventoryCIF;
	}
	public void setInitialInventoyCIF(double initialInventoyCIF) {
		this.initialInventoryCIF = initialInventoyCIF;
	}
	public double getStartedAndFinished() {
		return startedAndFinished;
	}
	public void setStartedAndFinished(double startedAndFinished) {
		this.startedAndFinished = startedAndFinished;
	}
	public double getTotalCostsFinishedProduct() {
		return totalCostsFinishedProduct;
	}
	public void setTotalCostsFinishedProduct(double totalCostsFinishedProduct) {
		this.totalCostsFinishedProduct = totalCostsFinishedProduct;
	}
	public double getProductOnProcess() {
		return totalProductOnProcess;
	}
	public void setProductOnProcess(double productOnProcess) {
		this.totalProductOnProcess = productOnProcess;
	}
	public double getProductOnProcessMD() {
		return productOnProcessMD;
	}
	public void setProductOnProcessMD(double productOnProcessMD) {
		this.productOnProcessMD = productOnProcessMD;
	}
	public double getProductOnProcessMOD() {
		return productOnProcessMOD;
	}
	public void setProductOnProcessMOD(double productOnProcessMOD) {
		this.productOnProcessMOD = productOnProcessMOD;
	}
	public double getProductOnProcessCIF() {
		return productOnProcessCIF;
	}
	public void setProductOnProcessCIF(double productOnProcessCIF) {
		this.productOnProcessCIF = productOnProcessCIF;
	}
	
	
	
	

}
