import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

/**
 * Assess the signal strength across map
 */
public class SignalStrength
{
	
	private Network net;
	private double[][] signal;
	private int range;
	
	/**
	 * Store signal strength of network
	 * @param net The network
	 * @param range The width and height of the map
	 */
	public SignalStrength(Network net, int range)
	{
		this.net = net;
		this.range = range;
		signal = new double[range][range];
		
		// row
		for (int i = 0; i < range; i++) {
			// col
			for (int j = 0; j < range; j++) {
				signal[i][j] = net.getSignal(i, j);
			}
		}
	}
	
	/**
	 * Calculate the average signal over the whole map
	 * @return Average signal over map
	 */
	public double averageSignal()
	{
		double total = 0.0;
		for (int i = 0; i < range; i++) {
			for (int j = 0; j < range; j++) {
				total += signal[i][j];
			}
		}
		return total / (range*range);
	}
	
	/**
	 * Return the signal strength at a specified location
	 * @param x x-coord
	 * @param y y-coord
	 * @return signal at specified (x, y)
	 */
	public double getSignalAt(double x, double y)
	{
		return signal[(int) x][(int) y];
	}
	
}
