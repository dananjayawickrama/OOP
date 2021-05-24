package B_Java_Classes_Objects;

public class Dog extends Pet{

	public int dogage;
	
	
	public void displayDetails() {
		System.out.println("This is Dog Class");
		System.out.println("Dog age is "+dogage);
		Pet p1 = new Pet();
		p1.name = "Pet01";
		p1.displayDetails();
	}
	
}
