package dstiekem.za.controller;

import dstiekem.za.validators.ValidChoice;
import dstiekem.za.model.*;
import dstiekem.za.view.*;
import org.graalvm.compiler.lir.StandardOp;

import java.io.*;
import java.lang.*;
import java.util.ArrayList;
public class PlayGame {
    @ValidChoice
    private static String onlyYN;
    private static Hero hero;
    private static Map map;
    private static BufferedReader bbr;
    public static Coords coords;
    private static String dir;
    private static ChoiceChanceArray choice;
    PlayGame(Hero hero) throws IOException, InterruptedException {
        //start game
        this.hero = hero;
        OutputYouend end = new OutputYouend();
        map = new Map(hero.l);
        int size = (map.MapDim()*map.MapDim())/4;
        choice = new ChoiceChanceArray(size, 2, 0);
        //make hero put in the middle of the map and make placehero takes those coords
        coords = new Coords(map.fndCentre().getX(), map.fndCentre().getY());
        coords = hero.Move(coords, "ee");
        Coords newcord;
        map.PlaceHero(coords, coords, 0);
        //map.PrintHero();
        InputMove moving = new InputMove(coords);
        dir = moving.getDirInput();
        if(dir.equals("exit")) {
            new SaveState(hero);
        }
        int h = 0;
        while(1 == 1){
            int passedenemy = 0;
            newcord = hero.Move(coords, dir);
            if (newcord.getX() >= map.MapDim() || newcord.getY() >= map.MapDim() || newcord.getX() < 0 || newcord.getY() < 0)
            {
                end.OutputYouwon();
            }
            if(map.EnemytoFind(newcord, hero) == 1)
            {
                String fifl;
                //for(int i = 0; i < size; i++)
                //  System.out.println(choice.getnextvalue(i));
            /*if (newcord == passedenemy.getCoords())
                enemy = */
                Enemy enemy = (Enemy) map.getEnemy(h);
                InputFightorFlight ff = new InputFightorFlight(enemy);
                do{
                    fifl = ff.getFightOrFlight();
                } while (!(fifl.equals("fight")) && !(fifl.equals("flee")) && !(fifl.equals("exit")));
                if(fifl.equals("exit"))
                {
                    new SaveState(hero);
                }
                int i = hero.FightOrFlight(enemy, fifl, choice, h);
                // System.out.println("this is the index" + h);
                if(i == 2)
                {
                    ff.NowFight();
                    int comp = enemy.compareStats();
                    for(int x = 0; x < 3; x++) {
                        java.lang.Thread.sleep(1000);
                        System.out.print(".\n");
                    }
                    if(comp == 1)
                    {
                        //pick up artefact
                        System.out.println("you have beaten the enemy!\n");
                        int newexint;
                        Artefact a = enemy.DropsArtefact();
                        InputPickup pickme = new InputPickup(a);
                        //String classy = hero.getClassy();
                        int hex = hero.getEx();
                        Stat newastat = a.getStat();
                        newexint = hex + newastat.getAt() + newastat.getHi() + newastat.getDe();
                        hero.setEx(newexint);
                        pickme.newex(newexint);
                        boolean islevup = hero.l.LevelUp(hero.ex);
                        if(islevup)
                        {
                            new PlayGame(hero);
                        }
                        //for artefact...if
                    }
                    else if(comp == 2)
                    {
                        //YOU LOST
                        end.OutputYoulost();
                    }
                    else
                    {
                        System.out.println("something else happend that was niether a win nor a loss see compare stats output");
                        System.out.println(enemy.compareStats());
                    }
                }
                else if(i == 1)
                {
                    ff.ThankTheGods();
                    passedenemy = 1;

                    newcord = coords;
                }
                h++;
            }
            map.PlaceHero(newcord, coords, passedenemy);
            map.PrintMap(1);
            dir = moving.getDirPrompt();
            if(dir.equals("exit")) {
                new SaveState(hero);
            }
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
