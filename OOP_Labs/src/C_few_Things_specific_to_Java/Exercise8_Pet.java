package C_few_Things_specific_to_Java;

public class Exercise8_Pet {

	private String name;
	private String owner;
	private int age;
	
	public Exercise8_Pet(String n, String o, int a) {
		this.name = n;
		this.owner = o;
		this.age = a;
	}
	
	
	public Exercise8_Pet(String n, String o) {
		name = n;
		owner = o;
		age = 0;
	}
	
	
	public void showDetails(){
	System.out.println("I am a pet. My name is "
	+this.name+". My owner is "+this.owner);
	}
	
	
	}//end of the pet class