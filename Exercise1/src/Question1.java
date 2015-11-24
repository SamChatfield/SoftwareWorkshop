// Question 1
// Print all even integers between 0 and given input

import java.util.Scanner;

public class Question1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("This program will print out all of the even integers between 0 and the input integer (inclusive if input is even).");
		System.out.print("Enter a valid integer: ");
		
		int n = scan.nextInt();
		scan.nextLine(); // Catch empty string from nextInt call
		
		for (int i=0; i<=n; i+=2) {
			System.out.print(i + " ");
		}
		
		System.out.print("\nOutput complete, press enter to exit.");
		scan.nextLine();
		scan.close();
		System.exit(0);
	}
	
}
