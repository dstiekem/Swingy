package dstiekem.za.model;

import javax.validation.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import dstiekem.za.Classy;
import dstiekem.za.model.*;
import dstiekem.za.controller.*;

//hero behaviours:
//move
//pick up artifects, pickup artefacts shoudl be an interface to be defined by each hero.
//fightOrFlight also defined by each hero.
//attributes:
// experience - game state
// level - game state
//attack - fight
//defense - run
//hit points - how many attack before die
public class Hero {
    private Experience ex;
    public Level l;
    private Attack at;
    private Defense de;
    private HitPoints hp;
    private Classy classy;
    //@NotNull
    //@Size(min=5, max=10)
    private String name;
    private Coords coords;

    /*public Hero(Classy classy, String name, Experience exp, Level lev, Attack attack, Defense defense, HitPoints hitpoints) {
        this.classy = classy;
        this.name = name;
        this.ex = exp;
        this.l = lev;
        this.at = attack;
        this.de = defense;
        this.hp = hitpoints;
    }*/

    public Hero(String name) {
        /*this.classy = classy;*/
        this.name = name;
    }

    private Coords move(Coords currentCoords, String direction) {
        //figure out how to use validators here
        if (direction.equals("North") || direction.equals("NORTH") || direction.equals("north"))
        {
            return (currentCoords(x, y+1));
        }
        else if (direction.equals("East") || direction.equals("EAST") || direction.equals("east"))
        {
            return (currentCoords(x+1, y));
        }
        else if (direction.equals("South") || direction.equals("SOUTH") || direction.equals("south"))
        {
            return (currentCoords(x, y-1));
        }
        else if (direction.equals("West") || direction.equals("WEST") || direction.equals("west"))
        {
            return (currentCoords(x-1, y));
        }
        return (currentCoords(x,y));
    }
    private void FightOrFlight(Enemy enemy, boolean choice, Coords coords) {

    }
    protected Artefact pickUp() {

    }
    public Level getLev() {
        return this.l;
    }
    public Attack getAt() {
        return at;
    }
    public Defense getDe() {
        return de;
    }
    public HitPoints getHi() {
        return hp;
    }
    public Classy getClassy() {
        return classy;
    }
    public Experience getEx() {
        return ex;
    }
    public void setLev(int setlev) {
        this.l.setLevel(setlev);
    }
    public void setEx(int setexp) {
        this.ex.setExp(setexp);
    }
    public void setAt(int setat) {
        this.at.setAtt(setat);
    }
    public void setDe(int setde) {
        this.de.setDe(setde);
    }
    public void setHi(int sethi) {
        this.hp.setHi(sethi);
    }

    public void setClassy(Classy classy) {
        this.classy = classy;

    }
}