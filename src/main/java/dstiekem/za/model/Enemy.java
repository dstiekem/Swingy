package dstiekem.za.model;

import dstiekem.za.controller.Level;
import dstiekem.za.model.*;

import java.util.Random;
//aggregates the level. either +1 -1 or the same level.
//map is composed of enemy
//behaviour:
// generates itself randomly on the map
// wins or looses a fight
//drops an artefact.

//attributes:
// a level
// an artefact
public abstract class Enemy {
    Level heL;
    Level enL;
    Artefact a;
    Enemy(Level heL) {
        this.heL = heL;
        int plusMinus = new Random().nextInt(2);
        if(plusMinus == 1)
            enL.setLevel(this.heL.getLev() - 1);
        else
            enL.setLevel(this.heL.getLev() + 1);
    }

    public Artefact DropsArtefact() {
        Random r = new Random();
        int chance = r.nextInt(3);
        if (chance == 1)
            a = new FlowerArtefact(heL);
        if (chance == 2)
            a = new RoyajellyArtefact(heL);
        if(chance == 3)
            a = new LeafArtefact(heL);
        return a;
    }
}