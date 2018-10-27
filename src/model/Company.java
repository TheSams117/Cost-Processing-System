package model;

public class Company {

	private Departament[] departaments;
	private String name;
	
	
	public Company( String name, int num) {
		super();
		this.departaments = new Departament[num];
		this.name = name;
	}
	
	
	public Departament[] getDepartaments() {
		return departaments;
	}
	public void setDepartaments(Departament[] departaments) {
		this.departaments = departaments;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	public static void main(String[] args) {
		Company company = new Company("company sa", 1);
		Departament uno = new Departament(0,0,0, 0, 120000, 186600, 331680, 411840, 60000, 0, 0, 0, 100, 60, 60, 60000, 0);
		company.getDepartaments()[0] = uno;
		
		PhysicalFlow x = company.getDepartaments()[0].getPhysicalFlow();
		
		
//		System.out.println(x.getUnitsInProcess());
//		
//		System.out.println(x.getInitialDirectWorkforcePP()+x.getInitialIndirectManufacturingCostsPP()+ "   " + x.getStartedAndFinished() +  "   " + (x.getFinalInventoryPPDirectWorkforce()+ x.getFinalInventoryPPIndirectManufacturingCosts()));
//
//		
//		System.out.println(x.getUnitsToPayDirectWorkforce());
		
		
	
		
	}
	
	
	
	
	
	
	
	
	
}
