// Question 6
// Sort string alphabetically

import java.util.Scanner;

public class Question6 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a string to sort: ");
		StringBuilder str = new StringBuilder(scan.nextLine().toLowerCase());
		for (int i=0; i<str.length(); i++) { // remove spaces
			if (str.charAt(i) == ' ') {
				str.deleteCharAt(i);
			}
		}
		// my implementation of bubble sort algorithm
		int swaps = 1;
		while (swaps > 0) {
			swaps = 0;
			for (int i=0; i<str.length()-1; i++) {
				char left = str.charAt(i);
				char right = str.charAt(i+1);
				if (left > right) { // if need to be swapped use StringBuilder's setCharAt() to swap the characters
					str.setCharAt(i, right);
					str.setCharAt(i+1, left);
					swaps++;
				}
			}
		}
		System.out.println(str.toString());
		
		System.out.print("String sorted. Press enter to exit.");
		scan.nextLine();
		scan.close();
		System.exit(0);
	}
	
}
