package D_Abstract_Classes_Interfaces_Exception_Handling;

public class A_Circle_AbstractClz extends A_Shape_AbstractClz{

	double r;
	
	public void calArea() {
		
		double cArea = 22 / 7 * r * r;
		System.out.println("Area is = "+cArea);
	}
}
