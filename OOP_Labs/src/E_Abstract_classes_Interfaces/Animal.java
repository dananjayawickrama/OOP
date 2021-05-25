package E_Abstract_classes_Interfaces;

class Animal { 
	
	private String name; 
	
	public Animal(String name)
	{
		this.name = name;
		
	} 
	
	public String speak()
	{
		return ""; 
		
	} 
	
	public void display() 
	{
		System.out.println("My name is " + this.name + ". " + this.speak() + ".");
	}
	
}