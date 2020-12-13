package dstiekem.za.model;

import dstiekem.za.model.Classy;

public class Hero {
    private Experience ex = null;
    private Level l = null;
    /*private int at;
    private int de;
    private int hp;
    private Stat stats;*/
    private Classy classy;
    //private Coords coords;
    private String name;

    public Hero(String name, Classy classy) {
        /*this.classy = classy;*/
        this.name = name;

    }
    public void setInitalLevEx(int one, int onethousand) {
        l = new Level(1);
        ex = new Experience(1000);

    }
}
