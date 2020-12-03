package dstiekem.za;

import dstiekem.za.model.*;

public class Classy {
    private String className;
    private Attack at;
    private Defense de;
    private HitPoints hi;
    Classy(String className) {
        this.className = className;
    }
    public Attack getClassAt() {
        if (className.equals("mimicryst"))
        {
            at.setAt(75);
        }
        if (className.equals("venomed"))
        {
            at.setAt(100);
        }
        if (className.equals("shelled"))
        {
            at.setAt(25);
        }
        if (className.equals("winged"))
        {
            at.setAt(25);
        }
        //winged, Shelled, venomed, or mimicryst
        return (at);
    }
    public Defense getClassDe() {
        if (className.equals("mimicryst"))
        {
            de.setDe(75);
        }
        if (className.equals("venomed"))
        {
            de.setDe(25);
        }
        if (className.equals("shelled"))
        {
            de.setDe(100);
        }
        if (className.equals("winged"))
        {
            de.setDe(50);
        }
        //winged, Shelled, venomed, or mimicryst
        return (de);
    }
    public HitPoints getClassHi() {
        if (className.equals("mimicryst"))
        {
            hi.setHi(25);
        }
        if (className.equals("venomed"))
        {
            hi.setHi(50);
        }
        if (className.equals("shelled"))
        {
            hi.setHi(50);
        }
        if (className.equals("winged"))
        {
            hi.setHi(100);
        }
        //winged, Shelled, venomed, or mimicryst
        return (hi);
    }

}
