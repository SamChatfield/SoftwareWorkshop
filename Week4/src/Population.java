import java.util.Random;

/**
 * Represents a population of people and an infection that passes between them
 * @author sxc678
 */
public class Population
{

	private Person[] pop;
	private double initial;
	private double infect;
	private double recover;
	private Random generator;

	/**
	 * Create a population of given size
	 * @param size THe size of the population
	 * @param initial The initial probability of infection
	 * @param infect The infection rate
	 * @param recover The recovery rate
	 */
	public Population(int size, double initial, double infect, double recover)
	{
		this.infect = infect;
		this.recover = recover;
		pop = new Person[size];
		generator = new Random();

		for (int i = 0; i < pop.length; i++)
		{
			pop[i] = new Person();
			if (generator.nextDouble() < initial)
			{
				pop[i].setInfected(true);
			}
		}
	}

	public String toString()
	{
		return "The size of this population is " + pop.length;
	}

	/**
	 * Get the size of the population
	 * @return population size
	 */
	public int getSize()
	{
		return pop.length;
	}

	/**
	 * Get the infection rate
	 * @return infection rate
	 */
	public double getInfectionRate()
	{
		return infect;
	}

	/**
	 * Get recovery rate
	 * @return recovery rate
	 */
	public double getRecoveryRate()
	{
		return recover;
	}

	/**
	 * Returns whether or not the given person in the population is infected
	 * @param index of person within population
	 * @return whether person is infected
	 */
	public boolean isInfected(int index)
	{
		return pop[index].isInfected();
	}

	/**
	 * Set the infection rate
	 * @param infectionRate The infection rate
	 */
	public void setInfectionRate(double infectionRate)
	{
		this.infect = infectionRate;
	}

	/**
	 * Set the recovery rate
	 * @param recoveryRate The recovery rate
	 */
	public void setRecoveryRate(double recoveryRate)
	{
		this.recover = recoveryRate;
	}

	/**
	 * Return number of people in the population infected
	 * @return number of infected people
	 */
	public int howManyInfected()
	{
		int count = 0;
		for (int i = 0; i < pop.length; i++)
		{
			if (isInfected(i))
			{
				count++;
			}
		}
		return count;
	}

	/**
	 * Find proportion infected
	 * @return proportion infected
	 */
	public double proportionInfected()
	{
		return (double) howManyInfected() / pop.length;
	}

	/**
	 * Simulate one day
	 */
	public void update()
	{
		for (int i = 0; i < pop.length; i++)
		{
			if (pop[i].isInfected())
			{
				if (generator.nextDouble() < recover)
				{
					pop[i].setInfected(false);
				}
			}
			else
			{
				int j = generator.nextInt(pop.length);
				if (isInfected(j))
				{
					if (generator.nextDouble() < infect)
					{
						pop[i].setInfected(true);
					}
				}
			}
		}
	}

}
