package main.java.dstiekem.za.controller;

//behaviour:
//load level from sql or txt else level 1.
//defines map
//composed of experience
public class Level {
    public Experience experience;
    public int level;
    Level(int leevel) {
        this.leevel = level;
    }
    public Experience Up(Level level) {
        experience = level*1000+(level−1)2*450;
        return experience;
    }
}