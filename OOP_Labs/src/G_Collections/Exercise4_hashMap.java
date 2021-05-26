package G_Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Exercise4_hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<String,Exercise2_Student> hm = new HashMap<String,Exercise2_Student>();

		Exercise2_Student obj1 = new Exercise2_Student("IT112","Dananjaya",3.6);
		Exercise2_Student obj2 = new Exercise2_Student("IT222","Sajani",3.8);
		Exercise2_Student obj3 = new Exercise2_Student("IT111","Chamilka",3.65);
		
		
		//Set<Map.Entry<String,Exercise2_Student>> myset = hm.entrySet();
		
		
		hm.put(obj1.getStudentId(), obj1);
		hm.put(obj2.getStudentId(), obj2);
		hm.put(obj3.getStudentId(), obj3);
		
		
		Set<Map.Entry<String,Exercise2_Student>> set = hm.entrySet();
		
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter Student Id:");
		String sId = sc.next();
		
		Exercise2_Student s1 = hm.get(sId);
		
		if(s1 != null) {
			System.out.println(s1.getsName());
			System.out.println(s1.getGpa());
		}else {
			System.out.println("Invalid Student Number");
		}
	}

}
