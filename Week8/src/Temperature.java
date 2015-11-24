import org.omg.CORBA.portable.ValueBase;

/**
 * Converting between celsius and fahrenheit
 */

public class Temperature
{
	private double celsius;
	private double fahrenheit;
	
	/**
	 * Construct temperature in degrees celsius
	 */
	public Temperature(double celsius)
	{
		this.celsius = celsius;
		this.fahrenheit = 1.8 * celsius + 32.0;
	}
	
	/**
	 * temperature in celsius
	 * @return temperature in celsius
	 */
	public double getCelsius()
	{
		return celsius;
	}
	
	/**
	 * temperature in fahrenheit
	 * @return temperature in fahrenheit
	 */
	public double getFahrenheit()
	{
		return fahrenheit;
	}
	
	/**
	 * change temperature (celsius)
	 * @param celsius new temperature in celsius
	 */
	public void setCelsius(double celsius)
	{
		this.celsius = celsius;
		this.fahrenheit = 1.8 * celsius + 32.0;
	}
	
	/**
	 * change temperature (fahrenheit)
	 * @param fahrenheit new temperature in fahrenheit
	 */
	public void setFahrenheit(double fahrenheit)
	{
		this.fahrenheit = fahrenheit;
		this.celsius = (fahrenheit - 32.0) / 1.8;
	}
}
