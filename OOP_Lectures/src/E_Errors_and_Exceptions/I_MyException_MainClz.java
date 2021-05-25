package E_Errors_and_Exceptions;

public class I_MyException_MainClz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n1 = 1000.0;
		double n2 = 1.0;
		
		try {
			
			double ans = n2 / n1;
			
			if(ans < 1) {
				
				throw new I_MyException("Number is very small");
			}
			
		} catch (I_MyException e) {
			// TODO: handle exception
			System.out.println("Caught my exception");

	        System.out.println(e.getMessage());
		}

	}

}
