package dstiekem.za;

import dstiekem.za.model.*;

public class Classy {
    private String className;
    private Attack at;
    private Defense de;
    private HitPoints hi;
    Classy(String className) {

        this.className = className;
        setNewClassAt(this.className);
        setNewClassDe(this.className);
        setNewClassHi(this.className);

    }
    private void setNewClassAt(String className) {
        if (className.equals("mimicryst"))
        {
            at.setAtt(75);
        }
        if (className.equals("venomed"))
        {
            at.setAtt(100);
        }
        if (className.equals("shelled"))
        {
            at.setAtt(25);
        }
        if (className.equals("winged"))
        {
            at.setAtt(25);
        }
        //winged, Shelled, venomed, or mimicryst
      /*  return (at);*/
    }
    private void setNewClassDe(String className) {
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
/*        return (de);*/
    }
    private void setNewClassHi(String className) {
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
        /*return (hi);*/
    }
    public Attack getAt() {
        return this.at;
    }
    public HitPoints getHi() {
        return this.hi;
    }
    public Defense getDe() {
        return this.de;
    }

}
