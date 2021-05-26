package F_Exception_Handling;

public class Account {

	private int accNo;
	private double fAmount;
	
	public Account(int aN) {
	
		accNo = aN;
	}
	
	
	public double deposit(double dAmount) {
		
		fAmount = fAmount + dAmount;
		return fAmount;
	}
	
	
	public void withdraw(double wAmount) throws InsufficientBalanceException{
		
		if(wAmount > fAmount) {
			
			throw new InsufficientBalanceException(fAmount);
			
		}else {
			
			fAmount = fAmount - wAmount;
			System.out.println("Excisting Amount is = "+fAmount);
			System.out.println();
		}

	}
	
	
	
	
	
}
