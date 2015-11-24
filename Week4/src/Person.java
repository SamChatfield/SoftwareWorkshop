/**
 * Describes a person and whether or not they are infected
 * @author sxc678
 */
public class Person
{

	private boolean infected;

	/**
	 * Create an uninfected person
	 */
	public Person()
	{
		infected = false;
	}

	public String toString()
	{
		// Ternary operation of form (boolean check ? valuetrue : valuefalse)
		return infected ? "This person is infected" : "This person is healthy";
	}

	/**
	 * Tells us if the person is infected
	 * @return The infection status
	 */
	public boolean isInfected()
	{
		return infected;
	}

	/**
	 * Changes the infection status
	 * @param infected The new infection status
	 */
	public void setInfected(boolean infected)
	{
		this.infected = infected;
	}

}
