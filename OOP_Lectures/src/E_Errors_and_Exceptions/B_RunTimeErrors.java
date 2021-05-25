package E_Errors_and_Exceptions;

public class B_RunTimeErrors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1st Example - Dividinganintegerbyzero
		int number = 18;
		int answer = number / 0;
		
		System.out.println(answer);

		
		//2nd Example - Accessing an element that is out of the bounds of an array
		
		int numbers[] = {1,5,6};
		System.out.println(numbers[3]);
		
		//3rd Example - Converting invalid string to a number
		String name = "Dananjaya";
		int n = Integer.parseInt(name);
		System.out.println(n);
		
	}

}
