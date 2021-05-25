package C_few_Things_specific_to_Java;

public class Exercise1_Student {
	
	//Exercise1
	private String name,ditno,address;//change public to private->Exercise3
	
	
	//Exercise2
	public Exercise1_Student(String n,String d,String a) {
		
		name = n;
		ditno = d;
		address = a;
	}
	
	
	
	////Exercise3
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}


	public String getDitno() {
		return ditno;
	}


	public void setDitno(String ditno) {
		this.ditno = ditno;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	
	//Exercise 4
	
	public String getDetails() {

		String details = "I am a Student.\nMy name is "+this.getName()+".\nI am From "+this.address+".\nMy DitNo is "+this.ditno+".";
		return details;
	}

}
