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

    //Karn part
    public void add(GObject gObject) {
        // TODO: Implement this method.
    }
    //Karn part
    public void remove(GObject gObject) {
        // TODO: Implement this method.
    }

    // Beau Part
    @Override
    public void move(int dX, int dY) {
        /* Move every object in the list */
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
        /* Paint every object, both oval and rectangle by overriding their own methods. */
        for (GObject gObject : gObjects) {
            gObject.paintObject(g);
        }
    }

    @Override
    public void paintLabel(Graphics g) {
        /* Paint every object's label, both oval and rectangle by overriding their own methods. */
        for (GObject gObject : gObjects) {
            gObject.paintLabel(g);
        }
    }

}
