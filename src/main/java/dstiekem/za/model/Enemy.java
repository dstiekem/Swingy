
package dstiekem.za.model;

import dstiekem.za.controller.ChoiceChanceArray;
import dstiekem.za.model.Level;
import dstiekem.za.model.*;

import java.util.Random;
public abstract class Enemy {
    Level heL;
    Level enL;
    String name;
    String threat;
    Hero hero;
    Artefact a;
    Coords coords;
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
    public int compareStats() {
        ChoiceChanceArray hchance;
        ChoiceChanceArray echance;
        int max = 5;
        int min = 1;
        int out = 1;
        if(heL.getLev() < enL.getLev())
        {
            Random ran = new Random();
            echance = new ChoiceChanceArray(5, 2, 3);
            //int out = echance.getnextvalue(ran.nextInt((max - min) + 1) + min);
            out = echance.getnextvalue(ran.nextInt(5));
            //System.out.println(out);
            //ran.nextInt((max - min) + 1) + min
            //
        }
        else if(heL.getLev() >= enL.getLev())
        {
            Random ran = new Random();
            echance = new ChoiceChanceArray(5, 2, 4);

            /*int out = echance.getnextvalue(ran.nextInt((max - min) + 1) + min);
            if (out < 1)
            {

            }*/
            out = echance.getnextvalue(ran.nextInt(5));
            //System.out.println(out);
            //return out;
            //ran.nextInt((max - min) + 1) + min
        }
        //System.out.println("didnt companre stats");
        return out;
    }
    public Artefact DropsArtefact() {
        Random r = new Random();
        int max = 3;
        int min = 1;
        int chance = r.nextInt((max - min) + 1) + min;
        /*int Low = 1;
        int High = 10;
        int R = r.nextInt(High-Low) + Low;*/
        //System.out.println("random art number" + chance);
        if (chance == 1)
            a = new FlowerArtefact(heL);
        if (chance == 2)
            a = new RoyaJellyArtefact(heL);
        if(chance == 3)
            a = new LeafArtefact(heL);

        return a;
    }
    public void setCoords(int X, int Y){
        coords.setX(X);
        coords.setY(Y);
    }
    public Coords getCoords(){
        return coords;
    }

}
