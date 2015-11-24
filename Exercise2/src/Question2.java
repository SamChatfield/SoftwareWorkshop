import java.util.ArrayList;
import java.util.Scanner;

// Question 2
// Reverse order of strings

// Note:
// I wasn't sure of the wording of this question, to me it implied that list at the end
// should be the reverse of list at the beginning, hence all of the messing about with
// a second ArrayList and setting list equal to it at the end.

public class Question2 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> rev = new ArrayList<String>();
		
		System.out.println("Enter a string (enter stop to finish):");
		String s = in.nextLine();
		
		while(!s.equalsIgnoreCase("stop")) {
			list.add(s);
			System.out.println("Enter a string (enter stop to finish):");
			s = in.nextLine();
		}
		for (int i=list.size()-1; i>=0; i--) {
			rev.add(list.get(i));
		}
		list = rev;
		System.out.println(list); // I hope printing out this way is OK rather than printing line by line in the above for loop
		System.out.print("Press enter to exit.");
		in.nextLine();
		in.close();
		System.exit(0);
	}
	
}
