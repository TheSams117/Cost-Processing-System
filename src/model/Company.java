package model;

public class Company {

	private Departament[] departaments;
	private String name;
	
	
	public Company( String name) {
		super();
		this.departaments = new Departament[3];
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
	
	
	
	
	
	
	
	
	
}
