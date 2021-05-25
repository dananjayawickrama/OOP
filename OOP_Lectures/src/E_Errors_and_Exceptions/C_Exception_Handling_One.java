package E_Errors_and_Exceptions;

public class C_Exception_Handling_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 10;
		int b = 0;
		
		try {
			
			int div = a / b;
			System.out.println(div);
			
		} catch (Exception e) {
			
			System.out.println("Exception: " + e);
			System.out.println("Division by zero.");
		}
		
		
		System.out.println("Good Bye");
		
		
		

	}

}
