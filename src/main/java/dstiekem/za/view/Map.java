package dstiekem.za.view;

import dstiekem.za.*;
import dstiekem.za.controller.Level;
import dstiekem.za.model.Coords;
//map size composed of level;
//composed of enemies 1 map many enemies;

//behaviours:
// generates based on level;
// checks to see if hero is off.
//attributes:
//composed of squares;
//composed of borders;
//has a hero in the middle;
//has a size;
public class Map {
    Level level;
    int lev;
    public int[][] map2d;

    public Map(Level lev){

    }
    public int[][] GenerateMap() {
        //2d arrat
        this.map2d = new int[this.MapSize()][this.MapSize()];
        return(this.map2d);
    }
    public String CheckBounds(Coords coords) {
        //check coords of hero with size of map
    }
    public void GenerateEnemies() {
        //
    }
    private int MapSize() {
        int lev = this.level.getLev();
        return((lev - 1)*5 + 10 - (lev % 2));
    }

}