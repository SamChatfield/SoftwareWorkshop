import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class RectangleComponent extends JComponent
{
	
	private int x, y;
	
	public RectangleComponent(int x, int y)
	{
		super();
		this.x = x;
		this.y = y;
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		Rectangle box = new Rectangle(x, y, 200, 100);
		
		g2d.setColor(Color.RED);
		g2d.fill(box);
		
		Color c = new Color(0, 255, 0);
		g2d.setColor(c);
		g2d.draw(box);
		g2d.drawString("My rectangle", x+60, y+55);
	}
	
}
