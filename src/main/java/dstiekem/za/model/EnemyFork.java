package dstiekem.za.model;

public class EnemyFork extends Enemy{
    EnemyFork(Level heL) {
        super(heL);
        super.name = "Fork";
        super.setThreat("A devil's gardening pitchfork appeared.\n" +
                " Although sharp and deadly, you're little and stealy\n");
    }
    @Override
    public String getName() {
        return super.getName();
    }
}
