import java.util.Scanner;

public class Week1
{

	public static void main(String[] args)
	{
		System.out.println("hello world");
		System.out.println("What is your name?");

		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		System.out.println("Hello " + name + ". What is your favourite colour?");
		String colour = in.nextLine();
		System.out.println("Favourite colour is " + colour);
		
		int x = name.length();
		System.out.println("Your name is " + x + " characters in length.");
		char c = name.charAt(0);
		System.out.println("Your name begins with the letter " + c + ".");
		
		int cl = colour.length();
		System.out.println("The colour has length " + cl + ".");
		char clc = colour.charAt(cl - 1);
		System.out.println("The last letter is " + clc + ".");
		
		System.out.println("What is your age?");
		int age = in.nextInt();
		in.nextLine(); // soaks up the empty string java infers after nextInt()
		System.out.println("You are " + age + " years old.");
		int nextYear = age + 1;
		int young = age - 10;
		int twice = age * 2;
		int half = age / 2;
		
		if (age < 25)
		{
			System.out.println("You are young.");
		}
		else
		{
			System.out.println("You are old.");
		}
		
		System.out.println("Enter a number.");
		int num = in.nextInt();
		in.nextLine();
		if (num > 10 && num < 100)
		{
			System.out.println("Middle sized number.");
		}
		else
		{
			System.out.println("Number is too big or too small.");
		}
		
		System.out.println("Enter some text.");
		String input = in.nextLine();
		while (input.length() > 0)
		{
			input = in.nextLine();
		}
		System.out.println("Enter some numbers.");
		int number = in.nextInt();
		in.nextLine();
		int total = 0;
		while (number >= 0)
		{
			total += number;
			number = in.nextInt();
			in.nextLine();
		}
		System.out.println("The total of added numbers was " + total);
		
		System.out.println("Printing numbers 1 to 10 with a while loop.");
		int count = 0;
		while (count < 10)
		{
			count++;
			System.out.print(count + " ");
		}
		System.out.print("\n");
		
		System.out.println("Printing numbers 1 to 10 with a for loop.");
		for (int i = 1; i <= 10; i++)
		{
			System.out.print(i + " ");
		}
		System.out.print("\n");
		
		for (int i = 10; i >= 1; i--)
		{
			System.out.print(i + " ");
		}
		System.out.print("\n");
	}
	
}
