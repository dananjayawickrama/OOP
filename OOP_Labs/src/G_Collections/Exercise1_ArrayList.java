package G_Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> aL = new ArrayList<Integer>();
		
		if(aL.isEmpty()) {
			
			for(int i = 0;i < 10;i++) {
				
				System.out.print("Enter number "+(i+1)+" :");
				int numbers = sc.nextInt();
				aL.add(numbers);
			}
			
			
			
			//convert into Array
			
			Integer[] myNumbers = new Integer[aL.size()];
			myNumbers = aL.toArray(myNumbers);
			
			int total = 0;
			for(int i = 0;i < 10;i++) {
				
				total = total + myNumbers[i];
			}
			
			System.out.println("Sum is = "+total);
		}

	}

}
