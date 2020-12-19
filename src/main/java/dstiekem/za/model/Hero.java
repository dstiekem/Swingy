package dstiekem.za.model;

import dstiekem.za.controller.ChoiceChanceArray;

import java.util.Random;

public class Hero {
    private Experience ex = null;
    public Level l = null;
    /*private int at;
    private int de;
    private int hp;*/
    private Stat stats;
    private Classy classy;
    //private Coords coords;
    private String name;
    public Coords coords;

    public Hero(String name, Classy classy) {
        /*this.classy = classy;*/
        this.name = name;
        l = new Level(1);
        ex = new Experience(1000);
        this.classy = classy;
        //this.coords = new Coords(2, 2);
    }
    /*public void setInitalLevEx() {

    }*/
    public int getLev() {
        return this.l.getLev();
    }
/*    public Attack getAt() {
        return at;
    }
    public Defense getDe() {
        return de;
    }
    public HitPoints getHi() {
        return hp;
    }*/
    public String getClassy() {
        return classy.getClassName();
    }
    public int getEx() {
        return ex.getEx();
    }
    public void setLev(int setlev) {
        this.l.setLevel(setlev);
    }
    public void setEx(int setexp) {
        this.ex.setExp(setexp);
    }
    public String getName() {
        return name;
    }
/*    public void setAt(int setat) {
        this.at.setAtt(setat);
    }
    public void setDe(int setde) {
        this.de.setDe(setde);
    }
    public void setHi(int sethi) {
        this.hp.setHi(sethi);
    }*/
    public Coords Move(Coords coords, String direction) {
        Coords newcoord = new Coords(coords.getX(), coords.getY());
        //this.coords = newcoord;
        if (direction.equals("North") || direction.equals("NORTH") || direction.equals("north"))
        {
            newcoord.setX(coords.getX() - 1);
            newcoord.setY(coords.getY());
           // return (new Coords(this.coords.getX(), this.coords.getY() + 1));
        }
        else if (direction.equals("East") || direction.equals("EAST") || direction.equals("east"))
        {
            newcoord.setX(coords.getX());
            newcoord.setY(coords.getY() + 1);
        }
        else if (direction.equals("South") || direction.equals("SOUTH") || direction.equals("south"))
        {
            newcoord.setX(coords.getX() + 1);
            newcoord.setY(coords.getY());
        }
        else if (direction.equals("West") || direction.equals("WEST") || direction.equals("west"))
        {
            newcoord.setX(coords.getX());
            newcoord.setY(coords.getY() - 1);
        }
        return (newcoord);
    }
    public int FightOrFlight(Enemy enemy, String choice, ChoiceChanceArray choicechance) {
        if(choice.equals("fight"))
        {
            return 1;
        }
        else if (choice.equals("flee") || choice.equals("flight")) {

            System.out.println("e" + choicechance.getnextvalue(1));
            if (choicechance.getnextvalue(1) == 1) {
                return 0;
            } else if (choicechance.getnextvalue(1) == 2) {
                return 1;
            }
        }
        return 0;
    }
    public Coords getCoords() {
        return this.coords;
    }
    public void setCoords(Coords newcoords) {
        this.coords = newcoords;
    }
}
