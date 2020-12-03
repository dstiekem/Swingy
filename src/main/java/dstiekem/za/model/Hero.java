package dstiekem.za.model;

import javax.validation.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
    private Experience Ex;
    public Level l;
    private Attack at;
    private Defense de;
    private HitPoints hp;
    private Classy classy;
    //@NotNull
    //@Size(min=5, max=10)
    private String name;
    private Coords coords;

    public Hero(Classy classy, String name, Experience Ex, Level lev, Attack attack, Defense defense, HitPoints hitpoints) {
        this.classy = classy;
        this.name = name;
        this.Ex = Ex;
        this.l = lev;
        this.at = attack;
        this.de = defense;
        this.hp = hitpoints;
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
    private FightOrFlight(Enemy enemy, boolean choice, Coords coords) {

    }
    protected Artefact pickUp() {

    }*/
}