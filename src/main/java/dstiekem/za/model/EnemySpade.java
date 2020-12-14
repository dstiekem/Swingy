package dstiekem.za.model;

public class EnemySpade extends Enemy{
    EnemySpade(Level heL) {
        super(heL);
        super.name = "spade";
        super.setThreat("This spade will wack you dead with a solid thunk if it can get you\n");
    }
    @Override
    public String getName() {
        return super.getName();
    }

}
