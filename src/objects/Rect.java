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
		// TODO: Implement this method.
	}
	
	@Override
	public void paintLabel(Graphics g) {
		// TODO: Implement this method.
	}
	
}
