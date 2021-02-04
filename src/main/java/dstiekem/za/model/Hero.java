package dstiekem.za.model;

import dstiekem.za.controller.ChoiceChanceArray;
import dstiekem.za.controller.SaveState;
import dstiekem.za.view.InputFightorFlight;

import java.io.IOException;
import java.util.Random;

public class Hero {
    public Experience ex = null;
    public Level l = null;
    /*private int at;
    private int de;
    private int hp;*/
    private Stat stats;
    public Classy classy;
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
    public int getLev() {
        return this.l.getLev();
    }
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
    public Coords Move(Coords coords, String direction) {
        Coords newcoord = new Coords(coords.getX(), coords.getY());
        if (direction.equals("North") || direction.equals("NORTH") || direction.equals("north"))
        {
            newcoord.setX(coords.getX() - 1);
            newcoord.setY(coords.getY());
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
    public int FightOrFlight(Enemy enemy, String choice, ChoiceChanceArray choicechance, int index) throws InterruptedException {

        if(choice.equals("fight"))
        {
            return 2;
        }
        else if (choice.equals("flee")) {

            //System.out.println("e" + choicechance.getnextvalue(1));
            if (choicechance.getnextvalue(index) == 1) {
                return 1;
            } else if (choicechance.getnextvalue(index) == 2) {
                return 2;
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
