// Question 4
// Create new list containing each element of input list only once

import java.util.Scanner;
import java.util.ArrayList;

public class Question4 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> once = new ArrayList<String>();
		
		System.out.println("Enter a string (enter stop to finish):");
		String s = in.nextLine();
		
		while(!s.equalsIgnoreCase("stop")) {
			list.add(s);
			System.out.println("Enter a string (enter stop to finish):");
			s = in.nextLine();
		}
		
		for (int i=0; i<list.size(); i++) {
			if (!once.contains(list.get(i))) {
				once.add(list.get(i));
				System.out.println("[" + list.get(i) + "]");
			}
		}
		
		System.out.print("Press enter to exit.");
		in.nextLine();
		in.close();
		System.exit(0);
	}
	
}
