// Question 2
// Output smallest integer entered prior to a negative being given

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a sequence of integers ending the sequence with a negative one to find the smallest integer given.");
		
		System.out.print("Enter integer: ");
		int lastInt = scan.nextInt();
		scan.nextLine();
		int smallestInt = lastInt;
		
		while (lastInt >= 0) {
			if (lastInt < smallestInt) {
				smallestInt = lastInt;
			}
			System.out.print("Enter integer: ");
			lastInt = scan.nextInt();
			scan.nextLine();
		}
		
		System.out.print("Sequence ended."
				+ "\nSmallest number was " + smallestInt
				+ "\nPress enter to exit.");
		scan.nextLine();
		scan.close();
		System.exit(0);
	}
	
}
