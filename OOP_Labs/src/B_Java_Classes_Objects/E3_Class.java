package B_Java_Classes_Objects;

import java.util.Scanner;

public class E3_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Length,width and height");
		double l = sc.nextDouble();
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		
		
		System.out.println("Volume is = "+(l*w*h));
		
	}

}
