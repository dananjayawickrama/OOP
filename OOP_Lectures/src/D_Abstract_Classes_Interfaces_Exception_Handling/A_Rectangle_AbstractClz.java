package D_Abstract_Classes_Interfaces_Exception_Handling;

public class A_Rectangle_AbstractClz extends A_Shape_AbstractClz {

	double l;
	
	public void calArea() {
		
		double rArea = l * l;
		System.out.println("Area is = "+rArea);
	}
}
