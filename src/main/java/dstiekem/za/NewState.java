package dstiekem.za;

import dstiekem.za.controller.*;
import dstiekem.za.controller.*;
import dstiekem.za.model.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import dstiekem.za.validators.ValidClassy;
import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;


//take a yes no string
//
public class NewState extends GameState{

    public static Experience experience;
    public static Level level;
    public static Attack at;
    public static Defense de;
    public static HitPoints hi;
    @ValidClassy
    public static Classy classs;
    @NotNull
    @Size(min=1, max=3)
    public static String name;
    NewState(Hero hero) throws IOException {
        super(hero);
    }
    private void createHero() {
        try {
            BufferedReader classr = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("pick a class! type winged, Shelled, venomed, or mimicryst");
            classs = new Classy(classr.readLine());
            System.out.println("great! now give your hero a name");
            BufferedReader namer = new BufferedReader(new InputStreamReader(System.in));
            this.hero = new Hero(namer.readLine());
            this.hero.setClassy(classs);
            this.hero.setLev(1);
            this.hero.setEx(1000);

            /*return hero;*/
        } catch (FileNotFoundException ex) {

        } catch (IOException e) {
            e.printStackTrace();
        }
        /*return hero;*/
    }
}
