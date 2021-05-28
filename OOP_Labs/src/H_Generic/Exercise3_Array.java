package H_Generic;

public class Exercise3_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int numbers[] = {2,5,3,1,7,99,55};
		
		int fNumber = numbers[0]; 
		
		for(int i = 1;i < numbers.length;i++) {
			
			if(fNumber < numbers[i])
				fNumber = numbers[i];
			
				
		}

		System.out.println("Largest Number is = "+fNumber);
	}

}
