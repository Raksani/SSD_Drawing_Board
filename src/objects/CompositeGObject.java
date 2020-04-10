package objects;

import com.sun.tools.corba.se.idl.InterfaceGen;

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
        gObjects.add(gObject);

    }
    //Karn part
    public void remove(GObject gObject) {
        gObjects.remove(gObject);
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
        int width = 0;
        int height = 0;
        int Xmin = Integer.MAX_VALUE;
        int Ymin = Integer.MAX_VALUE;
        int Xmax = Integer.MIN_VALUE;
        int Ymax = Integer.MIN_VALUE;

        for (GObject g: gObjects){
            if (Xmax < g.x){
                Xmax = g.x;
                height = g.height;
            }
            if (Ymax < g.y){
                Ymax = g.y;
                width = g.width;
            }
            Xmin = Math.min(g.x, Xmin);
            Ymin = Math.min(g.y, Ymin);
        }
        super.x = Xmin;
        super.y = Ymin;
        super.width = Xmax - Xmin + width;
        super.height = Ymax - Ymin + height;
        //จัดไป
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
