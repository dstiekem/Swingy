package dstiekem.za.view;

import dstiekem.za.controller.Level;
import dstiekem.za.model.*;
import dstiekem.za.validators.ValidChoiceFF;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
    @ValidChoiceFF
    String fightOrFlight;
    //Enemy enemy;
    ArrayList<Enemy> enemyArray;

    public int[][] map2d;

    public Map(Level lev){
        this.level = lev;
    }
    public int[][] GenerateMap() {
        //2d arrat
        int dim = this.MapDim();
        this.map2d = new int[dim][dim];
        for(int i = 0; i < (dim * dim)/4; i++) {
            Random rand = new Random();
            map2d[rand.nextInt(dim)][rand.nextInt(dim)] = -1;
            //gonna use Alistairs of placing int values on the map for characters
            //-1 for enemies
            // 1 for loss
            //2 for defeated
            //0 for empty
            //3 for fleed
        }
        //fill array with all enemy types
        enemyArray = new ArrayList<Enemy>;
        for(int i = 0; i< 7; i++)
        {
            switch (i) {
                case 1: enemyArray.add(new EnemyBoot(level));
                case 2: enemyArray.add(new EnemyFork(level));
                case 3: enemyArray.add(new EnemyHosepipe(level));
                case 4: enemyArray.add(new EnemyPesticide(level));
                case 5: enemyArray.add(new EnemyPlasticFlower(level));
                case 6: enemyArray.add(new EnemySheers(level));
                case 7: enemyArray.add(new EnemySpade(level));
            }
        }
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

    public void ApplytoMap(Coords coords, Hero hero) {
        Enemy enemy = null;
        if(map2d[coords.getX()][coords.getY()] == -1)
        {
            try {
                System.out.println("AN ENEMY. choose fight or flight");
                BufferedReader forfr = new BufferedReader(new InputStreamReader(System.in));
                fightOrFlight = forfr.readLine();
                if(hero.FightOrFlight(enemy, fightOrFlight, coords) == 1)
                {
                    enemy = this.GenerateEnemies();

                    //fight and loss;
                    //end game with message
                }
                if(hero.FightOrFlight(enemy, fightOrFlight, coords) == 2)
                {
                    //fight and won;
                    //make square 0;
                }
                else if(hero.FightOrFlight(enemy, fightOrFlight, coords) == 3)
                {
                    //flight;
                    //keep value on square
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(map2d[coords.getX()][coords.getY()] == 0) {
            return;
        }
    }

    public Coords PlaceHero() {
        map2d[MapDim()/2][MapDim()/2] = 1;
        return(new Coords(MapDim()/2, MapDim()/2));
    }
    public Enemy GenerateEnemies() {
        Enemy en;
        en = enemyArray.get(Random.nextInt(enemyArray.size()));
        return en;
    }
    public void recordDefeat(Coords coords) {
        if(map2d[coords.getX()][coords.getY()] == -1)
        {
            map2d[coords.getX()][coords.getY()] = 0;
        }
    }
    private int MapDim() {
        int lev = this.level.getLev();
        return((lev - 1)*5 + 10 - (lev % 2));
    }

}