package E_Abstract_classes_Interfaces;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int [] marks = new int[5];
		int total = 0;
		
		double avg;
		
		try {

			// 2. Using a for loop -  input marks 
			
			for(int i = 0;i < 5;i++) 
			{
				System.out.print("Enter mark"+(i+1)+" : ");
				marks[i] = sc.nextInt();	
			}
		
			// 3. Calculate the avg marks 
			for(int i = 0;i < 5;i++) 
			{
				total = total + marks[i];
			}
			
			avg = total / marks.length;
			System.out.println("Average is = "+avg);
			

		} catch (NumberFormatException e) {
			
			System.out.println("Exception is = "+e);
			
		}catch(ArithmeticException e) {
			
			System.out.println("Exception is = "+e);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception is = "+e);
		
		}finally {
			
			System.out.println("This code will be gurrentied to run");
			
		}
		
		System.out.println("The end");
		
	}
	
}