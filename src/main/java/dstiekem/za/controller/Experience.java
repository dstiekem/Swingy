package main.java.dstiekem.za.controller;
//composed of level
//composed of
public class Experience {
    public int Experience;
    Experience(int points) {
        this.Experience = points;
    }
    public Experience UpEx(Experience experience) {
        return experience++;
    }
}