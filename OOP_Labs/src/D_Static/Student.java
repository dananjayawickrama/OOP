package D_Static;

public class Student {

	private int studentID;
	private String name;
	private String degree;
	private String mobile;
	private static int max = 100;
	
	Student(String n,String d,String m){
		
		name = n;
		degree = d;
		mobile = m;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	public void print() {
		System.out.println("Student Id is = "+Student.getNextStudentID());
		System.out.println("Student Name is = "+getName());
		System.out.println("Student Degree is = "+getDegree());
		System.out.println("Student Mobile is = "+getMobile());
		System.out.println();
	}
	
	
	public static int getNextStudentID() {
		
		max = max + 1;
		return max;
		
	}
}
