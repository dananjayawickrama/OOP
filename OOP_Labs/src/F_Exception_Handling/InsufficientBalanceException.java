package F_Exception_Handling;

public class InsufficientBalanceException extends Exception{

	double bAmount;
	
	public InsufficientBalanceException(double a) {
	
		bAmount = a;
	}
	
	
	public double getAmount() {
		return bAmount;
	}
	
}
