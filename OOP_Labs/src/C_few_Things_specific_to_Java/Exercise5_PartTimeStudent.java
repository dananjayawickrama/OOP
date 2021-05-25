package C_few_Things_specific_to_Java;

public class Exercise5_PartTimeStudent extends Exercise5_Student{

	
	private double noOfWorkingH;

	public double getNoOfWorkingH() {
		return noOfWorkingH;
	}

	public void setNoOfWorkingH(double noOfWorkingH) {
		this.noOfWorkingH = noOfWorkingH;
	}
	

	//method overriding - >Exercise 7
		public void showDetails() {
			System.out.println("Name is = "+getName()+"\nAddress is = "+getAddress());
			System.out.println("Student Id is = "+getStudentid());
			System.out.println("No Of working Hours = "+getNoOfWorkingH());
			
		}
	
	
}
