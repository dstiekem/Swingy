package dstiekem.za;

import java.util.*;
import javax.swing.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.awt.*;

import dstiekem.za.*;
import dstiekem.za.controller.*;
import dstiekem.za.model.Hero;

import java.io.*;
import java.util.*;
import java.lang.*;

public class Main
{
    public static void main( String[] args ) throws IOException {
        //launch gui : Framey
            //
        //see if you can read from the file
            //if you can old game is set
        //new game or old game
            //old game: parse a json file if it exists.
            //new game: generate random character.
        //
        @NotNull
        @Size(min=1, max=3)
        String onlyYN;
        try {
            BufferedReader mr = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Create new game?: ");
            onlyYN = mr.readLine();
            GameState gameState;
            Hero hero = null;
            if (onlyYN.equals("yes") || onlyYN.equals("Yes") || onlyYN.equals("YES") || onlyYN.equals("Y") || onlyYN.equals("y")) {
                gameState = new NewState(hero);
            } else if (onlyYN.equals("no") || onlyYN.equals("No") || onlyYN.equals("NO") || onlyYN.equals("N") || onlyYN.equals("n")) {
                gameState = new ReadState(hero);
            }
            //map(gameState.gethero)
            /*BufferedWriter bbw = new BufferedWriter(new FileWriter(file));
            bbw.write("overwrten");
            bbw.close();*/
        } catch (IOException e) {
            System.out.println("Error reading input!");
        }
    }

}
