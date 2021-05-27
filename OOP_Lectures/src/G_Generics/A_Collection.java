package G_Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class A_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//all
		Collection value = new ArrayList();
		value.add("Sliit");
		value.add(125);
		value.add(2.5);
		
		
		//Integer
		
		Collection<Integer> al1 = new ArrayList<Integer>();
		al1.add(15);
		al1.add(334);
		
		

	}

}
