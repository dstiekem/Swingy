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
    public Experience Ex;
    public Level l;
    protected Attack at;
    protected Defense de;
    protected HitPoints hp;
    protected String classy;
    //@NotNull
    //@Size(min=5, max=10)
    protected String name;
    protected Coords coords;

    public Hero(String classy, String name, Experience Ex, Level lev) {
        this.classy = classy;
        this.name = name;
        this.Ex = Ex;
        this.l = lev;
    }

    priavte Coords move(Coords currentCoords, String direction) {
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
  /*  protected FightOrFlight(Enemy enemy, boolean choice) {

    }
    protected Artefact pickUp() {

    }*/
}