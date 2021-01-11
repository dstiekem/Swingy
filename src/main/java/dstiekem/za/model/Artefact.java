package dstiekem.za.model;

public class Artefact {
    protected Stat stat;
    protected String artName;
    protected Level hLev;
    protected int hp;
    protected int de;
    protected int at;
    Artefact(Level hLev) {
        this.hLev = hLev;
    }
    public String getStringstats(){
        String statstring = null;
        return("HitPoints = " + statstring.valueOf(stat.getHi()) + "\n" + "Defense = " + statstring.valueOf(stat.getDe()) + "\n" + "Attack = " + statstring.valueOf(stat.getAt()) + "\n");
    }
    public Stat getStat(){
        return stat;
    }
    public void setStat(int hp, int de, int at){
        //depending on hero level, each artefact needs to be a particular portion of xp needed to level up
        this.hp = hp;
        this.de = de;
        this.at = at;
        stat = new Stat(hp, de, at);
    }
    public String getname(){
        return artName;
    }
}
