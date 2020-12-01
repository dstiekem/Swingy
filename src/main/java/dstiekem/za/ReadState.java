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
    public File file;
    public Experience experience;
    public Level level;
    public String onlyYN;
    @NotNull
    @Size(min=1, max=3)
    public String classs;
    @NotNull
    @Size(min=1, max=3)
    public String name;
    private Hero hero;
    ReadState() throws IOException {
        super(createHero());
        file = new File("savestate.txt");

    }
    private Hero createHero() {
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
            Integer intEx;
            intEx = new Integer.valueOf(lines.get(2));
            Integer intLev;
            intLev = new Integer.valueOf(lines.get(3));
            experience = new Experience(intEx);
            level =  new Level(intLev);
            Hero hero = new Hero(lines.get(0),
                    lines.get(1), experience, level);
            return hero;

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
    }
}
