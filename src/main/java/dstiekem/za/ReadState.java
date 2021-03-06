package dstiekem.za;

import dstiekem.za.controller.*;
import dstiekem.za.controller.*;
import dstiekem.za.model.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import dstiekem.za.validators.ValidChoice;
import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadState extends GameState{

   /* public static Experience experience;
    public static Level level;
    public static Attack at;
    public static Defense de;
    public static HitPoints hi;*/
    @ValidChoice
    public String onlyYN;
    @NotNull
    @Size(min=1, max=3)
    public String classs;
    @NotNull
    @Size(min=1, max=3)
    public String name;

    ReadState(Hero hero) throws IOException {
        super(hero);
        readHero();
        file = new File("savestate.txt");

    }
    public void readHero() throws IOException {
        try {
            FileReader fr = new FileReader(file);
            BufferedReader bbr = new BufferedReader(fr);
            ArrayList<String> lines = new ArrayList<>();
            for (;;) {
                String line = bbr.readLine();
                if (line == null) { // End of input reached.
                    break;
                }
            }
            //problem: I want to set parameters of a constructor by using set methods from that object
            this.hero = new Hero(lines.get(0));
            Classy classy = new Classy(lines.get(1));
            this.hero.setEx(Integer.parseInt(lines.get(2)));
            this.hero.setLev(Integer.parseInt(lines.get(3)));
            this.hero.setAt(Integer.parseInt(lines.get(4)));
            this.hero.setDe(Integer.parseInt(lines.get(5)));
            this.hero.setHi(Integer.parseInt(lines.get(6)));
        } catch (FileNotFoundException ex) {
            System.out.println("Saved Game not found. Create new game?");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            onlyYN = br.readLine();
            if(onlyYN.equals("yes") || onlyYN.equals("Yes") || onlyYN.equals("YES") || onlyYN.equals("Y") || onlyYN.equals("y"))
            {
                GameState newState = new NewState(hero);
            }
            else if(onlyYN.equals("no") || onlyYN.equals("No") || onlyYN.equals("NO") || onlyYN.equals("N") || onlyYN.equals("n"))
            {
                System.out.println("ok bye bye");
                java.lang.System.exit(0);
            }
            onlyYN = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*return hero;*/
    }
}
