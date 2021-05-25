package C_few_Things_specific_to_Java;

public class Exercise8_Cat extends Exercise8_Pet{

	private int livesLeft;
	
	public Exercise8_Cat(String n, String o, int a,int l) {
		super(n, o, a);
		this.livesLeft = l;
	}
	
	public Exercise8_Cat(String n, String o) {
		
		super(n, o, 0);
		livesLeft = 7;
	}
	
	public void showDetails(){
		super.showDetails();
		System.out.println("I am a cat. " +
		this.livesLeft + " lives remain for me.");
		
	}
	
}