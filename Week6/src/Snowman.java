import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Random;

public class Snowman
{
	
	private Ellipse2D.Double head, body, eyeLeft, eyeRight, snowflake;
	private Line2D.Double armLeft, armRight;
	private Rectangle ground, sky;
	
	public Snowman(int x, int y, int headSize)
	{
		head = new Ellipse2D.Double(x, y, headSize, headSize); // headSize is the diameter of the head
		body = new Ellipse2D.Double(x-headSize, y+headSize, headSize*3, headSize*3);
		armLeft = new Line2D.Double(x-headSize, y+2.5*headSize, x-2*headSize, y+1.75*headSize);
		armRight = new Line2D.Double(x+2*headSize, y+2.5*headSize, x+3*headSize, y+1.75*headSize);
		eyeLeft = new Ellipse2D.Double(x+(headSize/5), y+(headSize/3), (headSize/5), (headSize/5));
		eyeRight = new Ellipse2D.Double(x+(headSize/5)*3, y+(headSize/3), (headSize/5), (headSize/5));
		ground = new Rectangle(0, y+headSize*4, 600, 400-y-(headSize*4));
		sky = new Rectangle(0, 0, 600, 400);
	}
	
	public void draw(Graphics2D g2d)
	{
		Random random = new Random();
		g2d.setColor(new Color(25, 25, 112));
		g2d.fill(sky);
		g2d.setColor(Color.WHITE);
		g2d.fill(ground);
		for (int i = 0; i < 50; i++) {
			g2d.fill(snowflake = new Ellipse2D.Double(random.nextDouble()*600, random.nextDouble()*300, 5, 5));
		}
		g2d.fill(head);
		g2d.fill(body);
		g2d.setColor(Color.BLACK);
		g2d.draw(head);
		g2d.draw(body);
		g2d.draw(armLeft);
		g2d.draw(armRight);
		g2d.fill(eyeLeft);
		g2d.fill(eyeRight);
	}
	
}
