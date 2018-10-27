package model;

public class physicalFlow {

	private double initialInventoryPP;
	private double startedUnits;
	private double unitsInProcess;
	private double startedAndFinished;
	private double startedAndFinishedDirectMaterial;
	private double startedAndFinishedDirectWorkforce;
	private double startedAndFinishedIndirectManufacturingCosts;
	private double finalInventoryPP;
	private double finalInventoryPPDirectMaterial;
	private double finalInventoryPPDirectWorkforce;
	private double finalInventoryPPIndirectManufacturingCosts;
	private double unitsToPay;
	private double unitsToPayDirectMaterial;
	private double unitsToPayDirectWorkforce;
	private double unitsToPayIndirectManufacturingCosts;
	
	
	public physicalFlow(double initialInventoryPP, double startedUnits, double unitsInProcess,
			double startedAndFinished, double startedAndFinishedDirectMaterial,
			double startedAndFinishedDirectWorkforce, double startedAndFinishedIndirectManufacturingCosts,
			double finalInventoryPP, double finalInventoryPPDirectMaterial, double finalInventoryPPDirectWorkforce,
			double finalInventoryPPIndirectManufacturingCosts, double unitsToPay, double unitsToPayDirectMaterial,
			double unitsToPayDirectWorkforce, double unitsToPayIndirectManufacturingCosts) {
		super();
		this.initialInventoryPP = initialInventoryPP;
		this.startedUnits = startedUnits;
		this.unitsInProcess = unitsInProcess;
		this.startedAndFinished = startedAndFinished;
		this.startedAndFinishedDirectMaterial = startedAndFinishedDirectMaterial;
		this.startedAndFinishedDirectWorkforce = startedAndFinishedDirectWorkforce;
		this.startedAndFinishedIndirectManufacturingCosts = startedAndFinishedIndirectManufacturingCosts;
		this.finalInventoryPP = finalInventoryPP;
		this.finalInventoryPPDirectMaterial = finalInventoryPPDirectMaterial;
		this.finalInventoryPPDirectWorkforce = finalInventoryPPDirectWorkforce;
		this.finalInventoryPPIndirectManufacturingCosts = finalInventoryPPIndirectManufacturingCosts;
		this.unitsToPay = unitsToPay;
		this.unitsToPayDirectMaterial = unitsToPayDirectMaterial;
		this.unitsToPayDirectWorkforce = unitsToPayDirectWorkforce;
		this.unitsToPayIndirectManufacturingCosts = unitsToPayIndirectManufacturingCosts;
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


	public double getStartedAndFinishedDirectMaterial() {
		return startedAndFinishedDirectMaterial;
	}


	public void setStartedAndFinishedDirectMaterial(double startedAndFinishedDirectMaterial) {
		this.startedAndFinishedDirectMaterial = startedAndFinishedDirectMaterial;
	}


	public double getStartedAndFinishedDirectWorkforce() {
		return startedAndFinishedDirectWorkforce;
	}


	public void setStartedAndFinishedDirectWorkforce(double startedAndFinishedDirectWorkforce) {
		this.startedAndFinishedDirectWorkforce = startedAndFinishedDirectWorkforce;
	}


	public double getStartedAndFinishedIndirectManufacturingCosts() {
		return startedAndFinishedIndirectManufacturingCosts;
	}


	public void setStartedAndFinishedIndirectManufacturingCosts(double startedAndFinishedIndirectManufacturingCosts) {
		this.startedAndFinishedIndirectManufacturingCosts = startedAndFinishedIndirectManufacturingCosts;
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
	
	
	
	
	
	
	
	
	
	
	
	
}
