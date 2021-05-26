package F_JavaCollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class D_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<String, Double> hm = new HashMap<String, Double>();
		
		hm.put("Dananjaya", new Double(10000.00));
		hm.put("Wickrama", new Double(40000.00));
		hm.put("Sajani", new Double(20000.00));
		
		//entries
		Set<Map.Entry<String,Double>> set = hm.entrySet();
		
		for (Map.Entry<String, Double> my : set) {
			
			System.out.print(my.getKey()+" : ");
			System.out.println(my.getValue());
		}
		
		
		
		//update
		double balance = hm.get("Dananjaya");
		hm.put("Dananjaya", (1000+balance));
		
		System.out.println("\n********After Update************\n");
		for (Map.Entry<String, Double> my : set) {
			
			System.out.print(my.getKey()+" : ");
			System.out.println(my.getValue());
		}
		
	}

}
