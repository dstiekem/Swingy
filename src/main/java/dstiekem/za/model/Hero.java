package dstiekem.za.model;

import java.util.Random;

public class Hero {
    private Experience ex = null;
    public Level l = null;
    /*private int at;
    private int de;
    private int hp;
    private Stat stats;*/
    private Classy classy;
    //private Coords coords;
    private String name;
    private Coords coords;

    public Hero(String name, Classy classy) {
        /*this.classy = classy;*/
        this.name = name;
        l = new Level(1);
        ex = new Experience(1000);
        this.classy = classy;


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
    public Coords Move(Coords currentCoords, String direction) {
        //figure out how to use validators here
        //this.coords = currentCoords;
        this.coords = currentCoords;
        System.out.println("HEOOOO");
        if (direction.equals("North") || direction.equals("NORTH") || direction.equals("north"))
        {
            System.out.println("HEOOOO");
            return (new Coords(this.coords.getX(), this.coords.getY() + 1));
        }
        else if (direction.equals("East") || direction.equals("EAST") || direction.equals("east"))
        {
            return (new Coords(this.coords.getX() + 1, this.coords.getY()));
        }
        else if (direction.equals("South") || direction.equals("SOUTH") || direction.equals("south"))
        {
            return (new Coords (this.coords.getX(), this.coords.getY() - 1));
        }
        else if (direction.equals("West") || direction.equals("WEST") || direction.equals("west"))
        {
            return (new Coords (this.coords.getX() - 1, this.coords.getY()));
        }
        return (new Coords(88770, 96));
    }
    public int FightOrFlight(Enemy enemy, String choice, Coords coords) {
        if(choice.equals("fight"))
        {
            return 1;
        }
        else {
            Random r = new Random();
            int chance = r.nextInt(2);
            if (chance == 1) {
                return 0;
            } else if (chance == 2) {
                return 1;
            }
        }
        return 0;
    }
    public Coords getCoords() {
        return coords;
    }


}
