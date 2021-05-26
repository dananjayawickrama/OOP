package F_JavaCollectionFramework;

import java.util.ArrayList;

public class A_ArrayListOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//String
		ArrayList<String> arrayObj = new ArrayList<String>();
		arrayObj.add("Dananjaya");
		arrayObj.add("Wickrama");
		arrayObj.add("Wickrama");
		arrayObj.add("Sajani");
		arrayObj.add("Chamilka");
		arrayObj.add("AAA");
		
		//remove
		arrayObj.remove(4);
		
		//display
		for (String mySt : arrayObj) {
			
			System.out.println(mySt);
		}
		
		System.out.println("\n***************ALL*******************\n");
		
		//All 
		ArrayList<Object> arrayObj2 = new ArrayList<Object>();
		arrayObj2.add("Wickrama");
		arrayObj2.add(26);
		arrayObj2.add("Chamilka");
		arrayObj2.add(25);
		
	
		
		//display
		for (Object mySt : arrayObj2) {
			
			System.out.println(mySt);
		}
		
		
		
		
	}

}
