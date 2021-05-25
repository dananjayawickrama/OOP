package E_Abstract_classes_Interfaces;

class Cat extends Animal {
	
	public Cat(String name)
	{ 
		super(name);
		
	}
	
		public Cat() {
		
			System.out.println("Cat constructor called");
		}
	
	
	public String speak() 
	{
		return "Meow Meow";
		}
	}