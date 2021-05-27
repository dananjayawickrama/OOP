package G_Generics;

public class D_Multiple_Parameters<T,V> {

		T o1;
		V o2;
	
	public D_Multiple_Parameters(T o1, V o2) {
	
		this.o1 = o1;
		this.o2 = o2;
	}
	
	
	public T getNumberOne() {
		return o1;
	}
	
	public V getNumberTwo() {
		return o2;
	}
	
}
