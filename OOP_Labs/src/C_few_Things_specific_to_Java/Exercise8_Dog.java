package C_few_Things_specific_to_Java;

public class Exercise8_Dog extends Exercise8_Pet{

	private int noOfMasters;
	
	
	
	Exercise8_Dog(String n, String o, int a, int m){
		
		super(n, o,a);
		noOfMasters = m;
	}
	
	
	Exercise8_Dog(String n, String o){
		
		super(n, o,0);
		noOfMasters = 1;
	}
	
	public void showDetails(){
		super.showDetails();
		System.out.println("I am a Dog. " +"i Have "+
		this.noOfMasters + "masters at home..");
		
	}
	
}
