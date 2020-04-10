package objects;

import java.awt.Color;
import java.awt.Graphics;

//Beau Part
public class Rect extends GObject  {

	private Color color;
	
	public Rect(int x, int y, int width, int height, Color color) {
		super(x, y, width, height);
		this.color = color;
	}

	@Override
	public void paintObject(Graphics g) {
		/* Set the color as we declare. */
		g.setColor(color);
		/* Draw a filled rectangle in the position (x,y) with size (width, height) */
		g.fillRect(x,y,width,height);
	}
	
	@Override
	public void paintLabel(Graphics g) {
		/* Draw label below the object, "Rectangle" */
		g.setColor(Color.BLACK);
		/* y + height = below object */
		g.drawString("Rectangle",x, y + height + 15);
		g.
	}
	
}
