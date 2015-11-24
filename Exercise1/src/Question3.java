// Question 3
// Prints a given number of lines of asterisks with decrementing length

import java.util.Scanner;

public class Question3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number of lines of asterisks to print: ");
		
		int lines = scan.nextInt();
		scan.nextLine();
		
		if (lines > 0) {
			for (int l=lines; l>0; l--) { // Loops through each row
				for (int s=0; s<l; s++) { // Loops through creating new stars within each row
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.print("Asterisks have finished printing."
					+ "\nPress enter to exit.");
		} else {
			System.out.print("A positive number is required."
					+ "\nPress enter to exit.");
		}
		scan.nextLine();
		scan.close();
		System.exit(0);
	}
	
}
