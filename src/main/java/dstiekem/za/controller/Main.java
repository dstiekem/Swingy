package dstiekem.za.controller;

import dstiekem.za.validators.ValidChoice;
import dstiekem.za.model.*;
import dstiekem.za.view.InputClassname;
import dstiekem.za.view.InputNewgame;
import org.graalvm.compiler.lir.StandardOp;

import java.io.*;
import java.lang.*;

public class Main
{
    @ValidChoice
    private static String onlyYN;
    private static Hero hero;
    public static void main( String[] args ) throws IOException {
        System.out.println("Create new game?: ");
        BufferedReader mr = new BufferedReader(new InputStreamReader(System.in));
        onlyYN = mr.readLine();
        boolean fileex = true;
        try {
            File file = new File("savestate.txt");
            FileReader fr = new FileReader(file);
            BufferedReader bbr = new BufferedReader(fr);

        } catch (FileNotFoundException ex) {
            fileex = false;
        }
        InputNewgame inpit = new InputNewgame(onlyYN, fileex);
        if(inpit.GetGame()) {
            System.out.println("cx");
        }
        else {
            InputClassname ICN = new InputClassname();
            Classy classy = new Classy(ICN.getClassy());
            hero = new Hero(ICN.getHeroname(), classy);
            hero.setInitalLevEx(1, 1000);
            System.out.println("yeee! Your hero is a " + ICN.getClassy() + " by the name of " + ICN.getHeroname());
        }


        //map(gameState.gethero)
            /*BufferedWriter bbw = new BufferedWriter(new FileWriter(file));
            bbw.write("overwrten");
            bbw.close();*/
    }

}
