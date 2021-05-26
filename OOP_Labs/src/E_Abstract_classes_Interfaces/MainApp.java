package E_Abstract_classes_Interfaces;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Tablet t1 = new Tablet(01,"ITab",10000.0,2,"Apple","Ipad","5MP");

		Vegetables v1 = new Vegetables(02,"Carrot",50.0,3,true,100);
		
		
		IPrint myArray[] = new IPrint[2];
		
		myArray[0] = t1;
		myArray[1] = v1;
		
		
		 for (int i = 0; i < 2; i++) {
			 myArray[i].printLine();
	                        System.out.println("\n\n");
			}
	}

}
