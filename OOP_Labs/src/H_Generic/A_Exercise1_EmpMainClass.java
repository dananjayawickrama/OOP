package H_Generic;

import java.util.Scanner;

public class A_Exercise1_EmpMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee ID : ");
		String id = sc.next();
		System.out.println("Enter Employee Name: ");
		String name = sc.next();
		System.out.println("Enter Basic Salary: ");
		double bSal = Integer.parseInt(sc.next());
		System.out.println("Enter Net Salary: ");
		double nSal = Integer.parseInt(sc.next());
		
		
		A_Exercise1_Emp obj = new A_Exercise1_Emp(id, name, bSal, nSal);
		double total = obj.calTotal();

		System.out.println("ID is = "+obj.getId());
		System.out.println("ID is = "+obj.getName());
		System.out.println("Total Salary is = "+total);
	}

}
