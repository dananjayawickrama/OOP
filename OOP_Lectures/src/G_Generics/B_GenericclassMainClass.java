package G_Generics;

public class B_GenericclassMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		B_Genericclass<Integer> obj = new B_Genericclass<Integer>();
		obj.addN(4);
		System.out.println(obj.getNumber());
		
		
		B_Genericclass<Double> obj1 = new B_Genericclass<Double>();
		obj1.addN(4.5);
		System.out.println(obj1.getNumber());
		
		
	}

}
