package objects;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class CompositeGObject extends GObject {

	private List<GObject> gObjects;

	public CompositeGObject() {
		super(0, 0, 0, 0);
		gObjects = new ArrayList<GObject>();
	}

	//add and remove Karn part
	public void add(GObject gObject) {
		// TODO: Implement this method.
	}

	public void remove(GObject gObject) {
		// TODO: Implement this method.
	}

	// Beau Part
	@Override
	public void move(int dX, int dY) {
		// TODO: Implement this method.
	}

	//Karn Part
	public void recalculateRegion() {
		// TODO: Implement this method.
	}

	//Beau Part
	@Override
	public void paintObject(Graphics g) {
		// TODO: Implement this method.
	}

	@Override
	public void paintLabel(Graphics g) {
		// TODO: Implement this method.
	}
	
}
