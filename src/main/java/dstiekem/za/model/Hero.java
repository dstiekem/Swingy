package java.model;

import javax.validation;

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
public abstract class Hero {
    protected Level l;
    protected Experience Ex;
    protected Attack at;
    protected Defense de;
    protected HitPoints hp;
    protected String classy;
    protected Coords coords;
    protected Hero(String classy) {

    }

    protected coords move(Coords currentCoords, String direction) {
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
    }
    protected FightOrFlight(Enemy enemy, boolean choice) {

    }
    protected Artefact pickUp() {

    }
}