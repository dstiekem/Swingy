package dstiekem.za.view;

import dstiekem.za.model.Enemy;
import dstiekem.za.validators.ValidChoiceFF;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputFightorFlight {
    @ValidChoiceFF
    private String fightOrFlight;
    private Enemy en;
    public InputFightorFlight(Enemy en) {
        this.en = en;
    }
    public String getFightOrFlight()throws IOException {
        String enname;
        System.out.println("AN ENEMY! " + en.getThreat() + "choose to fight or flee from this " + en.getName());
        BufferedReader forfr = new BufferedReader(new InputStreamReader(System.in));
        fightOrFlight = forfr.readLine();
        return fightOrFlight;
    }
}
