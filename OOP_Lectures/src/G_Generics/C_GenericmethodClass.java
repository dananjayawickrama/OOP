package G_Generics;

public class C_GenericmethodClass<T> {

	public <E> void printArray(E[] elements) {
		
		for(E myA : elements) {
			System.out.print(myA);
		}
		
	
		
		System.out.println();
	}
	



	
	
}

