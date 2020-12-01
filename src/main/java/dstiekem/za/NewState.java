package dstiekem.za;

import dstiekem.za.controller.Experience;
import dstiekem.za.controller.Level;
import dstiekem.za.model.Hero;
import dstiekem.za.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

//take a yes no string
//
public class NewState extends Gamestate{
    public File file;

    NewState(Hero hero) throws IOException {
        super(hero);
        System.out.println("pick a class! type winged, Shelled, venomed, or mimicryst");
        BufferedReader classr = new BufferedReader(new InputStreamReader(System.in));
        classs = classr.readLine();
        System.out.println("great! now give your hero a name");
        BufferedReader namer = new BufferedReader(new InputStreamReader(System.in));
        name = namer.readLine();
        Hero hero = new Hero(classs,
                name, experience, level);
    }
}
