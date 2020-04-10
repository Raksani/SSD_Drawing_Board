package objects;

import java.awt.Color;
import java.awt.Graphics;

//Beau Part
public class Oval extends GObject {

	private Color color;
	
	public Oval(int x, int y, int width, int height, Color color) {
		super(x, y, width, height);
		this.color = color;
	}


	@Override
	public void paintObject(Graphics g) {
        /* Set the color as we declare. */
        g.setColor(color);
        /* Draw a filled oval in the position (x,y) with size (width, height) */
        g.fillOval(x,y,width,height);

	}
	
	@Override
	public void paintLabel(Graphics g) {
        /* Draw label below the object, "Oval" */
        g.setColor(Color.BLACK);
        /* y + height = below object */
        g.drawString("Oval",x,y + height);

	}
	
}
