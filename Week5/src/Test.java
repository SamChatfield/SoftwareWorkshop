/**
 * Test Transmitter class methods
 */

public class Test
{
	
	public static void main(String[] args)
	{
		Transmitter t1 = new Transmitter(1.0, 0.5, 60.0);
		System.out.println(t1);
		System.out.println(t1.getSignal(1.1, 0.45));
		Network n1 = new Network();
		System.out.println(n1);
		n1.add(t1);
		n1.add(new Transmitter(2.0, 1.5, 50.0));
		n1.add(new Transmitter(0.8, 3.7, 55.0));
		System.out.println(n1);
		System.out.println(n1.size());
		System.out.println(n1.getTransmitter(1));
		System.out.println("Max signal strength at (12.0, 3.25) is " + n1.getSignal(12.0, 3.25));
		SignalStrength signalStrength = new SignalStrength(n1, 50);
		System.out.println("Signal strength at (25, 25) on map: " + signalStrength.getSignalAt(25, 25));
		System.out.println(signalStrength.averageSignal());
	}
	
}
