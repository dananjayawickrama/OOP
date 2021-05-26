package F_JavaCollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;

public class C_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//HashSet remove the duplivate values
		
				//String
				HashSet<String> arrayLObj = new HashSet<String>();
				arrayLObj.add("Wickrama");
				arrayLObj.add("Wickrama");
				arrayLObj.add("Sajani");
				arrayLObj.add("Sajani");
				arrayLObj.add("AAA");
				
				//remove
				arrayLObj.remove(4);
				
				//display
				for (String mySt : arrayLObj) {
					
					System.out.println(mySt);
				}
	}

}
