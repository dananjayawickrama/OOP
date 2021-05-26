package G_Collections;

public class Exercise2_Student {

	
	private String studentId;
	private String sName;
	private double gpa;
	
	
	
	
	
	
	public Exercise2_Student(String studentId, String sName, double gpa) {
	
		this.studentId = studentId;
		this.sName = sName;
		this.gpa = gpa;
	}






	public String getStudentId() {
		return studentId;
	}






	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}






	public String getsName() {
		return sName;
	}






	public void setsName(String sName) {
		this.sName = sName;
	}






	public double getGpa() {
		return gpa;
	}






	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	
	
}
