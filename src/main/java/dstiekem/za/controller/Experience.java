package dstiekem.za.controller;
//composed of level
//composed of
public class Experience {
    public Level level;
    public int Experience;
    public Experience(int points) {
        this.Experience = points;
    }
    public int UpEx() {
        return Experience++;
    }
    public void setExp(int ex) {
        Experience = ex;
    }
}