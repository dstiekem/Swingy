package dstiekem.za.model;

public class EnemySheers extends Enemy{
    EnemySheers(Level heL) {
        super(heL);
        super.name = "sheers";
        super.setThreat("AAAAHH the sheers of doom!\n" +
                "... You could actually survive this since they're not meant for cutting insects\n");
    }
    @Override
    public String getName() {
        return super.getName();
    }
}
