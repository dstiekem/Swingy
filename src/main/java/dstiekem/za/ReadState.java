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

public class ReadState extends GameState{

   /* public static Experience experience;
    public static Level level;
    public static Attack at;
    public static Defense de;
    public static HitPoints hi;*/
    public String onlyYN;
    @NotNull
    @Size(min=1, max=3)
    public String classs;
    @NotNull
    @Size(min=1, max=3)
    public String name;

    ReadState() throws IOException {
        super(readHero());
        file = new File("savestate.txt");

    }
    static private Hero readHero() {
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
            experience = new Experience(Integer.parseInt(lines.get(2)));
            level =  new Level(Integer.parseInt(lines.get(3)));
            at = new Attack(Integer.parseInt(lines.get(4)));
            de = new Defense(Integer.parseInt(lines.get(5)));
            hi = new HitPoints(Integer.parseInt(lines.get(6)));

            Hero hero = new Hero(lines.get(0),
                    lines.get(1), experience, level, at, de, hi);


        } catch (FileNotFoundException ex) {

            /*System.out.println("Saved Game not found. Create new game?");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            onlyYN = br.readLine();
            if(onlyYN.equals("yes") || onlyYN.equals("Yes") || onlyYN.equals("YES") || onlyYN.equals("Y") || onlyYN.equals("y"))
            {
                NewState newState = new NewState();
            }
            else if(onlyYN.equals("no") || onlyYN.equals("No") || onlyYN.equals("NO") || onlyYN.equals("N") || onlyYN.equals("n"))
            {
                System.out.println("ok bye bye");
                java.lang.System.exit(0);
            }
            onlyYN = br.readLine();*/
        } catch (IOException e) {
            e.printStackTrace();
        }
        return hero;
    }
}
