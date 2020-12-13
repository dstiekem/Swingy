package dstiekem.za.model;

import dstiekem.za.model.*;

public class Classy {
    private String className;
    private int at;
    private int de;
    private int hi;
    public Classy(String className) {

        this.className = className;
        setNewClassAt(this.className);
        setNewClassDe(this.className);
        setNewClassHi(this.className);

    }
    private void setNewClassAt(String className) {
        if (className.equals("mimicryst"))
        {
            at = 75;
        }
        if (className.equals("venomed"))
        {
            at = 100;
        }
        if (className.equals("shelled"))
        {
            at = 25;
        }
        if (className.equals("winged"))
        {
            at = 25;
        }
        //winged, Shelled, venomed, or mimicryst
        /*  return (at);*/
    }
    private void setNewClassDe(String className) {
        if (className.equals("mimicryst"))
        {
            de = 75;
        }
        if (className.equals("venomed"))
        {
            de = 25;
        }
        if (className.equals("shelled"))
        {
            de = 100;
        }
        if (className.equals("winged"))
        {
            de = 50;
        }
        //winged, Shelled, venomed, or mimicryst
        /*        return (de);*/
    }
    private void setNewClassHi(String className) {
        if (className.equals("mimicryst"))
        {
            hi = 25;
        }
        if (className.equals("venomed"))
        {
            hi = 50;
        }
        if (className.equals("shelled"))
        {
            hi = 50;
        }
        if (className.equals("winged"))
        {
            hi = 100;
        }
        /*return (hi);*/
    }
}