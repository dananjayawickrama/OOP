package E_Abstract_classes_Interfaces;

public class Person implements ICompute{

	
	private String name; 
	private double basicSal;
	private double otRate;
	private double otHrs;
	private double netSal;
	
	
	
	
	
	
	
	public Person(String name, double basicSal, double otRate, double otHrs) {
		super();
		this.name = name;
		this.basicSal = basicSal;
		this.otRate = otRate;
		this.otHrs = otHrs;
		
	}

	public void calculate() {
		
		netSal = basicSal + (otHrs * otRate);
		System.out.println("Net Salary is = "+netSal);
	}
	
	public void display() {
		
		String details = "Name is = "+name+"\nBasic Salary is = "+basicSal+"\nOT Rate is = "+otRate+"\nOt hours = "+otHrs+"\nNet Salary is = "+netSal;
		System.out.println(details);
	}
}
