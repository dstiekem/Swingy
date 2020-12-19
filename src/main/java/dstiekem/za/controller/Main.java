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
    public static Coords coords;
    private static String dir;
    private static ChoiceChanceArray choice;
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
        OutputYouend end = new OutputYouend();
        map = new Map(hero.l);
        choice = new ChoiceChanceArray(map.MapDim(), 2, 0);
        //make hero put in the middle of the map and make placehero takes those coords
        coords = new Coords(map.fndCentre().getX(), map.fndCentre().getY());
        coords = hero.Move(coords, "ee");
        Coords newcord;
        map.PlaceHero(coords, coords, 0);
        //map.PrintHero();
        InputMove moving = new InputMove(coords);
        dir = moving.getDirInput();
        while(1 == 1){
            int passedenemy = 0;
            newcord = hero.Move(coords, dir);
            if (newcord.getX() >= map.MapDim() || newcord.getY() >= map.MapDim() || newcord.getX() < 0 || newcord.getY() < 0)
            {
                end.OutputYouwon();
            }
            if(map.EnemytoFind(newcord, hero) == 1)
            {
                Enemy enemy = (Enemy) map.getEnemy();
                InputFightorFlight ff = new InputFightorFlight(enemy);
                int i = hero.FightOrFlight(enemy, ff.getFightOrFlight(), choice);
                for(int h = 0; h < map.MapDim(); h++) {
                    System.out.println(choice.getnextvalue(h));
                    //System.out.println(h);
                }
                if(i == 1)
                {
                    ff.NowFight();
                    if(enemy.compareStats() == 1)
                    {
                        //pick up artefact
                        Artefact a = enemy.DropsArtefact();
                        InputPickup pickme = new InputPickup(a);
                        //for artefact...if
                    }
                    else if(enemy.compareStats() == 2)
                    {
                        //YOU LOST
                        end.OutputYoulost();
                    }
                    //enemy.compare stats
                        //if hero has higher stats he has a 4/5 chance winning
                        //if hero has lower stats he has a 3/5 chance winning
                    //if won
                        //hero.pickupart
                        //art adds pointsNeededForNextLevel

                }
                else if(i == 0)
                {
                    ff.ThankTheGods();
                    passedenemy = 1;
                    newcord = coords;
                }
            }
            map.PlaceHero(newcord, coords, passedenemy);
            map.PrintMap(1);
            dir = moving.getDirPrompt();
            coords = newcord;
        }
        //call input move in a loop
        //pass the directions to hero.move
        //check if theres an emeny at that point
            //call fights with the map.
                //change value at that point to reflect nothing if hero won.
        //or nothing move on

        //map.MoveMap(hero);
    }
}
