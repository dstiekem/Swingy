package dstiekem.za.model;

public class EnemyHosepipe extends Enemy{
    EnemyHosepipe(Level heL) {
        super(heL);
        super.name = "Hosepipe";
        super.setThreat("oh NO! You're about to be flooded!\n" +
                " a hosepipe is almost impossible to fight!\n");
    }
    @Override
    public String getName() {
        return super.getName();
    }

}
