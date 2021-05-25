package E_Errors_and_Exceptions;

public class G_CodingExerciseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		G_CodingExerciseClz obj = new G_CodingExerciseClz();
		
		
		try {
			
			double answer = obj.divide(10, 0);
			System.out.println(answer);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			
			System.out.println("Exception is = "+e);
		}
		
		

	}

}
