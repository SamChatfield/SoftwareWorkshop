import javax.swing.JFrame;

public class FrameTest
{
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("MERRY CHRISTMAS");
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		//RectangleComponent rc = new RectangleComponent(100, 20);
		SnowmanComponent sc = new SnowmanComponent(200, 100, 50);
		
		//frame.add(rc);
		frame.add(sc);
		frame.setVisible(true);
	}
	
}
