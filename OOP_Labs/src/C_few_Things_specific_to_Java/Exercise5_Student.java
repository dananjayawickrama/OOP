package C_few_Things_specific_to_Java;

public class Exercise5_Student extends Exercise5_Person{

	//Exercise06
	private String studentid;

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	
	//method overriding - >Exercise 6
	public void showDetails() {
		System.out.println("Name is = "+this.getName()+"\nAddress is = "+getAddress());
		System.out.println("Student Id is = "+studentid);
		
	}
	
}
