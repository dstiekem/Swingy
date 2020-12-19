package dstiekem.za.model;

public class Stat {
    int hp;
    int def;
    int at;
    Stat(int hp, int def, int at){
        this.hp = hp;
        this.def = def;
        this.at = at;
    }
    public int getHi() {
        return this.hp;
    }
    public int getAt() {
        return this.at;
    }
    public int getDe() {
        return this.def;
    }
    public void setHi(int hi) {
        this.hp = hi;
    }
    public void setAt(int att) {
        this.at = att;
    }
    public void setDe(int de) {
        this.def = de;
    }
}
