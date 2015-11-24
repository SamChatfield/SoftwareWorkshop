
import java.util.Scanner;
import java.util.ArrayList;

public class Week2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("goodbye".compareTo("hello"));
		
		ArrayList<String> list = new ArrayList<String>();
		
		// Input loop
		boolean typing = true;
		System.out.println("Enter some text. Type stop to exit.");
		while (typing) {
			String next = scan.nextLine();
			if (next.equalsIgnoreCase("stop")) {
				typing = false;
			} else {				
				list.add(next);
			}
		}
		
		// Print list elements
		System.out.println();
		for (int i=0; i<list.size(); i++) {
			System.out.println("[" + list.get(i) + "]" );
		}
		
		// Print list elements in reverse order
		System.out.println();
		for (int i=list.size()-1; i>=0; i--) {
			System.out.println("[" + list.get(i) + "]");
		}
				
		System.out.println("\n" + list);
		
		// Find first string in list alphabetically
		String small;
		small = list.get(0);
		for (int i=1; i<list.size(); i++) {
			String cur = list.get(i);
			if (cur.compareToIgnoreCase(small) < 0) {
				small = cur;
			}
		}
		System.out.println(small);
		
		// Count number of apples
		int appleCount = 0;
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).equalsIgnoreCase("apple")) {
				appleCount++;
			}
		}
		System.out.println(appleCount);
		
		// Is there a banana?
		if (list.contains("banana")) {
			System.out.println("There's a banana!");
		} else {
			System.out.println("No bananas.");
		}
		
		// Find peach
		int n = list.indexOf("peach");
		System.out.println("Peach at index " + n);
		
		// Remove an item
		System.out.println("Removing item at index 1.");
		list.remove(1);
		System.out.println(list);
		
		// Remove first occurunce of banana
		System.out.println("Removing bananas.");
		list.remove("banana");
		System.out.println(list);
		
		System.out.print("Finished. Press enter to exit.");
		scan.nextLine();
		scan.close();
		System.exit(0);
	}
	
}
