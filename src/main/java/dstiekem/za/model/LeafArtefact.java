package dstiekem.za.model;
public class LeafArtefact extends Artefact{
        //leaf for ...hp
        //level 1 lettuce leaves not much nutrition adds 455 X 5 (takes 5 to get to new level)2450
        //level 2 235 x 10 to get to 4800
        //level 3 budlia leaves 325 x 10 to get to 8050
        //level 4 cellulose fruit (seeds) 415 x10 to get to 12200
        //level 5 glucose fruit.1725 X 10 to get to 17250 and win the game.
    LeafArtefact(Level hLev) {
        super(hLev);
        super.artName = "Leaf";
        int aspLev = hLev.getLev() + 1;
        switch(aspLev){
            case 2: super.setStat(172, 182, 101);
            case 3: super.setStat(47, 141, 47);
            case 4: super.setStat(65, 130, 65);
            case 5: super.setStat(83, 166,83);
            case 6: super.setStat(115, 120, 110);
        }
    }
}
