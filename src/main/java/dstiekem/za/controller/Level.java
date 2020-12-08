package dstiekem.za.controller;

import dstiekem.za.controller.Experience;
//behaviour:
//load level from sql or txt else level 1.
//defines map
//composed of experience
public class Level {
    public Experience experience;
    private int level;
    public Level(int leevel) {
        this.level = leevel;
    }
    public Level LevelUp(Experience experience) {
        //tmp1 = level * 1000 ;
        //tmp2 = (level-1)^2 * 450;
        //tmp1 + tmp2;
        this.experience = experience;
        int tmp1 = level * 1000;
        int tmp2 = (level-1)^2 * 450;
        if (experience.Experience >= tmp1 + tmp2)
            return new Level(level++);
        else
            return new Level(level);
    }
    public int getLev(){
        return this.level;
    }
    public void setLevel(int set) {
        level = set;
    }
}