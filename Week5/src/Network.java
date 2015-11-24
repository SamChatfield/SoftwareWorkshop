import java.util.ArrayList;

import javax.print.attribute.ResolutionSyntax;

import com.sun.org.apache.xpath.internal.axes.AxesWalker;

/**
 * Network of several transmitters
 */
public class Network
{
	
	private ArrayList<Transmitter> stations;
	
	/**
	 * Create network with no transmitters
	 */
	public Network()
	{
		stations = new ArrayList<Transmitter>();
	}
	
	public String toString()
	{
		return "Network of " + size() + " transmitters";
	}
	
	/**
	 * Returns the number of transmitters in the network
	 * @return size of transmitter network
	 */
	public int size()
	{
		return stations.size();
	}
	
	/**
	 * Add a new transmitter to the network
	 * @param t new transmitter
	 */
	public void add(Transmitter t)
	{
		stations.add(t);
	}
	
	/**
	 * Return transmitter at specified index
	 * @param i index of transmitter
	 * @return transmitter at index i
	 */
	public Transmitter getTransmitter(int i)
	{
		return stations.get(i);
	}
	
	/**
	 * Find the signal strength at a particular location
	 * @param x x-coord of location
	 * @param y y-coord of location
	 * @return The max signal strength from the transmitters in the network
	 */
	public double getSignal(double x, double y)
	{
		double max = 0.0;
		for (Transmitter t : stations) {
			if (t.getSignal(x, y) > max) {
				max = t.getSignal(x, y);
			}
		}
		return max;
	}
	
}
