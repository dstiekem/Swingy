package dstiekem.za;

import java.util.*;
import javax.swing.*;
import java.awt.*;

//import dstiekem.za.*;
import java.io.*;
import java.util.*;
import java.lang.*;

public class Main
{
    public static void main( String[] args ) throws IOException {
        //launch gui : Framey
            //
        //new game or old game
            //old game: parse a json file if it exists.
            //new game: generate random character.
        //
        try {
            File file;
            file = new File("savestate.txt");
            //new Hero();
            BufferedWriter bbw;
            bbw = new BufferedWriter(new FileWriter(file));
            bbw.write("overwritten");
        } catch (FileNotFoundException ex) {
            System.out.println("file " + args[0] + " not found");
        }

    }

}
