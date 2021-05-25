package E_Abstract_classes_Interfaces;

public class IMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ICompute ob1 = new Person("Danushka",40000, 1000, 5); 
		ob1.display();
		ob1.calculate();
		
		
		System.out.println("***************");
		
		ICompute ob2 = new Box(10, 20, 30);
		ob2.display();
		ob2.calculate();
		
		
	}
	
}