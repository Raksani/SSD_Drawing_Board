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
        //move all objects in the list
        for (GObject gObject : gObjects) {
//			gObject.x += dX;
//			gObject.y += dY;
            gObject.move(dX, dY);
        }
    }

    //Karn Part
    public void recalculateRegion() {
        // TODO: Implement this method.
    }

    //Beau Part
    @Override
    public void paintObject(Graphics g) {
        // paint all objects, both oval and rectangle by overriding their own method.
        for (GObject gObject : gObjects) {
            gObject.paintObject(g);
        }
    }

    @Override
    public void paintLabel(Graphics g) {
        // paint all objects, both oval and rectangle by overriding their own method.
        for (GObject gObject : gObjects) {
            gObject.paintLabel(g);
        }
    }

}
