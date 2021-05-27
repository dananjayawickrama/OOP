package G_Generics;

public class D_Multiple_ParametersMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		D_Multiple_Parameters<String, Integer> obj1 = new D_Multiple_Parameters<String, Integer>("Dananjaya", 100);
		
		String v1 = obj1.getNumberOne();
		int n1 = obj1.getNumberTwo();

	
		System.out.println(v1+"\n"+n1);
	}

}
