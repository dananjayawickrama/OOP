package E_Abstract_classes_Interfaces;

class Main { 
	
	public static void main(String[] args) {
		
		
		Animal animal1 = new Animal("test");
		animal1.display(); 
		
		Cat mycat = new Cat("Micky");
		mycat.display();
		
		Dog mydog = new Dog("Rover");
		mydog.display();
		
		ToyCat mytoy = new ToyCat("kittie","Toysrus");
		mytoy.display(); } }