package B_Java_Classes_Objects;

public class E1_Class {
	
	public static void main(String args[]) {
		
		
		int miles,yards;
		double kilometers;
		
		miles = 26;
		yards = 385;
		
		
		kilometers = 1.609 * miles + (1 / 1760 * yards * 1.609);
		
		System.out.println("Kilometers From miles and yards:"+kilometers);
	}

}
