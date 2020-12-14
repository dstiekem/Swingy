package dstiekem.za.model;

public class EnemyPlasticFlower extends Enemy{
    EnemyPlasticFlower(Level heL) {
        super(heL);
        super.name = "plastic flower";
        super.setThreat("AHA! you've been fooled!...this is not food!?\n" +
                " that's it...wanna fight the plastic flower?\n");
    }
    @Override
    public String getName() {
        return super.getName();
    }
}
