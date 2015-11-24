// Question 7
// Test for primes

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question7 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a positive integer to check if prime: ");
		int input = 0;
		boolean vi = true; // valid input
		boolean prime = true;
		
		try {
			input = scan.nextInt();
		} catch (InputMismatchException e) {
			vi = false;
		}
		scan.nextLine();
		
		if (input > 0 && vi && input > 1) {
			for (int i=2; i<=Math.sqrt(input); i++) {
				if (i != input && input % i == 0 && prime) {
					System.out.println(input + " is divisible by " + i + ", so it is not prime.");
					prime = false;
				}
			}
			if (prime) {
				System.out.println("The number " + input + " is a prime.");
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
