// Question 1
// Find longest string in list

import java.util.Scanner;
import java.util.ArrayList;

public class Question1 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<String>();
		
		System.out.println("Enter a string (enter stop to finish):");
		String s = in.nextLine();
		String longest = "";
		
		while(!s.equalsIgnoreCase("stop")) {
			list.add(s);
			if (s.length() > longest.length()) {
				longest = s;
			}
			System.out.println("Enter a string (enter stop to finish):");
			s = in.nextLine();
		}
		System.out.println("The longest string entered was: '" + longest + "'.");
		
		System.out.print("Press enter to exit.");
		in.nextLine();
		in.close();
		System.exit(0);
	}
	
}
