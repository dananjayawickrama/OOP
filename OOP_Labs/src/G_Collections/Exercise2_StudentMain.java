package G_Collections;

import java.util.ArrayList;

public class Exercise2_StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Exercise2_Student obj1 = new Exercise2_Student("IT112","Dananjaya",3.6);
		Exercise2_Student obj2 = new Exercise2_Student("IT222","Sajani",3.8);
		Exercise2_Student obj3 = new Exercise2_Student("IT111","Chamilka",3.65);
		
		ArrayList<Exercise2_Student> StudentList = new ArrayList<Exercise2_Student>();
		
		StudentList.add(obj1);
		StudentList.add(obj2);
		StudentList.add(obj3);
	
	
		for(Exercise2_Student s1 : StudentList) {
			
			System.out.println(s1.getStudentId());
			System.out.println(s1.getsName());
			System.out.println(s1.getGpa());
			
			System.out.println();
		}
	}

}
