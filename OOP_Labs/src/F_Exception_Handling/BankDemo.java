package F_Exception_Handling;

import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account = new Account(123);
		System.out.println("Depositing 10000.0");
		account.deposit(10000.0);
		
		try {
			
			gettingAmount(account);
			

		} catch (InsufficientBalanceException e) {
			// TODO: handle exception
			
			System.out.println("Sorry,Your account remains only Rs."+e.getAmount());
			e.printStackTrace();
		}finally {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Do you want to be Continue (yes/no): ");
			String condi = sc.next();
			
			if(condi.equalsIgnoreCase("yes")) {
				
				Account account2 = new Account(123);
				System.out.println("Depositing 10000.0");
				account2.deposit(10000.0);
				
				try {
					gettingAmount(account2);
				} catch (InsufficientBalanceException e2) {
					
					e2.printStackTrace();
				}
			}
		}
		
		
	}
	
	
	
	public static void gettingAmount(Account accObj1) throws InsufficientBalanceException {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("please enter Amount to be withdrawn = ");
			double amount = sc.nextDouble();
			accObj1.withdraw(amount);
		}
	}

}
