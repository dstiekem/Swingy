package dstiekem.za.model;

public class EnemyBoot extends Enemy{
    String threat1;
    String threat2;
    EnemyBoot(Level heL) {
        super(heL);
        super.name = "Boot";
        super.setThreat("your gardener's variety boot has entered your map and it" +
                "threatens to squash you out of existence\n" +
                "                                        \n" +
                "                                        \n" +
                "             .lkkkkkkkkkkkl,,.          \n" +
                "           .dkkk0KKKKKKKKNMMMk.         \n" +
                "            dMNOkkkkkkkkkKMMXc          \n" +
                "            .cOKkKMMMMMMMMMWx.          \n" +
                "            ,kXk;kMO::OMO:kK,           \n" +
                "            'dkkoxKkod0NKOKO.           \n" +
                "            .kWNKkxkkkkkkKMk.           \n" +
                "          .. cXMMMMMMMMMMMMk.           \n" +
                "       .lkKKoc0MMMMMMMMMMMMk.           \n" +
                "     .lKMMMMMMMMMMMMMMMMMMMK;           \n" +
                "    ,KMMMMMMMMMMMMMMMMMWWNOx;           \n" +
                "    lMMMMMMMMMMMMMMWN0dc;'              \n" +
                "    'dOKNMMMMMMMWXOo:.                  \n" +
                "      .;;cdxxxdo:.                      \n" +
                "       . .'.....                        ");
    }
    @Override
    public String getName() {
        return super.getName();
    }
}
