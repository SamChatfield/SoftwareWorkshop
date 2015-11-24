import sun.nio.cs.ext.TIS_620;

/**
 * Represents the location and power of a mobile phone transmitter
 */

public class Transmitter
{
	
	private double x, y, power;
	private final double limit = 1.0;
	
	/**
	 * Create a transmitter at specified coordinates and power
	 * @param x x-coordinate
	 * @param y y-coordinate
	 * @param power power
	 */
	public Transmitter(double x, double y, double power)
	{
		this.x = x;
		this.y = y;
		this.power = power;
	}
	
	public String toString()
	{
		return "Transmitter at x: " + x + ", y: " + y + ", with power: " + power;
	}
	
	public double getSignal(double x, double y)
	{
		double distance = Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
		return distance > limit ? power / (distance * distance) : power;
	}
	
}
