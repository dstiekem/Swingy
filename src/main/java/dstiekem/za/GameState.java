package dstiekem.za;

import dstiekem.za.controller.Experience;
import dstiekem.za.controller.Level;
import dstiekem.za.model.*;
import dstiekem.za.validators.ValidDirection;
import dstiekem.za.validators.ValidDirectionImpl;
import dstiekem.za.view.Map;
import org.graalvm.compiler.phases.common.UseTrappingNullChecksPhase;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.FormatFlagsConversionMismatchException;

public abstract class GameState {
    public File file;
    protected Hero hero;
    private Map map;
    @ValidDirection
    String dirInput;
    GameState(Hero hero) throws IOException {
        this.hero = hero;
    }
    /*public Hero getHero() {
        return this.hero;
    }
    public void setHero(String Name) {
        hero = new Hero(Name);
    }*/

    public void start() {
        Coords coords;

        map = new Map(this.hero.getLev());
        map.GenerateMap();
        try {
            BufferedReader dirReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Move your hero around the map using north, south, east and west. " +
                    "You'll encounter some enemies. which you can try to flee or fight. " +
                    "reaching the end of the map means you won");
            dirInput = dirReader.readLine();
            while (!dirInput.equals("exit")){ //print all of input stream
                System.out.println("your move");
                dirInput = dirReader.readLine();
                coords = this.hero.Move(map.PlaceHero(), dirInput);
                map.ApplytoMap(coords,this.hero);
                //handle direction a, nd prompt user again
                    //move hero.
                    //check map.
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //move the hero
        //
    }


}
