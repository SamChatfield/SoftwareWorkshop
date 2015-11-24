
public class Infection
{

	public static void main(String[] args)
	{
		Person p = new Person();
		System.out.println(p); // well person

		p.setInfected(true);
		System.out.println(p); // sick person

		Population pop = new Population(100, 0.1, 0.85, 0.2);
		System.out.println(pop); // population of 100 people
		System.out.println(pop.howManyInfected()); // about 10

		// run simulation for several time steps
		for (int i = 0; i < 40; i++)
		{
			pop.update();
			System.out.println("DAY " + (i + 1) + ":");
			System.out.println(pop.howManyInfected());
		}

		System.out.print("\n\n");

		// Test constructor of fatal disease
		Population pop2 = new Population(100, 0.1, 0.85, 0.2, 0.3);
		System.out.println(pop2);
		System.out.println(pop2.howManyInfected());
		for (int i = 0; i < 40; i++)
		{
			pop2.update();
			System.out.println("DAY " + (i + 1) + ":");
			System.out.println(pop2.howManyInfected());
		}
	}

}
