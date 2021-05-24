package C_few_Things_specific_to_Java;

import java.util.Scanner;

public class C_CreateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int myArray[] = new int[5];
		
		for(int i =0;i < 5;i++) {
			
			System.out.print("Enter Number "+(i+1)+":");
			myArray[i] = sc.nextInt();
			
		}
		
		
		System.out.println(myArray[0]);

	}

}
