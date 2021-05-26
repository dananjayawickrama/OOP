package G_Collections;

import java.util.HashSet;
import java.util.Scanner;

public class Exercise3_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		HashSet<Double> hs = new HashSet<Double>();
		
		for(int i = 0;i < 10;i++) {
			
			System.out.print("Enter "+(i+1)+"Student height  :");
			double height = sc.nextDouble();
			hs.add(height);
		}
		
		for(Double h : hs) {
			System.out.println(h);
		}

	}

}
