package dstiekem.za.controller;

import dstiekem.za.model.Hero;
import dstiekem.za.view.outputGamesaved;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveState {
    private Hero hero;
    public File file;
    public BufferedWriter bbw;
    public SaveState(Hero hero){
        this.hero = hero;
        //pass in the hero variable with level, exp, name, class
        try {
            file = new File("savestate.txt");
            bbw = new BufferedWriter(new FileWriter(file));
            bbw.write(hero.getName() + "\n");
            bbw.write(hero.getClassy() + "\n");
            bbw.write(hero.getEx() + "\n");
            bbw.write(hero.getLev() + "\n");
            bbw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        //write to file savestate.txt
        //your game has been saved
        // exiting game...
        //
    }
    public void stating() {
        new outputGamesaved();
        System.out.println("you are " + hero.getName() + "\n" + "class: " + hero.getClassy() + "\n" + "experience: "
                + hero.getEx() + "\n" + "level: " + hero.getLev());
    }
    public void exiting() {
        new outputGamesaved();
        System.out.println("exiting...\n");
        System.exit(0);
    }
}
