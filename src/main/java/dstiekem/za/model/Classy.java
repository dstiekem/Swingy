package dstiekem.za.model;

import dstiekem.za.model.*;

public class Classy {
    private String className;
    private int at;
    private int de;
    private int hi;
    private Stat stat;
    public Classy(String className) {

        this.className = className;
        setNewClassAt(this.className);
        setNewClassDe(this.className);
        setNewClassHi(this.className);

    }
    private void setNewClassAt(String className) {
        if (className.equals("mimicryst"))
        {
            at = 300;
        }
        if (className.equals("venomed"))
        {
            at = 500;
        }
        if (className.equals("shelled"))
        {
            at = 100;
        }
        if (className.equals("winged"))
        {
            at = 100;
        }
        //winged, Shelled, venomed, or mimicryst
        /*  return (at);*/
    }
    private void setNewClassDe(String className) {
        if (className.equals("mimicryst"))
        {
            de = 300;
        }
        if (className.equals("venomed"))
        {
            de =100;
        }
        if (className.equals("shelled"))
        {
            de = 500;
        }
        if (className.equals("winged"))
        {
            de = 100;
        }
        //winged, Shelled, venomed, or mimicryst
        /*        return (de);*/
    }
    private void setNewClassHi(String className) {
        if (className.equals("mimicryst"))
        {
            hi = 100;
        }
        if (className.equals("venomed"))
        {
            hi = 200;
        }
        if (className.equals("shelled"))
        {
            hi = 200;
        }
        if (className.equals("winged"))
        {
            hi = 500;
        }
        /*return (hi);*/
    }
    public String getClassName() {
        return className;
    }
    public Stat getStat(){
        stat = new Stat(hi, de, at);
        return stat;
    }
}