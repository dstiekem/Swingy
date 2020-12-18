package dstiekem.za.model;

import java.util.ArrayList;
import java.util.Random;

public class Map {
    private Level herolev;
    private int[][] map2d;
    private ArrayList<Enemy> enemyArray;
    private Enemy enemy;

    public Map(Level heroLev){
        this.herolev = heroLev;
        int dim = this.MapDim();
        this.map2d = new int[dim][dim];
        for(int i = 0; i < (dim * dim)/4; i++) {
            Random rand = new Random();
            map2d[rand.nextInt(dim)][rand.nextInt(dim)] = -1;
            //gonna use Alistairs of placing int values on the map for characters
            //-1 for     enemies
            // 1 for loss
            //2 for defeated
            //0 for empty
            //3 for fleed
        }
        for (int i = 0; i < (dim); i++) {
            for (int ii = 0; ii < (dim); ii++) {
                if(map2d[i][ii] == -1)
                    continue ;
                else
                    map2d[i][ii] = 0;
            }
        }
        //fill array with all enemy types
        ArrayList enemyArray = new ArrayList<Enemy>();
        Enemy boot = new EnemyBoot(herolev);
        Enemy fork = new EnemyFork(herolev);
        Enemy hosepipe = new EnemyHosepipe(herolev);
        Enemy pesticide = new EnemyPesticide(herolev);
        Enemy plasticflower = new EnemyPlasticFlower(herolev);
        Enemy sheers = new EnemySheers(herolev);
        Enemy spade = new EnemySpade(herolev);

        for(int i = 0; i< 7; i++)
        {
            switch (i) {
                case 1: enemyArray.add(boot);
                case 2: enemyArray.add(fork);
                case 3: enemyArray.add(hosepipe);
                case 4: enemyArray.add(pesticide);
                case 5: enemyArray.add(plasticflower);
                case 6: enemyArray.add(sheers);
                case 7: enemyArray.add(spade);
            }
        }
      /* for (int i = 0; i < enemyArray.size(); i++) {
            Enemy en = (Enemy) enemyArray.get(i);
            System.out.print(en.getName() + " ");
        }*/
        Random rand = new Random();
        enemy = (Enemy) enemyArray.get(rand.nextInt(enemyArray.size() - 1));
    }
    public void PrintMap(int n) {
        if (n == 1) {
            int dim = this.MapDim();
            for (int i = 0; i < (dim); i++) {
                for (int ii = 0; ii < (dim); ii++) {
                    if (map2d[i][ii] == -1)
                        System.out.print("-|");
                    else
                        System.out.print(map2d[i][ii] + "|");
                }
                System.out.print("\n");
            }
        }
        else {
            int dim = this.MapDim();
            int k = 0;
            for (int i = 0; i < (dim); i++) {
                int ii = 0;
                while (ii < dim) {
                    /*if (map2d[i][ii] == -1)
                        System.out.print("-|");
                    else {*/
                    if (map2d[i][ii] == 1)
                        System.out.print("| |");
                    else
                        System.out.print(ii + k + "|");

                    /*}*/
                    ii++;
                }
                k = k + ii;
                System.out.print("\n");
            }
        }
    }
    /*public void PrintHero(Coords coords) {
        System.out.println("");
    }*/
    public boolean EnemytoFind(Coords coords, Hero hero) {

        if(map2d[coords.getX()][coords.getY()] == -1) {
            //i.nextInt(6)
            //this.enemy = (Enemy) enemyArray.get(2);
            //System.out.print(this.enemy.getName() + " ");

            //System.out.print((Enemy) enemyArray.get(rand.nextInt(enemyArray.size() - 1)).getName());
            return true;
        }
        else if(map2d[coords.getX()][coords.getY()] == 0) {
            return false;
        }
        return false;
    }
    public Enemy getEnemy() {
        return(enemy);
    }
/*    public void EnemyFound() {
        try {
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
    }*/
    public Coords fndCentre(){
        Coords coords = new Coords(MapDim()/2, MapDim()/2);
        return coords;
    }
    public int MapDim() {
        int lev = this.herolev.getLev();
        //System.out.println((lev - 1)*5 + 10 - (lev % 2));
        return((lev - 1)*5 + 10 - (lev % 2));
    }
    public void PlaceHero(Coords coords, Coords prev) {
        //return(new Coords(MapDim()/2, MapDim()/2));
        map2d[prev.getX()][prev.getY()] = 0;
        map2d[coords.getX()][coords.getY()] = 1;
    }
/*    public void MoveMap(Hero hero) {


    }*/
}
