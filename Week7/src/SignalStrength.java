import javax.swing.JFrame;

public class SignalStrength
{
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Frame");
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Network net = new Network();
		net.add(new Transmitter(5, 5, 100.0));
		net.add(new Transmitter(4, 7, 50.0));
		net.add(new Transmitter(0, 0, 80.0));
		
		int mapSize = 10;
		int frameSize = 300;
		double maxSig = 200.0;
		SignalComponent sc = new SignalComponent(net, mapSize, frameSize, maxSig);
		
		frame.add(sc);
		frame.setVisible(true);
	}
	
}
