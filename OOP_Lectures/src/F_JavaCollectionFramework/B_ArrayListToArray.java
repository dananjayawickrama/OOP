package F_JavaCollectionFramework;

import java.util.ArrayList;

public class B_ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
				//String
				ArrayList<String> arrayListObj = new ArrayList<String>();
				arrayListObj.add("Dananjaya");
				arrayListObj.add("Wickrama");
				arrayListObj.add("Sajani");
				arrayListObj.add("Chamilka");
				arrayListObj.add("AAA");
				
				
				//convert to array
				
				String myArray[] = new String[arrayListObj.size()];
				myArray = arrayListObj.toArray(myArray);
				
				
				for(int i = 0;i < myArray.length;i++) {
					
					System.out.println(myArray[i]);
				}
	}

}
