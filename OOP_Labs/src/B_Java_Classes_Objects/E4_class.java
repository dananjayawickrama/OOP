package B_Java_Classes_Objects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E4_class {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		
		System.out.println("Enter Length,width and height");
		String l = br.readLine();
		String w = br.readLine();
		String h = br.readLine();
		
		
		double length = Double.parseDouble(l);
		double height = Double.parseDouble(h);
		double weight = Double.parseDouble(w);
		
		
		System.out.println("Volume is = "+length*weight*height);
		
	}

}
