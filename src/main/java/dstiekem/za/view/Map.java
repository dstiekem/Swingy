package dstiekem.za.view;

import dstiekem.za.controller.Level;
import dstiekem.za.model.Coords;

import java.util.Random;
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
        this.level = lev;
    }
    public int[][] GenerateMap() {
        //2d arrat
        this.map2d = new int[this.MapDim()][this.MapDim()];
        return(this.map2d);
    }
    public String CheckBounds(Coords coords) {
        //check coords of hero with size of map
        if (coords.getX() >= this.MapDim() || coords.getY() >= this.MapDim() || coords.getX() < 0 || coords.getY() < 0)
        {
            //hero has won?
            System.out.println("YOU WON. go play something else now");

        }
        return
    }
    public void GenerateEnemies() {
        //
        int dim = this.MapDim();
        for(int i = 0; i < (dim * dim)/4; i++) {
            Random rand = new Random();
            map2d[rand.nextInt(dim)][rand.nextInt(dim)] = -1;
            //gonna use Alistairs of placing int values on the map for characters
            //-1 for enemies
            // 1 for heros
            //2 for defeated
            //0 for empty
            //3 for fleed
        }
    }
    public Coords PlaceHero() {
        map2d[MapDim()/2][MapDim()/2] = 1;
        return(new Coords(MapDim()/2, MapDim()/2));
    }
    public void recordDefeat(Coords coords) {
        if(map2d[coords.getX()][coords.getY()] == -1)
        {
            map2d[coords.getX()][coords.getY()] = 2;
        }
    }
    public void recordFlee(Coords coords) {
        if(map2d[coords.getX()][coords.getY()] == -1)
        {
            map2d[coords.getX()][coords.getY()] = 3;
        }
    }
    private int MapDim() {
        int lev = this.level.getLev();
        return((lev - 1)*5 + 10 - (lev % 2));
    }

}