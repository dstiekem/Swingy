package dstiekem.za.view;

import dstiekem.za.model.Coords;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputMove {
    String dirInput;
    String dirPrompt;
    Coords coords;
    public InputMove(Coords coords) {
        //this.getDirInput();
        this.coords = coords;
    }
    public String getDirInput() {
        try {
            BufferedReader dirReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nMove your hero around the map using north, south, east and west.\n " +
                    "You'll encounter some enemies. which you can try to flee or fight.\n" +
                    "reaching the end of the map means you won\n");
            dirInput = dirReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dirInput;
    }
    public String getDirPrompt() {
        //System.out.println(this.coords.getX());
        //System.out.println(this.coords.getY());
        try {
            BufferedReader dirpReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("your move...\n");
            dirPrompt = dirpReader.readLine();
            //System.out.println(dirPrompt);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dirPrompt;
    }


}
