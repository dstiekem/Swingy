package dstiekem.za.view;

import dstiekem.za.validators.ValidClassy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputClassname {
    @ValidClassy
    private String classy;
    private String heroname;

    public InputClassname() {
        try {
            BufferedReader classr = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("pick a class! type winged, Shelled, venomed, or mimicryst");
            classy = classr.readLine();
            System.out.println("great! now give your hero a name " + classy);
            BufferedReader namer = new BufferedReader(new InputStreamReader(System.in));
            heroname = namer.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getHeroname() {
        return heroname;
    }
    public String getClassy() {
        return classy;
    }
}
