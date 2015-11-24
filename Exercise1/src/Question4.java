// Question 4
// String reversal and check for palindromes

import java.util.Scanner;

public class Question4 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input a string to be reversed: ");
		String input = scan.nextLine().toLowerCase(); // Call toLowerCase() to make sure that random capital letters won't ruin the palindrome check (spaces still will).
		
		// Use Java's StringBuilder to go through the input and add each character from 
		// back to front, then convert back to string to be able to check for palindrome.
		// Could have just used StringBuilder's reverse() method but since sort is excluded later in the task I felt it safer to also not use reverse here.
		StringBuilder sb = new StringBuilder(input.length());
		for (int i=input.length()-1; i>=0; i--) {
			sb.append(input.charAt(i));
		}
		String rev = sb.toString();
		System.out.println("'" + input + "'" + " reversed is: " + rev);
		
		// Palindrome check
		if (input.equals(rev)) {
			System.out.println("Palindrome.");
		} else {
			System.out.println("Not a palindrome.");
		}
		
		System.out.print("Press enter to exit.");
		scan.nextLine();
		scan.close();
		System.exit(0);
	}

}
