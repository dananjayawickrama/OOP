package A_Introduction_to_Java;

public class D_E5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		
		while(i < 5) {
			
			System.out.println("*********");
			
			i++;
		}
		
	
		System.out.println();

		
		for(int y = 1;y <= 5;y++) {
			
			for(int r = y;r < 5;r++) {
				System.out.print("^");
			}
			
			
			System.out.println();
		}
		
		
		System.out.println();
		
		
		for(int y = 1;y <= 5;y++) {
			
			for(int r = y;r < 5;r++) {
				System.out.print("^");
			}
			
			for(int t = 1;t <= y;t++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		
		
		for(int y = 1;y <= 5;y++) {
			
			for(int r = y;r < 5;r++) {
				System.out.print(" ");
			}
			
			for(int t = 1;t <= (y*2);t++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
