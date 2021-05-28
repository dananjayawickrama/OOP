package H_Generic;

public class A_Exercise1_Emp {
	
	private String id,name;
	private double bsalary,netsalary,totoalsalary;
	
	
	public A_Exercise1_Emp(String id, String name, double bsalary, double netsalary) {
		
		this.id = id;
		this.name = name;
		this.bsalary = bsalary;
		this.netsalary = netsalary;
		
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getBsalary() {
		return bsalary;
	}


	public void setBsalary(double bsalary) {
		this.bsalary = bsalary;
	}


	public double getNetsalary() {
		return netsalary;
	}


	public void setNetsalary(double netsalary) {
		this.netsalary = netsalary;
	}


	public double getTotoalsalary() {
		return totoalsalary;
	}


	public void setTotoalsalary(double totoalsalary) {
		this.totoalsalary = totoalsalary;
	}
	
	
	public double calTotal() {
		
		totoalsalary = bsalary + netsalary;
		return totoalsalary;
	}
}
