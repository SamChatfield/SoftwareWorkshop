// Question 5
// Finds first character alphabetically given an input string

import java.util.Scanner;

public class Question5 {

	public static void main(String[] agrs) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String input = scan.nextLine().toLowerCase();
		char current;
		char smallest = input.charAt(0); // Start with first char so begin comparison with second later (i=1 in for loop)
		
		for (int i=1; i<input.length(); i++) {
			current = input.charAt(i);
			if (current < smallest && current != ' ' && (current >= 'a' && current <= 'z')) { // Compare values of the characters and ignore spaces
				smallest = current;
			}
		}
		System.out.println("First character alphabetically is " + smallest);
		System.out.print("Press enter to exit.");
		
		scan.nextLine();
		scan.close();
		System.exit(0);
	}
	
}
