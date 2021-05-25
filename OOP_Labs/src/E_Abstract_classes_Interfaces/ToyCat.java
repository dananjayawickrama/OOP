package E_Abstract_classes_Interfaces;

class ToyCat extends Cat { 
	
	String manufacturer; 
	
	public ToyCat(String name, String manufacturer) {
		
		 super(name);
		 this.manufacturer = manufacturer;
		
	}
	
	
	public ToyCat() {
		System.out.println("ToyCat constructor called");
		}
	
	
	public void display() 
	{
		super.display(); 
		System.out.println("I am from " + manufacturer + "."); 
		}
	}