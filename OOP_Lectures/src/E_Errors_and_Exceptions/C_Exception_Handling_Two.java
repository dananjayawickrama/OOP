package E_Errors_and_Exceptions;

public class C_Exception_Handling_Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  try {
			
				int c[] = {1};
				c[45] = 99;
				int a = args.length;
				System.out.println("a = " + a);
				int b = 42 / a;

			}catch (ArithmeticException e) {
			
				System.out.println("Divide by 0: " + e);
			
			} catch (ArrayIndexOutOfBoundsException e) {
			
				System.out.println("Array index oob: " + e);
			
			}
		
		System.out.println("After try/catch blocks.");
			
	
	}
			
}