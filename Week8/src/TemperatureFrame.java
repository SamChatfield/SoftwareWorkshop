import javax.swing.JFrame;

public class TemperatureFrame
{
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Temperature");
		frame.setSize(250, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setResizable(false);
		
		TemperatureComponent tComponent = new TemperatureComponent(new Temperature(35.0), -200, 200, 0);
		
		frame.add(tComponent);
		frame.setVisible(true);
	}
	
}
