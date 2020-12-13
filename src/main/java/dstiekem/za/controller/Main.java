package dstiekem.za.controller;

import dstiekem.za.validators.ValidChoice;

import java.io.*;
import java.lang.*;

public class Main
{
    @ValidChoice
    String onlyYN;
    public static void main( String[] args ) throws IOException {

        BufferedReader mr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Create newgame?: ");
            /*onlyYN = mr.readLine();
            GameState gameState;
            Hero hero = null;
            if (onlyYN.equals("yes") || onlyYN.equals("Yes") || onlyYN.equals("YES") || onlyYN.equals("Y") || onlyYN.equals("y")) {
                gameState = new NewState(hero);
            } else if (onlyYN.equals("no") || onlyYN.equals("No") || onlyYN.equals("NO") || onlyYN.equals("N") || onlyYN.equals("n")) {
                gameState = new ReadState(hero);
            }*/

        //map(gameState.gethero)
            /*BufferedWriter bbw = new BufferedWriter(new FileWriter(file));
            bbw.write("overwrten");
            bbw.close();*/
    }

}
