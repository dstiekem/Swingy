package dstiekem.za;

import dstiekem.za.controller.Experience;
import dstiekem.za.controller.Level;
import dstiekem.za.model.*;
import dstiekem.za.view.Map;
import org.graalvm.compiler.phases.common.UseTrappingNullChecksPhase;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.File;
import java.io.IOException;

public abstract class GameState {
    public File file;
    protected Hero hero;
    private Map map;
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
        public Coords coords;
        map = new Map(this.hero.getLev());
        map.GenerateMap();
        coords = this.hero.Move(map.PlaceHero());
        //move the hero
        //
    }


}
