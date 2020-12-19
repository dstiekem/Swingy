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
    public String getstats(){
        String statstring = null;
        return(statstring.valueOf(stat.getHi()) + "\n" + statstring.valueOf(stat.getDe()) + "\n" + statstring.valueOf(stat.getAt()) + "\n");
    }
    public void setStat(int hp, int de, int at){
        //depending on hero level, each artefact needs to be a particular portion of xp needed to level up
        this.hp = hp;
        this.de = de;
        this.at = at;
        stat.setAt(at);
        stat.setDe(de);
        stat.setHi(hp);
    }
}
