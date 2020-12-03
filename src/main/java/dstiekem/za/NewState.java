package dstiekem.za;

import dstiekem.za.controller.*;
import dstiekem.za.controller.*;
import dstiekem.za.model.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
    @NotNull
    @Size(min=1, max=3)
    public static Class classs;
    @NotNull
    @Size(min=1, max=3)
    public static String name;
    NewState() throws IOException {
        super(createHero());

    }
    static private Hero createHero() {
        Hero hero;
        try {
            BufferedReader classr = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("pick a class! type winged, Shelled, venomed, or mimicryst");
            classs = classr.readLine();
            System.out.println("great! now give your hero a name");
            BufferedReader namer = new BufferedReader(new InputStreamReader(System.in));
            name = namer.readLine();
            level = new Level(1);
            experience = new Experience(1000);


            hero = new Hero(classs, name, experience, level, at, de, hi);
            return hero;
        } catch (FileNotFoundException ex) {

        } catch (IOException e) {
            e.printStackTrace();
        }
        return hero;
    }
}
