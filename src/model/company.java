package model;

public class company {

	private departament[] departaments;
	private String name;
	
	
	public company( String name) {
		super();
		this.departaments = new departament[3];
		this.name = name;
	}
	
	
	public departament[] getDepartaments() {
		return departaments;
	}
	public void setDepartaments(departament[] departaments) {
		this.departaments = departaments;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
}
