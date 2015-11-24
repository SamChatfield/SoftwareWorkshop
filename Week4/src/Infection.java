public class Infection
{

	public static void main(String args[])
	{
		Person p = new Person();
		System.out.println(p);
		p.setInfected(true);
		System.out.println(p);

		Population pop = new Population(100, 0.75, 0.1, 0.2);
		System.out.println(pop);

		System.out.println(pop.isInfected(0));
		System.out.println(pop.howManyInfected() + " infected");
		System.out.println(pop.proportionInfected() * 100
				+ "% of population infected");

		for (int i = 0; i < 40; i++)
		{
			System.out.println("Day " + (i + 1));
			pop.update();
			System.out.println(pop.howManyInfected() + " infected");
		}
	}

}
