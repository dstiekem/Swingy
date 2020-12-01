package dstiekem.za;

import dstiekem.za.controller.Experience;
import dstiekem.za.controller.Level;
import dstiekem.za.model.Hero;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.File;
import java.io.IOException;

public abstract class GameState {
    public File file;
/*    public Experience experience;
    public Level level;
    @NotNull
    @Size(min=1, max=3)
    public String classs;
    @NotNull
    @Size(min=1, max=3)
    public String name;*/
    private Hero hero;
    GameState(Hero hero) throws IOException {
        this.hero = hero;
    }
    Hero getHero() {
        return hero;
    }

}
