
package dstiekem.za.model;

import dstiekem.za.model.Level;
import dstiekem.za.model.*;

import java.util.Random;
public abstract class Enemy {
    Level heL;
    Level enL;
    String name;
    String threat;
    //Artefact a;
    Enemy(Level heL) {
        this.heL = heL;
        enL = new Level(1);
        int plusMinus = new Random().nextInt(2);
        if(plusMinus == 1)
            enL.setLevel(this.heL.getLev() - 1);
        else
            enL.setLevel(this.heL.getLev() + 1);
    }
    public String getName() {
        return name;
    }
    public void setThreat(String threat) {
        this.threat = threat;
    }
    public String getThreat() {
        return threat;
    }

   /* public Artefact DropsArtefact() {
        Random r = new Random();
        int chance = r.nextInt(3);
        if (chance == 1)
            a = new FlowerArtefact(heL);
        if (chance == 2)
            a = new RoyajellyArtefact(heL);
        if(chance == 3)
            a = new LeafArtefact(heL);
        return a;
    }*/


}
