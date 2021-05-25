package E_Errors_and_Exceptions;

public class C_Nested_try_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		try {
			
			try {
			
				try {
						int arr[] = {1,2,3,4};
						System.out.println(arr[10]);
			
					} catch(ArithmeticException e) {
				
						System.out.println("Arithmetic Exception");
						System.out.println("handleed in try bloack3");
			
					}
			
			}catch(ArithmeticException e1) {
				
				System.out.println("Arithmetic Exception");
				System.out.println("handleed in try bloack2");
		
			}
			
		} catch(ArithmeticException e3) { //Catch of Main(parent) try block
		
			System.out.println("Arithmetic Exception");
			System.out.println("handleed in try bloack");
		
		} catch(ArrayIndexOutOfBoundsException e4) { //Catch of Main(parent) try block
			
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("handleed in main try bloack");
		
		} catch(Exception e5) { //Catch of Main(parent) try block
			
			System.out.println(" Exception");
			System.out.println("handleed in main try bloack");
		
		}
	}

}
