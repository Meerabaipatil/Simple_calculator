package Calci;

import java.util.Scanner;

public class calci {

	public static double sum(double num1, double num2) {
		double sum = num1 + num2;
		return sum;
	}

	public static double sub(double num1, double num2) {
		double sub = num1 - num2;
		return sub;
	}

	public static double mul(double num1, double num2) {
		double mul = num1 * num2;
		return mul;
	}

	public static double div(double num1, double num2) {
		if (num2 != 0) {
			double div = num1 / num2;
			return div;
		} else {
			System.out.println("cant divide number by zero");
			return 0;
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter First number");
		double num1 = scan.nextInt();

		System.out.println("Enter second Number");
		double num2 = scan.nextInt();

		// loop to allow multiple calculations until the user exits.
		while (true) {
			System.out.println("Click 1 for Addition \n" + "Click 2 for Substraction \n"
					+ "Click 3 for Multilication \n" + "Click 4 for Division \n"+"click 5 to exit" );
			int choice = scan.nextInt();
			
			if(choice==5) {
				System.out.println("Existing loop");
				break;
			}

			switch (choice) {

			case 1:

				System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum(num1,num2));
				break;

			case 2:
				
				System.out.println("The sub of " + num1 + " and " + num2 + " is " + sub(num1,num2));
				break;
			case 3:
				
				System.out.println("The mul of " + num1 + " and " + num2 + " is " + mul(num1,num2));
				break;
			case 4:
				
				System.out.println("The div of " + num1 + " and " + num2 + " is " + "" + div(num1,num2));
				break;
			
			default:
				System.out.println("Invalid Input ");

			}
			
			
			System.out.println();

		}

	}
}
