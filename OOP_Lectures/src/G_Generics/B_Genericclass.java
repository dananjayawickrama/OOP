package G_Generics;

public class B_Genericclass<T>{

	
	T number;
	
	public void addN(T n) {
		
	this.number = n;
	}
	
	
	public T getNumber() {
		return number;
	}
}
