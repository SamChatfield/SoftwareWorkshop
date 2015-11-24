// Question 3
// Replace strings with >3 chars with their first 3 chars

import java.util.Scanner;
import java.util.ArrayList;

public class Question3 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<String>();
		
		System.out.println("Enter a string (enter stop to finish):");
		String s = in.nextLine();
		
		while(!s.equalsIgnoreCase("stop")) {
			list.add(s);
			System.out.println("Enter a string (enter stop to finish):");
			s = in.nextLine();
		}
		
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).length() > 3) {
				list.set(i, list.get(i).substring(0, 3));
			}
			System.out.println("[" + list.get(i) + "]");
		}
		
		System.out.print("Press enter to exit.");
		in.nextLine();
		in.close();
		System.exit(0);
	}
	
}
