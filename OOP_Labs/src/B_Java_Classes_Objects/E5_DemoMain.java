package B_Java_Classes_Objects;

import java.util.Scanner;

public class E5_DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int number = sc.nextInt();
		
		E5_Demo obj = new E5_Demo();
		boolean value = obj.findEvenOrOdd(number);
		
		if(value == true)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
		
		
		

	}

}
