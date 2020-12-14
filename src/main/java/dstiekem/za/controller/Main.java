package dstiekem.za.controller;

import dstiekem.za.validators.ValidChoice;
import dstiekem.za.model.*;
import dstiekem.za.view.*;
import org.graalvm.compiler.lir.StandardOp;

import java.io.*;
import java.lang.*;
import java.util.ArrayList;

public class Main
{
    @ValidChoice
    private static String onlyYN;
    private static Hero hero;
    private static Map map;
    private static BufferedReader bbr;
    private static Coords coords;

    public static void main( String[] args ) throws IOException {
        System.out.println("Create new game?: ");
        BufferedReader mr = new BufferedReader(new InputStreamReader(System.in));
        onlyYN = mr.readLine();
        boolean fileex = true;
        try {
            File file = new File("savestate.txt");
            FileReader fr = new FileReader(file);
            bbr = new BufferedReader(fr);

        } catch (FileNotFoundException ex) {
            fileex = false;
        }
        InputNewgame inpit = new InputNewgame(onlyYN, fileex);
        if(inpit.GetGame()) {
            try {

                ArrayList<String> lines = new ArrayList<String>();
                for (;;) {
                    String line = bbr.readLine();
                    lines.add(line);
                    if (line == null) {
                        break;
                    }
                }
                Classy readclassy = new Classy(lines.get(1));
                hero = new Hero(lines.get(0), readclassy);
                hero.setEx(Integer.parseInt(lines.get(2)));
                hero.setLev(Integer.parseInt(lines.get(3)));

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        else {
            InputClassname ICN = new InputClassname();
            Classy classy = new Classy(ICN.getClassy());
            hero = new Hero(ICN.getHeroname(), classy);
            System.out.println("yeee! Your hero is a " + ICN.getClassy() + " by the name of " + ICN.getHeroname());
        }
        //start game
        map = new Map(hero.l);
        coords = map.PlaceHero();
        InputMove moving = new InputMove(coords);
        String dir;
        //coords = new Coords(1,1);
        dir = moving.getDirInput();
        while(1 == 1){
            coords = hero.Move(this.coords, dir);
            dir = new String();
            //System.out.println(dir);
            dir = moving.getDirPrompt();
            System.out.println(dir);
            if (coords.getX() >= map.MapDim() || coords.getY() >= map.MapDim() || coords.getX() < 0 || coords.getY() < 0)
            {
                new OutputYouwon();
            }
            if(map.EnemytoFind(coords, hero))
            {
                Enemy enemy = (Enemy) map.getEnemy();
                InputFightorFlight ff = new InputFightorFlight(enemy);
                hero.FightOrFlight(enemy, ff.getFightOrFlight(), coords);
            }
            /*System.out.println(coords.getX());
            System.out.println(coords.getY());*/

        }
        //call input move in a loop
        //pass the directions to hero.move
        //check if theres an emeny at that point
            //call fights with the map.
                //change value at that point to reflect nothing if hero won.
        //or nothing move on
    }
}
