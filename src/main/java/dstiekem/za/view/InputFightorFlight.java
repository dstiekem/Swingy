package dstiekem.za.view;

import dstiekem.za.model.Enemy;
import dstiekem.za.validators.ValidChoiceFF;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputFightorFlight {
    @ValidChoiceFF
    String fightOrFlight;
    private Enemy en;
    public InputFightorFlight(Enemy en) {
        this.en = en;
    }
    public String getFightOrFlight()throws IOException {
        String enname;
        System.out.println("AN ENEMY! " + en.getThreat() + "choose to fight or flee from this " + en.getName());
        BufferedReader forfr = new BufferedReader(new InputStreamReader(System.in));
        fightOrFlight = forfr.readLine();
        //fightOrFlight = "ew";
        return fightOrFlight;
    }
    public void NowFight(){
        System.out.println("by chance or choice you have chosen to fight, may you not die an insignificant death");
    }
    public void ThankTheGods() {
        System.out.println("thank the insect gods you escaped. but be weary of this place in future...");
    }
}
