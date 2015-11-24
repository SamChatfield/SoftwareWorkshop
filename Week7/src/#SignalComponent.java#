import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class SignalComponent extends JComponent
{
	
	private Network net;
	private int mapSize, frameSize;
	private double maxSig;
	
	public SignalComponent(Network net, int mapSize, int frameSize, double maxSig)
	{
		super();
		this.net = net;
		this.mapSize = mapSize;
		this.frameSize = frameSize;
		this.maxSig = maxSig;
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		frameSize = getWidth();
		for (int i = 0; i < frameSize; i++) {
			for (int j = 0; j < frameSize; j++) {
				double x = (double) i / frameSize * mapSize;
				double y = (double) j / frameSize * mapSize;
				
				double sig = net.getSignal(x, y); // get signal at (x, y)
				int greyLevel = (int) (255 * sig / maxSig); // set grey level
				Rectangle pixel = new Rectangle(i, j, 1, 1); // create 1 by 1 rectangle
				try {
					Color grey = new Color(greyLevel, greyLevel, greyLevel); // set colour to grey
					g2d.setColor(grey);
				} catch (IllegalArgumentException e) {
					g2d.setColor(Color.RED);
				}
				g2d.fill(pixel); // draw rectangle
			}
		}
	}
	
}
