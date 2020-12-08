package dstiekem.za;

import dstiekem.za.controller.Experience;
import dstiekem.za.controller.Level;
import dstiekem.za.model.Attack;
import dstiekem.za.model.Defense;
import dstiekem.za.model.Hero;
import dstiekem.za.model.HitPoints;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.File;
import java.io.IOException;

public abstract class GameState {
    public File file;
    protected Hero hero;
    GameState(Hero hero) throws IOException {
        this.hero = hero;
    }
    /*public Hero getHero() {
        return this.hero;
    }
    public void setHero(String Name) {
        hero = new Hero(Name);
    }*/

}
