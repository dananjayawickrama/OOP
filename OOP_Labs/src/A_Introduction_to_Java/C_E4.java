package A_Introduction_to_Java;

import java.util.Scanner;

public class C_E4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter value of the day:");
		int day = sc.nextInt();
		
		
		switch (day) {
		case 1: System.out.println("Value of the Day :1");
				System.out.println("Day of the Week : Monday");
				break;
		case 2: System.out.println("Value of the Day :2");
				System.out.println("Day of the Week : Tuesday");
				break;
		case 3: System.out.println("Value of the Day :3");
				System.out.println("Day of the Week : Wednesday");
				break;
		case 4: System.out.println("Value of the Day :4");
				System.out.println("Day of the Week : Thursday");
				break;
		case 5: System.out.println("Value of the Day :5");
				System.out.println("Day of the Week : Friday");
				break;
		case 6: System.out.println("Value of the Day :6");
				System.out.println("Day of the Week : Saturday");
				break;
		case 7: System.out.println("Value of the Day :7");
				System.out.println("Day of the Week : Sunday");
				break;
		default:System.out.println("Invalid input");
				break;
		}
		
		System.out.println("Good Bye");
	}

}
