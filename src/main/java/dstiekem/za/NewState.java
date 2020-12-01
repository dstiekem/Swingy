package dstiekem.za;

import dstiekem.za.controller.Experience;
import dstiekem.za.controller.Level;
import dstiekem.za.model.Hero;
import dstiekem.za.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.*;

//take a yes no string
//
public class NewState extends Gamestate{
    public File file;
    public Experience experience;
    public Level level;
    @NotNull
    @Size(min=1, max=3)
    public String classs;
    @NotNull
    @Size(min=1, max=3)
    public String name;
    private Hero hero;
    NewState(Hero hero) throws IOException {
        super(hero);

        try {
            BufferedReader classr = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("pick a class! type winged, Shelled, venomed, or mimicryst");
            classs = classr.readLine();
            System.out.println("great! now give your hero a name");
            BufferedReader namer = new BufferedReader(new InputStreamReader(System.in));
            name = namer.readLine();
            hero = new Hero(classs,
                    name, experience, level);
        } catch (FileNotFoundException ex) {

        }
    }
}
