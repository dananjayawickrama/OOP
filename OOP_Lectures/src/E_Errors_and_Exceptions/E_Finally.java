package E_Errors_and_Exceptions;

public class E_Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			
			int answer = 16 / 0;
			System.out.println(answer);
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Exception is = "+e);
		}finally {
			System.out.println("Good Bye!!!");
		}
		
	}

}
