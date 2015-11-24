// Question 5
// Find string that occurs most often

import java.util.Scanner;
import java.util.ArrayList;

public class Question5 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		
		System.out.println("Enter a string (enter stop to finish):");
		String s = in.nextLine();
		String oft = ""; // most occurring string
		int oftc = 0; // count of most occurring string
		
		while(!s.equalsIgnoreCase("stop")) {
			list.add(s);
			int cc = 0; // count of current string (s)
			
			// Check if the last input is already in the list and check if it should be made the most occurring string.
			for (int i=0; i<list.size(); i++) {
				if (list.get(i).equalsIgnoreCase(s)) {
					cc++;
				}
			}
			if (cc > oftc && !s.equalsIgnoreCase(oft)) {
				oft = s;
				oftc = cc;
			}
			
			System.out.println("Enter a string (enter stop to finish):");
			s = in.nextLine();
		}
		
		System.out.println("The most frequent string was '" + oft + "'.");
		System.out.print("Press enter to exit.");
		in.nextLine();
		in.close();
		System.exit(0);
	}
	
}
