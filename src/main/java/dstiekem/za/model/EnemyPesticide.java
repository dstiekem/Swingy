package dstiekem.za.model;

public class EnemyPesticide extends Enemy{
    EnemyPesticide(Level heL) {
        super(heL);
        super.name = "pesticide";
        super.setThreat("You stand no chance against the poison machine!\n" +
                " behold the death of a species! of many species... BEHOLD THE ROUNDUP\n");
    }
    @Override
    public String getName() {
        return super.getName();
    }
}
