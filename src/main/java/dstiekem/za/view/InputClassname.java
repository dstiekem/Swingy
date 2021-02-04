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
            BufferedReader namer = new BufferedReader(new InputStreamReader(System.in));
            do {
                System.out.println("pick a class! type winged, shelled, venomed, or mimicryst");
                classy = classr.readLine();
            } while (!(classy.equals("winged")) && !(classy.equals("shelled")) && !(classy.equals("venomed")) && !(classy.equals("mimicryst")));
            do {
                System.out.println("great! now give your hero a name");
                heroname = namer.readLine();
            } while (!(heroname.matches("[\\S]+")));
            //((heroname.equals(null)) || heroname.equals("")) &&
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
