package E_Errors_and_Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class F_throws {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		
		
		BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
		
		String text=""; 
		System.out.print("Enter an integer value : "); 
		text = in.readLine(); 
		int num= Integer.parseInt(text); 
		System.out.println("You inserted "+num);
		
	}
	
}