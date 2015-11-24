// Question 8
// Test for square numbers

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question8 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a positive integer to check if square: ");
		int input = 0;
		boolean vi = true; // valid input
		
		try {
			input = scan.nextInt();
		} catch (InputMismatchException e) {
			vi = false;
		}
		scan.nextLine();
		
		if (input > 0 && vi) {
			double dsq = Math.sqrt(input);
			int isq = (int) Math.round(dsq);
			if (dsq == isq) {
				System.out.println(input + " is the square of " + isq + ".");
			} else {
				System.out.println(input + " is not a square number.");
			}
		} else {
			System.out.println("Invalid input.");
		}
		
		System.out.print("Press enter to exit.");
		scan.nextLine();
		scan.close();
		System.exit(0);
	}
	
}
