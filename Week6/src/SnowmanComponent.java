import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class SnowmanComponent extends JComponent
{
	
	private Snowman snowman;
	
	public SnowmanComponent(int x, int y, int headSize)
	{
		super();
		snowman = new Snowman(x, y, headSize);
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		snowman.draw(g2d);
	}
	
}
